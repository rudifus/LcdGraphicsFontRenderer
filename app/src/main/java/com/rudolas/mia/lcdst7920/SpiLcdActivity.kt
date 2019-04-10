package com.rudolas.mia.lcdst7920

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.io.IOException
import android.util.Log
import com.google.android.things.contrib.driver.ssd1306.Ssd1306
import com.google.android.things.pio.PeripheralManager
import com.google.android.things.pio.SpiDevice
import kotlinx.android.synthetic.main.lcd_activity.*
import java.util.*


class SpiLcdActivity : AppCompatActivity() {
    private var mDevice: SpiDevice? = null

    private lateinit var mST9720: SpiST9720
    private lateinit var mSsd1306: Ssd1306

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lcd_activity)

        setupST7920SpiDisplay()
        setupOledDisplay()

        mSsd1306.clearPixels()
        val messageOrig = "Ahoj, ako sa mas? Mam sa velmi dobre a ked budes citat tieto riadky este lepsie. Vyborne :) A kolko riadkov dokaze clovek vtesnat na tento 128x64 pixelovy displejik"
        val message = if (messageOrig.length > 128) messageOrig.substring(0, 128) else messageOrig
        for (i in message.indices) {
            showSsd1306FontChar(message[i], (i % 16) * 8, 8 * (i / 16))
        }

        mSsd1306.show()

//        mST9720.lcdSendCommand(1) // write begin
//        for(i in 0.. 3) {
//            showLcdMessage("Ahoj$i", i, 0)
//            showLcdMessage("Ako sa mas?", i, 2)
//        }

//        mST9720.lcdDisableGraphics()
        mST9720.lcdEnableGraphics()
        mST9720.lcdClearGraphics()
//        mST9720.lcdFillGraphics()
//        mST9720.lcdClearGraphics()

//        mST9720.show6x8Message(messageOrig)
        mST9720.show6x8MessageCompacted2("mam sa velmi dobre a teraz budem mat velmi dlhy text na prekrytie skoro celej obrazovky, az taky dlhy, ze sa tu nezmesti")
//        mST9720.showCosinusWaveAnimated()

        Log.d(TAG, "Display screen activity created")
    }

    private fun delayMillis(millis: Int) {
        mST9720.delayMicroseconds(1000 * millis)
    }

    private fun showLcdMessage(msg: String) {
        mST9720.sendMessage(msg)
        messageText.text = msg
    }

    private fun showLcdMessage(msg: String, row: Int, column: Int) {
        mST9720.sendMessage(msg, row, column)
        messageText.text = msg
    }

    private fun showSsd1306FontChar(char: Char, offsetX: Int, offsetY: Int) {
        val char1Array = SpiST9720.FONT6x8[char.toInt() - 32]
        for (i in char1Array.indices) {
            val hex = char1Array[i]
//            logMsg("char [$char] $i")
            val y = i + offsetY
            mSsd1306.setPixel(offsetX, y, 128 and hex != 0)
            mSsd1306.setPixel(offsetX + 1, y, 64 and hex != 0)
            mSsd1306.setPixel(offsetX + 2, y, 32 and hex != 0)
            mSsd1306.setPixel(offsetX + 3, y, 16 and hex != 0)
            mSsd1306.setPixel(offsetX + 4, y, 8 and hex != 0)
            mSsd1306.setPixel(offsetX + 5, y, 4 and hex != 0)
            mSsd1306.setPixel(offsetX + 6, y, 2 and hex != 0)
            mSsd1306.setPixel(offsetX + 7, y, 1 and hex != 0)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        destroyAlphanumericDisplay()
        destroyOledDisplay()
    }

    private fun setupOledDisplay() {
        val manager = PeripheralManager.getInstance()
        val deviceList: List<String> = manager.i2cBusList
        if (deviceList.isEmpty()) {
            Log.i(TAG, "No I2C bus available on this device.")
        } else {
            Log.i(TAG, "List of available devices: $deviceList")
        }
        try {
            mSsd1306 = Ssd1306(I2C_BUS, 0x3C)
        } catch (e: IOException) {
            Log.e(TAG, "Error while opening screen", e)
        }
    }

    private fun setupST7920SpiDisplay() {
//        val manager = PeripheralManager.getInstance()
//        val deviceList: List<String> = manager.spiBusList
//        if (deviceList.isEmpty()) {
//            Log.i(TAG, "No SPI bus available on this device.")
//        } else {
//            Log.i(TAG, "List of available devices: $deviceList")
//        }
        // Attempt to access the SPI device
        mDevice = try {
            PeripheralManager.getInstance()
                .openSpiDevice(SPI_DEVICE_NAME)
        } catch (e: IOException) {
            Log.w(TAG, "Unable to access SPI device", e)
            null
        }

        mDevice?.apply {
            // Low clock, leading edge transfer
            setMode(SpiDevice.MODE0)
//            setFrequency(250000)
            setFrequency(540000)
//            setFrequency(1000000)
//            setFrequency(2400000)
//            setFrequency(16000000)
            setBitsPerWord(8)
            setBitJustification(SpiDevice.BIT_JUSTIFICATION_MSB_FIRST)
            mST9720 = SpiST9720(this)
            mST9720.init()
        }
    }

    private fun destroyOledDisplay() {
        try {
            mSsd1306.close()
        } catch (e: IOException) {
            Log.w(TAG, "Error closing SSD1306", e)
        }
    }

    private fun destroyAlphanumericDisplay() {
        Log.i(TAG, "Closing display")

        try {
            mDevice?.close()
            mDevice = null
        } catch (e: IOException) {
            Log.w(TAG, "Unable to close SPI device", e)
        }
    }

    companion object {
        private val TAG = SpiLcdActivity::class.java.simpleName
        private const val SPI_DEVICE_NAME = "SPI3.0"
        private const val I2C_BUS = "I2C1"

        private fun logMsg(msg: String) = android.util.Log.d(TAG, "LCD $msg")
    }
}
