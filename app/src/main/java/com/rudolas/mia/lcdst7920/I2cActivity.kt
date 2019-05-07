package com.rudolas.mia.lcdst7920

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.io.IOException
import android.util.Log
import com.google.android.things.pio.PeripheralManager
import java.nio.IntBuffer
import kotlin.math.PI
import kotlin.math.cos
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.widget.TextView
import kotlinx.android.synthetic.main.lcd_activity.*


class I2cActivity : AppCompatActivity() {
    private lateinit var mSsd1306: Ssd1306v2
    private val mHandler: Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setupAlphanumericDisplay()
        setContentView(R.layout.lcd_activity)
        setupOledDisplay()
//        mSsd1306.clearPixels()

//        val text = "Evelynka je 1234"
//        messageText.text = text
//        messageText2.text = text
//        AsyncTask.execute {
//            showCosinusWaveAnimated()
//        }

        /*mHandler.postDelayed(
            {
                val textBitmap = getTextBitmap(messageText)
//        textAsBitmap(text, 24.0f)
//        val textBitmap2 = textAsBitmap(text2, 20.0f)
                logMsg("Bitmap ${textBitmap.width} ${textBitmap.height}")
                val scaledBitmap = Bitmap.createScaledBitmap(textBitmap, 128, 64, true)
                BitmapHelper.setBmpData(mSsd1306, 0, 0, scaledBitmap, true)
                logMsg("ScaledBitmap ${scaledBitmap.width} ${scaledBitmap.height}")

                mSsd1306.show()
            }, 1000
        )*/

//        for (i in 0 .. 155) {
//            logMsg("Char [$i] ${i.toChar()}")
//        }
//        val messageOrig = "Evelynka je 1234 ta najlepsia a mama je naj kucharka vuobec zo vsetkych. Adbxtra20px kolko riadkov dokaze clovek vtesnat na tento 128x64 pixelovy OLED displejik" //
//        val message = if (messageOrig.length > 128) messageOrig.substring(0, 128) else messageOrig
//        for (i in message.indices) {
//            showFontChar(message[i], (i % 16) * 8, 8 * (i / 16))
//        }
//        mSsd1306.show()

