package com.rudolas.mia.lcdst7920;

import java.nio.ByteBuffer;

public class ST9720v2 {

    private static final int DATA_BYTES_SIZE = 3;
    private static final int SHIFT_OFFSET = 2;
    private static final int ROW_CHARS_16 = 16;
    private static final int ROW_CHARS_18 = 18;
    private static final int ROW_CHARS_21 = 21;
    private static final int SCREEN_CHARS_128 = 128;
    private static final int SCREEN_CHARS_168 = 168;

    private int actFontItemIndex = 0;
    private ByteBuffer mDataBuffer  = ByteBuffer.allocate(DATA_BYTES_SIZE);
    private ByteBuffer mGraphicsBuffer = ByteBuffer.allocate(DATA_BYTES_SIZE * 24 * 64);


    private void init() {
//        mDevice.setDelay(100);
    }

}
