package com.rudolas.mia.lcdst7920

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.io.IOException
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.google.android.things.contrib.driver.ssd1306.Ssd1306
import com.google.android.things.pio.PeripheralManager
import com.google.android.things.pio.SpiDevice
import kotlinx.android.synthetic.main.lcd_activity.*

class SpiLcdActivity : AppCompatActivity(), View.OnClickListener, AdapterView.OnItemSelectedListener {

    private var mDevice: SpiDevice? = null

    private lateinit var mST9720: SpiST9720
    private lateinit var mSsd1306: Ssd1306

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lcd_activity)
        logMsg("Display screen activity created")

        buttonClose.setOnClickListener(this)
        setupST7920SpiDisplay()
//        setupOledDisplay()

        fontsSpinner.adapter = ArrayAdapter<String>(
            this,
            R.layout.spinner_item,
            R.id.spinnerFontText,
            SpiST9720.fontsArray.map { it.name }.toList()
        )

        fontsSpinner.onItemSelectedListener = this

//        mSsd1306.clearPixels()
//        val messageOrig =
//            "Ahoj, ako sa mas? Mam sa velmi dobre a ked budes citat tieto riadky este lepsie. Vyborne :) Adbxtra20px kolko riadkov dokaze clovek vtesnat na tento 128x64 pixelovy displejik"
//        val message = if (messageOrig.length > 128) messageOrig.substring(0, 128) else messageOrig
//        for (i in message.indices) {
//            showSsd1306FontChar(message[i], (i % 16) * 8, 8 * (i / 16))
//        }
//
//        mSsd1306.show()

        if (false) {
//            mST9720.lcdDisableGraphics()
//            mST9720.lcdSendCommand(1) // write begin
//        for(i in 0.. 3) {
//            showLcdMessage("Ahoj$i", i, 0)
//            showLcdMessage("Ako sa mas?", i, 2)
//        }
            showLcdMessage("Ahoj")
        } else {
            mST9720.lcdEnableGraphics()

            if (true) {

//                mST9720.show6x8Message(messageOrig)
//                show6x8MessageCompacted2(
                showMessageCompacted3(
                    ""
//                    message1
                )
            } else {
                mST9720.showCosinusWaveAnimated()
            }
        }
    }

    private fun delayMillis(millis: Int) {
        mST9720.delayMicroseconds(1000 * millis)
    }

    private fun show6x8MessageCompacted2(msg: String) {
        mST9720.show6x8MessageCompacted2(msg)
        messageText.text = msg
    }

    private fun showMessageCompacted3(msg: String) {
        mST9720.renderGraphicsMessageCompacted3(msg)
        messageText.text = msg
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

    override fun onClick(view: View) {
        when (view.id) {
            R.id.buttonClose -> finish()
            else -> logMsg("Not found case")
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
            logInfo("No I2C bus available on this device.")
        } else {
            logInfo("List of available devices: $deviceList")
        }
        try {
            mSsd1306 = Ssd1306(I2C_BUS, 0x3C)
        } catch (e: IOException) {
            android.util.Log.e(TAG, "Error while opening OLED screen", e)
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
            logWarn("Unable to access SPI device", e)
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
            messageText.text = getString(R.string.init)
            mST9720.init()
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        logMsg("Spinner onNothingSelected")
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        logMsg("Spinner onItemSelected [$position] ${parent.getItemAtPosition(position)}")
//        mST9720.selectFont(parent.getItemAtPosition(position) as String)
        fontsSpinner.postDelayed(
            {fontsSpinner.setSelection((position + 1) % 23)},
            3000
        )
        mST9720.showFontDemoScreen(parent.getItemAtPosition(position) as String, message1)
    }

    private fun destroyOledDisplay() {
        try {
            mSsd1306.close()
        } catch (e: IOException) {
            logWarn("Error closing SSD1306", e)
        }
    }

    private fun destroyAlphanumericDisplay() {
        logInfo("Closing display")

        try {
            mDevice?.close()
            mDevice = null
        } catch (e: IOException) {
            android.util.Log.w(TAG, "Unable to close SPI device", e)
        }
    }

    companion object {
        private val TAG = SpiLcdActivity::class.java.simpleName
        private const val SPI_DEVICE_NAME = "SPI3.0"
        private const val I2C_BUS = "I2C1"
        private const val message1 = "¿ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõö÷øùúûüýþÿĀāĂăĄąĆćĈĉĊċČčĎďĐđĒēĔĕĖėĘęĚěĜĝĞğĠġĢģĤĥĦħĨĩĪīĬĭĮįİ" +
                        "ıĲĳĴĵĶķĸĹĺĻļĽľĿŀŁłŃńŅņŇňŉŊŋŌōŎŏŐőŒœŔŕŖŗŘřŚśŜŝŞşŠšŢţŤťŦŧŨũŪūŬŭŮůŰűŲųŴŵŶŷŸŹźŻżŽž"
        private const val message = "Žiadny príklad by nebol krajší, než takýto krásny text s dĺžňami a mäkčeňmi rýdzo po slovensky."

        private fun logMsg(msg: String) = android.util.Log.d(TAG, "LCD $msg")
        private fun logInfo(msg: String) = android.util.Log.i(TAG, "LCD $msg")
        private fun logWarn(msg: String, t: Throwable) = android.util.Log.w(TAG, "LCD $msg", t)
    }
}