        val message1 = "¿ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõö÷øùúûüýþÿĀāĂăĄąĆćĈĉĊċČčĎďĐđĒēĔĕĖėĘęĚěĜĝĞğĠġĢģĤĥĦħĨĩĪīĬĭĮįİ" +
                "ıĲĳĴĵĶķĸĹĺĻļĽľĿŀŁłŃńŅņŇňŉŊŋŌōŎŏŐőŒœŔŕŖŗŘřŚśŜŝŞşŠšŢţŤťŦŧŨũŪūŬŭŮůŰűŲųŴŵŶŷŸŹźŻżŽž"
        val message = "Žiadny príklad by nebol krajší, než takýto krásny text s dĺžňami a mäkčeňmi rýdzo po slovensky."
        messageText.text = message
        messageText2.text = ""
        messageText.post(object : Runnable {
            private var index = -1
            override fun run() {
//                mSsd1306.showFullScreenMessage(message)
                mSsd1306.showFontDemoScreen(Ssd1306v2.FONTS_ARRAY[++index % 23].name, message)
                messageText.postDelayed(this, 3000)
            }
        })
    }

    private fun showFontChar(char: Char, offsetX: Int, offsetY: Int) {
        val char1Array = SpiST7920.FONT6x8[char.toInt() - 32] //
        for (i in char1Array.indices) {
            val hex = char1Array[i]
            logMsg("char [$char] $i")
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

    private fun getTextBitmap(messageTextView: TextView): Bitmap {
        val textBitmap1 = Bitmap.createBitmap(messageTextView.width, messageTextView.height, Bitmap.Config.ARGB_8888)
        messageTextView.draw(Canvas(textBitmap1))
        return textBitmap1
    }

    private fun textAsBitmap(text: String, textSize: Float): Bitmap {
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.textSize = textSize
        paint.color = Color.WHITE
//        paint.textAlign = Paint.Align.LEFT
        val baseline = -paint.ascent() * 3 / 4// ascent() is negative
        val width = (paint.measureText(text) + .5f).toInt() // round
        val height = (baseline * 1.2f + paint.descent() + .5f).toInt()
        val image = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
//        val image = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(image)
        canvas.drawText(text, 0.toFloat(), baseline, paint)
        return image
    }

    private fun showVerticalHillRefresh() {
        mHandler.post(object : Runnable {
            override fun run() {
//                showHill2(true)
                showHill1(false)
                mSsd1306.show()
                showHill1(true)
//                showHill2(false)
                mSsd1306.show()
//                delayMicroseconds(10000)
                mHandler.postDelayed(this, REFRESH_DELAY)
            }

            private fun showHill1(toShow: Boolean) {
                val toShow1 = toShow
                for (i in 0..31) {
                    mSsd1306.setPixel(i, i, toShow1)
                    mSsd1306.setPixel(64 + i, i, toShow1)
                    mSsd1306.setPixel(63 - i, i, toShow1)
                    mSsd1306.setPixel(127 - i, i, toShow1)

                    mSsd1306.setPixel(31 - i, 32 + i, toShow1)
                    mSsd1306.setPixel(32 + i, 32 + i, toShow1)
                    mSsd1306.setPixel(95 - i, 32 + i, toShow1)
                    mSsd1306.setPixel(96 + i, 32 + i, toShow1)
                }
            }
        })
    }

    private fun showHorizontalHillRefresh() {
        mHandler.post(object : Runnable {
            override fun run() {
                showHill1(false)
                mSsd1306.show()
                showHill1(true)
                mSsd1306.show()
                mHandler.postDelayed(this, REFRESH_DELAY)
            }

            private fun showHill1(toShow: Boolean) {
                val toShow1 = toShow
                for (i in 0..31) {
                    val i1 = i % 32
                    mSsd1306.setPixel(i, i1, toShow1)
                    mSsd1306.setPixel(i, 63 - i1, toShow1)
                    mSsd1306.setPixel(64 + i, i1, toShow1)
                    mSsd1306.setPixel(64 + i, 63 - i1, toShow1)
                }
                for (i in 32..63) {
                    val i1 = i % 32
                    mSsd1306.setPixel(i, 31 - i1, toShow1)
                    mSsd1306.setPixel(i, 32 + i1, toShow1)
                    mSsd1306.setPixel(64 + i, 31 - i1, toShow1)
                    mSsd1306.setPixel(64 + i, 32 + i1, toShow1)
                }
//                for (i in 64..95) {
//                    val i1 = i % 32
//                    mSsd1306.setPixel(i, i1, toShow1)
//                    mSsd1306.setPixel(i, 63 - i1, toShow1)
//                }
//                for (i in 96..127) {
//                    val i1 = i % 32
//                    mSsd1306.setPixel(i, 32 + i1, toShow1)
//                    mSsd1306.setPixel(i, 31 - i1, toShow1)
//                }
            }
        })
    }

    private fun showVerticalHill2() {
        mHandler.post(object : Runnable {
            override fun run() {
                showHill2(true)
                showHill1(false)
                mSsd1306.show()
                showHill1(true)
                showHill2(false)
                mSsd1306.show()
//                delayMicroseconds(10000)
                mHandler.postDelayed(this, REFRESH_DELAY)
            }

            private fun showHill1(toShow: Boolean) {
                val toShow1 = toShow
                for (i in 0..63) {
                    mSsd1306.setPixel(i, i, toShow1)
                    mSsd1306.setPixel(64 + i, 63 - i, toShow1)
                    mSsd1306.setPixel(i, 63 - i, toShow1)
                    mSsd1306.setPixel(64 + i, i, toShow1)
                }
            }

            private fun showHill2(toShow: Boolean) {
                val toShow1 = toShow
                for (i in 0..63) {
                    mSsd1306.setPixel(i, i, toShow1)
                    mSsd1306.setPixel(64 + i, 63 - i, toShow1)
                    mSsd1306.setPixel(i, 63 - i, toShow1)
                    mSsd1306.setPixel(64 + i, i, toShow1)
                }
            }
        })
    }

    private fun showSinusHill() {
        val buffer: IntBuffer = IntBuffer.allocate(195)
        for (i in 0..155) {
            buffer.put(32 + Math.round(cos((i % 64) / 32.toFloat() * PI) * 31).toInt())
        }
        var index = 0
        while (true) {
            buffer.rewind().position(index)
            val intArrayNew = IntArray(131)
            buffer.get(intArrayNew)

            for (i in 0..63) {
                val yOld = intArrayNew[i]
                val y = intArrayNew[i + SHIFT_OFFSET]
                mSsd1306.setPixel(i, yOld, false)
                mSsd1306.setPixel(64 + i, yOld, false)
                mSsd1306.setPixel(i, y, true)
                mSsd1306.setPixel(64 + i, y, true)
            }
            mSsd1306.show()

            val nextIndex = index + SHIFT_OFFSET
            index = if (nextIndex > 63) nextIndex % 64 else nextIndex
        }
//        showCosinusWaveAnimated()


        /*mHandler.post(object : Runnable {
            private var index = -1
            private val buffer : IntBuffer = IntBuffer.allocate(128)
            override fun run() {
                if (index >= 0) {
                    showHill1(false)
                }
                buffer.rewind()
                index += 8
                for (i in 0..127) {
                    buffer.put(computeCosinusY(i + index))
                }
                mSsd1306.show()
                showHill1(true)
                mSsd1306.show()
                mHandler.postDelayed(this, 1)
            }

            private fun showHill1(toShow: Boolean) {
                val toShow1 = toShow
                buffer.rewind()
                for (i in 0..127) {
//                    logMsg("[$i]. Sin(${i/32.toFloat() * PI}) =  ${sin(i/32.toFloat() * PI)}")
                    //                    if (toShow1) {
//                        logMsg("[$i]. $i1")
//                    }
                    mSsd1306.setPixel(i, buffer[i], toShow1)
                }
            }

        })*/
    }

//    private fun computeCosinusY(i: Int) = 32 + Math.round(cos((i % 64) / 32.toFloat() * PI) * 31).toInt()

    /*private fun showHill1(toShow: Boolean, offset: Int) {
        buffer.rewind().position(offset % 64)
        val intArray = IntArray(128)
        buffer.get(intArray)

        val toShow1 = toShow
        for (i in 0..63) {
            val y = intArray[i]
            mSsd1306.setPixel(i, y, toShow1)
            mSsd1306.setPixel(64 + i, y, toShow1)
        }
    }*/

    /*private fun showHill2(intArrayOld: IntArray, offset: Int): IntArray {
        buffer.rewind().position(offset)
        val intArrayNew = IntArray(128)
        buffer.get(intArrayNew)

        for (i in 0..63) {
            val yOld = intArrayOld[i]
            mSsd1306.setPixel(i, yOld, false)
            mSsd1306.setPixel(64 + i, yOld, false)
            val y = intArrayNew[i]
            mSsd1306.setPixel(i, y, true)
            mSsd1306.setPixel(64 + i, y, true)
        }
        mSsd1306.show()

        return intArrayNew
    }*/

    private fun showDiagonals() {
        mHandler.post(object : Runnable {
            override fun run() {
                showDiagonal2(false)
                showDiagonal1(true)
                mSsd1306.show()
                delayMicroseconds(10000)
                showDiagonal1(false)
                showDiagonal2(true)
                mSsd1306.show()
                mHandler.postDelayed(this, 20)
            }

            private fun showDiagonal1(toShow: Boolean) {
                val toShow1 = toShow
                for (i in 0..63) {
                    mSsd1306.setPixel(2 * i, i, toShow1)
                }
            }

            private fun showDiagonal2(toShow: Boolean) {
                val toShow1 = toShow
                for (i in 0..63) {
                    mSsd1306.setPixel(2 * i, 63 - i, toShow1)
                }
            }
        })
    }

    private fun delayMicroseconds(delayMicroseconds: Int) {
        val millis = delayMicroseconds / 1000
        val micros = delayMicroseconds % 1000
//        logMsg(" # ---> Delay $millis ms $micros us")
        Thread.sleep(millis.toLong(), 1000 * micros)
    }

    override fun onDestroy() {
        super.onDestroy()
//        destroyAlphanumericDisplay()
        destroyOledDisplay()
    }


    /*private fun setupAlphanumericDisplay() {
            try {
                mSegmentDisplay = AlphanumericDisplay(I2C_BUS)
                mSegmentDisplay.setBrightness(1.0f)
                mSegmentDisplay.setEnabled(true)
                mSegmentDisplay.clear()
                mSegmentDisplay.display("ABCD")
            } catch (e: IOException) {
                Log.e(TAG, "Error configuring display", e)
            }

        }

        private fun destroyAlphanumericDisplay() {
            Log.i(TAG, "Closing display")
            try {
                mSegmentDisplay.close()
            } catch (e: IOException) {
                Log.e(TAG, "Error closing display", e)
            }
        }*/
    private fun setupOledDisplay() {
        val manager = PeripheralManager.getInstance()
        val deviceList: List<String> = manager.i2cBusList
        if (deviceList.isEmpty()) {
            Log.i(TAG, "No I2C bus available on this device.")
        } else {
            Log.i(TAG, "List of available devices: $deviceList")
        }
        try {
            mSsd1306 = Ssd1306v2(I2C_BUS, 0x3C)
        } catch (e: IOException) {
            Log.e(TAG, "Error while opening screen", e)
        }

        // Attempt to access the I2C device
//    mDevice = try {
//        PeripheralManager.getInstance()
//            .openI2cDevice(I2C_DEVICE_NAME, I2C_ADDRESS)
//    } catch (e: IOException) {
//        Log.w(TAG, "Unable to access I2C device", e)
//        null
//    }

        Log.d(TAG, "OLED screen activity created")
    }

    private fun destroyOledDisplay() {
        try {
            mSsd1306.close()
        } catch (e: IOException) {
            Log.e(TAG, "Error closing SSD1306", e)
        }
    }

    companion object {
        private val TAG = I2cActivity::class.java.simpleName
        private const val REFRESH_DELAY = 390.toLong()
        private const val SHIFT_OFFSET = 2
        private const val I2C_BUS = "I2C1"

        private fun logMsg(msg: String) = android.util.Log.d(TAG, msg)
    }
}
