package com.rudolas.mia.lcdst7920.fonts

import com.rudolas.mia.lcdst7920.SpiST9720

class Pxl10px {
    companion object {
        val font = SpiST9720.Companion.FontItem( // FONT 10px pxl.ttf
            "PXL_10PX",
            charBytes = arrayOf( 
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [0] 2x13 ' ' 0x20
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x02, 0x00, 0x00, 0x00) , // [1] 2x13 '!' 0x21
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [2] 4x13 '"' 0x22
    intArrayOf(0x00, 0x00, 0x00, 0x14, 0x14, 0x3E, 0x14, 0x3E, 0x14, 0x14, 0x00, 0x00, 0x00) , // [3] 6x13 '#' 0x23
    intArrayOf(0x00, 0x00, 0x0C, 0x0E, 0x0E, 0x08, 0x0E, 0x02, 0x0A, 0x0E, 0x04, 0x00, 0x00) , // [4] 4x13 '$' 0x24
    intArrayOf(0x00, 0x00, 0x1C0, 0x1F0, 0x1F0, 0x1F0, 0x7E, 0x7E, 0x7E, 0x7E, 0x00, 0x00, 0x00) , // [5] 9x13 '%' 0x25
    intArrayOf(0x00, 0x00, 0x00, 0x1C, 0x14, 0x10, 0x1E, 0x14, 0x14, 0x1C, 0x00, 0x00, 0x00) , // [6] 5x13 '&' 0x26
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [7] 2x13 ''' 0x27
    intArrayOf(0x00, 0x00, 0x07, 0x06, 0x06, 0x06, 0x06, 0x06, 0x06, 0x06, 0x07, 0x00, 0x00) , // [8] 3x13 '(' 0x28
    intArrayOf(0x00, 0x00, 0x07, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x07, 0x00, 0x00) , // [9] 3x13 ')' 0x29
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x04, 0x0A, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [10] 4x13 '*' 0x2A
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x04, 0x0E, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00) , // [11] 4x13 '+' 0x2B
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x02, 0x00, 0x00) , // [12] 2x13 ',' 0x2C
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [13] 4x13 '-' 0x2D
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00) , // [14] 2x13 '.' 0x2E
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x06, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [15] 3x13 '/' 0x2F
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [16] 4x13 '0' 0x30
    intArrayOf(0x00, 0x00, 0x00, 0x0C, 0x04, 0x04, 0x04, 0x04, 0x04, 0x0E, 0x00, 0x00, 0x00) , // [17] 4x13 '1' 0x31
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x02, 0x0E, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [18] 4x13 '2' 0x32
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x02, 0x06, 0x02, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [19] 4x13 '3' 0x33
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0E, 0x0E, 0x0E, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [20] 4x13 '4' 0x34
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x08, 0x08, 0x0E, 0x02, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [21] 4x13 '5' 0x35
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x08, 0x0E, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [22] 4x13 '6' 0x36
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x02, 0x02, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [23] 4x13 '7' 0x37
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [24] 4x13 '8' 0x38
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x02, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [25] 4x13 '9' 0x39
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00) , // [26] 2x13 ':' 0x3A
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x02, 0x02, 0x00, 0x00) , // [27] 2x13 ';' 0x3B
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x02, 0x04, 0x02, 0x02, 0x00, 0x00, 0x00) , // [28] 3x13 '<' 0x3C
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x00, 0x00, 0x00, 0x00, 0x00) , // [29] 4x13 '=' 0x3D
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x04, 0x04, 0x02, 0x04, 0x04, 0x00, 0x00, 0x00) , // [30] 3x13 '>' 0x3E
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x02, 0x06, 0x04, 0x00, 0x04, 0x00, 0x00, 0x00) , // [31] 4x13 '?' 0x3F
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x3E, 0x22, 0x2E, 0x2A, 0x2E, 0x20, 0x3E, 0x00, 0x00) , // [32] 6x13 '@' 0x40
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [33] 4x13 'A' 0x41
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [34] 4x13 'B' 0x42
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x08, 0x08, 0x08, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [35] 4x13 'C' 0x43
    intArrayOf(0x00, 0x00, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [36] 4x13 'D' 0x44
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x04, 0x04, 0x06, 0x04, 0x04, 0x06, 0x00, 0x00, 0x00) , // [37] 3x13 'E' 0x45
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x04, 0x04, 0x06, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [38] 3x13 'F' 0x46
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x08, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [39] 4x13 'G' 0x47
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [40] 4x13 'H' 0x48
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [41] 2x13 'I' 0x49
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x02, 0x02, 0x02, 0x02, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [42] 4x13 'J' 0x4A
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0C, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [43] 4x13 'K' 0x4B
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x06, 0x00, 0x00, 0x00) , // [44] 3x13 'L' 0x4C
    intArrayOf(0x00, 0x00, 0x00, 0x3E, 0x2A, 0x2A, 0x2A, 0x2A, 0x2A, 0x2A, 0x00, 0x00, 0x00) , // [45] 6x13 'M' 0x4D
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [46] 4x13 'N' 0x4E
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [47] 4x13 'O' 0x4F
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x08, 0x08, 0x08, 0x00, 0x00, 0x00) , // [48] 4x13 'P' 0x50
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x02, 0x00, 0x00) , // [49] 4x13 'Q' 0x51
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0C, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [50] 4x13 'R' 0x52
    intArrayOf(0x00, 0x00, 0x00, 0x0F, 0x0F, 0x0C, 0x0F, 0x0B, 0x0F, 0x0F, 0x00, 0x00, 0x00) , // [51] 4x13 'S' 0x53
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [52] 4x13 'T' 0x54
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [53] 4x13 'U' 0x55
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0C, 0x00, 0x00, 0x00) , // [54] 4x13 'V' 0x56
    intArrayOf(0x00, 0x00, 0x00, 0x2A, 0x2A, 0x2A, 0x2A, 0x2A, 0x2A, 0x3E, 0x00, 0x00, 0x00) , // [55] 6x13 'W' 0x57
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x04, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [56] 4x13 'X' 0x58
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [57] 4x13 'Y' 0x59
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x02, 0x02, 0x04, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [58] 4x13 'Z' 0x5A
    intArrayOf(0x00, 0x00, 0x06, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x06, 0x00, 0x00) , // [59] 3x13 '[' 0x5B
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x04, 0x04, 0x06, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [60] 3x13 '\' 0x5C
    intArrayOf(0x00, 0x00, 0x06, 0x06, 0x06, 0x06, 0x06, 0x06, 0x06, 0x06, 0x06, 0x00, 0x00) , // [61] 3x13 ']' 0x5D
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [62] 4x13 '^' 0x5E
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x1E, 0x00, 0x00) , // [63] 5x13 '_' 0x5F
    intArrayOf(0x00, 0x00, 0x00, 0x01, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [64] 1x13 '`' 0x60
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x02, 0x0E, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [65] 4x13 'a' 0x61
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x08, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [66] 4x13 'b' 0x62
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x0A, 0x08, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [67] 4x13 'c' 0x63
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [68] 4x13 'd' 0x64
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [69] 4x13 'e' 0x65
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x04, 0x0E, 0x04, 0x04, 0x04, 0x0C, 0x00, 0x00, 0x00) , // [70] 4x13 'f' 0x66
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x02, 0x0E, 0x00, 0x00) , // [71] 4x13 'g' 0x67
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x08, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [72] 4x13 'h' 0x68
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [73] 2x13 'i' 0x69
    intArrayOf(0x00, 0x00, 0x00, 0x03, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00) , // [74] 2x13 'j' 0x6A
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x08, 0x0A, 0x0A, 0x0C, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [75] 4x13 'k' 0x6B
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [76] 2x13 'l' 0x6C
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x3E, 0x3E, 0x3E, 0x3E, 0x3E, 0x00, 0x00, 0x00) , // [77] 6x13 'm' 0x6D
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [78] 4x13 'n' 0x6E
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [79] 4x13 'o' 0x6F
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x0E, 0x0A, 0x0A, 0x0E, 0x0E, 0x08, 0x00, 0x00) , // [80] 4x13 'p' 0x70
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x0E, 0x0A, 0x0A, 0x0E, 0x0E, 0x02, 0x00, 0x00) , // [81] 4x13 'q' 0x71
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x06, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [82] 3x13 'r' 0x72
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x08, 0x0E, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [83] 4x13 's' 0x73
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x04, 0x06, 0x04, 0x04, 0x04, 0x06, 0x00, 0x00, 0x00) , // [84] 3x13 't' 0x74
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [85] 4x13 'u' 0x75
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0C, 0x00, 0x00, 0x00) , // [86] 4x13 'v' 0x76
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x3E, 0x3E, 0x3E, 0x3E, 0x3E, 0x00, 0x00, 0x00) , // [87] 6x13 'w' 0x77
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0A, 0x0A, 0x04, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [88] 4x13 'x' 0x78
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x02, 0x0E, 0x00, 0x00) , // [89] 4x13 'y' 0x79
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x02, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [90] 4x13 'z' 0x7A
    intArrayOf(0x00, 0x00, 0x06, 0x04, 0x04, 0x04, 0x0C, 0x04, 0x04, 0x04, 0x06, 0x00, 0x00) , // [91] 4x13 '{' 0x7B
    intArrayOf(0x00, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00) , // [92] 2x13 '|' 0x7C
    intArrayOf(0x00, 0x00, 0x0C, 0x04, 0x04, 0x04, 0x06, 0x04, 0x04, 0x04, 0x0C, 0x00, 0x00) , // [93] 4x13 '}' 0x7D
    intArrayOf(0x00, 0x00, 0x00, 0x0C, 0x0F, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [94] 4x13 '~' 0x7E
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [95] 2x13 '¡' 0xA1
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x04, 0x0E, 0x0A, 0x08, 0x0A, 0x0E, 0x04, 0x00, 0x00) , // [96] 4x13 '¢' 0xA2
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x08, 0x1C, 0x08, 0x08, 0x1E, 0x00, 0x00, 0x00) , // [97] 5x13 '£' 0xA3
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x22, 0x1E, 0x16, 0x3E, 0x22, 0x00, 0x00, 0x00) , // [98] 6x13 '¤' 0xA4
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x04, 0x0E, 0x04, 0x00, 0x00, 0x00) , // [99] 4x13 '¥' 0xA5
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x00, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [100] 2x13 '¦' 0xA6
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x08, 0x04, 0x02, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [101] 4x13 '§' 0xA7
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [102] 4x13 '¨' 0xA8
    intArrayOf(0x00, 0x00, 0x00, 0x7E, 0x42, 0x5A, 0x52, 0x5A, 0x42, 0x7E, 0x00, 0x00, 0x00) , // [103] 7x13 '©' 0xA9
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x02, 0x06, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [104] 3x13 'ª' 0xAA
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x08, 0x10, 0x3E, 0x10, 0x08, 0x00, 0x00, 0x00, 0x00) , // [105] 6x13 '«' 0xAB
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x08, 0x1C, 0x2A, 0x08, 0x08, 0x38, 0x00, 0x00, 0x00) , // [106] 6x13 '¬' 0xAC
    IntArray(0), // blank font char '­' 0xAD
    intArrayOf(0x00, 0x00, 0x7E, 0x42, 0x5A, 0x52, 0x42, 0x7E, 0x00, 0x00, 0x00, 0x00, 0x00) , // [108] 7x13 '®' 0xAE
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x38, 0x08, 0x08, 0x2A, 0x1C, 0x08, 0x00, 0x00) , // [109] 6x13 '¯' 0xAF
    intArrayOf(0x00, 0x00, 0x0E, 0x0E, 0x0A, 0x0E, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [110] 4x13 '°' 0xB0
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x04, 0x0E, 0x04, 0x00, 0x0E, 0x00, 0x00, 0x00, 0x00) , // [111] 4x13 '±' 0xB1
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x02, 0x06, 0x04, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00) , // [112] 3x13 '²' 0xB2
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x02, 0x06, 0x02, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00) , // [113] 3x13 '³' 0xB3
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [114] 2x13 '´' 0xB4
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x1E, 0x06, 0x0A, 0x12, 0x20, 0x00, 0x00, 0x00) , // [115] 6x13 'µ' 0xB5
    intArrayOf(0x00, 0x00, 0x00, 0x1E, 0x1A, 0x1A, 0x1A, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [116] 5x13 '¶' 0xB6
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [117] 2x13 '·' 0xB7
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x02, 0x00, 0x00) , // [118] 2x13 '¸' 0xB8
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00, 0x00, 0x00) , // [119] 3x13 '¹' 0xB9
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x08, 0x0E, 0x02, 0x0E, 0x04, 0x00, 0x00) , // [120] 4x13 'º' 0xBA
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x08, 0x04, 0x3E, 0x04, 0x08, 0x00, 0x00, 0x00, 0x00) , // [121] 6x13 '»' 0xBB
    intArrayOf(0x00, 0x00, 0x00, 0x1B0, 0xB0, 0xB4, 0xF4, 0xE6, 0x66, 0x62, 0x00, 0x00, 0x00) , // [122] 9x13 '¼' 0xBC
    intArrayOf(0x00, 0x00, 0x00, 0x1B0, 0xB0, 0xB6, 0xF2, 0xE6, 0x64, 0x66, 0x00, 0x00, 0x00) , // [123] 9x13 '½' 0xBD
    intArrayOf(0x00, 0x00, 0x00, 0x1F0, 0xF0, 0x1F4, 0xB4, 0x1E6, 0x66, 0x62, 0x00, 0x00, 0x00) , // [124] 9x13 '¾' 0xBE
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x00, 0x04, 0x0C, 0x08, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [125] 4x13 '¿' 0xBF
    intArrayOf(0x04, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [126] 4x13 'À' 0xC0
    intArrayOf(0x04, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [127] 4x13 'Á' 0xC1
    intArrayOf(0x00, 0x1C, 0x00, 0x1C, 0x14, 0x14, 0x1C, 0x14, 0x14, 0x14, 0x00, 0x00, 0x00) , // [128] 5x13 'Â' 0xC2
    intArrayOf(0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [129] 4x13 'Ã' 0xC3
    intArrayOf(0x00, 0x0A, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [130] 4x13 'Ä' 0xC4
    intArrayOf(0x00, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [131] 4x13 'Å' 0xC5
    intArrayOf(0x00, 0x00, 0x00, 0x1E, 0x14, 0x14, 0x1E, 0x14, 0x14, 0x16, 0x00, 0x00, 0x00) , // [132] 5x13 'Æ' 0xC6
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x08, 0x08, 0x08, 0x0A, 0x0E, 0x04, 0x00, 0x00) , // [133] 4x13 'Ç' 0xC7
    intArrayOf(0x00, 0x02, 0x02, 0x06, 0x04, 0x04, 0x06, 0x04, 0x04, 0x06, 0x00, 0x00, 0x00) , // [134] 3x13 'È' 0xC8
    intArrayOf(0x00, 0x02, 0x02, 0x06, 0x04, 0x04, 0x06, 0x04, 0x04, 0x06, 0x00, 0x00, 0x00) , // [135] 3x13 'É' 0xC9
    intArrayOf(0x00, 0x06, 0x00, 0x06, 0x04, 0x04, 0x06, 0x04, 0x04, 0x06, 0x00, 0x00, 0x00) , // [136] 3x13 'Ê' 0xCA
    intArrayOf(0x00, 0x06, 0x00, 0x06, 0x04, 0x04, 0x06, 0x04, 0x04, 0x06, 0x00, 0x00, 0x00) , // [137] 3x13 'Ë' 0xCB
    intArrayOf(0x02, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [138] 2x13 'Ì' 0xCC
    intArrayOf(0x02, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [139] 2x13 'Í' 0xCD
    intArrayOf(0x00, 0x0E, 0x00, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [140] 4x13 'Î' 0xCE
    intArrayOf(0x00, 0x0A, 0x00, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [141] 4x13 'Ï' 0xCF
    intArrayOf(0x00, 0x00, 0x00, 0x1C, 0x14, 0x14, 0x34, 0x14, 0x14, 0x18, 0x00, 0x00, 0x00) , // [142] 6x13 'Ð' 0xD0
    intArrayOf(0x0A, 0x0A, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [143] 4x13 'Ñ' 0xD1
    intArrayOf(0x04, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [144] 4x13 'Ò' 0xD2
    intArrayOf(0x04, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [145] 4x13 'Ó' 0xD3
    intArrayOf(0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [146] 4x13 'Ô' 0xD4
    intArrayOf(0x0A, 0x0A, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [147] 4x13 'Õ' 0xD5
    intArrayOf(0x00, 0x0A, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [148] 4x13 'Ö' 0xD6
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0A, 0x04, 0x0A, 0x00, 0x00, 0x00, 0x00, 0x00) , // [149] 4x13 '×' 0xD7
    intArrayOf(0x00, 0x00, 0x00, 0x1E, 0x12, 0x12, 0x16, 0x1A, 0x12, 0x1E, 0x00, 0x00, 0x00) , // [150] 5x13 'Ø' 0xD8
    intArrayOf(0x04, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [151] 4x13 'Ù' 0xD9
    intArrayOf(0x04, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [152] 4x13 'Ú' 0xDA
    intArrayOf(0x00, 0x0E, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [153] 4x13 'Û' 0xDB
    intArrayOf(0x00, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [154] 4x13 'Ü' 0xDC
    intArrayOf(0x04, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [155] 4x13 'Ý' 0xDD
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04) , // [156] 4x13 'Þ' 0xDE
    intArrayOf(0x00, 0x00, 0x00, 0x1C, 0x14, 0x16, 0x12, 0x12, 0x12, 0x16, 0x00, 0x00, 0x00) , // [157] 5x13 'ß' 0xDF
    intArrayOf(0x00, 0x00, 0x04, 0x04, 0x00, 0x0E, 0x02, 0x0E, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [158] 4x13 'à' 0xE0
    intArrayOf(0x00, 0x00, 0x04, 0x04, 0x00, 0x0E, 0x02, 0x0E, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [159] 4x13 'á' 0xE1
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x02, 0x0E, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [160] 4x13 'â' 0xE2
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x02, 0x0E, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [161] 4x13 'ã' 0xE3
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x00, 0x0E, 0x02, 0x0E, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [162] 4x13 'ä' 0xE4
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x00, 0x0E, 0x02, 0x0E, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [163] 4x13 'å' 0xE5
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x3E, 0x0A, 0x3E, 0x28, 0x3E, 0x00, 0x00, 0x00) , // [164] 6x13 'æ' 0xE6
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x0A, 0x08, 0x0A, 0x0E, 0x04, 0x00, 0x00) , // [165] 4x13 'ç' 0xE7
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x04, 0x0E, 0x0A, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [166] 4x13 'è' 0xE8
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x04, 0x0E, 0x0A, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [167] 4x13 'é' 0xE9
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [168] 4x13 'ê' 0xEA
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x00, 0x0E, 0x0A, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [169] 4x13 'ë' 0xEB
    intArrayOf(0x00, 0x00, 0x02, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [170] 2x13 'ì' 0xEC
    intArrayOf(0x00, 0x00, 0x02, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [171] 2x13 'í' 0xED
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [172] 2x13 'î' 0xEE
    intArrayOf(0x00, 0x00, 0x00, 0x01, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [173] 2x13 'ï' 0xEF
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x08, 0x1E, 0x04, 0x1C, 0x14, 0x1C, 0x00, 0x00, 0x00) , // [174] 5x13 'ð' 0xF0
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [175] 4x13 'ñ' 0xF1
    intArrayOf(0x00, 0x00, 0x04, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [176] 4x13 'ò' 0xF2
    intArrayOf(0x00, 0x00, 0x04, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [177] 4x13 'ó' 0xF3
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [178] 4x13 'ô' 0xF4
    intArrayOf(0x00, 0x00, 0x0A, 0x0A, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [179] 4x13 'õ' 0xF5
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [180] 4x13 'ö' 0xF6
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x04, 0x00, 0x0E, 0x00, 0x04, 0x00, 0x00, 0x00) , // [181] 4x13 '÷' 0xF7
    intArrayOf(0x00, 0x00, 0x00, 0x1E, 0x12, 0x12, 0x16, 0x1A, 0x12, 0x1E, 0x00, 0x00, 0x00) , // [182] 5x13 'ø' 0xF8
    intArrayOf(0x00, 0x00, 0x04, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [183] 4x13 'ù' 0xF9
    intArrayOf(0x00, 0x00, 0x04, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [184] 4x13 'ú' 0xFA
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [185] 4x13 'û' 0xFB
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [186] 4x13 'ü' 0xFC
    intArrayOf(0x00, 0x00, 0x04, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x02, 0x0E, 0x00, 0x00) , // [187] 4x13 'ý' 0xFD
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x04, 0x06, 0x04, 0x04, 0x04, 0x06, 0x04, 0x04, 0x00) , // [188] 3x13 'þ' 0xFE
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x02, 0x0E, 0x00, 0x00) , // [189] 4x13 'ÿ' 0xFF
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [190] 4x13 'Ā' 0x100
    intArrayOf(0x00, 0x00, 0x00, 0x1C, 0x00, 0x1C, 0x04, 0x1C, 0x14, 0x1C, 0x00, 0x00, 0x00) , // [191] 5x13 'ā' 0x101
    intArrayOf(0x00, 0x380, 0x00, 0x380, 0x280, 0x280, 0x380, 0x280, 0x280, 0x280, 0x00, 0x00, 0x00) , // [192] 10x13 'Ă' 0x102
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x02, 0x0E, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [193] 4x13 'ă' 0x103
    intArrayOf(0x00, 0x00, 0x18, 0x1C, 0x1C, 0x3C, 0x36, 0x7E, 0x7E, 0x63, 0x07, 0x07, 0x02) , // [194] 7x13 'Ą' 0x104
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x1F, 0x1F, 0x1F, 0x1B, 0x1F, 0x0F, 0x03, 0x03) , // [195] 5x13 'ą' 0x105
    intArrayOf(0x00, 0x04, 0x04, 0x0E, 0x0A, 0x08, 0x08, 0x08, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [196] 4x13 'Ć' 0x106
    intArrayOf(0x00, 0x00, 0x04, 0x04, 0x00, 0x0E, 0x0A, 0x08, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [197] 4x13 'ć' 0x107
    intArrayOf(0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x08, 0x08, 0x08, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [198] 4x13 'Ĉ' 0x108
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x08, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [199] 4x13 'ĉ' 0x109
    intArrayOf(0x00, 0x04, 0x00, 0x0E, 0x0A, 0x08, 0x08, 0x08, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [200] 4x13 'Ċ' 0x10A
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x00, 0x0E, 0x0A, 0x08, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [201] 4x13 'ċ' 0x10B
    intArrayOf(0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x08, 0x08, 0x08, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [202] 4x13 'Č' 0x10C
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x08, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [203] 4x13 'č' 0x10D
    intArrayOf(0x3C, 0x1C, 0x78, 0x7E, 0x66, 0x66, 0x62, 0x66, 0x6E, 0x7E, 0x00, 0x00, 0x00) , // [204] 7x13 'Ď' 0x10E
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x38, 0x28, 0x28, 0x28, 0x38, 0x00, 0x00, 0x00) , // [205] 6x13 'ď' 0x10F
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x1A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [206] 5x13 'Đ' 0x110
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x04, 0x1C, 0x14, 0x14, 0x14, 0x1C, 0x00, 0x00, 0x00) , // [207] 5x13 'đ' 0x111
    intArrayOf(0x00, 0x06, 0x00, 0x06, 0x04, 0x04, 0x06, 0x04, 0x04, 0x06, 0x00, 0x00, 0x00) , // [208] 3x13 'Ē' 0x112
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [209] 4x13 'ē' 0x113
    intArrayOf(0x00, 0x06, 0x00, 0x06, 0x04, 0x04, 0x06, 0x04, 0x04, 0x06, 0x00, 0x00, 0x00) , // [210] 3x13 'Ĕ' 0x114
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [211] 4x13 'ĕ' 0x115
    intArrayOf(0x00, 0x02, 0x00, 0x06, 0x04, 0x04, 0x06, 0x04, 0x04, 0x06, 0x00, 0x00, 0x00) , // [212] 3x13 'Ė' 0x116
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x00, 0x0E, 0x0A, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [213] 4x13 'ė' 0x117
    intArrayOf(0x00, 0x00, 0x3F, 0x3F, 0x30, 0x3E, 0x3E, 0x30, 0x30, 0x3F, 0x06, 0x07, 0x02) , // [214] 6x13 'Ę' 0x118
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x1F, 0x1F, 0x1F, 0x19, 0x1F, 0x06, 0x07, 0x00) , // [215] 5x13 'ę' 0x119
    intArrayOf(0x1E, 0x0E, 0x3F, 0x3F, 0x30, 0x3E, 0x3E, 0x30, 0x30, 0x3F, 0x00, 0x00, 0x00) , // [216] 6x13 'Ě' 0x11A
    intArrayOf(0x00, 0x00, 0x0F, 0x07, 0x0E, 0x1F, 0x1F, 0x1F, 0x19, 0x1F, 0x06, 0x00, 0x00) , // [217] 5x13 'ě' 0x11B
    intArrayOf(0x18, 0x3C, 0x1C, 0x3E, 0x77, 0x60, 0x6F, 0x6F, 0x77, 0x3F, 0x0C, 0x00, 0x00) , // [218] 7x13 'Ĝ' 0x11C
    intArrayOf(0x00, 0x00, 0x18, 0x3C, 0x1E, 0x3E, 0x36, 0x32, 0x36, 0x3E, 0x3E, 0x3E, 0x08) , // [219] 6x13 'ĝ' 0x11D
    intArrayOf(0x3C, 0x3C, 0x1C, 0x3E, 0x77, 0x60, 0x6F, 0x6F, 0x77, 0x3F, 0x0C, 0x00, 0x00) , // [220] 7x13 'Ğ' 0x11E
    intArrayOf(0x00, 0x00, 0x1E, 0x1E, 0x1E, 0x3E, 0x36, 0x32, 0x36, 0x3E, 0x3E, 0x3E, 0x08) , // [221] 6x13 'ğ' 0x11F
    intArrayOf(0x00, 0x04, 0x00, 0x0E, 0x0A, 0x08, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [222] 4x13 'Ġ' 0x120
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x02, 0x0E, 0x00, 0x00) , // [223] 4x13 'ġ' 0x121
    intArrayOf(0x00, 0x00, 0x1C, 0x3E, 0x77, 0x60, 0x6F, 0x6F, 0x77, 0x3F, 0x1C, 0x18, 0x18) , // [224] 7x13 'Ģ' 0x122
    intArrayOf(0x00, 0x00, 0x18, 0x18, 0x1E, 0x3E, 0x36, 0x32, 0x36, 0x3E, 0x3E, 0x3E, 0x08) , // [225] 6x13 'ģ' 0x123
    intArrayOf(0x18, 0x3C, 0x63, 0x63, 0x63, 0x7F, 0x7F, 0x63, 0x63, 0x63, 0x00, 0x00, 0x00) , // [226] 7x13 'Ĥ' 0x124
    intArrayOf(0x18, 0x3C, 0x30, 0x30, 0x3E, 0x3E, 0x36, 0x36, 0x36, 0x36, 0x00, 0x00, 0x00) , // [227] 6x13 'ĥ' 0x125
    intArrayOf(0x00, 0x00, 0x63, 0x63, 0x7F, 0x7F, 0x7F, 0x63, 0x63, 0x63, 0x00, 0x00, 0x00) , // [228] 7x13 'Ħ' 0x126
    intArrayOf(0x00, 0x00, 0x30, 0x3C, 0x3E, 0x3E, 0x32, 0x32, 0x32, 0x32, 0x00, 0x00, 0x00) , // [229] 6x13 'ħ' 0x127
    intArrayOf(0x0A, 0x0A, 0x00, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [230] 4x13 'Ĩ' 0x128
    intArrayOf(0x00, 0x00, 0x01, 0x01, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [231] 2x13 'ĩ' 0x129
    intArrayOf(0x00, 0x07, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [232] 3x13 'Ī' 0x12A
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x06, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [233] 3x13 'ī' 0x12B
    intArrayOf(0x00, 0x07, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [234] 3x13 'Ĭ' 0x12C
    intArrayOf(0x00, 0x00, 0x00, 0x03, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [235] 2x13 'ĭ' 0x12D
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00) , // [236] 2x13 'Į' 0x12E
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00) , // [237] 2x13 'į' 0x12F
    intArrayOf(0x00, 0x01, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [238] 2x13 'İ' 0x130
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [239] 2x13 'ı' 0x131
    intArrayOf(0x00, 0x00, 0xC3, 0xC3, 0xC3, 0xC3, 0xC3, 0xC3, 0xDB, 0xDF, 0x04, 0x00, 0x00) , // [240] 8x13 'Ĳ' 0x132
    intArrayOf(0x00, 0x00, 0x00, 0x0B, 0x00, 0x0A, 0x0E, 0x0E, 0x0E, 0x0E, 0x0E, 0x00, 0x00) , // [241] 4x13 'ĳ' 0x133
    intArrayOf(0x06, 0x0F, 0x06, 0x06, 0x06, 0x06, 0x06, 0x06, 0x36, 0x3E, 0x08, 0x00, 0x00) , // [242] 6x13 'Ĵ' 0x134
    intArrayOf(0x00, 0x00, 0x06, 0x07, 0x06, 0x06, 0x06, 0x06, 0x06, 0x06, 0x06, 0x06, 0x04) , // [243] 3x13 'ĵ' 0x135
    intArrayOf(0x00, 0x00, 0x33, 0x33, 0x36, 0x3E, 0x3C, 0x3E, 0x37, 0x3F, 0x0C, 0x0C, 0x00) , // [244] 6x13 'Ķ' 0x136
    intArrayOf(0x00, 0x00, 0x18, 0x18, 0x1B, 0x1F, 0x1E, 0x1E, 0x1F, 0x1F, 0x0C, 0x0C, 0x00) , // [245] 5x13 'ķ' 0x137
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x37, 0x36, 0x3C, 0x3C, 0x3E, 0x37, 0x00, 0x00, 0x00) , // [246] 6x13 'ĸ' 0x138
    intArrayOf(0x00, 0x00, 0x01, 0x05, 0x04, 0x04, 0x04, 0x04, 0x04, 0x06, 0x00, 0x00, 0x00) , // [247] 3x13 'Ĺ' 0x139
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [248] 2x13 'ĺ' 0x13A
    intArrayOf(0x00, 0x00, 0x18, 0x18, 0x18, 0x18, 0x18, 0x18, 0x18, 0x1F, 0x06, 0x06, 0x06) , // [249] 5x13 'Ļ' 0x13B
    intArrayOf(0x00, 0x00, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03, 0x03) , // [250] 2x13 'ļ' 0x13C
    intArrayOf(0x00, 0x00, 0x1E, 0x1E, 0x1E, 0x18, 0x18, 0x18, 0x18, 0x1F, 0x00, 0x00, 0x00) , // [251] 5x13 'Ľ' 0x13D
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x08, 0x08, 0x08, 0x08, 0x08, 0x00, 0x00, 0x00) , // [252] 4x13 'ľ' 0x13E
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x08, 0x0A, 0x08, 0x08, 0x08, 0x0C, 0x00, 0x00, 0x00) , // [253] 4x13 'Ŀ' 0x13F
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x08, 0x0A, 0x08, 0x08, 0x08, 0x08, 0x00, 0x00, 0x00) , // [254] 4x13 'ŀ' 0x140
    intArrayOf(0x00, 0x00, 0x18, 0x18, 0x18, 0x1E, 0x1E, 0x18, 0x18, 0x1F, 0x00, 0x00, 0x00) , // [255] 5x13 'Ł' 0x141
    intArrayOf(0x00, 0x00, 0x06, 0x06, 0x06, 0x07, 0x07, 0x06, 0x06, 0x06, 0x00, 0x00, 0x00) , // [256] 3x13 'ł' 0x142
    intArrayOf(0x0C, 0x1C, 0x63, 0x73, 0x7B, 0x7B, 0x7F, 0x6F, 0x67, 0x67, 0x00, 0x00, 0x00) , // [257] 7x13 'Ń' 0x143
    intArrayOf(0x00, 0x00, 0x06, 0x0E, 0x3E, 0x3E, 0x36, 0x36, 0x36, 0x36, 0x00, 0x00, 0x00) , // [258] 6x13 'ń' 0x144
    intArrayOf(0x00, 0x00, 0x63, 0x73, 0x7B, 0x7B, 0x7F, 0x6F, 0x67, 0x67, 0x18, 0x18, 0x18) , // [259] 7x13 'Ņ' 0x145
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x3E, 0x3E, 0x36, 0x36, 0x36, 0x36, 0x0C, 0x0C, 0x0C) , // [260] 6x13 'ņ' 0x146
    intArrayOf(0x3C, 0x1C, 0x63, 0x73, 0x7B, 0x7B, 0x7F, 0x6F, 0x67, 0x67, 0x00, 0x00, 0x00) , // [261] 7x13 'Ň' 0x147
    intArrayOf(0x00, 0x00, 0x1E, 0x0E, 0x3E, 0x3E, 0x36, 0x36, 0x36, 0x36, 0x00, 0x00, 0x00) , // [262] 6x13 'ň' 0x148
    intArrayOf(0x00, 0x00, 0x20, 0x20, 0x3E, 0x3E, 0x36, 0x36, 0x36, 0x36, 0x00, 0x00, 0x00) , // [263] 6x13 'ŉ' 0x149
    intArrayOf(0x00, 0x00, 0x63, 0x73, 0x7B, 0x7B, 0x7F, 0x6F, 0x67, 0x67, 0x03, 0x07, 0x06) , // [264] 7x13 'Ŋ' 0x14A
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x3E, 0x3E, 0x36, 0x32, 0x32, 0x32, 0x06, 0x0E, 0x0C) , // [265] 6x13 'ŋ' 0x14B
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [266] 4x13 'Ō' 0x14C
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [267] 4x13 'ō' 0x14D
    intArrayOf(0x00, 0x1C, 0x00, 0x1C, 0x14, 0x14, 0x14, 0x14, 0x14, 0x1C, 0x00, 0x00, 0x00) , // [268] 5x13 'Ŏ' 0x14E
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [269] 4x13 'ŏ' 0x14F
    intArrayOf(0x0A, 0x0A, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [270] 4x13 'Ő' 0x150
    intArrayOf(0x00, 0x00, 0x0A, 0x0A, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [271] 4x13 'ő' 0x151
    intArrayOf(0x00, 0x00, 0x00, 0x3C, 0x28, 0x28, 0x2C, 0x28, 0x28, 0x3C, 0x00, 0x00, 0x00) , // [272] 6x13 'Œ' 0x152
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x3E, 0x2A, 0x2E, 0x28, 0x3E, 0x00, 0x00, 0x00) , // [273] 6x13 'œ' 0x153
    intArrayOf(0x06, 0x0E, 0x3C, 0x3F, 0x33, 0x33, 0x3F, 0x3E, 0x37, 0x33, 0x00, 0x00, 0x00) , // [274] 6x13 'Ŕ' 0x154
    intArrayOf(0x00, 0x00, 0x01, 0x03, 0x07, 0x07, 0x06, 0x06, 0x06, 0x06, 0x00, 0x00, 0x00) , // [275] 3x13 'ŕ' 0x155
    intArrayOf(0x00, 0x00, 0x3C, 0x3F, 0x33, 0x33, 0x3F, 0x3E, 0x37, 0x33, 0x0C, 0x0C, 0x0C) , // [276] 6x13 'Ŗ' 0x156
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x07, 0x07, 0x06, 0x06, 0x06, 0x06, 0x06, 0x06, 0x06) , // [277] 3x13 'ŗ' 0x157
    intArrayOf(0x1E, 0x0E, 0x3C, 0x3F, 0x33, 0x33, 0x3F, 0x3E, 0x37, 0x33, 0x00, 0x00, 0x00) , // [278] 6x13 'Ř' 0x158
    intArrayOf(0x00, 0x00, 0x07, 0x03, 0x07, 0x07, 0x06, 0x06, 0x06, 0x06, 0x00, 0x00, 0x00) , // [279] 3x13 'ř' 0x159
    intArrayOf(0x06, 0x0E, 0x0E, 0x3F, 0x33, 0x3C, 0x1F, 0x37, 0x33, 0x3F, 0x0C, 0x00, 0x00) , // [280] 6x13 'Ś' 0x15A
    intArrayOf(0x00, 0x00, 0x03, 0x07, 0x0E, 0x1F, 0x1F, 0x0F, 0x1B, 0x1F, 0x06, 0x00, 0x00) , // [281] 5x13 'ś' 0x15B
    intArrayOf(0x0C, 0x1E, 0x0E, 0x3F, 0x33, 0x3C, 0x1F, 0x37, 0x33, 0x3F, 0x0C, 0x00, 0x00) , // [282] 6x13 'Ŝ' 0x15C
    intArrayOf(0x00, 0x00, 0x0C, 0x1E, 0x0E, 0x1F, 0x1F, 0x0F, 0x1B, 0x1F, 0x06, 0x00, 0x00) , // [283] 5x13 'ŝ' 0x15D
    intArrayOf(0x00, 0x00, 0x00, 0x0F, 0x0F, 0x0C, 0x0F, 0x0B, 0x0F, 0x0F, 0x04, 0x00, 0x00) , // [284] 4x13 'Ş' 0x15E
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x08, 0x0E, 0x02, 0x0E, 0x04, 0x00, 0x00) , // [285] 4x13 'ş' 0x15F
    intArrayOf(0x00, 0x0E, 0x00, 0x0F, 0x0E, 0x0C, 0x0F, 0x03, 0x0B, 0x0F, 0x00, 0x00, 0x00) , // [286] 4x13 'Š' 0x160
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x08, 0x0E, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [287] 4x13 'š' 0x161
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00) , // [288] 4x13 'Ţ' 0x162
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x04, 0x06, 0x04, 0x04, 0x04, 0x06, 0x04, 0x04, 0x00) , // [289] 3x13 'ţ' 0x163
    intArrayOf(0x00, 0x0E, 0x00, 0x0E, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [290] 4x13 'Ť' 0x164
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x0A, 0x0C, 0x08, 0x08, 0x08, 0x0C, 0x00, 0x00, 0x00) , // [291] 4x13 'ť' 0x165
    intArrayOf(0x00, 0x00, 0x3F, 0x3F, 0x0C, 0x1E, 0x0C, 0x0C, 0x0C, 0x0C, 0x00, 0x00, 0x00) , // [292] 6x13 'Ŧ' 0x166
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x07, 0x07, 0x07, 0x07, 0x02, 0x03, 0x03, 0x00, 0x00) , // [293] 3x13 'ŧ' 0x167
    intArrayOf(0x0A, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [294] 4x13 'Ũ' 0x168
    intArrayOf(0x00, 0x00, 0x0A, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [295] 4x13 'ũ' 0x169
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [296] 4x13 'Ū' 0x16A
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [297] 4x13 'ū' 0x16B
    intArrayOf(0x00, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [298] 4x13 'Ŭ' 0x16C
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [299] 4x13 'ŭ' 0x16D
    intArrayOf(0x00, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [300] 4x13 'Ů' 0x16E
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [301] 4x13 'ů' 0x16F
    intArrayOf(0x0A, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [302] 4x13 'Ű' 0x170
    intArrayOf(0x00, 0x00, 0x0A, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [303] 4x13 'ű' 0x171
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0A, 0x0F, 0x01, 0x00, 0x00) , // [304] 4x13 'Ų' 0x172
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0F, 0x01, 0x00, 0x00) , // [305] 4x13 'ų' 0x173
    intArrayOf(0x30, 0x78, 0x193, 0x1BB, 0x1BB, 0x1BB, 0xFE, 0xEE, 0xEE, 0xEE, 0x00, 0x00, 0x00) , // [306] 9x13 'Ŵ' 0x174
    intArrayOf(0x00, 0x00, 0x30, 0x78, 0xDB, 0xDB, 0xFE, 0xFE, 0x7E, 0x6C, 0x00, 0x00, 0x00) , // [307] 8x13 'ŵ' 0x175
    intArrayOf(0x0C, 0x1E, 0x33, 0x33, 0x3F, 0x1E, 0x1E, 0x0C, 0x0C, 0x0C, 0x00, 0x00, 0x00) , // [308] 6x13 'Ŷ' 0x176
    intArrayOf(0x00, 0x00, 0x0C, 0x1E, 0x1B, 0x1B, 0x1F, 0x1E, 0x0E, 0x0E, 0x0C, 0x1C, 0x18) , // [309] 5x13 'ŷ' 0x177
    intArrayOf(0x00, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [310] 4x13 'Ÿ' 0x178
    intArrayOf(0x06, 0x0E, 0x3F, 0x3F, 0x07, 0x0E, 0x0C, 0x1C, 0x38, 0x3F, 0x00, 0x00, 0x00) , // [311] 6x13 'Ź' 0x179
    intArrayOf(0x00, 0x00, 0x06, 0x0E, 0x1F, 0x1F, 0x06, 0x0E, 0x1C, 0x1F, 0x00, 0x00, 0x00) , // [312] 5x13 'ź' 0x17A
    intArrayOf(0x00, 0x04, 0x00, 0x0E, 0x02, 0x02, 0x04, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [313] 4x13 'Ż' 0x17B
    intArrayOf(0x00, 0x00, 0x0C, 0x0C, 0x1F, 0x1F, 0x06, 0x0E, 0x1C, 0x1F, 0x00, 0x00, 0x00) , // [314] 5x13 'ż' 0x17C
    intArrayOf(0x00, 0x0E, 0x00, 0x0E, 0x02, 0x02, 0x04, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [315] 4x13 'Ž' 0x17D
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x02, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00)   // [316] 4x13 'ž' 0x17E
),
            widths = intArrayOf(
    2,2,4,6,4,9,5,2,3,3,           // ' '..')' 0x20
    4,4,2,4,2,3,4,4,4,4,           // '*'..'3' 0x2A
    4,4,4,4,4,4,2,2,3,4,           // '4'..'=' 0x34
    3,4,6,4,4,4,4,3,3,4,           // '>'..'G' 0x3E
    4,2,4,4,3,6,4,4,4,4,           // 'H'..'Q' 0x48
    4,4,4,4,4,6,4,4,4,3,           // 'R'..'[' 0x52
    3,3,4,5,1,4,4,4,4,4,           // '\'..'e' 0x5C
    4,4,4,2,2,4,2,6,4,4,           // 'f'..'o' 0x66
    4,4,3,4,3,4,4,6,4,4,           // 'p'..'y' 0x70
    4,4,2,4,4,2,4,5,6,4,           // 'z'..'¥' 0x7A
    2,4,4,7,3,6,6,1,7,6,           // '¦'..'¯' 0xA6
    4,4,3,3,2,6,5,2,2,3,           // '°'..'¹' 0xB0
    4,6,9,9,9,4,4,4,5,4,           // 'º'..'Ã' 0xBA
    4,4,5,4,3,3,3,3,2,2,           // 'Ä'..'Í' 0xC4
    4,4,6,4,4,4,4,4,4,4,           // 'Î'..'×' 0xCE
    5,4,4,4,4,4,4,5,4,4,           // 'Ø'..'á' 0xD8
    4,4,4,4,6,4,4,4,4,4,           // 'â'..'ë' 0xE2
    2,2,2,2,5,4,4,4,4,4,           // 'ì'..'õ' 0xEC
    4,4,5,4,4,4,4,4,3,4,           // 'ö'..'ÿ' 0xF6
    4,5,10,4,7,5,4,4,4,4,          // 'Ā'..'ĉ' 0x100
    4,4,4,4,7,6,5,5,3,4,           // 'Ċ'..'ē' 0x10A
    3,4,3,4,6,5,6,5,7,6,           // 'Ĕ'..'ĝ' 0x114
    7,6,4,4,7,6,7,6,7,6,           // 'Ğ'..'ħ' 0x11E
    4,2,3,3,3,2,2,2,2,2,           // 'Ĩ'..'ı' 0x128
    8,4,6,3,6,5,6,3,2,5,           // 'Ĳ'..'Ļ' 0x132
    2,5,4,4,4,5,3,7,6,7,           // 'ļ'..'Ņ' 0x13C
    6,7,6,6,7,6,4,4,5,4,           // 'ņ'..'ŏ' 0x146
    4,4,6,6,6,3,6,3,6,3,           // 'Ő'..'ř' 0x150
    6,5,6,5,4,4,4,4,4,3,           // 'Ś'..'ţ' 0x15A
    4,4,6,3,4,4,4,4,4,4,           // 'Ť'..'ŭ' 0x164
    4,4,4,4,4,4,9,8,6,5,           // 'Ů'..'ŷ' 0x16E
    4,6,5,4,5,4,4                  //    ..'ž'
        )
    )
    }
}
// Max Bitmap 10 x 13
// Mass Matrix #####..... 0
// Mass Matrix ######.... 1
// Mass Matrix #########. 2
// Mass Matrix #########. 3
// Mass Matrix #########. 4
// Mass Matrix #########. 5
// Mass Matrix ########.. 6
// Mass Matrix ########.. 7
// Mass Matrix ########.. 8
// Mass Matrix ########.. 9
// Mass Matrix #######... 10
// Mass Matrix #######... 11
// Mass Matrix ######.... 12
