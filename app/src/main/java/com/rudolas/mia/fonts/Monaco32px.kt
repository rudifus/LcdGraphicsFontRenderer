package com.rudolas.mia.fonts

class Monaco32px {
    companion object {
        val font = FontItem( // FONT 32px monaco.ttf
            "MONACO_32PX",
            charBytes = arrayOf(
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [0] 4x20 ' ' 0x20
                intArrayOf(
                    0x00, 0x00, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x00, 0x00,
                    0x0C, 0x0C, 0x00, 0x00, 0x00, 0x00
                ), // [1] 4x20 '!' 0x21
                intArrayOf(
                    0x00, 0x00, 0xCC, 0xCC, 0xCC, 0xCC, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [2] 8x20 '"' 0x22
                intArrayOf(
                    0x00,
                    0x00,
                    0xC0C,
                    0xC0C,
                    0x3030,
                    0x3030,
                    0x3FFFC,
                    0x3FFFC,
                    0xC0C0,
                    0xC0C0,
                    0xFFFFC,
                    0xFFFFC,
                    0x30300,
                    0x30300,
                    0xC0C00,
                    0xC0C00,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [3] 20x20 '#' 0x23
                intArrayOf(
                    0xC0, 0xC0, 0x3F0, 0x3F0, 0xCCC, 0xCCC, 0xCC0, 0xCC0, 0x3F0, 0x3F0, 0xCC, 0xCC, 0xCCC, 0xCCC,
                    0x3F0, 0x3F0, 0xC0, 0xC0, 0x00, 0x00
                ), // [4] 12x20 '$' 0x24
                intArrayOf(
                    0x00,
                    0x00,
                    0xC030,
                    0xC030,
                    0x330C0,
                    0x330C0,
                    0xC300,
                    0xC300,
                    0xC00,
                    0xC00,
                    0x3030,
                    0x3030,
                    0xC0CC,
                    0xC0CC,
                    0x30030,
                    0x30030,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [5] 18x20 '%' 0x25
                intArrayOf(
                    0x1F7C0,
                    0xFFC0,
                    0xFF80,
                    0x7E00,
                    0xFE00,
                    0x1FF1E,
                    0x3EF9E,
                    0x7CFDE,
                    0x787DE,
                    0x783FC,
                    0x781FC,
                    0x780FC,
                    0x7C0FC,
                    0x3FFFE,
                    0x1FFFE,
                    0xFFDF,
                    0x3F00,
                    0x00,
                    0x00,
                    0x00
                ), // [6] 20x20 '&' 0x26
                intArrayOf(
                    0x00, 0x00, 0x0C, 0x0C, 0x0C, 0x0C, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [7] 4x20 ''' 0x27
                intArrayOf(
                    0x00, 0x00, 0x0C, 0x0C, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30,
                    0x0C, 0x0C, 0x00, 0x00, 0x00, 0x00
                ), // [8] 6x20 '(' 0x28
                intArrayOf(
                    0x00, 0x00, 0x30, 0x30, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C,
                    0x30, 0x30, 0x00, 0x00, 0x00, 0x00
                ), // [9] 6x20 ')' 0x29
                intArrayOf(
                    0x00, 0x00, 0x30, 0x30, 0xCC, 0xCC, 0x30, 0x30, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [10] 8x20 '*' 0x2A
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x30, 0x30, 0xFC, 0xFC, 0x30, 0x30, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [11] 8x20 '+' 0x2B
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x0C, 0x0C,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [12] 6x20 ',' 0x2C
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xFC, 0xFC, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [13] 8x20 '-' 0x2D
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x0C, 0x0C, 0x00, 0x00, 0x00, 0x00
                ), // [14] 4x20 '.' 0x2E
                intArrayOf(
                    0x00, 0x00, 0x0C, 0x0C, 0x30, 0x30, 0x30, 0x30, 0xC0, 0xC0, 0x300, 0x300, 0x300, 0x300,
                    0xC00, 0xC00, 0x00, 0x00, 0x00, 0x00
                ), // [15] 12x20 '/' 0x2F
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xC3C, 0xC3C, 0xCCC, 0xCCC, 0xF0C, 0xF0C, 0xC0C, 0xC0C,
                    0x3F0, 0x3F0, 0x00, 0x00, 0x00, 0x00
                ), // [16] 12x20 '0' 0x30
                intArrayOf(
                    0x00, 0x00, 0x0C, 0x0C, 0x3C, 0x3C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C,
                    0x0C, 0x0C, 0x00, 0x00, 0x00, 0x00
                ), // [17] 6x20 '1' 0x31
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0x0C, 0x0C, 0x30, 0x30, 0xC0, 0xC0, 0x300, 0x300,
                    0xFFC, 0xFFC, 0x00, 0x00, 0x00, 0x00
                ), // [18] 12x20 '2' 0x32
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0x0C, 0x0C, 0xF0, 0xF0, 0x0C, 0x0C, 0xC0C, 0xC0C,
                    0x3F0, 0x3F0, 0x00, 0x00, 0x00, 0x00
                ), // [19] 12x20 '3' 0x33
                intArrayOf(
                    0x00, 0x00, 0x30, 0x30, 0xF0, 0xF0, 0x330, 0x330, 0xC30, 0xC30, 0xFFC, 0xFFC, 0x30, 0x30,
                    0x30, 0x30, 0x00, 0x00, 0x00, 0x00
                ), // [20] 12x20 '4' 0x34
                intArrayOf(
                    0x00, 0x00, 0xFFC, 0xFFC, 0xC00, 0xC00, 0xFF0, 0xFF0, 0x0C, 0x0C, 0x0C, 0x0C, 0xC0C, 0xC0C,
                    0x3F0, 0x3F0, 0x00, 0x00, 0x00, 0x00
                ), // [21] 12x20 '5' 0x35
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC00, 0xC00, 0xFF0, 0xFF0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0x3F0, 0x3F0, 0x00, 0x00, 0x00, 0x00
                ), // [22] 12x20 '6' 0x36
                intArrayOf(
                    0x00, 0x00, 0xFFC, 0xFFC, 0x0C, 0x0C, 0x0C, 0x0C, 0x30, 0x30, 0xC0, 0xC0, 0xC0, 0xC0,
                    0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00
                ), // [23] 12x20 '7' 0x37
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0x3F0, 0x3F0, 0x00, 0x00, 0x00, 0x00
                ), // [24] 12x20 '8' 0x38
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0x3FC, 0x3FC, 0x0C, 0x0C,
                    0x3F0, 0x3F0, 0x00, 0x00, 0x00, 0x00
                ), // [25] 12x20 '9' 0x39
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x0C, 0x0C, 0x00, 0x00, 0x0C, 0x0C, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [26] 4x20 ':' 0x3A
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x0C, 0x0C, 0x00, 0x00, 0x0C, 0x0C, 0x3C, 0x3C,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [27] 6x20 ';' 0x3B
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x0C, 0x0C, 0x30, 0x30, 0xC0, 0xC0, 0x30, 0x30,
                    0x0C, 0x0C, 0x00, 0x00, 0x00, 0x00
                ), // [28] 8x20 '<' 0x3C
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xFFC, 0xFFC, 0x00, 0x00, 0x00, 0x00, 0xFFC, 0xFFC,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [29] 12x20 '=' 0x3D
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xC0, 0xC0, 0x30, 0x30, 0x0C, 0x0C, 0x30, 0x30,
                    0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00
                ), // [30] 8x20 '>' 0x3E
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0x0C, 0x0C, 0x30, 0x30, 0xC0, 0xC0, 0x00, 0x00,
                    0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00
                ), // [31] 12x20 '?' 0x3F
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xC3C, 0xC3C, 0xCCC, 0xCCC, 0xCCC, 0xCCC, 0xC3C, 0xC3C,
                    0xC00, 0xC00, 0x3FC, 0x3FC, 0x00, 0x00
                ), // [32] 12x20 '@' 0x40
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xFFC, 0xFFC, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0xC0C, 0xC0C, 0x00, 0x00, 0x00, 0x00
                ), // [33] 12x20 'A' 0x41
                intArrayOf(
                    0x00, 0x00, 0xFF0, 0xFF0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xFF0, 0xFF0, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0xFF0, 0xFF0, 0x00, 0x00, 0x00, 0x00
                ), // [34] 12x20 'B' 0x42
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xC00, 0xC00, 0xC00, 0xC00, 0xC00, 0xC00, 0xC0C, 0xC0C,
                    0x3F0, 0x3F0, 0x00, 0x00, 0x00, 0x00
                ), // [35] 12x20 'C' 0x43
                intArrayOf(
                    0x00, 0x00, 0xFF0, 0xFF0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0xFF0, 0xFF0, 0x00, 0x00, 0x00, 0x00
                ), // [36] 12x20 'D' 0x44
                intArrayOf(
                    0x00, 0x00, 0xFFC, 0xFFC, 0xC00, 0xC00, 0xC00, 0xC00, 0xFF0, 0xFF0, 0xC00, 0xC00, 0xC00, 0xC00,
                    0xFFC, 0xFFC, 0x00, 0x00, 0x00, 0x00
                ), // [37] 12x20 'E' 0x45
                intArrayOf(
                    0x00, 0x00, 0xFFC, 0xFFC, 0xC00, 0xC00, 0xC00, 0xC00, 0xFF0, 0xFF0, 0xC00, 0xC00, 0xC00, 0xC00,
                    0xC00, 0xC00, 0x00, 0x00, 0x00, 0x00
                ), // [38] 12x20 'F' 0x46
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xC00, 0xC00, 0xC3C, 0xC3C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0x3F0, 0x3F0, 0x00, 0x00, 0x00, 0x00
                ), // [39] 12x20 'G' 0x47
                intArrayOf(
                    0x00, 0x00, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xFFC, 0xFFC, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0xC0C, 0xC0C, 0x00, 0x00, 0x00, 0x00
                ), // [40] 12x20 'H' 0x48
                intArrayOf(
                    0x00, 0x00, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C,
                    0x0C, 0x0C, 0x00, 0x00, 0x00, 0x00
                ), // [41] 4x20 'I' 0x49
                intArrayOf(
                    0x00, 0x00, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0x3F0, 0x3F0, 0x00, 0x00, 0x00, 0x00
                ), // [42] 12x20 'J' 0x4A
                intArrayOf(
                    0x00, 0x00, 0xC0C, 0xC0C, 0xC30, 0xC30, 0xCC0, 0xCC0, 0xF00, 0xF00, 0xCC0, 0xCC0, 0xC30, 0xC30,
                    0xC0C, 0xC0C, 0x00, 0x00, 0x00, 0x00
                ), // [43] 12x20 'K' 0x4B
                intArrayOf(
                    0x00, 0x00, 0xC00, 0xC00, 0xC00, 0xC00, 0xC00, 0xC00, 0xC00, 0xC00, 0xC00, 0xC00, 0xC00, 0xC00,
                    0xFFC, 0xFFC, 0x00, 0x00, 0x00, 0x00
                ), // [44] 12x20 'L' 0x4C
                intArrayOf(
                    0x00, 0x00, 0xC0C, 0xC0C, 0xF3C, 0xF3C, 0xCCC, 0xCCC, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0xC0C, 0xC0C, 0x00, 0x00, 0x00, 0x00
                ), // [45] 12x20 'M' 0x4D
                intArrayOf(
                    0x00, 0x00, 0xC0C, 0xC0C, 0xF0C, 0xF0C, 0xCCC, 0xCCC, 0xC3C, 0xC3C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0xC0C, 0xC0C, 0x00, 0x00, 0x00, 0x00
                ), // [46] 12x20 'N' 0x4E
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0x3F0, 0x3F0, 0x00, 0x00, 0x00, 0x00
                ), // [47] 12x20 'O' 0x4F
                intArrayOf(
                    0x00, 0x00, 0xFF0, 0xFF0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xFF0, 0xFF0, 0xC00, 0xC00, 0xC00, 0xC00,
                    0xC00, 0xC00, 0x00, 0x00, 0x00, 0x00
                ), // [48] 12x20 'P' 0x50
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0x3F0, 0x3F0, 0x0C, 0x0C, 0x00, 0x00
                ), // [49] 12x20 'Q' 0x51
                intArrayOf(
                    0x00, 0x00, 0xFF0, 0xFF0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xFF0, 0xFF0, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0xC0C, 0xC0C, 0x00, 0x00, 0x00, 0x00
                ), // [50] 12x20 'R' 0x52
                intArrayOf(
                    0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xC00, 0xC00, 0x3F0, 0x3F0, 0x0C, 0x0C, 0xC0C, 0xC0C,
                    0x3F0, 0x3F0, 0x00, 0x00, 0x00, 0x00
                ), // [51] 12x20 'S' 0x53
                intArrayOf(
                    0x00, 0x00, 0xFFC, 0xFFC, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0,
                    0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00
                ), // [52] 12x20 'T' 0x54
                intArrayOf(
                    0x00, 0x00, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0x3F0, 0x3F0, 0x00, 0x00, 0x00, 0x00
                ), // [53] 12x20 'U' 0x55
                intArrayOf(
                    0x00, 0x00, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0x330, 0x330, 0x330, 0x330, 0xC0, 0xC0,
                    0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00
                ), // [54] 12x20 'V' 0x56
                intArrayOf(
                    0x00, 0x00, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xCCC, 0xCCC, 0xF3C, 0xF3C,
                    0xC0C, 0xC0C, 0x00, 0x00, 0x00, 0x00
                ), // [55] 12x20 'W' 0x57
                intArrayOf(
                    0x00, 0x00, 0xC0C, 0xC0C, 0x330, 0x330, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0, 0x330, 0x330,
                    0xC0C, 0xC0C, 0x00, 0x00, 0x00, 0x00
                ), // [56] 12x20 'X' 0x58
                intArrayOf(
                    0x00, 0x00, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0x330, 0x330, 0xC0, 0xC0, 0xC0, 0xC0,
                    0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00
                ), // [57] 12x20 'Y' 0x59
                intArrayOf(
                    0x00, 0x00, 0xFFC, 0xFFC, 0x0C, 0x0C, 0x30, 0x30, 0xC0, 0xC0, 0x300, 0x300, 0xC00, 0xC00,
                    0xFFC, 0xFFC, 0x00, 0x00, 0x00, 0x00
                ), // [58] 12x20 'Z' 0x5A
                intArrayOf(
                    0x00, 0x00, 0x3C, 0x3C, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [59] 6x20 '[' 0x5B
                intArrayOf(
                    0x00, 0x00, 0xC00, 0xC00, 0x300, 0x300, 0x300, 0x300, 0xC0, 0xC0, 0x30, 0x30, 0x30, 0x30,
                    0x0C, 0x0C, 0x00, 0x00, 0x00, 0x00
                ), // [60] 12x20 '\' 0x5C
                intArrayOf(
                    0x00, 0x00, 0x3C, 0x3C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [61] 6x20 ']' 0x5D
                intArrayOf(
                    0x00, 0x00, 0x30, 0x30, 0xCC, 0xCC, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [62] 8x20 '^' 0x5E
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0xFFC, 0xFFC, 0x00, 0x00, 0x00, 0x00
                ), // [63] 12x20 '_' 0x5F
                intArrayOf(
                    0x00, 0x00, 0x01, 0x01, 0x01, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [64] 1x20 '`' 0x60
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x3FC, 0x3FC, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC3C, 0xC3C,
                    0x3CC, 0x3CC, 0x00, 0x00, 0x00, 0x00
                ), // [65] 12x20 'a' 0x61
                intArrayOf(
                    0x00, 0x00, 0xC00, 0xC00, 0xC00, 0xC00, 0xFF0, 0xFF0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0xFF0, 0xFF0, 0x00, 0x00, 0x00, 0x00
                ), // [66] 12x20 'b' 0x62
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xC00, 0xC00, 0xC00, 0xC00,
                    0x3FC, 0x3FC, 0x00, 0x00, 0x00, 0x00
                ), // [67] 12x20 'c' 0x63
                intArrayOf(
                    0x00, 0x00, 0x0C, 0x0C, 0x0C, 0x0C, 0x3FC, 0x3FC, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0x3FC, 0x3FC, 0x00, 0x00, 0x00, 0x00
                ), // [68] 12x20 'd' 0x64
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xFFC, 0xFFC, 0xC00, 0xC00,
                    0x3FC, 0x3FC, 0x00, 0x00, 0x00, 0x00
                ), // [69] 12x20 'e' 0x65
                intArrayOf(
                    0x00, 0x00, 0x3C, 0x3C, 0xC0, 0xC0, 0x3F0, 0x3F0, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0,
                    0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00
                ), // [70] 10x20 'f' 0x66
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x3FC, 0x3FC, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0x3FC, 0x3FC, 0x0C, 0x0C, 0x3F0, 0x3F0
                ), // [71] 12x20 'g' 0x67
                intArrayOf(
                    0x00, 0x00, 0xC00, 0xC00, 0xC00, 0xC00, 0xFF0, 0xFF0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0xC0C, 0xC0C, 0x00, 0x00, 0x00, 0x00
                ), // [72] 12x20 'h' 0x68
                intArrayOf(
                    0x00, 0x00, 0x0C, 0x0C, 0x00, 0x00, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C,
                    0x0C, 0x0C, 0x00, 0x00, 0x00, 0x00
                ), // [73] 4x20 'i' 0x69
                intArrayOf(
                    0x00, 0x00, 0x0C, 0x0C, 0x00, 0x00, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C,
                    0x0C, 0x0C, 0x0C, 0x0C, 0xF0, 0xF0
                ), // [74] 8x20 'j' 0x6A
                intArrayOf(
                    0x00, 0x00, 0xC00, 0xC00, 0xC00, 0xC00, 0xC30, 0xC30, 0xCC0, 0xCC0, 0xFC0, 0xFC0, 0xC30, 0xC30,
                    0xC0C, 0xC0C, 0x00, 0x00, 0x00, 0x00
                ), // [75] 12x20 'k' 0x6B
                intArrayOf(
                    0x00, 0x00, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [76] 6x20 'l' 0x6C
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xFF0, 0xFF0, 0xCCC, 0xCCC, 0xCCC, 0xCCC, 0xCCC, 0xCCC,
                    0xCCC, 0xCCC, 0x00, 0x00, 0x00, 0x00
                ), // [77] 12x20 'm' 0x6D
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xCF0, 0xCF0, 0xF0C, 0xF0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0xC0C, 0xC0C, 0x00, 0x00, 0x00, 0x00
                ), // [78] 12x20 'n' 0x6E
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x3F0, 0x3F0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0x3F0, 0x3F0, 0x00, 0x00, 0x00, 0x00
                ), // [79] 12x20 'o' 0x6F
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xFF0, 0xFF0, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0xFF0, 0xFF0, 0xC00, 0xC00, 0xC00, 0xC00
                ), // [80] 12x20 'p' 0x70
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x3FC, 0x3FC, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0x3FC, 0x3FC, 0x0C, 0x0C, 0x0C, 0x0C
                ), // [81] 12x20 'q' 0x71
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xCF0, 0xCF0, 0xF0C, 0xF0C, 0xC00, 0xC00, 0xC00, 0xC00,
                    0xC00, 0xC00, 0x00, 0x00, 0x00, 0x00
                ), // [82] 12x20 'r' 0x72
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x3FC, 0x3FC, 0xC00, 0xC00, 0x3F0, 0x3F0, 0x0C, 0x0C,
                    0xFF0, 0xFF0, 0x00, 0x00, 0x00, 0x00
                ), // [83] 12x20 's' 0x73
                intArrayOf(
                    0x00, 0x00, 0xC0, 0xC0, 0xC0, 0xC0, 0x3FC, 0x3FC, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [84] 10x20 't' 0x74
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC3C, 0xC3C,
                    0x3CC, 0x3CC, 0x00, 0x00, 0x00, 0x00
                ), // [85] 12x20 'u' 0x75
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0x330, 0x330, 0x330, 0x330,
                    0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00
                ), // [86] 12x20 'v' 0x76
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xCCC, 0xCCC, 0xCCC, 0xCCC, 0xCCC, 0xCCC, 0xCCC, 0xCCC,
                    0x330, 0x330, 0x00, 0x00, 0x00, 0x00
                ), // [87] 12x20 'w' 0x77
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xC0C, 0xC0C, 0x330, 0x330, 0xC0, 0xC0, 0x330, 0x330,
                    0xC0C, 0xC0C, 0x00, 0x00, 0x00, 0x00
                ), // [88] 12x20 'x' 0x78
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C, 0xC0C,
                    0x3FC, 0x3FC, 0x0C, 0x0C, 0x3F0, 0x3F0
                ), // [89] 12x20 'y' 0x79
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xFFC, 0xFFC, 0x30, 0x30, 0xC0, 0xC0, 0x300, 0x300,
                    0xFFC, 0xFFC, 0x00, 0x00, 0x00, 0x00
                ), // [90] 12x20 'z' 0x7A
                intArrayOf(
                    0x00, 0x00, 0x0C, 0x0C, 0x30, 0x30, 0x30, 0x30, 0xF0, 0xF0, 0x30, 0x30, 0x30, 0x30,
                    0x0C, 0x0C, 0x00, 0x00, 0x00, 0x00
                ), // [91] 8x20 '{' 0x7B
                intArrayOf(
                    0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C,
                    0x0C, 0x0C, 0x0C, 0x0C, 0x00, 0x00
                ), // [92] 4x20 '|' 0x7C
                intArrayOf(
                    0x00, 0x00, 0xC0, 0xC0, 0x30, 0x30, 0x30, 0x30, 0x3C, 0x3C, 0x30, 0x30, 0x30, 0x30,
                    0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00
                ), // [93] 8x20 '}' 0x7D
                intArrayOf(
                    0x00,
                    0x00,
                    0x00,
                    0x3F01C,
                    0x7F81C,
                    0xFFE3C,
                    0xFFF7C,
                    0xF1FF8,
                    0xE0FF8,
                    0xE03F0,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [94] 22x20 '~' 0x7E
                intArrayOf(
                    0x3C, 0x3C, 0x18, 0x00, 0x00, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C
                ), // [95] 8x20 '¡' 0xA1
                intArrayOf(
                    0x7FF8,
                    0x7FF8,
                    0xFFFC,
                    0xF7BC,
                    0x1F7BC,
                    0x1E780,
                    0x1E780,
                    0x1E780,
                    0x1E780,
                    0x1E780,
                    0x1F79C,
                    0xF7BC,
                    0xFFFC,
                    0x7FFC,
                    0x7FF8,
                    0x3FF0,
                    0x7C0,
                    0x780,
                    0x780,
                    0x780
                ), // [96] 18x20 '¢' 0xA2
                intArrayOf(
                    0xF000,
                    0xF000,
                    0xF000,
                    0x3FF80,
                    0x3FF80,
                    0x3FF80,
                    0x3FF80,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0xF000,
                    0xF000,
                    0x3FFFE,
                    0x3FFFE,
                    0x3FFFE,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [97] 19x20 '£' 0xA3
                intArrayOf(
                    0xFC1F8,
                    0xF80F8,
                    0x1F007C,
                    0x1E003C,
                    0x1E003C,
                    0x1C003C,
                    0x1C001C,
                    0x1C003C,
                    0x1E003C,
                    0x1E003C,
                    0x1F007C,
                    0xF80F8,
                    0x1FC1FC,
                    0x1FFFFE,
                    0x3FFFFE,
                    0x1DFFDC,
                    0x83E08,
                    0x00,
                    0x00,
                    0x00
                ), // [98] 23x20 '¤' 0xA4
                intArrayOf(
                    0x3EF8,
                    0x1EF0,
                    0x1FF0,
                    0xFE0,
                    0xFFFC,
                    0xFFFC,
                    0xFFFC,
                    0x780,
                    0x780,
                    0xFFFC,
                    0xFFFC,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [99] 17x20 '¥' 0xA5
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x00, 0x00, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C
                ), // [100] 8x20 '¦' 0xA6
                intArrayOf(
                    0x3E000,
                    0x3F800,
                    0x1FF00,
                    0x1FFE0,
                    0x3FFF0,
                    0x7CFF8,
                    0x781FC,
                    0x7807C,
                    0x7803C,
                    0x7C03C,
                    0x3F83C,
                    0x3FF7C,
                    0xFFF8,
                    0x7FF0,
                    0xFF8,
                    0x1F8,
                    0x3807C,
                    0x7803C,
                    0x7803C,
                    0x7C07C
                ), // [101] 20x20 '§' 0xA7
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [102] 13x20 '¨' 0xA8
                intArrayOf(
                    0x73CF9E,
                    0xE3878E,
                    0xE7838E,
                    0xE7800E,
                    0xE7800E,
                    0xE7800E,
                    0xE7838E,
                    0xE3838E,
                    0xF3C79E,
                    0x73FF1C,
                    0x79FF3C,
                    0x3CFC78,
                    0x3E00F8,
                    0x1F83F0,
                    0xFFFE0,
                    0x3FF80,
                    0x7C00,
                    0x00,
                    0x00,
                    0x00
                ), // [103] 25x20 '©' 0xA9
                intArrayOf(
                    0xF9C, 0xE1C, 0xFFC, 0xFFC, 0x7FE, 0x1C0, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [104] 14x20 'ª' 0xAA
                intArrayOf(
                    0x00,
                    0x3DE,
                    0x7BC,
                    0x7BC,
                    0xF78,
                    0x1EF0,
                    0x3FF0,
                    0x3DE0,
                    0x1EF0,
                    0x1FF8,
                    0xF78,
                    0x7BC,
                    0x3DE,
                    0x3DE,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [105] 15x20 '«' 0xAB
                intArrayOf(
                    0x00, 0x00, 0x00, 0x1FFF8, 0x1FFF8, 0x1FFF8, 0xFFF8, 0x38, 0x38, 0x38, 0x38, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [106] 18x20 '¬' 0xAC
                IntArray(0), // blank font char '­' 0xAD
                intArrayOf(
                    0x71C79E,
                    0xE1C38E,
                    0xE1C78E,
                    0xE1FF8E,
                    0xE1FF0E,
                    0xE1FF0E,
                    0xE1C78E,
                    0xE1C78E,
                    0xF1C39E,
                    0x71C39C,
                    0x79C3BC,
                    0x3DC3F8,
                    0x3E00F8,
                    0x1F83F0,
                    0xFFFE0,
                    0x3FF80,
                    0x7C00,
                    0x00,
                    0x00,
                    0x00
                ), // [108] 25x20 '®' 0xAE
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [109] 15x20 '¯' 0xAF
                intArrayOf(
                    0x1F8, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [110] 12x20 '°' 0xB0
                intArrayOf(
                    0x3C0,
                    0x3C0,
                    0xFFFE,
                    0xFFFE,
                    0xFFFE,
                    0xFFFE,
                    0x3C0,
                    0x3C0,
                    0x3C0,
                    0x3C0,
                    0x3C0,
                    0x3C0,
                    0x00,
                    0x7FFE,
                    0x7FFE,
                    0x7FFE,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [111] 17x20 '±' 0xB1
                intArrayOf(
                    0xF8, 0x1F0, 0x3E0, 0x7FE, 0x7FE, 0x7FE, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [112] 12x20 '²' 0xB2
                intArrayOf(
                    0xFE, 0x1E, 0x71E, 0x7FE, 0x7FC, 0x3F8, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [113] 12x20 '³' 0xB3
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [114] 10x20 '´' 0xB4
                intArrayOf(
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF87C,
                    0xFFFC,
                    0xFFFC,
                    0xFFFC,
                    0xFF80,
                    0xF000,
                    0xF000,
                    0xF000
                ), // [115] 18x20 'µ' 0xB5
                intArrayOf(
                    0x7FF3C,
                    0x7FF3C,
                    0x7FF3C,
                    0x3FF3C,
                    0x1FF3C,
                    0x7F3C,
                    0xF3C,
                    0xF3C,
                    0xF3C,
                    0xF3C,
                    0xF3C,
                    0xF3C,
                    0xF3C,
                    0xF3C,
                    0xF3C,
                    0xF3C,
                    0xF3C,
                    0xF3C,
                    0xF3C,
                    0xF3C
                ), // [116] 20x20 '¶' 0xB6
                intArrayOf(
                    0x00, 0x00, 0x18, 0x3C, 0x3C, 0x3C, 0x1C, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [117] 8x20 '·' 0xB7
                intArrayOf(
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x38, 0x7E, 0x7E, 0x0E
                ), // [118] 8x20 '¸' 0xB8
                intArrayOf(
                    0x70, 0x70, 0x70, 0x70, 0x70, 0x70, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [119] 12x20 '¹' 0xB9
                intArrayOf(
                    0x3C3C, 0x1E3C, 0x1FFC, 0x1FF8, 0xFF0, 0x3C0, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                    0x00, 0x00, 0x00, 0x00, 0x00, 0x00
                ), // [120] 15x20 'º' 0xBA
                intArrayOf(
                    0x00,
                    0x3CF0,
                    0x1C70,
                    0x1E78,
                    0xF3C,
                    0xFBE,
                    0x79E,
                    0x3CF,
                    0x79E,
                    0xFBE,
                    0xF3C,
                    0x1E78,
                    0x3CF0,
                    0x3CF0,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [121] 15x20 '»' 0xBB
                intArrayOf(
                    0x70780,
                    0x70700,
                    0x70F00,
                    0x71E3C,
                    0x71C7C,
                    0x73C7C,
                    0x78FC,
                    0x79FC,
                    0xF3FC,
                    0xE3FC,
                    0x1E7BC,
                    0x3CFFE,
                    0x38FFE,
                    0x78FFE,
                    0x1003C,
                    0x3C,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [122] 23x20 '¼' 0xBC
                intArrayOf(
                    0x1C1E00,
                    0x1C1C00,
                    0x1C3C00,
                    0x1C7BE0,
                    0x1C77F8,
                    0x1CFFF8,
                    0x1EF3C,
                    0x1EE3C,
                    0x3C07C,
                    0x38078,
                    0x781F0,
                    0xF03E0,
                    0xE07C0,
                    0x1E0F80,
                    0x40FFC,
                    0xFFC,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [123] 25x20 '½' 0xBD
                intArrayOf(
                    0xFC780,
                    0x1E700,
                    0x71EF00,
                    0x7BFE3C,
                    0x7FFC7C,
                    0x3FFC7C,
                    0xE78FC,
                    0x79FC,
                    0xF3FC,
                    0xE3FC,
                    0x1E7BC,
                    0x3CFFE,
                    0x38FFE,
                    0x78FFE,
                    0x1003C,
                    0x3C,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [124] 25x20 '¾' 0xBE
                intArrayOf(
                    0x3E0, 0x1E0, 0x80, 0x00, 0x00, 0x1E0, 0x1E0, 0x3E0, 0x3C0, 0x7C0, 0xF80, 0x1F00, 0x3E00, 0x3E00,
                    0x3C00, 0x3C00, 0x3C1E, 0x3C1E, 0x3E3E, 0x3FFE
                ), // [125] 15x20 '¿' 0xBF
                intArrayOf(
                    0x7BC0,
                    0xF3E0,
                    0xF1E0,
                    0xF1E0,
                    0x1E0F0,
                    0x1E0F0,
                    0x3E0F0,
                    0x3FFF8,
                    0x3FFF8,
                    0x7FFFC,
                    0x7FFFC,
                    0x7803C,
                    0xF003E,
                    0xF001E,
                    0x1F001F,
                    0x1E000F,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [126] 21x20 'À' 0xC0
                intArrayOf(
                    0x7BC0,
                    0xF3E0,
                    0xF1E0,
                    0xF1E0,
                    0x1E0F0,
                    0x1E0F0,
                    0x3E0F0,
                    0x3FFF8,
                    0x3FFF8,
                    0x7FFFC,
                    0x7FFFC,
                    0x7803C,
                    0xF003E,
                    0xF001E,
                    0x1F001F,
                    0x1E000F,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [127] 21x20 'Á' 0xC1
                intArrayOf(
                    0x7BC0,
                    0xF3E0,
                    0xF1E0,
                    0xF1E0,
                    0x1E0F0,
                    0x1E0F0,
                    0x3E0F0,
                    0x3FFF8,
                    0x3FFF8,
                    0x7FFFC,
                    0x7FFFC,
                    0x7803C,
                    0xF003E,
                    0xF001E,
                    0x1F001F,
                    0x1E000F,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [128] 21x20 'Â' 0xC2
                intArrayOf(
                    0x7BC0,
                    0xF3E0,
                    0xF1E0,
                    0xF1E0,
                    0x1E0F0,
                    0x1E0F0,
                    0x3E0F0,
                    0x3FFF8,
                    0x3FFF8,
                    0x7FFFC,
                    0x7FFFC,
                    0x7803C,
                    0xF003E,
                    0xF001E,
                    0x1F001F,
                    0x1E000F,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [129] 21x20 'Ã' 0xC3
                intArrayOf(
                    0x7BC0,
                    0xF3E0,
                    0xF1E0,
                    0xF1E0,
                    0x1E0F0,
                    0x1E0F0,
                    0x3E0F0,
                    0x3FFF8,
                    0x3FFF8,
                    0x7FFFC,
                    0x7FFFC,
                    0x7803C,
                    0xF003E,
                    0xF001E,
                    0x1F001F,
                    0x1E000F,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [130] 21x20 'Ä' 0xC4
                intArrayOf(
                    0x7BC0,
                    0xF3E0,
                    0xF1E0,
                    0xF1E0,
                    0x1E0F0,
                    0x1E0F0,
                    0x3E0F0,
                    0x3FFF8,
                    0x3FFF8,
                    0x7FFFC,
                    0x7FFFC,
                    0x7803C,
                    0xF003E,
                    0xF001E,
                    0x1F001F,
                    0x1E000F,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [131] 21x20 'Å' 0xC5
                intArrayOf(
                    0x3EF000,
                    0x3CF000,
                    0x7CFFFC,
                    0x787FFC,
                    0xF87FFC,
                    0x1F07FFC,
                    0x1F07800,
                    0x3FFF800,
                    0x3FFF800,
                    0x7FFF800,
                    0xFFFF800,
                    0xF807800,
                    0x1F007800,
                    0x1E007FFF,
                    0x3E007FFF,
                    0x3C007FFF,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [132] 30x20 'Æ' 0xC6
                intArrayOf(
                    0x7801E,
                    0xF8000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF8000,
                    0x7801E,
                    0x7801E,
                    0x7803E,
                    0x7C03C,
                    0x3E07C,
                    0x1FFF8,
                    0x1FFF0,
                    0x7FE0,
                    0x1F80,
                    0x1F80,
                    0x1F80,
                    0x380
                ), // [133] 21x20 'Ç' 0xC7
                intArrayOf(
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFC,
                    0xFFFC,
                    0xFFFC,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFF,
                    0xFFFF,
                    0xFFFF,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [134] 18x20 'È' 0xC8
                intArrayOf(
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFC,
                    0xFFFC,
                    0xFFFC,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFF,
                    0xFFFF,
                    0xFFFF,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [135] 18x20 'É' 0xC9
                intArrayOf(
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFC,
                    0xFFFC,
                    0xFFFC,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFF,
                    0xFFFF,
                    0xFFFF,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [136] 18x20 'Ê' 0xCA
                intArrayOf(
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFC,
                    0xFFFC,
                    0xFFFC,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFF,
                    0xFFFF,
                    0xFFFF,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [137] 18x20 'Ë' 0xCB
                intArrayOf(
                    0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78,
                    0x78, 0x78, 0x00, 0x00, 0x00, 0x00
                ), // [138] 9x20 'Ì' 0xCC
                intArrayOf(
                    0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78,
                    0x78, 0x78, 0x00, 0x00, 0x00, 0x00
                ), // [139] 9x20 'Í' 0xCD
                intArrayOf(
                    0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78,
                    0x78, 0x78, 0x00, 0x00, 0x00, 0x00
                ), // [140] 9x20 'Î' 0xCE
                intArrayOf(
                    0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78,
                    0x78, 0x78, 0x00, 0x00, 0x00, 0x00
                ), // [141] 9x20 'Ï' 0xCF
                intArrayOf(
                    0x3C01E,
                    0x3C01E,
                    0x3C01E,
                    0x1FFC1E,
                    0x1FFC1E,
                    0x1FFC1E,
                    0x3C01E,
                    0x3C01E,
                    0x3C01E,
                    0x3C03E,
                    0x3C03C,
                    0x3C07C,
                    0x3C1F8,
                    0x3FFF0,
                    0x3FFE0,
                    0x3FF80,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [142] 21x20 'Ð' 0xD0
                intArrayOf(
                    0x1FF03C,
                    0x1EF83C,
                    0x1E783C,
                    0x1E7C3C,
                    0x1E3E3C,
                    0x1E3E3C,
                    0x1E1F3C,
                    0x1E0FBC,
                    0x1E0FBC,
                    0x1E07FC,
                    0x1E03FC,
                    0x1E03FC,
                    0x1E01FC,
                    0x1E00FC,
                    0x1E00FC,
                    0x1E007C,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [143] 23x20 'Ñ' 0xD1
                intArrayOf(
                    0xF003C,
                    0xF003E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1F003E,
                    0xF003C,
                    0xF003C,
                    0xF807C,
                    0x7807C,
                    0x7E0F8,
                    0x3FFF0,
                    0x1FFE0,
                    0xFFC0,
                    0x3F00,
                    0x00,
                    0x00,
                    0x00
                ), // [144] 22x20 'Ò' 0xD2
                intArrayOf(
                    0xF003C,
                    0xF003E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1F003E,
                    0xF003C,
                    0xF003C,
                    0xF807C,
                    0x7807C,
                    0x7E0F8,
                    0x3FFF0,
                    0x1FFE0,
                    0xFFC0,
                    0x3F00,
                    0x00,
                    0x00,
                    0x00
                ), // [145] 22x20 'Ó' 0xD3
                intArrayOf(
                    0xF003C,
                    0xF003E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1F003E,
                    0xF003C,
                    0xF003C,
                    0xF807C,
                    0x7807C,
                    0x7E0F8,
                    0x3FFF0,
                    0x1FFE0,
                    0xFFC0,
                    0x3F00,
                    0x00,
                    0x00,
                    0x00
                ), // [146] 22x20 'Ô' 0xD4
                intArrayOf(
                    0xF003C,
                    0xF003E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1F003E,
                    0xF003C,
                    0xF003C,
                    0xF807C,
                    0x7807C,
                    0x7E0F8,
                    0x3FFF0,
                    0x1FFE0,
                    0xFFC0,
                    0x3F00,
                    0x00,
                    0x00,
                    0x00
                ), // [147] 22x20 'Õ' 0xD5
                intArrayOf(
                    0xF003C,
                    0xF003E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1F003E,
                    0xF003C,
                    0xF003C,
                    0xF807C,
                    0x7807C,
                    0x7E0F8,
                    0x3FFF0,
                    0x1FFE0,
                    0xFFC0,
                    0x3F00,
                    0x00,
                    0x00,
                    0x00
                ), // [148] 22x20 'Ö' 0xD6
                intArrayOf(
                    0xF83E,
                    0x7C7C,
                    0x3EF8,
                    0x1FF0,
                    0xFE0,
                    0x7C0,
                    0xFE0,
                    0x1FF0,
                    0x3EF8,
                    0x7CFC,
                    0xF87E,
                    0xF03E,
                    0x601C,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [149] 17x20 '×' 0xD7
                intArrayOf(
                    0xF03FC,
                    0xF03BE,
                    0x1E079E,
                    0x1E071E,
                    0x1E0F1E,
                    0x1E1E1E,
                    0x1E1C1E,
                    0xF3C3E,
                    0xF783C,
                    0xF703C,
                    0xFF07C,
                    0x7E07C,
                    0x7E0F8,
                    0x3FFF0,
                    0x3FFE0,
                    0x7FFC0,
                    0xF3F00,
                    0xF0000,
                    0x00,
                    0x00
                ), // [150] 22x20 'Ø' 0xD8
                intArrayOf(
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7C07C,
                    0x7E0F8,
                    0x3FFF8,
                    0x1FFF0,
                    0xFFE0,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [151] 21x20 'Ù' 0xD9
                intArrayOf(
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7C07C,
                    0x7E0F8,
                    0x3FFF8,
                    0x1FFF0,
                    0xFFE0,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [152] 21x20 'Ú' 0xDA
                intArrayOf(
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7C07C,
                    0x7E0F8,
                    0x3FFF8,
                    0x1FFF0,
                    0xFFE0,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [153] 21x20 'Û' 0xDB
                intArrayOf(
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7C07C,
                    0x7E0F8,
                    0x3FFF8,
                    0x1FFF0,
                    0xFFE0,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [154] 21x20 'Ü' 0xDC
                intArrayOf(
                    0x78F8,
                    0x7CF0,
                    0x3DF0,
                    0x3FE0,
                    0x1FC0,
                    0x1FC0,
                    0xF80,
                    0xF80,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [155] 19x20 'Ý' 0xDD
                intArrayOf(
                    0x1FFFC,
                    0x1E07C,
                    0x1E03E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E03E,
                    0x1E07C,
                    0x1FFFC,
                    0x1FFF8,
                    0x1FFF0,
                    0x1FF00,
                    0x1E000,
                    0x1E000,
                    0x1E000,
                    0x1E000,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [156] 19x20 'Þ' 0xDE
                intArrayOf(
                    0x1E3E0,
                    0x1E3C0,
                    0x1E3C0,
                    0x1E3C0,
                    0x1E3C0,
                    0x1E3F0,
                    0x1E1F8,
                    0x1E0FC,
                    0x1E07E,
                    0x1E03E,
                    0x1E01E,
                    0x1E01E,
                    0x1E81E,
                    0x1EFFE,
                    0x1EFFC,
                    0x1EFF8,
                    0x3E0,
                    0x00,
                    0x00,
                    0x00
                ), // [157] 19x20 'ß' 0xDF
                intArrayOf(
                    0x3FF8,
                    0x7FFC,
                    0x783C,
                    0x783C,
                    0x1E,
                    0x7FE,
                    0x1FFE,
                    0x7FFE,
                    0x7E1E,
                    0xF81E,
                    0xF01E,
                    0xF03E,
                    0xF87E,
                    0x7FFE,
                    0x7FFE,
                    0x3FFE,
                    0xF80,
                    0x00,
                    0x00,
                    0x00
                ), // [158] 17x20 'à' 0xE0
                intArrayOf(
                    0x3FF8,
                    0x7FFC,
                    0x783C,
                    0x783C,
                    0x1E,
                    0x7FE,
                    0x1FFE,
                    0x7FFE,
                    0x7E1E,
                    0xF81E,
                    0xF01E,
                    0xF03E,
                    0xF87E,
                    0x7FFE,
                    0x7FFE,
                    0x3FFE,
                    0xF80,
                    0x00,
                    0x00,
                    0x00
                ), // [159] 17x20 'á' 0xE1
                intArrayOf(
                    0x3FF8,
                    0x7FFC,
                    0x783C,
                    0x783C,
                    0x1E,
                    0x7FE,
                    0x1FFE,
                    0x7FFE,
                    0x7E1E,
                    0xF81E,
                    0xF01E,
                    0xF03E,
                    0xF87E,
                    0x7FFE,
                    0x7FFE,
                    0x3FFE,
                    0xF80,
                    0x00,
                    0x00,
                    0x00
                ), // [160] 17x20 'â' 0xE2
                intArrayOf(
                    0x3FF8,
                    0x7FFC,
                    0x783C,
                    0x783C,
                    0x1E,
                    0x7FE,
                    0x1FFE,
                    0x7FFE,
                    0x7E1E,
                    0xF81E,
                    0xF01E,
                    0xF03E,
                    0xF87E,
                    0x7FFE,
                    0x7FFE,
                    0x3FFE,
                    0xF80,
                    0x00,
                    0x00,
                    0x00
                ), // [161] 17x20 'ã' 0xE3
                intArrayOf(
                    0x3FF8,
                    0x7FFC,
                    0x783C,
                    0x783C,
                    0x1E,
                    0x7FE,
                    0x1FFE,
                    0x7FFE,
                    0x7E1E,
                    0xF81E,
                    0xF01E,
                    0xF03E,
                    0xF87E,
                    0x7FFE,
                    0x7FFE,
                    0x3FFE,
                    0xF80,
                    0x00,
                    0x00,
                    0x00
                ), // [162] 17x20 'ä' 0xE4
                intArrayOf(
                    0x3FF8,
                    0x7FFC,
                    0x783C,
                    0x783C,
                    0x1E,
                    0x7FE,
                    0x1FFE,
                    0x7FFE,
                    0x7E1E,
                    0xF81E,
                    0xF01E,
                    0xF03E,
                    0xF87E,
                    0x7FFE,
                    0x7FFE,
                    0x3FFE,
                    0xF80,
                    0x00,
                    0x00,
                    0x00
                ), // [163] 17x20 'å' 0xE5
                intArrayOf(
                    0x1FFFFFC,
                    0x1FFFFFC,
                    0x3E1FC3E,
                    0x3C0F81E,
                    0xC0F81E,
                    0xF00E,
                    0xFFFFFE,
                    0x1FFFFFE,
                    0x3FFFFFE,
                    0x3E0F000,
                    0x3C0F800,
                    0x3C0F800,
                    0x3C1FC0C,
                    0x3FFFFFE,
                    0x3FFDFFE,
                    0x1FF8FFC,
                    0x7E03F0,
                    0x00,
                    0x00,
                    0x00
                ), // [164] 27x20 'æ' 0xE6
                intArrayOf(
                    0x3FFC,
                    0x7FFC,
                    0x7C3E,
                    0xF81E,
                    0xF01E,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF01E,
                    0xF81E,
                    0x7C3E,
                    0x7FFC,
                    0x3FFC,
                    0x1FF0,
                    0x7C0,
                    0x7E0,
                    0x7E0,
                    0xE0
                ), // [165] 17x20 'ç' 0xE7
                intArrayOf(
                    0x3FF8,
                    0x3FFC,
                    0x7C3E,
                    0x781E,
                    0xF01E,
                    0xF01E,
                    0xFFFE,
                    0xFFFE,
                    0xFFFE,
                    0xF000,
                    0xF000,
                    0xF80C,
                    0x7C1E,
                    0x7FFE,
                    0x3FFC,
                    0x1FF8,
                    0x3E0,
                    0x00,
                    0x00,
                    0x00
                ), // [166] 17x20 'è' 0xE8
                intArrayOf(
                    0x3FF8,
                    0x3FFC,
                    0x7C3E,
                    0x781E,
                    0xF01E,
                    0xF01E,
                    0xFFFE,
                    0xFFFE,
                    0xFFFE,
                    0xF000,
                    0xF000,
                    0xF80C,
                    0x7C1E,
                    0x7FFE,
                    0x3FFC,
                    0x1FF8,
                    0x3E0,
                    0x00,
                    0x00,
                    0x00
                ), // [167] 17x20 'é' 0xE9
                intArrayOf(
                    0x3FF8,
                    0x3FFC,
                    0x7C3E,
                    0x781E,
                    0xF01E,
                    0xF01E,
                    0xFFFE,
                    0xFFFE,
                    0xFFFE,
                    0xF000,
                    0xF000,
                    0xF80C,
                    0x7C1E,
                    0x7FFE,
                    0x3FFC,
                    0x1FF8,
                    0x3E0,
                    0x00,
                    0x00,
                    0x00
                ), // [168] 17x20 'ê' 0xEA
                intArrayOf(
                    0x3FF8,
                    0x3FFC,
                    0x7C3E,
                    0x781E,
                    0xF01E,
                    0xF01E,
                    0xFFFE,
                    0xFFFE,
                    0xFFFE,
                    0xF000,
                    0xF000,
                    0xF80C,
                    0x7C1E,
                    0x7FFE,
                    0x3FFC,
                    0x1FF8,
                    0x3E0,
                    0x00,
                    0x00,
                    0x00
                ), // [169] 17x20 'ë' 0xEB
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [170] 8x20 'ì' 0xEC
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [171] 8x20 'í' 0xED
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [172] 8x20 'î' 0xEE
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [173] 8x20 'ï' 0xEF
                intArrayOf(
                    0xF78,
                    0x3FFC,
                    0xFFFC,
                    0xFFFC,
                    0x1F07C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x3C03C,
                    0x1C03C,
                    0x1E03C,
                    0x1E07C,
                    0x1F078,
                    0xFFF8,
                    0x7FF0,
                    0x3FE0,
                    0xF80,
                    0x00,
                    0x00,
                    0x00
                ), // [174] 19x20 'ð' 0xF0
                intArrayOf(
                    0xFFF8,
                    0xFFFC,
                    0xF87C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [175] 18x20 'ñ' 0xF1
                intArrayOf(
                    0x7FF8,
                    0x7FFC,
                    0xF87C,
                    0xF03E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1F03E,
                    0xF83C,
                    0xFFFC,
                    0x7FF8,
                    0x3FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [176] 18x20 'ò' 0xF2
                intArrayOf(
                    0x7FF8,
                    0x7FFC,
                    0xF87C,
                    0xF03E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1F03E,
                    0xF83C,
                    0xFFFC,
                    0x7FF8,
                    0x3FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [177] 18x20 'ó' 0xF3
                intArrayOf(
                    0x7FF8,
                    0x7FFC,
                    0xF87C,
                    0xF03E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1F03E,
                    0xF83C,
                    0xFFFC,
                    0x7FF8,
                    0x3FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [178] 18x20 'ô' 0xF4
                intArrayOf(
                    0x7FF8,
                    0x7FFC,
                    0xF87C,
                    0xF03E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1F03E,
                    0xF83C,
                    0xFFFC,
                    0x7FF8,
                    0x3FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [179] 18x20 'õ' 0xF5
                intArrayOf(
                    0x7FF8,
                    0x7FFC,
                    0xF87C,
                    0xF03E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1F03E,
                    0xF83C,
                    0xFFFC,
                    0x7FF8,
                    0x3FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [180] 18x20 'ö' 0xF6
                intArrayOf(
                    0x780,
                    0x00,
                    0x00,
                    0x1FFFE,
                    0x1FFFE,
                    0x1FFFE,
                    0x1FFFE,
                    0x00,
                    0x00,
                    0x300,
                    0x780,
                    0x780,
                    0x780,
                    0x300,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [181] 18x20 '÷' 0xF7
                intArrayOf(
                    0x7FF8,
                    0x7FFC,
                    0xF8FC,
                    0xF0FE,
                    0x1E1DE,
                    0x1E1DE,
                    0x1E39E,
                    0x1E39E,
                    0x1E71E,
                    0x1E71E,
                    0x1EE1E,
                    0x1FE3E,
                    0xFC3C,
                    0xFFFC,
                    0x7FF8,
                    0x3FF0,
                    0x77C0,
                    0x7000,
                    0x6000,
                    0x00
                ), // [182] 18x20 'ø' 0xF8
                intArrayOf(
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF07C,
                    0xFFFC,
                    0x7FFC,
                    0x7FFC,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [183] 18x20 'ù' 0xF9
                intArrayOf(
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF07C,
                    0xFFFC,
                    0x7FFC,
                    0x7FFC,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [184] 18x20 'ú' 0xFA
                intArrayOf(
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF07C,
                    0xFFFC,
                    0x7FFC,
                    0x7FFC,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [185] 18x20 'û' 0xFB
                intArrayOf(
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF07C,
                    0xFFFC,
                    0x7FFC,
                    0x7FFC,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [186] 18x20 'ü' 0xFC
                intArrayOf(
                    0x7C0F,
                    0x3C1F,
                    0x3C1E,
                    0x3E1E,
                    0x1E3C,
                    0x1E3C,
                    0x1F3C,
                    0xF78,
                    0xF78,
                    0xFF8,
                    0x7F0,
                    0x7F0,
                    0x3F0,
                    0x3E0,
                    0x3E0,
                    0x1E0,
                    0x3C0,
                    0x3C0,
                    0x3C0,
                    0xF80
                ), // [187] 15x20 'ý' 0xFD
                intArrayOf(
                    0xFFF8,
                    0xFFFC,
                    0xF87C,
                    0xF03E,
                    0xF01E,
                    0xF01E,
                    0xF01E,
                    0xF01E,
                    0xF01E,
                    0xF01E,
                    0xF01E,
                    0xF03E,
                    0xF87C,
                    0xFFFC,
                    0xFFF8,
                    0xFFF0,
                    0xF3C0,
                    0xF000,
                    0xF000,
                    0xF000
                ), // [188] 18x20 'þ' 0xFE
                intArrayOf(
                    0x7C0F,
                    0x3C1F,
                    0x3C1E,
                    0x3E1E,
                    0x1E3C,
                    0x1E3C,
                    0x1F3C,
                    0xF78,
                    0xF78,
                    0xFF8,
                    0x7F0,
                    0x7F0,
                    0x3F0,
                    0x3E0,
                    0x3E0,
                    0x1E0,
                    0x3C0,
                    0x3C0,
                    0x3C0,
                    0xF80
                ), // [189] 15x20 'ÿ' 0xFF
                intArrayOf(
                    0x7BC0,
                    0xF3E0,
                    0xF1E0,
                    0xF1E0,
                    0x1E0F0,
                    0x1E0F0,
                    0x3E0F0,
                    0x3FFF8,
                    0x3FFF8,
                    0x7FFFC,
                    0x7FFFC,
                    0x7803C,
                    0xF003E,
                    0xF001E,
                    0x1F001F,
                    0x1E000F,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [190] 21x20 'Ā' 0x100
                intArrayOf(
                    0x3FF8,
                    0x7FFC,
                    0x783C,
                    0x783C,
                    0x1E,
                    0x7FE,
                    0x1FFE,
                    0x7FFE,
                    0x7E1E,
                    0xF81E,
                    0xF01E,
                    0xF03E,
                    0xF87E,
                    0x7FFE,
                    0x7FFE,
                    0x3FFE,
                    0xF80,
                    0x00,
                    0x00,
                    0x00
                ), // [191] 17x20 'ā' 0x101
                intArrayOf(
                    0x7BC0,
                    0xF3E0,
                    0xF1E0,
                    0xF1E0,
                    0x1E0F0,
                    0x1E0F0,
                    0x3E0F0,
                    0x3FFF8,
                    0x3FFF8,
                    0x7FFFC,
                    0x7FFFC,
                    0x7803C,
                    0xF003E,
                    0xF001E,
                    0x1F001F,
                    0x1E000F,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [192] 21x20 'Ă' 0x102
                intArrayOf(
                    0x3FF8,
                    0x7FFC,
                    0x783C,
                    0x783C,
                    0x1E,
                    0x7FE,
                    0x1FFE,
                    0x7FFE,
                    0x7E1E,
                    0xF81E,
                    0xF01E,
                    0xF03E,
                    0xF87E,
                    0x7FFE,
                    0x7FFE,
                    0x3FFE,
                    0xF80,
                    0x00,
                    0x00,
                    0x00
                ), // [193] 17x20 'ă' 0x103
                intArrayOf(
                    0x7BC0,
                    0xF3E0,
                    0xF1E0,
                    0xF1E0,
                    0x1E0F0,
                    0x1E0F0,
                    0x3E0F0,
                    0x3FFF8,
                    0x3FFF8,
                    0x7FFFC,
                    0x7FFFC,
                    0x7803C,
                    0xF003E,
                    0xF001E,
                    0x1F001F,
                    0x1E000F,
                    0x1E,
                    0x3C,
                    0x78,
                    0x78
                ), // [194] 21x20 'Ą' 0x104
                intArrayOf(
                    0x3FF8,
                    0x7FFC,
                    0x783C,
                    0x783C,
                    0x1E,
                    0x7FE,
                    0x1FFE,
                    0x7FFE,
                    0x7E1E,
                    0xF81E,
                    0xF01E,
                    0xF03E,
                    0xF87E,
                    0x7FFE,
                    0x7FFE,
                    0x3FFE,
                    0xFBE,
                    0x78,
                    0x70,
                    0xF0
                ), // [195] 17x20 'ą' 0x105
                intArrayOf(
                    0x7801E,
                    0xF8000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF8000,
                    0x7801E,
                    0x7801E,
                    0x7803E,
                    0x7C03C,
                    0x3E07C,
                    0x1FFF8,
                    0x1FFF0,
                    0x7FE0,
                    0x1F80,
                    0x00,
                    0x00,
                    0x00
                ), // [196] 21x20 'Ć' 0x106
                intArrayOf(
                    0x3FFC,
                    0x7FFC,
                    0x7C3E,
                    0xF81E,
                    0xF01E,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF01E,
                    0xF81E,
                    0x7C3E,
                    0x7FFC,
                    0x3FFC,
                    0x1FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [197] 17x20 'ć' 0x107
                intArrayOf(
                    0x7801E,
                    0xF8000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF8000,
                    0x7801E,
                    0x7801E,
                    0x7803E,
                    0x7C03C,
                    0x3E07C,
                    0x1FFF8,
                    0x1FFF0,
                    0x7FE0,
                    0x1F80,
                    0x00,
                    0x00,
                    0x00
                ), // [198] 21x20 'Ĉ' 0x108
                intArrayOf(
                    0x3FFC,
                    0x7FFC,
                    0x7C3E,
                    0xF81E,
                    0xF01E,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF01E,
                    0xF81E,
                    0x7C3E,
                    0x7FFC,
                    0x3FFC,
                    0x1FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [199] 17x20 'ĉ' 0x109
                intArrayOf(
                    0x7801E,
                    0xF8000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF8000,
                    0x7801E,
                    0x7801E,
                    0x7803E,
                    0x7C03C,
                    0x3E07C,
                    0x1FFF8,
                    0x1FFF0,
                    0x7FE0,
                    0x1F80,
                    0x00,
                    0x00,
                    0x00
                ), // [200] 21x20 'Ċ' 0x10A
                intArrayOf(
                    0x3FFC,
                    0x7FFC,
                    0x7C3E,
                    0xF81E,
                    0xF01E,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF01E,
                    0xF81E,
                    0x7C3E,
                    0x7FFC,
                    0x3FFC,
                    0x1FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [201] 17x20 'ċ' 0x10B
                intArrayOf(
                    0x7801E,
                    0xF8000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF0000,
                    0xF8000,
                    0x7801E,
                    0x7801E,
                    0x7803E,
                    0x7C03C,
                    0x3E07C,
                    0x1FFF8,
                    0x1FFF0,
                    0x7FE0,
                    0x1F80,
                    0x00,
                    0x00,
                    0x00
                ), // [202] 21x20 'Č' 0x10C
                intArrayOf(
                    0x3FFC,
                    0x7FFC,
                    0x7C3E,
                    0xF81E,
                    0xF01E,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF01E,
                    0xF81E,
                    0x7C3E,
                    0x7FFC,
                    0x3FFC,
                    0x1FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [203] 17x20 'č' 0x10D
                intArrayOf(
                    0x7803C,
                    0x7803C,
                    0x7801E,
                    0x7801E,
                    0x7801E,
                    0x7801E,
                    0x7801E,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7807C,
                    0x780F8,
                    0x781F8,
                    0x7FFF0,
                    0x7FFE0,
                    0x7FF80,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [204] 21x20 'Ď' 0x10E
                intArrayOf(
                    0x1FFF0,
                    0x3FFF0,
                    0x3E1F0,
                    0x7C0F0,
                    0x780F0,
                    0x780F0,
                    0x780F0,
                    0x780F0,
                    0x780F0,
                    0x780F0,
                    0x780F0,
                    0x7C0F0,
                    0x3E1F0,
                    0x3FFF0,
                    0x1FFF0,
                    0xFFF0,
                    0x3E00,
                    0x00,
                    0x00,
                    0x00
                ), // [205] 20x20 'ď' 0x10F
                intArrayOf(
                    0x3C01E,
                    0x3C01E,
                    0x3C01E,
                    0x1FFC1E,
                    0x1FFC1E,
                    0x1FFC1E,
                    0x3C01E,
                    0x3C01E,
                    0x3C01E,
                    0x3C03E,
                    0x3C03C,
                    0x3C07C,
                    0x3C1F8,
                    0x3FFF0,
                    0x3FFE0,
                    0x3FF80,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [206] 21x20 'Đ' 0x110
                intArrayOf(
                    0xFFF8,
                    0x1FFF8,
                    0x1F0F8,
                    0x3E078,
                    0x3C078,
                    0x3C078,
                    0x3C078,
                    0x3C078,
                    0x3C078,
                    0x3C078,
                    0x3C078,
                    0x3E078,
                    0x1F0F8,
                    0x1FFF8,
                    0xFFF8,
                    0x7FF8,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [207] 19x20 'đ' 0x111
                intArrayOf(
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFC,
                    0xFFFC,
                    0xFFFC,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFF,
                    0xFFFF,
                    0xFFFF,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [208] 18x20 'Ē' 0x112
                intArrayOf(
                    0x3FF8,
                    0x3FFC,
                    0x7C3E,
                    0x781E,
                    0xF01E,
                    0xF01E,
                    0xFFFE,
                    0xFFFE,
                    0xFFFE,
                    0xF000,
                    0xF000,
                    0xF80C,
                    0x7C1E,
                    0x7FFE,
                    0x3FFC,
                    0x1FF8,
                    0x3E0,
                    0x00,
                    0x00,
                    0x00
                ), // [209] 17x20 'ē' 0x113
                intArrayOf(
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFC,
                    0xFFFC,
                    0xFFFC,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFF,
                    0xFFFF,
                    0xFFFF,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [210] 18x20 'Ĕ' 0x114
                intArrayOf(
                    0x3FF8,
                    0x3FFC,
                    0x7C3E,
                    0x781E,
                    0xF01E,
                    0xF01E,
                    0xFFFE,
                    0xFFFE,
                    0xFFFE,
                    0xF000,
                    0xF000,
                    0xF80C,
                    0x7C1E,
                    0x7FFE,
                    0x3FFC,
                    0x1FF8,
                    0x3E0,
                    0x00,
                    0x00,
                    0x00
                ), // [211] 17x20 'ĕ' 0x115
                intArrayOf(
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFC,
                    0xFFFC,
                    0xFFFC,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFF,
                    0xFFFF,
                    0xFFFF,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [212] 18x20 'Ė' 0x116
                intArrayOf(
                    0x3FF8,
                    0x3FFC,
                    0x7C3E,
                    0x781E,
                    0xF01E,
                    0xF01E,
                    0xFFFE,
                    0xFFFE,
                    0xFFFE,
                    0xF000,
                    0xF000,
                    0xF80C,
                    0x7C1E,
                    0x7FFE,
                    0x3FFC,
                    0x1FF8,
                    0x3E0,
                    0x00,
                    0x00,
                    0x00
                ), // [213] 17x20 'ė' 0x117
                intArrayOf(
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFC,
                    0xFFFC,
                    0xFFFC,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFF,
                    0xFFFF,
                    0xFFFF,
                    0x3C,
                    0x78,
                    0xF0,
                    0xF0
                ), // [214] 18x20 'Ę' 0x118
                intArrayOf(
                    0x3FF8,
                    0x3FFC,
                    0x7C3E,
                    0x781E,
                    0xF01E,
                    0xF01E,
                    0xFFFE,
                    0xFFFE,
                    0xFFFE,
                    0xF000,
                    0xF000,
                    0xF80C,
                    0x7C1E,
                    0x7FFE,
                    0x3FFC,
                    0x1FF8,
                    0x3F0,
                    0x3C0,
                    0x3C0,
                    0x3D0
                ), // [215] 17x20 'ę' 0x119
                intArrayOf(
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFC,
                    0xFFFC,
                    0xFFFC,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xF000,
                    0xFFFF,
                    0xFFFF,
                    0xFFFF,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [216] 18x20 'Ě' 0x11A
                intArrayOf(
                    0x3FF8,
                    0x3FFC,
                    0x7C3E,
                    0x781E,
                    0xF01E,
                    0xF01E,
                    0xFFFE,
                    0xFFFE,
                    0xFFFE,
                    0xF000,
                    0xF000,
                    0xF80C,
                    0x7C1E,
                    0x7FFE,
                    0x3FFC,
                    0x1FF8,
                    0x3E0,
                    0x00,
                    0x00,
                    0x00
                ), // [217] 17x20 'ě' 0x11B
                intArrayOf(
                    0xF0000,
                    0xF0000,
                    0x1F0000,
                    0x1E0000,
                    0x1E07FC,
                    0x1E07FC,
                    0x1F07FC,
                    0xF07FC,
                    0xF003C,
                    0xF003C,
                    0xF803C,
                    0x7803C,
                    0x7E07C,
                    0x3FFFC,
                    0x1FFF8,
                    0xFFF0,
                    0x1F80,
                    0x00,
                    0x00,
                    0x00
                ), // [218] 22x20 'Ĝ' 0x11C
                intArrayOf(
                    0x7FFC,
                    0xFFFC,
                    0xF87C,
                    0x1F03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1F03C,
                    0xF87C,
                    0xFFFC,
                    0x7FFC,
                    0x3FFC,
                    0xFBC,
                    0x3C,
                    0x607C,
                    0xF8FC
                ), // [219] 18x20 'ĝ' 0x11D
                intArrayOf(
                    0xF0000,
                    0xF0000,
                    0x1F0000,
                    0x1E0000,
                    0x1E07FC,
                    0x1E07FC,
                    0x1F07FC,
                    0xF07FC,
                    0xF003C,
                    0xF003C,
                    0xF803C,
                    0x7803C,
                    0x7E07C,
                    0x3FFFC,
                    0x1FFF8,
                    0xFFF0,
                    0x1F80,
                    0x00,
                    0x00,
                    0x00
                ), // [220] 22x20 'Ğ' 0x11E
                intArrayOf(
                    0x7FFC,
                    0xFFFC,
                    0xF87C,
                    0x1F03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1F03C,
                    0xF87C,
                    0xFFFC,
                    0x7FFC,
                    0x3FFC,
                    0xFBC,
                    0x3C,
                    0x607C,
                    0xF8FC
                ), // [221] 18x20 'ğ' 0x11F
                intArrayOf(
                    0xF0000,
                    0xF0000,
                    0x1F0000,
                    0x1E0000,
                    0x1E07FC,
                    0x1E07FC,
                    0x1F07FC,
                    0xF07FC,
                    0xF003C,
                    0xF003C,
                    0xF803C,
                    0x7803C,
                    0x7E07C,
                    0x3FFFC,
                    0x1FFF8,
                    0xFFF0,
                    0x1F80,
                    0x00,
                    0x00,
                    0x00
                ), // [222] 22x20 'Ġ' 0x120
                intArrayOf(
                    0x7FFC,
                    0xFFFC,
                    0xF87C,
                    0x1F03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1F03C,
                    0xF87C,
                    0xFFFC,
                    0x7FFC,
                    0x3FFC,
                    0xFBC,
                    0x3C,
                    0x607C,
                    0xF8FC
                ), // [223] 18x20 'ġ' 0x121
                intArrayOf(
                    0xF0000,
                    0xF0000,
                    0x1F0000,
                    0x1E0000,
                    0x1E07FC,
                    0x1E07FC,
                    0x1F07FC,
                    0xF07FC,
                    0xF003C,
                    0xF003C,
                    0xF803C,
                    0x7803C,
                    0x7E07C,
                    0x3FFFC,
                    0x1FFF8,
                    0xFFF0,
                    0x1F80,
                    0x00,
                    0x1E00,
                    0x1E00
                ), // [224] 22x20 'Ģ' 0x122
                intArrayOf(
                    0x7FFC,
                    0xFFFC,
                    0xF87C,
                    0x1F03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1E03C,
                    0x1F03C,
                    0xF87C,
                    0xFFFC,
                    0x7FFC,
                    0x3FFC,
                    0xFBC,
                    0x3C,
                    0x607C,
                    0xF8FC
                ), // [225] 18x20 'ģ' 0x123
                intArrayOf(
                    0x1E003C,
                    0x1E003C,
                    0x1E003C,
                    0x1FFFFC,
                    0x1FFFFC,
                    0x1FFFFC,
                    0x1E003C,
                    0x1E003C,
                    0x1E003C,
                    0x1E003C,
                    0x1E003C,
                    0x1E003C,
                    0x1E003C,
                    0x1E003C,
                    0x1E003C,
                    0x1E003C,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [226] 23x20 'Ĥ' 0x124
                intArrayOf(
                    0xFFF8,
                    0xFFFC,
                    0xF87C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [227] 18x20 'ĥ' 0x125
                intArrayOf(
                    0xF001E,
                    0xF001E,
                    0xF001E,
                    0xFFFFE,
                    0xFFFFE,
                    0xFFFFE,
                    0xF001E,
                    0xF001E,
                    0xF001E,
                    0xF001E,
                    0xF001E,
                    0xF001E,
                    0xF001E,
                    0xF001E,
                    0xF001E,
                    0xF001E,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [228] 22x20 'Ħ' 0x126
                intArrayOf(
                    0xFFFC,
                    0xFFFC,
                    0xFC3C,
                    0xF83C,
                    0xF01C,
                    0xF01C,
                    0xF01C,
                    0xF01C,
                    0xF01C,
                    0xF01C,
                    0xF01C,
                    0xF01C,
                    0xF01C,
                    0xF01C,
                    0xF01C,
                    0xF01C,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [229] 18x20 'ħ' 0x127
                intArrayOf(
                    0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78,
                    0x78, 0x78, 0x00, 0x00, 0x00, 0x00
                ), // [230] 9x20 'Ĩ' 0x128
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [231] 8x20 'ĩ' 0x129
                intArrayOf(
                    0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78,
                    0x78, 0x78, 0x00, 0x00, 0x00, 0x00
                ), // [232] 9x20 'Ī' 0x12A
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [233] 8x20 'ī' 0x12B
                intArrayOf(
                    0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78,
                    0x78, 0x78, 0x00, 0x00, 0x00, 0x00
                ), // [234] 9x20 'Ĭ' 0x12C
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [235] 8x20 'ĭ' 0x12D
                intArrayOf(
                    0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78,
                    0x78, 0x78, 0x78, 0xF0, 0x1E0, 0x1E0
                ), // [236] 9x20 'Į' 0x12E
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x78, 0xF0, 0xE0, 0xE0
                ), // [237] 8x20 'į' 0x12F
                intArrayOf(
                    0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78,
                    0x78, 0x78, 0x00, 0x00, 0x00, 0x00
                ), // [238] 9x20 'İ' 0x130
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [239] 8x20 'ı' 0x131
                intArrayOf(
                    0xF0001E,
                    0xF0001E,
                    0xF0001E,
                    0xF0001E,
                    0xF0001E,
                    0xF0001E,
                    0xF0001E,
                    0xF0001E,
                    0xF0001E,
                    0xF1E01E,
                    0xF1E01E,
                    0xF1F03C,
                    0xF0F87C,
                    0xF0FFFC,
                    0xF07FF8,
                    0xF03FF0,
                    0xFC0,
                    0x00,
                    0x00,
                    0x00
                ), // [240] 26x20 'Ĳ' 0x132
                intArrayOf(
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E1E,
                    0x1E,
                    0x1E,
                    0x1E,
                    0x3E
                ), // [241] 15x20 'ĳ' 0x133
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C03C, 0x3C03C, 0x3E078, 0x1F0F8, 0x1FFF8,
                    0xFFF0, 0x7FE0, 0x1F80, 0x00, 0x00, 0x00
                ), // [242] 18x20 'Ĵ' 0x134
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x7C
                ), // [243] 8x20 'ĵ' 0x135
                intArrayOf(
                    0x3CFC0,
                    0x3DF80,
                    0x3DF00,
                    0x3FE00,
                    0x3FF00,
                    0x3FF80,
                    0x3FFC0,
                    0x3E7C0,
                    0x3C3E0,
                    0x3C1F0,
                    0x3C0F8,
                    0x3C0F8,
                    0x3C07C,
                    0x3C03E,
                    0x3C01F,
                    0x3C01F,
                    0xF00,
                    0xF00,
                    0xF00,
                    0xF00
                ), // [244] 20x20 'Ķ' 0x136
                intArrayOf(
                    0x3C3E,
                    0x3C7C,
                    0x3CF8,
                    0x3DF0,
                    0x3FE0,
                    0x3FC0,
                    0x3FC0,
                    0x3FE0,
                    0x3FE0,
                    0x3FF0,
                    0x3CF8,
                    0x3C7C,
                    0x3C7C,
                    0x3C3E,
                    0x3C1F,
                    0x3C0F,
                    0x3C0,
                    0x3C0,
                    0x3C0,
                    0x3C0
                ), // [245] 16x20 'ķ' 0x137
                intArrayOf(
                    0xF07C,
                    0xF0F8,
                    0xF1F0,
                    0xF3E0,
                    0xF7E0,
                    0xF7C0,
                    0xFF80,
                    0xFF00,
                    0xFF80,
                    0xF7C0,
                    0xF3E0,
                    0xF1F0,
                    0xF1F8,
                    0xF0FC,
                    0xF07E,
                    0xF03E,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [246] 18x20 'ĸ' 0x138
                intArrayOf(
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7FFF,
                    0x7FFF,
                    0x7FFF,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [247] 17x20 'Ĺ' 0x139
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x00, 0x00, 0x00, 0x00
                ), // [248] 8x20 'ĺ' 0x13A
                intArrayOf(
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7FFF,
                    0x7FFF,
                    0x7FFF,
                    0x00,
                    0x1E0,
                    0x1E0,
                    0x1E0
                ), // [249] 17x20 'Ļ' 0x13B
                intArrayOf(
                    0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C, 0x3C,
                    0x3C, 0x3C, 0x00, 0x3C, 0x3C, 0x3C
                ), // [250] 8x20 'ļ' 0x13C
                intArrayOf(
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7FFF,
                    0x7FFF,
                    0x7FFF,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [251] 17x20 'Ľ' 0x13D
                intArrayOf(
                    0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0,
                    0xF0, 0xF0, 0x00, 0x00, 0x00, 0x00
                ), // [252] 10x20 'ľ' 0x13E
                intArrayOf(
                    0x7800,
                    0x7840,
                    0x78F0,
                    0x78F0,
                    0x78F0,
                    0x7860,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7FFF,
                    0x7FFF,
                    0x7FFF,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [253] 17x20 'Ŀ' 0x13F
                intArrayOf(
                    0x1E0, 0x1E4, 0x1EF, 0x1EF, 0x1EF, 0x1E6, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0,
                    0x1E0, 0x1E0, 0x00, 0x00, 0x00, 0x00
                ), // [254] 11x20 'ŀ' 0x140
                intArrayOf(
                    0x7800,
                    0x7980,
                    0x7F80,
                    0x7F80,
                    0x1FE00,
                    0x1F800,
                    0x1F800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7800,
                    0x7FFF,
                    0x7FFF,
                    0x7FFF,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [255] 17x20 'Ł' 0x141
                intArrayOf(
                    0x78, 0x7F, 0x7F, 0xFF, 0x1FC, 0x1F8, 0x1F8, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78,
                    0x78, 0x78, 0x00, 0x00, 0x00, 0x00
                ), // [256] 9x20 'ł' 0x142
                intArrayOf(
                    0x1FF03C,
                    0x1EF83C,
                    0x1E783C,
                    0x1E7C3C,
                    0x1E3E3C,
                    0x1E3E3C,
                    0x1E1F3C,
                    0x1E0FBC,
                    0x1E0FBC,
                    0x1E07FC,
                    0x1E03FC,
                    0x1E03FC,
                    0x1E01FC,
                    0x1E00FC,
                    0x1E00FC,
                    0x1E007C,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [257] 23x20 'Ń' 0x143
                intArrayOf(
                    0xFFF8,
                    0xFFFC,
                    0xF87C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [258] 18x20 'ń' 0x144
                intArrayOf(
                    0x1FF03C,
                    0x1EF83C,
                    0x1E783C,
                    0x1E7C3C,
                    0x1E3E3C,
                    0x1E3E3C,
                    0x1E1F3C,
                    0x1E0FBC,
                    0x1E0FBC,
                    0x1E07FC,
                    0x1E03FC,
                    0x1E03FC,
                    0x1E01FC,
                    0x1E00FC,
                    0x1E00FC,
                    0x1E007C,
                    0x00,
                    0x3C00,
                    0x3C00,
                    0x3C00
                ), // [259] 23x20 'Ņ' 0x145
                intArrayOf(
                    0xFFF8,
                    0xFFFC,
                    0xF87C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0x00,
                    0x780,
                    0x780,
                    0x780
                ), // [260] 18x20 'ņ' 0x146
                intArrayOf(
                    0x1FF03C,
                    0x1EF83C,
                    0x1E783C,
                    0x1E7C3C,
                    0x1E3E3C,
                    0x1E3E3C,
                    0x1E1F3C,
                    0x1E0FBC,
                    0x1E0FBC,
                    0x1E07FC,
                    0x1E03FC,
                    0x1E03FC,
                    0x1E01FC,
                    0x1E00FC,
                    0x1E00FC,
                    0x1E007C,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [261] 23x20 'Ň' 0x147
                intArrayOf(
                    0xFFF8,
                    0xFFFC,
                    0xF87C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [262] 18x20 'ň' 0x148
                intArrayOf(
                    0xFFF8,
                    0xFFFC,
                    0xF87C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [263] 18x20 'ŉ' 0x149
                intArrayOf(
                    0xFF83C,
                    0xF7C3C,
                    0xF7C3C,
                    0xF3E3C,
                    0xF1E3C,
                    0xF1F3C,
                    0xF0FBC,
                    0xF07BC,
                    0xF07FC,
                    0xF03FC,
                    0xF01FC,
                    0xF01FC,
                    0xF00FC,
                    0xF00FC,
                    0xF007C,
                    0xF003C,
                    0x3C,
                    0x3C,
                    0x3C,
                    0x7C
                ), // [264] 22x20 'Ŋ' 0x14A
                intArrayOf(
                    0xFFF8,
                    0xFFFC,
                    0xF87C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0x3C,
                    0x3C,
                    0x3C,
                    0x7C
                ), // [265] 18x20 'ŋ' 0x14B
                intArrayOf(
                    0xF003C,
                    0xF003E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1F003E,
                    0xF003C,
                    0xF003C,
                    0xF807C,
                    0x7807C,
                    0x7E0F8,
                    0x3FFF0,
                    0x1FFE0,
                    0xFFC0,
                    0x3F00,
                    0x00,
                    0x00,
                    0x00
                ), // [266] 22x20 'Ō' 0x14C
                intArrayOf(
                    0x7FF8,
                    0x7FFC,
                    0xF87C,
                    0xF03E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1F03E,
                    0xF83C,
                    0xFFFC,
                    0x7FF8,
                    0x3FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [267] 18x20 'ō' 0x14D
                intArrayOf(
                    0xF003C,
                    0xF003E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1F003E,
                    0xF003C,
                    0xF003C,
                    0xF807C,
                    0x7807C,
                    0x7E0F8,
                    0x3FFF0,
                    0x1FFE0,
                    0xFFC0,
                    0x3F00,
                    0x00,
                    0x00,
                    0x00
                ), // [268] 22x20 'Ŏ' 0x14E
                intArrayOf(
                    0x7FF8,
                    0x7FFC,
                    0xF87C,
                    0xF03E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1F03E,
                    0xF83C,
                    0xFFFC,
                    0x7FF8,
                    0x3FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [269] 18x20 'ŏ' 0x14F
                intArrayOf(
                    0xF003C,
                    0xF003E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1E001E,
                    0x1F003E,
                    0xF003C,
                    0xF003C,
                    0xF807C,
                    0x7807C,
                    0x7E0F8,
                    0x3FFF0,
                    0x1FFE0,
                    0xFFC0,
                    0x3F00,
                    0x00,
                    0x00,
                    0x00
                ), // [270] 22x20 'Ő' 0x150
                intArrayOf(
                    0x7FF8,
                    0x7FFC,
                    0xF87C,
                    0xF03E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1E01E,
                    0x1F03E,
                    0xF83C,
                    0xFFFC,
                    0x7FF8,
                    0x3FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [271] 18x20 'ő' 0x151
                intArrayOf(
                    0x3C03C000,
                    0x3C03C000,
                    0x3C03C000,
                    0x3C03FFF0,
                    0x3C03FFF0,
                    0x3C03FFF0,
                    0x3C03C000,
                    0x3C03C000,
                    0x3C03C000,
                    0x3C03C000,
                    0x1E03C000,
                    0x1E03C000,
                    0x1F03C000,
                    0xFFFFFFC,
                    0x7FFFFFC,
                    0x3FFFFFC,
                    0x7F0000,
                    0x00,
                    0x00,
                    0x00
                ), // [272] 31x20 'Œ' 0x152
                intArrayOf(
                    0x3FFDFFC,
                    0x3FFFFFC,
                    0x7C3FC3E,
                    0x781F81E,
                    0xF80F81E,
                    0xF00FFFE,
                    0xF00FFFE,
                    0xF00FFFE,
                    0xF00FFFE,
                    0xF00F800,
                    0xF00F800,
                    0x781F800,
                    0x7C3FC0C,
                    0x3FFFFFE,
                    0x3FFDFFE,
                    0x1FF8FFC,
                    0x7E03F0,
                    0x00,
                    0x00,
                    0x00
                ), // [273] 29x20 'œ' 0x153
                intArrayOf(
                    0x3C01E,
                    0x3C03E,
                    0x3C03C,
                    0x3C0FC,
                    0x3FFF8,
                    0x3FFF0,
                    0x3FFE0,
                    0x3C1E0,
                    0x3C1F0,
                    0x3C0F0,
                    0x3C0F8,
                    0x3C078,
                    0x3C07C,
                    0x3C03E,
                    0x3C03E,
                    0x3C01F,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [274] 20x20 'Ŕ' 0x154
                intArrayOf(
                    0x1FF, 0x1FF, 0x1F0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0,
                    0x1E0, 0x1E0, 0x00, 0x00, 0x00, 0x00
                ), // [275] 11x20 'ŕ' 0x155
                intArrayOf(
                    0x3C01E,
                    0x3C03E,
                    0x3C03C,
                    0x3C0FC,
                    0x3FFF8,
                    0x3FFF0,
                    0x3FFE0,
                    0x3C1E0,
                    0x3C1F0,
                    0x3C0F0,
                    0x3C0F8,
                    0x3C078,
                    0x3C07C,
                    0x3C03E,
                    0x3C03E,
                    0x3C01F,
                    0x00,
                    0xF00,
                    0xF00,
                    0xF00
                ), // [276] 20x20 'Ŗ' 0x156
                intArrayOf(
                    0x1FF, 0x1FF, 0x1F0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0,
                    0x1E0, 0x1E0, 0x00, 0x1E0, 0x1E0, 0x1E0
                ), // [277] 11x20 'ŗ' 0x157
                intArrayOf(
                    0x3C01E,
                    0x3C03E,
                    0x3C03C,
                    0x3C0FC,
                    0x3FFF8,
                    0x3FFF0,
                    0x3FFE0,
                    0x3C1E0,
                    0x3C1F0,
                    0x3C0F0,
                    0x3C0F8,
                    0x3C078,
                    0x3C07C,
                    0x3C03E,
                    0x3C03E,
                    0x3C01F,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [278] 20x20 'Ř' 0x158
                intArrayOf(
                    0x1FF, 0x1FF, 0x1F0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0, 0x1E0,
                    0x1E0, 0x1E0, 0x00, 0x00, 0x00, 0x00
                ), // [279] 11x20 'ř' 0x159
                intArrayOf(
                    0x1E000,
                    0x1F000,
                    0x1FE00,
                    0xFFC0,
                    0x3FF0,
                    0xFF8,
                    0x3FC,
                    0x7E,
                    0x1E,
                    0x3C01E,
                    0x3C01E,
                    0x3E01E,
                    0x3F03E,
                    0x1FFFC,
                    0xFFFC,
                    0x7FF0,
                    0xFC0,
                    0x00,
                    0x00,
                    0x00
                ), // [280] 19x20 'Ś' 0x15A
                intArrayOf(
                    0x3FF8,
                    0x7FFC,
                    0x787C,
                    0x783C,
                    0x783C,
                    0x7E00,
                    0x7FE0,
                    0x3FF8,
                    0x7FC,
                    0xFC,
                    0xF03C,
                    0xF03C,
                    0xF83C,
                    0x7FFC,
                    0x7FF8,
                    0x3FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [281] 17x20 'ś' 0x15B
                intArrayOf(
                    0x1E000,
                    0x1F000,
                    0x1FE00,
                    0xFFC0,
                    0x3FF0,
                    0xFF8,
                    0x3FC,
                    0x7E,
                    0x1E,
                    0x3C01E,
                    0x3C01E,
                    0x3E01E,
                    0x3F03E,
                    0x1FFFC,
                    0xFFFC,
                    0x7FF0,
                    0xFC0,
                    0x00,
                    0x00,
                    0x00
                ), // [282] 19x20 'Ŝ' 0x15C
                intArrayOf(
                    0x3FF8,
                    0x7FFC,
                    0x787C,
                    0x783C,
                    0x783C,
                    0x7E00,
                    0x7FE0,
                    0x3FF8,
                    0x7FC,
                    0xFC,
                    0xF03C,
                    0xF03C,
                    0xF83C,
                    0x7FFC,
                    0x7FF8,
                    0x3FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [283] 17x20 'ŝ' 0x15D
                intArrayOf(
                    0x1E000,
                    0x1F000,
                    0x1FE00,
                    0xFFC0,
                    0x3FF0,
                    0xFF8,
                    0x3FC,
                    0x7E,
                    0x1E,
                    0x3C01E,
                    0x3C01E,
                    0x3E01E,
                    0x3F03E,
                    0x1FFFC,
                    0xFFFC,
                    0x7FF0,
                    0xFC0,
                    0xFC0,
                    0xFC0,
                    0x1C0
                ), // [284] 19x20 'Ş' 0x15E
                intArrayOf(
                    0x3FF8,
                    0x7FFC,
                    0x787C,
                    0x783C,
                    0x783C,
                    0x7E00,
                    0x7FE0,
                    0x3FF8,
                    0x7FC,
                    0xFC,
                    0xF03C,
                    0xF03C,
                    0xF83C,
                    0x7FFC,
                    0x7FF8,
                    0x3FF0,
                    0x7C0,
                    0x7E0,
                    0x7E0,
                    0xE0
                ), // [285] 17x20 'ş' 0x15F
                intArrayOf(
                    0x1E000,
                    0x1F000,
                    0x1FE00,
                    0xFFC0,
                    0x3FF0,
                    0xFF8,
                    0x3FC,
                    0x7E,
                    0x1E,
                    0x3C01E,
                    0x3C01E,
                    0x3E01E,
                    0x3F03E,
                    0x1FFFC,
                    0xFFFC,
                    0x7FF0,
                    0xFC0,
                    0x00,
                    0x00,
                    0x00
                ), // [286] 19x20 'Š' 0x160
                intArrayOf(
                    0x3FF8,
                    0x7FFC,
                    0x787C,
                    0x783C,
                    0x783C,
                    0x7E00,
                    0x7FE0,
                    0x3FF8,
                    0x7FC,
                    0xFC,
                    0xF03C,
                    0xF03C,
                    0xF83C,
                    0x7FFC,
                    0x7FF8,
                    0x3FF0,
                    0x7C0,
                    0x00,
                    0x00,
                    0x00
                ), // [287] 17x20 'š' 0x161
                intArrayOf(
                    0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780,
                    0x780, 0x780, 0x700, 0xFC0, 0xFC0, 0x1C0
                ), // [288] 19x20 'Ţ' 0x162
                intArrayOf(
                    0x3FF, 0x3FF, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x7F,
                    0x7F, 0x3F, 0x1F, 0x1F, 0x1F, 0x03
                ), // [289] 10x20 'ţ' 0x163
                intArrayOf(
                    0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780, 0x780,
                    0x780, 0x780, 0x00, 0x00, 0x00, 0x00
                ), // [290] 19x20 'Ť' 0x164
                intArrayOf(
                    0x7FE, 0x7FE, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xF0, 0xFE,
                    0xFE, 0x7E, 0x3E, 0x00, 0x00, 0x00
                ), // [291] 11x20 'ť' 0x165
                intArrayOf(
                    0x7FF0,
                    0x7FF0,
                    0x7FF0,
                    0x7FF0,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [292] 19x20 'Ŧ' 0x166
                intArrayOf(
                    0x3FF, 0x3FF, 0x78, 0x78, 0x3FF, 0x3FF, 0x3FF, 0x78, 0x78, 0x78, 0x78, 0x78, 0x78, 0x7F,
                    0x7F, 0x3F, 0x1F, 0x00, 0x00, 0x00
                ), // [293] 10x20 'ŧ' 0x167
                intArrayOf(
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7C07C,
                    0x7E0F8,
                    0x3FFF8,
                    0x1FFF0,
                    0xFFE0,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [294] 21x20 'Ũ' 0x168
                intArrayOf(
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF07C,
                    0xFFFC,
                    0x7FFC,
                    0x7FFC,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [295] 18x20 'ũ' 0x169
                intArrayOf(
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7C07C,
                    0x7E0F8,
                    0x3FFF8,
                    0x1FFF0,
                    0xFFE0,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [296] 21x20 'Ū' 0x16A
                intArrayOf(
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF07C,
                    0xFFFC,
                    0x7FFC,
                    0x7FFC,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [297] 18x20 'ū' 0x16B
                intArrayOf(
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7C07C,
                    0x7E0F8,
                    0x3FFF8,
                    0x1FFF0,
                    0xFFE0,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [298] 21x20 'Ŭ' 0x16C
                intArrayOf(
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF07C,
                    0xFFFC,
                    0x7FFC,
                    0x7FFC,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [299] 18x20 'ŭ' 0x16D
                intArrayOf(
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7C07C,
                    0x7E0F8,
                    0x3FFF8,
                    0x1FFF0,
                    0xFFE0,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [300] 21x20 'Ů' 0x16E
                intArrayOf(
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF07C,
                    0xFFFC,
                    0x7FFC,
                    0x7FFC,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [301] 18x20 'ů' 0x16F
                intArrayOf(
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7C07C,
                    0x7E0F8,
                    0x3FFF8,
                    0x1FFF0,
                    0xFFE0,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [302] 21x20 'Ű' 0x170
                intArrayOf(
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF07C,
                    0xFFFC,
                    0x7FFC,
                    0x7FFC,
                    0x1F00,
                    0x00,
                    0x00,
                    0x00
                ), // [303] 18x20 'ű' 0x171
                intArrayOf(
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7803C,
                    0x7C07C,
                    0x7E0F8,
                    0x3FFF8,
                    0x1FFF0,
                    0xFFE0,
                    0x1F80,
                    0xF00,
                    0xF00,
                    0xFC0
                ), // [304] 21x20 'Ų' 0x172
                intArrayOf(
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF03C,
                    0xF07C,
                    0xFFFC,
                    0x7FFC,
                    0x7FFC,
                    0x1F7C,
                    0xF8,
                    0xF0,
                    0xE0
                ), // [305] 18x20 'ų' 0x173
                intArrayOf(
                    0x3C3FC3E,
                    0x3C3DE3C,
                    0x1E3DE3C,
                    0x1E39E3C,
                    0x1E78E3C,
                    0x1E78F78,
                    0xF78F78,
                    0xFF0F78,
                    0xFF0778,
                    0xFF07F0,
                    0x7E07F0,
                    0x7E03F0,
                    0x7E03F0,
                    0x7E03E0,
                    0x3C03E0,
                    0x3C01E0,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [306] 28x20 'Ŵ' 0x174
                intArrayOf(
                    0xF83C1E,
                    0x787E1E,
                    0x787E1E,
                    0x787E1E,
                    0x3C7E3C,
                    0x3CFF3C,
                    0x3CFF3C,
                    0x1CE738,
                    0x1FE7F8,
                    0x1FE7F8,
                    0x1FC3F8,
                    0xFC3F0,
                    0xFC3F0,
                    0xF81F0,
                    0x781E0,
                    0x781E0,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [307] 24x20 'ŵ' 0x175
                intArrayOf(
                    0x78F8,
                    0x7CF0,
                    0x3DF0,
                    0x3FE0,
                    0x1FC0,
                    0x1FC0,
                    0xF80,
                    0xF80,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [308] 19x20 'Ŷ' 0x176
                intArrayOf(
                    0x7C0F,
                    0x3C1F,
                    0x3C1E,
                    0x3E1E,
                    0x1E3C,
                    0x1E3C,
                    0x1F3C,
                    0xF78,
                    0xF78,
                    0xFF8,
                    0x7F0,
                    0x7F0,
                    0x3F0,
                    0x3E0,
                    0x3E0,
                    0x1E0,
                    0x3C0,
                    0x3C0,
                    0x3C0,
                    0xF80
                ), // [309] 15x20 'ŷ' 0x177
                intArrayOf(
                    0x78F8,
                    0x7CF0,
                    0x3DF0,
                    0x3FE0,
                    0x1FC0,
                    0x1FC0,
                    0xF80,
                    0xF80,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x780,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [310] 19x20 'Ÿ' 0x178
                intArrayOf(
                    0x1F0,
                    0x3E0,
                    0x7C0,
                    0x7C0,
                    0xF80,
                    0x1F00,
                    0x1F00,
                    0x3E00,
                    0x7C00,
                    0x7800,
                    0xF800,
                    0x1F000,
                    0x3E000,
                    0x3FFFE,
                    0x3FFFE,
                    0x3FFFE,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [311] 19x20 'Ź' 0x179
                intArrayOf(
                    0x7FFE, 0x7FFE, 0x7C, 0xF8, 0xF8, 0x1F0, 0x3E0, 0x7C0, 0x7C0, 0xF80, 0x1F00, 0x3E00, 0x3E00, 0x7FFE,
                    0x7FFE, 0x7FFE, 0x00, 0x00, 0x00, 0x00
                ), // [312] 16x20 'ź' 0x17A
                intArrayOf(
                    0x1F0,
                    0x3E0,
                    0x7C0,
                    0x7C0,
                    0xF80,
                    0x1F00,
                    0x1F00,
                    0x3E00,
                    0x7C00,
                    0x7800,
                    0xF800,
                    0x1F000,
                    0x3E000,
                    0x3FFFE,
                    0x3FFFE,
                    0x3FFFE,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [313] 19x20 'Ż' 0x17B
                intArrayOf(
                    0x7FFE, 0x7FFE, 0x7C, 0xF8, 0xF8, 0x1F0, 0x3E0, 0x7C0, 0x7C0, 0xF80, 0x1F00, 0x3E00, 0x3E00, 0x7FFE,
                    0x7FFE, 0x7FFE, 0x00, 0x00, 0x00, 0x00
                ), // [314] 16x20 'ż' 0x17C
                intArrayOf(
                    0x1F0,
                    0x3E0,
                    0x7C0,
                    0x7C0,
                    0xF80,
                    0x1F00,
                    0x1F00,
                    0x3E00,
                    0x7C00,
                    0x7800,
                    0xF800,
                    0x1F000,
                    0x3E000,
                    0x3FFFE,
                    0x3FFFE,
                    0x3FFFE,
                    0x00,
                    0x00,
                    0x00,
                    0x00
                ), // [315] 19x20 'Ž' 0x17D
                intArrayOf(
                    0x7FFE, 0x7FFE, 0x7C, 0xF8, 0xF8, 0x1F0, 0x3E0, 0x7C0, 0x7C0, 0xF80, 0x1F00, 0x3E00, 0x3E00, 0x7FFE,
                    0x7FFE, 0x7FFE, 0x00, 0x00, 0x00, 0x00
                )   // [316] 16x20 'ž' 0x17E
            ),
            widths = intArrayOf(
                4, 4, 8, 20, 12, 18, 20, 4, 6, 6,       // ' '..')' 0x20
                8, 8, 6, 8, 4, 12, 12, 6, 12, 12,       // '*'..'3' 0x2A
                12, 12, 12, 12, 12, 12, 4, 6, 8, 12,    // '4'..'=' 0x34
                8, 12, 12, 12, 12, 12, 12, 12, 12, 12,  // '>'..'G' 0x3E
                12, 4, 12, 12, 12, 12, 12, 12, 12, 12,  // 'H'..'Q' 0x48
                12, 12, 12, 12, 12, 12, 12, 12, 12, 6,  // 'R'..'[' 0x52
                12, 6, 8, 12, 1, 12, 12, 12, 12, 12,    // '\'..'e' 0x5C
                10, 12, 12, 4, 8, 12, 6, 12, 12, 12,    // 'f'..'o' 0x66
                12, 12, 12, 12, 10, 12, 12, 12, 12, 12, // 'p'..'y' 0x70
                12, 8, 4, 8, 22, 8, 18, 19, 23, 17,     // 'z'..'¥' 0x7A
                8, 20, 13, 25, 14, 15, 18, 1, 25, 15,   // '¦'..'¯' 0xA6
                12, 17, 12, 12, 10, 18, 20, 8, 8, 12,   // '°'..'¹' 0xB0
                15, 15, 23, 25, 25, 15, 21, 21, 21, 21, // 'º'..'Ã' 0xBA
                21, 21, 30, 21, 18, 18, 18, 18, 9, 9,   // 'Ä'..'Í' 0xC4
                9, 9, 21, 23, 22, 22, 22, 22, 22, 17,   // 'Î'..'×' 0xCE
                22, 21, 21, 21, 21, 19, 19, 19, 17, 17, // 'Ø'..'á' 0xD8
                17, 17, 17, 17, 27, 17, 17, 17, 17, 17, // 'â'..'ë' 0xE2
                8, 8, 8, 8, 19, 18, 18, 18, 18, 18,     // 'ì'..'õ' 0xEC
                18, 18, 18, 18, 18, 18, 18, 15, 18, 15, // 'ö'..'ÿ' 0xF6
                21, 17, 21, 17, 21, 17, 21, 17, 21, 17, // 'Ā'..'ĉ' 0x100
                21, 17, 21, 17, 21, 20, 21, 19, 18, 17, // 'Ċ'..'ē' 0x10A
                18, 17, 18, 17, 18, 17, 18, 17, 22, 18, // 'Ĕ'..'ĝ' 0x114
                22, 18, 22, 18, 22, 18, 23, 18, 22, 18, // 'Ğ'..'ħ' 0x11E
                9, 8, 9, 8, 9, 8, 9, 8, 9, 8,           // 'Ĩ'..'ı' 0x128
                26, 15, 18, 8, 20, 16, 18, 17, 8, 17,   // 'Ĳ'..'Ļ' 0x132
                8, 17, 10, 17, 11, 17, 9, 23, 18, 23,   // 'ļ'..'Ņ' 0x13C
                18, 23, 18, 18, 22, 18, 22, 18, 22, 18, // 'ņ'..'ŏ' 0x146
                22, 18, 31, 29, 20, 11, 20, 11, 20, 11, // 'Ő'..'ř' 0x150
                19, 17, 19, 17, 19, 17, 19, 17, 19, 10, // 'Ś'..'ţ' 0x15A
                19, 11, 19, 10, 21, 18, 21, 18, 21, 18, // 'Ť'..'ŭ' 0x164
                21, 18, 21, 18, 21, 18, 28, 24, 19, 15, // 'Ů'..'ŷ' 0x16E
                19, 19, 16, 19, 16, 19, 16           //    ..'ž'
            )
        )
    }
}
// Max Bitmap 31 x 20
// Mass Matrix ###########################.... 0
// Mass Matrix ###########################.... 1
// Mass Matrix ############################... 2
// Mass Matrix ############################... 3
// Mass Matrix ############################... 4
// Mass Matrix ############################... 5
// Mass Matrix ############################... 6
// Mass Matrix ############################... 7
// Mass Matrix ############################... 8
// Mass Matrix #########################...... 9
// Mass Matrix #########################...... 10
// Mass Matrix ########################....... 11
// Mass Matrix ###########################.... 12
// Mass Matrix ##############################. 13
// Mass Matrix ##############################. 14
// Mass Matrix ##############################. 15
// Mass Matrix #########################...... 16
// Mass Matrix ####################........... 17
// Mass Matrix ####################........... 18
// Mass Matrix ####################........... 19
