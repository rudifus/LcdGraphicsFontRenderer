package com.rudolas.mia.lcdst7920

import com.google.android.things.pio.SpiDevice
import com.rudolas.mia.fonts.*
import java.lang.Math.cos
import java.lang.StringBuilder
import java.nio.ByteBuffer
import java.text.Normalizer
import kotlin.math.PI
import kotlin.math.max

/**
 *
 */
class SpiST7920(
    private val mDevice: SpiDevice?
) {

    private var actFontItemIndex: Int = 0
    private var mDataBuffer: ByteBuffer = ByteBuffer.allocate(DATA_BYTES_SIZE)
    private var mGraphicsBuffer: ByteBuffer = ByteBuffer.allocate(DATA_BYTES_SIZE * (ROW_CHARS_21 + 2) * 64)

    fun init() {
        mDevice?.setDelay(100)

        /**
         *   function set - wait 100us
         *   _________________________________________
         *   | RS| RW|DB7|DB6|DB5|DB4|DB3|DB2|DB1|DB0|
         *   | 0 | 0 | 0 | 0 | 1 | 1 | X | 0 | X | X |
         *   -----------------------------------------
         *
         *   display On/Off
         *   _________________________________________
         *   | RS| RW|DB7|DB6|DB5|DB4|DB3|DB2|DB1|DB0|
         *   | 0 | 0 | 0 | 0 | 0 | 0 | 1 | D | C | B |
         *   -----------------------------------------
         *
         *   display clear
         *   _________________________________________
         *   | RS| RW|DB7|DB6|DB5|DB4|DB3|DB2|DB1|DB0|
         *   | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 1 |
         *   -----------------------------------------
         *
         *   entry mode set
         *   _________________________________________
         *   | RS| RW|DB7|DB6|DB5|DB4|DB3|DB2|DB1|DB0|
         *   | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 1 |I/D| S |
         *   -----------------------------------------
         */
        // Initialize the display
//            lcdExtendedFunctionSet(extended = false, graphics = false) // Do this twice since only one bit
//            lcdExtendedFunctionSet(extended = false, graphics = false) // can be set at a time.
        lcdSendCommand(0b00110000)
        lcdSendCommand(0b00110000)

//        lcdSendCommand(0b00100000)

        // entry mode set
//        lcdSendCommand(0b00000100)

//        lcdSendCommand(0b00001100)
        lcdDisplayStatus(display_on = true, cursor_on = false, blink_on = false)

//        lcdSetDDRamAddress(0)
//        lcdSendCommand(0b10000000)

//        lcdSendCommand(0b00000001)
        lcdClear()
//        mDevice?.setCsChange(true)
    }

    fun lcdEnableGraphics() {
        lcdSendCommand(0x20)
        lcdSendCommand(0x24) // Switch to extended instruction mode.
        lcdSendCommand(0x26) // Enable graphics mode.
    }

    fun lcdDisableGraphics() {
        lcdSendCommand(0x20)
    }

    fun sendMessage(msg: String) {
        lcdWriteMessage(msg)
    }

    fun sendMessage(msg: String, row: Int, column: Int) {
        // DDram address set
        lcdSendCommand(
            when (row) {
                1 -> 0x90
                2 -> 0x88
                3 -> 0x98
                else -> 0x80
            } + column
        )
        lcdWriteMessage(msg)
    }

    /**
     * fills graphics display buffer with all pixels off
     */
    public fun lcdClearGraphics() {
        mGraphicsBuffer.rewind()
        for (y in 0..31) {
            lcdAppendGraphicsCommand(0x80 or y)
            lcdAppendGraphicsCommand(0x80)
            for (x in 0..15) {
                lcdAppendGraphicsData00()
            }
        }
        for (y in 32..63) {
            lcdAppendGraphicsCommand(0x80 or (y - 32))
            lcdAppendGraphicsCommand(0x88)
            for (x in 0..15) {
                lcdAppendGraphicsData00()
            }
        }
        showGraphicsBuffer()
    }

    /**
     * fills graphics display buffer with all pixels on
     */
    public fun lcdFillGraphics() {
        mGraphicsBuffer.rewind()
        for (y in 0..31) {
            lcdAppendGraphicsCommand(0x80 or y)
            lcdAppendGraphicsCommand(0x80)
            for (x in 0..15) {
                lcdAppendGraphicsData(255)
            }
        }
        for (y in 32..63) {
            lcdAppendGraphicsCommand(0x80 or (y - 32))
            lcdAppendGraphicsCommand(0x88)
            for (x in 0..15) {
                lcdAppendGraphicsData(255)
            }
        }
        showGraphicsBuffer()
    }

    private fun lcdSetDDRamAddress(address: Int) = lcdSendCommand(128 or (address and 63))

    private fun lcdWriteMessage(message: String) {
        for (i in 0 until message.length) {
            logMsg("CMD Write Msg[$i] = ${message[i]}")
            lcdSendData(message[i].toInt())
        }
    }

    /**
     * write command to SPI buffer
     * 1 Sync byte and 2 content half bytes are written
     * parameter value == 1 is flag for write begin of characters to display and needs 1,6ms delay
     */
    fun lcdSendCommand(cmd: Int) =
        mDevice?.apply {
            write(
                toCmdBytes(
                    intArrayOf(
                        0xf8,
                        cmd and 0xf0,
                        cmd shl 4
                    )
                ), DATA_BYTES_SIZE
            )
            setDelay(if (cmd == 0x01) 1600 else 72)
        }

    /**
     * write data to SPI buffer
     * 1 Sync byte and 2 content half bytes are written
     */
    private fun lcdSendData(data: Int) =
        mDevice?.apply {
            write(
                toCmdBytes(
                    intArrayOf(
                        0xfa,
                        data and 0xf0,
                        data shl 4
                    )
                ), DATA_BYTES_SIZE
            )
            setDelay(72)
        }

    private fun lcdAppendGraphicsCommand(cmd: Int) = graphicsAppendCommandOrData(0xf8, cmd)

    private fun lcdAppendGraphicsData00() =
        graphicsAppendCommandOrData(0xfa, 0, 0)

    private fun lcdAppendGraphicsData(data: Int) =
        graphicsAppendCommandOrData(0xfa, data)

    private fun graphicsAppendCommandOrData(cmd: Int, data: Int) =
        graphicsAppendCommandOrData(cmd, (data and 0xf0).toByte(), (data shl 4).toByte())

    private fun graphicsAppendCommandOrData(cmd: Int, firstHalf: Byte, secondHalf: Byte) =
        mGraphicsBuffer.apply {
            put(cmd.toByte())
            put(firstHalf)
            put(secondHalf)
        }

    private fun toCmdBytes(values: IntArray): ByteArray =
        with(mDataBuffer) {
            rewind()
            for (intValue in values) {
                put(intValue.toByte())
            }

            return array()
        }


    private fun lcdExtendedFunctionSet(extended: Boolean, graphics: Boolean) =
        lcdSendCommand(
            0b00110000
                .or(if (extended) 0b00000100 else 0)
                .or(if (graphics) 0b00000010 else 0)
                .apply { logMsg("Extended Function $this") }
        )

    private fun lcdDisplayStatus(display_on: Boolean, cursor_on: Boolean, blink_on: Boolean) =
        lcdSendCommand(
            8
                    or (if (display_on) 4 else 0)   // 0b0100
                    or (if (cursor_on) 2 else 0)    // 0b0010
                    or if (blink_on) 1 else 0       // 0b0001
                .apply { logMsg("Display status $this") }
        )

    public fun lcdClear() = lcdSendCommand(1)

    public fun delayMicroseconds(delayMicroseconds: Int) {
        val millis = delayMicroseconds / 1000
        val micros = delayMicroseconds % 1000

        logMsg(" # ---> Delay $millis ms $micros us")
//        Thread.sleep(millis.toLong(), 1000 * micros)
        mDevice?.setDelay(delayMicroseconds)
    }

    /**
     * show all text rows at once for 6x8 font, all 8 rows with 16 chars per each are pre-rendered into graphics cache buffer
     * before writing into the SPI buffer.
     * Likely the most efficient rendering and whole screen refresh
     */
    fun show6x8Message(message: String) {
        val screenMessage1 = if (message.length > SCREEN_CHARS_128) message.substring(0, SCREEN_CHARS_128) else message
        val screenMessage =
            Normalizer.normalize(screenMessage1, Normalizer.Form.NFD).replace("[^\\p{ASCII}]".toRegex(), "")
        val messageLength = screenMessage.length
        val rowsCount = messageLength / ROW_CHARS_16
        mGraphicsBuffer.rewind()

        // write each row separately
//        for (row in 0 .. rowsCount) {
//            val rowSize = if (row == rowsCount) messageLength % ROW_CHARS_16 else ROW_CHARS_16
//            val startIndex = row * ROW_CHARS_16
//            val charArray = screenMessage.substring(startIndex, startIndex + rowSize).toCharArray()
//            for (i in 0 until charArray.size step 2) {
//                showFontChars(charArray[i], if (i < charArray.size - 1) charArray[i + 1] else ' ', row , i / 2)
//            }
//        }

        // write whole display text rendered at once, the most efficient text display refresh
        for (row in 0..rowsCount) {
            val isLastRow = row == rowsCount
            val rowSize = if (isLastRow) messageLength % ROW_CHARS_16 else ROW_CHARS_16
            val startIndex = row * ROW_CHARS_16
            val charArray = screenMessage.substring(startIndex, startIndex + rowSize).toCharArray()
            val charsData = Array(rowSize) { FONT6x8[charToFontIndex(charArray[it])] }
            if (charsData.isNotEmpty()) {
                logMsg("row[$row, $rowSize] ${mGraphicsBuffer.position()} ${charsData.size} ${charsData[0].size}")
                val rowOffset = 0x80 or ((row * 8) % 32)
                val cmd = if (row < 4) 0x80 else 0x88
                for (i in charsData[0].indices) {
                    lcdAppendGraphicsCommand(i + rowOffset)   // Vertical coordinate of the screen is specified first. (0-31)
                    lcdAppendGraphicsCommand(cmd)   // Then horizontal coordinate of the screen is specified. (0-8)
                    // send data to coordinate
                    for (j in 0..15) {
                        lcdAppendGraphicsData(if (!isLastRow || j < rowSize) charsData[j][i] else 0)
                    }
                }
            }
        }

        showGraphicsBuffer()
    }

    fun show6x8MessageCompacted(message: String) {
        val screenMessage = if (message.length > SCREEN_CHARS_168) message.substring(0, SCREEN_CHARS_168) else message
        val messageLength = screenMessage.length
        val rowsCount = messageLength / ROW_CHARS_21
        mGraphicsBuffer.rewind()

        // write whole display text rendered at once, the most efficient text display refresh
        for (row in 0..rowsCount) {
            val isLastRow = row == rowsCount
            val rowSize = if (isLastRow) messageLength % ROW_CHARS_21 else ROW_CHARS_21
            val startIndex = row * ROW_CHARS_21
            val charArray = screenMessage.substring(startIndex, startIndex + rowSize).toCharArray()
            val charsData = Array(rowSize) { FONT6x8[charToFontIndex(charArray[it])] }
            if (charsData.isNotEmpty()) {
                logMsg("row[$row, $rowSize] ${mGraphicsBuffer.position()} ${charsData.size} ${charsData[0].size}")
                val rowOffset = 0x80 or ((row * 8) % 32)
                val cmd = if (row < 4) 0x80 else 0x88
                val rowPixels = IntArray(128)  // pixels per row
                for (i in charsData[0].indices) {
                    lcdAppendGraphicsCommand(i + rowOffset)   // Vertical coordinate of the screen is specified first. (0-31)
                    lcdAppendGraphicsCommand(cmd)   // Then horizontal coordinate of the screen is specified. (0-8)
                    // send data to coordinate
                    if (i > 0) {
                        rowPixels.fill(0)
                    }
                    for (j in 0 until rowSize) {
                        val fontChar = charsData[j][i]
                        val pos = j * 6
                        for (k in 0..5) {
                            rowPixels[pos + k] = if (when (k) {
                                    0 -> 128
                                    1 -> 64
                                    2 -> 32
                                    3 -> 16
                                    4 -> 8
                                    else -> 4
                                } and fontChar != 0
                            ) 1 else 0
//                                logMsg("[${pos + k}] ${rowPixels[pos + k]}")
                        }
                    }
                    for (j in 0 until ROW_CHARS_16) {
                        val pos = j * 8
                        var rowByte = 0
                        for (k in 0..7) {
                            rowByte += (rowPixels[pos + k] shl (7 - k))
                        }
                        lcdAppendGraphicsData(rowByte)
                    }
                }
            }
        }

        showGraphicsBuffer()
    }

    fun show6x8MessageCompacted2(message1: String) {
        val message = Normalizer.normalize(message1, Normalizer.Form.NFD).replace("[^\\p{ASCII}]".toRegex(), "")
        val messageLength = message.length

        mGraphicsBuffer.rewind()

        var charIndex = -1
        var row = -1
        var lastRowIndex = -1
        while (charIndex < messageLength - 1 && row < 7) {
            row++
            var pixelCount = 0
            while (charIndex < messageLength - 1 && pixelCount < 128) {
                val char = message[charIndex + 1]
//                val widths = FONT_LED_CALCULATOR_20PX_WIDTH[charIndex + 1]
                val charPixels = if (char == ' ') 3 else 6
                logMsg("pixels[$row, ${charIndex + 1}] '$char' Pixels $pixelCount $charPixels")
                if (pixelCount + charPixels > 128) {
                    break
                }
                pixelCount += charPixels
                charIndex++
            }
            val rowSize = charIndex - lastRowIndex
            val startIndex = lastRowIndex + 1
            lastRowIndex = charIndex
            val charArray = message.substring(startIndex, startIndex + rowSize).toCharArray()
            logMsg("row[$row, $rowSize] ${mGraphicsBuffer.position()} chars $charIndex")
            val charsData = Array(rowSize) { FONT6x8[charToFontIndex(charArray[it])] }
            val isSpaceCharArray = BooleanArray(rowSize) { charArray[it] == ' ' }
            if (charsData.isNotEmpty()) {
                val rowOffset = 0x80 or ((row * 8) % 32)
                val cmd = if (row < 4) 0x80 else 0x88
                val rowPixels = IntArray(128)  // pixels per row
                for (i in charsData[0].indices) {
                    lcdAppendGraphicsCommand(i + rowOffset)   // Vertical coordinate of the screen is specified first. (0-31)
                    lcdAppendGraphicsCommand(cmd)   // Then horizontal coordinate of the screen is specified. (0-8)
                    if (i > 0) {
                        rowPixels.fill(0)
                    }
                    var pos = 0
                    for (j in charsData.indices) {
                        val fontChar = charsData[j][i]
                        val isChar = isSpaceCharArray[j]
                        if (!isChar) {
                            for (k in 0..5) {
                                rowPixels[pos + k] = if (when (k) {
                                        0 -> 128
                                        1 -> 64
                                        2 -> 32
                                        3 -> 16
                                        4 -> 8
                                        else -> 4
                                    } and fontChar != 0
                                ) 1 else 0
//                                logMsg("[$i, $j] ${pos + k} ${rowPixels[pos + k]}")
                            }
                        }
                        pos += if (isChar) 3 else 6
                    }
                    for (p in 0 until ROW_CHARS_16) {
                        val idx = p * 8 // compacted char pixels position
                        var rowByte = 0
                        for (k in 0..7) {
                            rowByte += (rowPixels[idx + k] shl (7 - k))
                        }
                        // send data to coordinate
                        lcdAppendGraphicsData(rowByte)
                    }
                }
            }
        }

        showGraphicsBuffer()
    }

    fun showFontDemoScreen(demoFont: String, message: String) {
        lcdClearGraphics()
        mGraphicsBuffer.rewind()
        selectFont(Monobit16px.font.name)
//        selectFont(LedCalculator20px.font.name)
        val headerFontHeight = getFontData(' ').size
        renderGraphicsMessageCompacted3(demoFont)

        selectFont(demoFont)
        renderGraphicsMessageCompacted3(message, headerFontHeight)
        showGraphicsBuffer()
    }

    fun showFullScreenMessage(message: String) {
        lcdClearGraphics()
        mGraphicsBuffer.rewind()
        renderGraphicsMessageCompacted3(message)
        showGraphicsBuffer()
    }

    /**
     * show message,
     */
    fun renderGraphicsMessageCompacted3(message: String, rowOffset: Int = 0) {

        var charIndex = -1
        var rowIndex = rowOffset
        var lastRowEndCharIndex = -1
        val messageLength = message.length
        while (charIndex < messageLength - 1 && rowIndex < 63) {
            var pixelCount = 0
            val widths = arrayListOf<Int>()
            while (charIndex < messageLength - 1 && pixelCount < 128) {
                val char = message[charIndex + 1]
                val charPixelsWidth = getFontDataWidth(char)
                widths.add(charPixelsWidth)
                logMsg("pixels[$rowIndex, ${charIndex + 1}] '$char' dataIndex ${charToFontIndex(char)} $pixelCount Pixels $charPixelsWidth")
                if (pixelCount + charPixelsWidth > 128) {
                    break
                }
                pixelCount += charPixelsWidth
                charIndex++
            }
            val rowSize = charIndex - lastRowEndCharIndex
            val startIndex = lastRowEndCharIndex + 1
            lastRowEndCharIndex = charIndex
            val charArray = message.substring(startIndex, startIndex + rowSize).toCharArray()
            logMsg("row[$rowIndex, $charIndex] ${mGraphicsBuffer.position()} chars $rowSize")
            val charsData = Array(rowSize) { getFontData(charArray[it]) }
//            val isSpaceCharArray = BooleanArray(rowSize) { charArray[it] == ' ' }
            if (charsData.isNotEmpty()) {
                val rowPixels = IntArray(128)  // pixels per row
                val rowCharWidths = widths.toTypedArray()
                val charDataHeight = charsData[0].size
                logMsg("row[$rowIndex, $startIndex] $rowSize chars Height ${charDataHeight}px")
                val strBuilder = StringBuilder(128)
                for (i in charsData[0].indices) {
                    val actRowIndex = rowIndex + i
                    if (actRowIndex > 63) {
                        break
                    }
                    val cmd = if (actRowIndex < 32) 0x80 else 0x88
//                    lcdSendCommand(0x80 or (actRowIndex % 32))
//                    lcdSendCommand(cmd)
                    lcdAppendGraphicsCommand(0x80 or (actRowIndex % 32))   // Vertical coordinate of the screen is specified first. (0-31)
                    lcdAppendGraphicsCommand(cmd)   // Then horizontal coordinate of the screen is specified. (0-8)
                    if (i > 0) {
                        rowPixels.fill(0)
                    }
                    var pos = 0
                    for (rowCharIndex in charsData.indices) {
                        if (charsData[rowCharIndex].isEmpty()) {
//                            pos += 3
                            continue
                        }
//                        logMsg("FONT ${charArray[rowCharIndex]} ${charsData[rowCharIndex].size} ")
                        val fontChar = charsData[rowCharIndex][i]
                        val charDataWidth = rowCharWidths[rowCharIndex]
//                        if (i == 0) {
//                            logMsg("data[$rowCharIndex] '${charArray[rowCharIndex]}' $charDataWidth pixels")
////                            logMsg("data[$rowCharIndex] data $fontChar of $charDataWidth pixels for ${charArray[rowCharIndex]}")
//                        }
                        for (k in 0 until charDataWidth) {
                            rowPixels[pos + k] = if (1 shl (charDataWidth - k - 1) and fontChar != 0) 1 else 0
//                            logMsg("[$i, $rowCharIndex] ${pos + k} ${rowPixels[pos + k]}")
                        }
                        pos += charDataWidth
                    }
                    strBuilder
                        .append("data[").append(actRowIndex)
                        .append(" of ").append(rowSize).append("] ")
                        .append(charArray).append(' ');

                    for (pixel in rowPixels) {
                        strBuilder.append(pixel.toString())
                    }
                    logMsg("$strBuilder")
                    strBuilder.clear()

                    // write rowPixels array into graphics buffer
                    for (p in 0 until ROW_CHARS_16) {
                        val idx = p * 8 // compacted char pixels position
                        var rowByte = 0
                        for (k in 0..7) {
                            rowByte += (rowPixels[idx + k] shl (7 - k))
                        }
                        // send data to coordinate
                        lcdAppendGraphicsData(rowByte)
//                        lcdSendData(rowByte)
                    }
                }
                rowIndex += charDataHeight
            }
        }
    }

    /**
     * show text bytes for 6x8 font, in each text row by 2 chars,
     * leads to slower rendering
     */
    private fun showFontChars(char1: Char, char2: Char, row: Int, column: Int) {
        val char1Data = FONT6x8[charToFontIndex(char1)]
        val char2Data = FONT6x8[charToFontIndex(char2)]
        logMsg("Chars row[$row, 0] ${mGraphicsBuffer.position()}")
        for (i in char1Data.indices) {
            lcdSendCommand(0x80 or (i + (row * 8) % 32))   // Vertical coordinate of the screen is specified first. (0-31)
            lcdSendCommand((if (row < 4) 0x80 else 0x88) or column)   // Then horizontal coordinate of the screen is specified. (0-8)
            lcdSendData(char1Data[i])            // Data to the upper byte is sent to the coordinate.
            lcdSendData(char2Data[i])
        }
    }

    private fun showGraphicsBuffer() {
        mDevice?.apply {
            logMsg("Showing Graphics buffer ${mGraphicsBuffer.position()} bytes")
            write(mGraphicsBuffer.array(), mGraphicsBuffer.position())
//            setDelay(100)
        }
    }

    fun showCosinusWaveAnimated() {
        val cosArray = IntArray(131)
        for (i in cosArray.indices) {
            cosArray[i] = 32 + Math.round(cos((i % 64) / 32.toFloat() * PI) * 31).toInt()
        }

        val shiftsCount = (64 + (SHIFT_OFFSET - 1)) / SHIFT_OFFSET
        val buffer = IntArray(8 * 64 * shiftsCount)
        for (j in 0 until shiftsCount) {
            val offset = 512 * j
            val shift = SHIFT_OFFSET * j
            for (i in 0..63) {
                val idx = offset + cosArray[i + shift] * 8 + i / 8  // 8 cos values into 1 byte of row intArray
//                logMsg("$i.[${cosArray[i]}, ${i / 8}] idx $idx -> ${buffer[idx] or (128 shr (i % 8))}")
                buffer[idx] = buffer[idx] or (128 shr (i % 8))  // append i-th bit of byte
            }
        }
        var index = 0
        while (true) {
            mGraphicsBuffer.rewind()
            for (row in 0..63) {
                lcdAppendGraphicsCommand(0x80 or (row % 32))   // Vertical coordinate of the screen is specified first. (0-31)
                lcdAppendGraphicsCommand(if (row < 32) 0x80 else 0x88)   // Then horizontal coordinate of the screen is specified. (0-8)
                // send data to coordinate
                for (i in 0..15) {
                    lcdAppendGraphicsData(buffer[(index / SHIFT_OFFSET * 512) + row * 8 + i % 8])
                }
            }
            /*for (i in 0..63) {
                val row = intArrayNew[i]
                val y = intArrayNew[i + SHIFT_OFFSET]
                lcdAppendGraphicsCommand(0x80 or (row % 32))   // Vertical coordinate of the screen is specified first. (0-31)
                lcdAppendGraphicsCommand((if (row < 32) 0x80 else 0x88) or i/8)
                lcdAppendGraphicsData(128 shr (i % 8))
            }*/
            showGraphicsBuffer()
//            delayMicroseconds(3000)
            val nextIndex = index + SHIFT_OFFSET
            index = if (nextIndex > 63) nextIndex % 64 else nextIndex
        }
    }

    fun selectFont(name: String) {
        actFontItemIndex = max(0, fontsArray.indexOfFirst { it.name == name })
    }

    fun getFontByIndex(index: Int) = fontsArray[index]

    fun getFontDataWidth(char: Char): Int = getFontData(char, dataType = FONT_DATA_WIDTH)[0]

    private fun getFontData(char: Char, dataType: Int = FONT_DATA): IntArray = when (dataType) {
        FONT_DATA_WIDTH -> intArrayOf(fontsArray[actFontItemIndex].widths[charToFontIndex(char)])
        else -> fontsArray[actFontItemIndex].charBytes[charToFontIndex(char)]
    }

    companion object {
        private val TAG = SpiST7920::class.java.simpleName
        private const val DATA_BYTES_SIZE = 3
        private const val SHIFT_OFFSET = 2
        private const val ROW_CHARS_16 = 16
        private const val ROW_CHARS_18 = 18
        private const val ROW_CHARS_21 = 21
        private const val SCREEN_CHARS_128 = 128
        private const val SCREEN_CHARS_168 = 168

        internal val FONT6x8 = arrayOf(
//            intArrayOf(0x06, 0x08, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00), // columns, rows, num_bytes_per_char
            intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00), // space 0x20  32
            intArrayOf(0x20, 0x20, 0x20, 0x20, 0x20, 0x00, 0x20, 0x00), // !  33
            intArrayOf(0x50, 0x50, 0x50, 0x00, 0x00, 0x00, 0x00, 0x00), // "
            intArrayOf(0x50, 0x50, 0xF8, 0x50, 0xF8, 0x50, 0x50, 0x00), // #
            intArrayOf(0x20, 0x78, 0xA0, 0x70, 0x28, 0xF0, 0x20, 0x00), // $
            intArrayOf(0xC0, 0xC8, 0x10, 0x20, 0x40, 0x98, 0x18, 0x00), // %
            intArrayOf(0x40, 0xA0, 0xA0, 0x40, 0xA8, 0x90, 0x68, 0x00), // &
            intArrayOf(0x30, 0x30, 0x20, 0x40, 0x00, 0x00, 0x00, 0x00), // '
            intArrayOf(0x10, 0x20, 0x40, 0x40, 0x40, 0x20, 0x10, 0x00), // (
            intArrayOf(0x40, 0x20, 0x10, 0x10, 0x10, 0x20, 0x40, 0x00), // )
            intArrayOf(0x00, 0x20, 0xA8, 0x70, 0x70, 0xA8, 0x20, 0x00), // *
            intArrayOf(0x00, 0x20, 0x20, 0xF8, 0x20, 0x20, 0x00, 0x00), // +
            intArrayOf(0x00, 0x00, 0x00, 0x00, 0x30, 0x30, 0x20, 0x40), // ,
            intArrayOf(0x00, 0x00, 0x00, 0xF8, 0x00, 0x00, 0x00, 0x00), // -
            intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x30, 0x30, 0x00), // .
            intArrayOf(0x00, 0x08, 0x10, 0x20, 0x40, 0x80, 0x00, 0x00), // / (forward slash)
            intArrayOf(0x70, 0x88, 0x88, 0xA8, 0x88, 0x88, 0x70, 0x00), // 0 0x30
            intArrayOf(0x20, 0x60, 0x20, 0x20, 0x20, 0x20, 0x70, 0x00), // 1
            intArrayOf(0x70, 0x88, 0x08, 0x70, 0x80, 0x80, 0xF8, 0x00), // 2
            intArrayOf(0xF8, 0x08, 0x10, 0x30, 0x08, 0x88, 0x70, 0x00), // 3
            intArrayOf(0x10, 0x30, 0x50, 0x90, 0xF8, 0x10, 0x10, 0x00), // 4
            intArrayOf(0xF8, 0x80, 0xF0, 0x08, 0x08, 0x88, 0x70, 0x00), // 5
            intArrayOf(0x38, 0x40, 0x80, 0xF0, 0x88, 0x88, 0x70, 0x00), // 6
            intArrayOf(0xF8, 0x08, 0x08, 0x10, 0x20, 0x40, 0x80, 0x00), // 7
            intArrayOf(0x70, 0x88, 0x88, 0x70, 0x88, 0x88, 0x70, 0x00), // 8
            intArrayOf(0x70, 0x88, 0x88, 0x78, 0x08, 0x10, 0xE0, 0x00), // 9
            intArrayOf(0x00, 0x00, 0x20, 0x00, 0x20, 0x00, 0x00, 0x00), // :
            intArrayOf(0x00, 0x00, 0x20, 0x00, 0x20, 0x20, 0x40, 0x00), // ;
            intArrayOf(0x08, 0x10, 0x20, 0x40, 0x20, 0x10, 0x08, 0x00), // <
            intArrayOf(0x00, 0x00, 0xF8, 0x00, 0xF8, 0x00, 0x00, 0x00), // =
            intArrayOf(0x40, 0x20, 0x10, 0x08, 0x10, 0x20, 0x40, 0x00), // >
            intArrayOf(0x70, 0x88, 0x08, 0x30, 0x20, 0x00, 0x20, 0x00), // ?
            intArrayOf(0x70, 0x88, 0xA8, 0xB8, 0xB0, 0x80, 0x78, 0x00), // @ 0x40   64
            intArrayOf(0x20, 0x50, 0x88, 0x88, 0xF8, 0x88, 0x88, 0x00), // Adbxtra20px     65
            intArrayOf(0xF0, 0x88, 0x88, 0xF0, 0x88, 0x88, 0xF0, 0x00), // B
            intArrayOf(0x70, 0x88, 0x80, 0x80, 0x80, 0x88, 0x70, 0x00), // C
            intArrayOf(0xF0, 0x88, 0x88, 0x88, 0x88, 0x88, 0xF0, 0x00), // D
            intArrayOf(0xF8, 0x80, 0x80, 0xF0, 0x80, 0x80, 0xF8, 0x00), // E
            intArrayOf(0xF8, 0x80, 0x80, 0xF0, 0x80, 0x80, 0x80, 0x00), // F
            intArrayOf(0x78, 0x88, 0x80, 0x80, 0x98, 0x88, 0x78, 0x00), // G
            intArrayOf(0x88, 0x88, 0x88, 0xF8, 0x88, 0x88, 0x88, 0x00), // H
            intArrayOf(0x70, 0x20, 0x20, 0x20, 0x20, 0x20, 0x70, 0x00), // I
            intArrayOf(0x38, 0x10, 0x10, 0x10, 0x10, 0x90, 0x60, 0x00), // J
            intArrayOf(0x88, 0x90, 0xA0, 0xC0, 0xA0, 0x90, 0x88, 0x00), // K
            intArrayOf(0x80, 0x80, 0x80, 0x80, 0x80, 0x80, 0xF8, 0x00), // L
            intArrayOf(0x88, 0xD8, 0xA8, 0xA8, 0xA8, 0x88, 0x88, 0x00), // M
            intArrayOf(0x88, 0x88, 0xC8, 0xA8, 0x98, 0x88, 0x88, 0x00), // N
            intArrayOf(0x70, 0x88, 0x88, 0x88, 0x88, 0x88, 0x70, 0x00), // O
            intArrayOf(0xF0, 0x88, 0x88, 0xF0, 0x80, 0x80, 0x80, 0x00), // P 0x50
            intArrayOf(0x70, 0x88, 0x88, 0x88, 0xA8, 0x90, 0x68, 0x00), // Q
            intArrayOf(0xF0, 0x88, 0x88, 0xF0, 0xA0, 0x90, 0x88, 0x00), // R
            intArrayOf(0x70, 0x88, 0x80, 0x70, 0x08, 0x88, 0x70, 0x00), // S
            intArrayOf(0xF8, 0xA8, 0x20, 0x20, 0x20, 0x20, 0x20, 0x00), // T
            intArrayOf(0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x70, 0x00), // U
            intArrayOf(0x88, 0x88, 0x88, 0x88, 0x88, 0x50, 0x20, 0x00), // V
            intArrayOf(0x88, 0x88, 0x88, 0xA8, 0xA8, 0xA8, 0x50, 0x00), // W
            intArrayOf(0x88, 0x88, 0x50, 0x20, 0x50, 0x88, 0x88, 0x00), // X
            intArrayOf(0x88, 0x88, 0x50, 0x20, 0x20, 0x20, 0x20, 0x00), // Y
            intArrayOf(0xF8, 0x08, 0x10, 0x70, 0x40, 0x80, 0xF8, 0x00), // Z
            intArrayOf(0x78, 0x40, 0x40, 0x40, 0x40, 0x40, 0x78, 0x00), // [
            intArrayOf(0x00, 0x80, 0x40, 0x20, 0x10, 0x08, 0x00, 0x00), // \ (back slash)
            intArrayOf(0x78, 0x08, 0x08, 0x08, 0x08, 0x08, 0x78, 0x00), // ]
            intArrayOf(0x20, 0x50, 0x88, 0x00, 0x00, 0x00, 0x00, 0x00), // ^
            intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xF8, 0x00), // _
            intArrayOf(0x60, 0x60, 0x20, 0x10, 0x00, 0x00, 0x00, 0x00), // ` 0x60
            intArrayOf(0x00, 0x00, 0x60, 0x10, 0x70, 0x90, 0x78, 0x00), // a
            intArrayOf(0x80, 0x80, 0xB0, 0xC8, 0x88, 0xC8, 0xB0, 0x00), // b
            intArrayOf(0x00, 0x00, 0x70, 0x88, 0x80, 0x88, 0x70, 0x00), // c
            intArrayOf(0x08, 0x08, 0x68, 0x98, 0x88, 0x98, 0x68, 0x00), // d
            intArrayOf(0x00, 0x00, 0x70, 0x88, 0xF8, 0x80, 0x70, 0x00), // e
            intArrayOf(0x10, 0x28, 0x20, 0x70, 0x20, 0x20, 0x20, 0x00), // f
            intArrayOf(0x00, 0x00, 0x70, 0x98, 0x98, 0x68, 0x08, 0x70), // g
            intArrayOf(0x80, 0x80, 0xB0, 0xC8, 0x88, 0x88, 0x88, 0x00), // h
            intArrayOf(0x20, 0x00, 0x60, 0x20, 0x20, 0x20, 0x70, 0x00), // i
            intArrayOf(0x10, 0x00, 0x10, 0x10, 0x10, 0x90, 0x60, 0x00), // j
            intArrayOf(0x80, 0x80, 0x90, 0xA0, 0xC0, 0xA0, 0x90, 0x00), // k
            intArrayOf(0x60, 0x20, 0x20, 0x20, 0x20, 0x20, 0x70, 0x00), // l
            intArrayOf(0x00, 0x00, 0xD0, 0xA8, 0xA8, 0xA8, 0xA8, 0x00), // m
            intArrayOf(0x00, 0x00, 0xB0, 0xC8, 0x88, 0x88, 0x88, 0x00), // n
            intArrayOf(0x00, 0x00, 0x70, 0x88, 0x88, 0x88, 0x70, 0x00), // o
            intArrayOf(0x00, 0x00, 0xB0, 0xC8, 0xC8, 0xB0, 0x80, 0x80), // p 0x70
            intArrayOf(0x00, 0x00, 0x68, 0x98, 0x98, 0x68, 0x08, 0x08), // q
            intArrayOf(0x00, 0x00, 0xB0, 0xC8, 0x80, 0x80, 0x80, 0x00), // r
            intArrayOf(0x00, 0x00, 0x78, 0x80, 0x70, 0x08, 0xF0, 0x00), // s
            intArrayOf(0x20, 0x20, 0xF8, 0x20, 0x20, 0x28, 0x10, 0x00), // t
            intArrayOf(0x00, 0x00, 0x88, 0x88, 0x88, 0x98, 0x68, 0x00), // u
            intArrayOf(0x00, 0x00, 0x88, 0x88, 0x88, 0x50, 0x20, 0x00), // v
            intArrayOf(0x00, 0x00, 0x88, 0x88, 0xA8, 0xA8, 0x50, 0x00), // w
            intArrayOf(0x00, 0x00, 0x88, 0x50, 0x20, 0x50, 0x88, 0x00), // x
            intArrayOf(0x00, 0x00, 0x88, 0x88, 0x78, 0x08, 0x88, 0x70), // y
            intArrayOf(0x00, 0x00, 0xF8, 0x10, 0x20, 0x40, 0xF8, 0x00), // z
            intArrayOf(0x10, 0x20, 0x20, 0x40, 0x20, 0x20, 0x10, 0x00), // {
            intArrayOf(0x20, 0x20, 0x20, 0x00, 0x20, 0x20, 0x20, 0x00), // |
            intArrayOf(0x40, 0x20, 0x20, 0x10, 0x20, 0x20, 0x40, 0x00), // }
            intArrayOf(0x40, 0xA8, 0x10, 0x00, 0x00, 0x00, 0x00, 0x00), // ~
            intArrayOf(0x70, 0xD8, 0xD8, 0x70, 0x00, 0x00, 0x00, 0x00) // DEL
        )

        val fontsArray: Array<FontItem> = arrayOf(
//            Bncuword27px.font,
//            Clacon41px.font,
//            Code7x548px.font,
//            DavidSansCondensed56px.font,
//            Display40px.font,
//            Everyday41px.font,

            // PERFECT
            LedCalculator20px.font,  // very good
            Nds1210px.font,  // perfect
            EnterCommand16px.font,  // very good
            MixSerifCondense16px.font, // tall condensed, good
            Mousetrap210px.font,  // small very good
            Monobit16px.font,  // small perfect
            PixelOperator88px.font,  // small very good
            PixelOperatorMono88px.font,  // small very good
            Font2a03Memesbruh0316px.font, // very good, squared
            EnterCommand16px.font, // very good, perfect
            Graph35Pix8px.font,  // very good, not tall, compact. mono space 6x7
            AmericanCursive16px.font,  // very good
            CyborgSister16px.font, // very good
            AerxTabs16px.font,  //very good
            Font712Serif16px.font,   // very good
            BabyBlue16px.font,   // big and OK
            HeyText16px.font,  // small and very good
            Igiari16px.font, // large
            Optixal16px.font,  // very good
            PfRondaSeven16px.font,  // quite big
            PixelOperator16px.font,  // very good
            PixelOperatorMono16px.font,  // very good
            Uni05538px.font  // small sold


            // TO NORMALIZE
//            EndlessType8px.font,  // basic chars only
//            Addwb18px.font,  // basic chars only
//            Adbxtra20px.font,  // basic chars only
//            AdvancedPixel7px20.font,  // basic chars only
//            AerxFont16px.font,  // basic chars only
//            AlterebroPixelFont16px.font,  // basic chars only
//            AngieAtore16px.font, // basic chars only
//            CharriotDeluxe10px.font,  // basic chars only
//            ClassicMemesbruh0316px.font,  // basic chars only
//            Font8BitFortress7px.font,  // basic chars only
//            HelloWorld13px.font,  // basic chars only
//            Mmbnthin32px.font,  // basic chars only
//            Monaco32px.font,  // basic chars only
//            Mosarg16px.font,  // basic chars only
//            Nano10px.font,  // basic chars only
//            NdsbiosMemesbruh0316px.font,  // basic chars only
//            OldSchoolAdventures7px.font,  // basic chars only
//            Pixur16px.font,  // basic chars only
//            PixL20px.font,  // basic chars only
//            Plastica16px.font,  // basic chars only
//            Poco10px.font,  // small very good
//            ProggyTiny16px.font,  // basic chars only
//            Pxl10px.font,  // quite small
//            Redensek13px.font,  // basic chars only
//            Resource16px.font,  // basic chars only
//            RevMiniPixel8px.font,  // basic chars only
//            Rix8px.font,  // basic chars only
//            RsehandWritingPixel20px.font,  // basic chars only
//            RootSquare20px.font,  // basic chars only
//            Savior116px.font,  // basic chars only
//            Scifibit16px.font,  // basic chars only big
//            SevastopolInterface16px.font,  // basic chars only
//            Sgk07516px.font,  // basic chars only
//            SillyPixel8px.font,  // basic chars only - ultra smLL
//            Techkr25px.font,  // basic chars only
//            ThinPixel720px.font,  // basic chars only - thin
//            TinyUnicode16px.font,  // basic chars only
//            TlozPhantomHourglass16px.font,  // basic chars only
//            Volter28Goldfish299px.font,  // basic chars only
//            ZeptoRegular8px.font,  // basic chars only - small

//            PxSansNouveaux10px.font,  // bad
//            Font15x516px.font,  // not good
//            Bmhaa30px.font,  // big
//            Font7x524px.font,  // big
//            FreePixel16px.font,  // bed chars
//            Homespun20px.font,  // big
//            LilliputSteps16px.font, // bad
//            Mojangregular24px.font,  // big
//            MonotypeGerhilt8px.font,  // bad
//            Notalot2516px.font,  // bad
//            Px1014px.font, //  bad
//            RClassic88px.font,  // bad
//            RntgLarger21px.font,  // big
//            Tiny30px.font,  // big
//            Bitdust28px.font,  // big
//            Bitlow28px.font  // big
        )

        private const val FONT_DATA = 0
        private const val FONT_DATA_WIDTH = 1

        //    private fun charToFontIndex(char: Char) = char.toInt() - 32
        private fun charToFontIndex(char: Char) = char.toInt().let { if (it > 130) it - 66 else it - 32 }

        private fun logMsg(msg: String) = android.util.Log.d(TAG, "LCD $msg")
    }
}