package com.rudolas.mia.lcdst7920.fonts

import com.rudolas.mia.lcdst7920.SpiST9720

class Mousetrap210px {
    companion object {
        val font = SpiST9720.Companion.FontItem( // FONT 10px mousetrap2.ttf
            "MOUSETRAP2_10PX",
            charBytes = arrayOf( 
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [0] 5x11 ' ' 0x20
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x00, 0x02, 0x00, 0x00, 0x00) , // [1] 2x11 '!' 0x21
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [2] 4x11 '"' 0x22
    intArrayOf(0x00, 0x00, 0x00, 0x14, 0x3E, 0x14, 0x3E, 0x14, 0x00, 0x00, 0x00) , // [3] 6x11 '#' 0x23
    intArrayOf(0x00, 0x00, 0x04, 0x0E, 0x08, 0x0E, 0x02, 0x0E, 0x04, 0x00, 0x00) , // [4] 4x11 '$' 0x24
    intArrayOf(0x00, 0x00, 0x00, 0x34, 0x34, 0x08, 0x16, 0x16, 0x00, 0x00, 0x00) , // [5] 6x11 '%' 0x25
    intArrayOf(0x00, 0x00, 0x00, 0x18, 0x14, 0x1E, 0x14, 0x1E, 0x00, 0x00, 0x00) , // [6] 5x11 '&' 0x26
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [7] 2x11 ''' 0x27
    intArrayOf(0x00, 0x00, 0x02, 0x04, 0x04, 0x04, 0x04, 0x04, 0x02, 0x00, 0x00) , // [8] 3x11 '(' 0x28
    intArrayOf(0x00, 0x00, 0x04, 0x02, 0x02, 0x02, 0x02, 0x02, 0x04, 0x00, 0x00) , // [9] 3x11 ')' 0x29
    intArrayOf(0x00, 0x00, 0x04, 0x0E, 0x04, 0x0A, 0x00, 0x00, 0x00, 0x00, 0x00) , // [10] 4x11 '*' 0x2A
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x04, 0x0E, 0x04, 0x00, 0x00, 0x00, 0x00) , // [11] 4x11 '+' 0x2B
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x02, 0x00, 0x00) , // [12] 2x11 ',' 0x2C
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00) , // [13] 3x11 '-' 0x2D
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00) , // [14] 2x11 '.' 0x2E
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x04, 0x04, 0x08, 0x08, 0x00, 0x00) , // [15] 4x11 '/' 0x2F
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [16] 4x11 '0' 0x30
    intArrayOf(0x00, 0x00, 0x00, 0x0C, 0x04, 0x04, 0x04, 0x0E, 0x00, 0x00, 0x00) , // [17] 4x11 '1' 0x31
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x02, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [18] 4x11 '2' 0x32
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x02, 0x06, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [19] 4x11 '3' 0x33
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0E, 0x02, 0x02, 0x00, 0x00, 0x00) , // [20] 4x11 '4' 0x34
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x08, 0x0C, 0x02, 0x0C, 0x00, 0x00, 0x00) , // [21] 4x11 '5' 0x35
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x08, 0x0E, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [22] 4x11 '6' 0x36
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x02, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [23] 4x11 '7' 0x37
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0E, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [24] 4x11 '8' 0x38
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0E, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [25] 4x11 '9' 0x39
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x00, 0x02, 0x00, 0x00, 0x00) , // [26] 2x11 ':' 0x3A
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x00, 0x02, 0x04, 0x00, 0x00) , // [27] 3x11 ';' 0x3B
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x06, 0x08, 0x06, 0x00, 0x00, 0x00, 0x00) , // [28] 4x11 '<' 0x3C
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x00, 0x0E, 0x00, 0x00, 0x00, 0x00) , // [29] 4x11 '=' 0x3D
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0C, 0x02, 0x0C, 0x00, 0x00, 0x00, 0x00) , // [30] 4x11 '>' 0x3E
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x02, 0x04, 0x00, 0x04, 0x00, 0x00, 0x00) , // [31] 4x11 '?' 0x3F
    intArrayOf(0x00, 0x00, 0x00, 0x0C, 0x12, 0x16, 0x16, 0x10, 0x0E, 0x00, 0x00) , // [32] 5x11 '@' 0x40
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0E, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [33] 4x11 'A' 0x41
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0C, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [34] 4x11 'B' 0x42
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x08, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [35] 4x11 'C' 0x43
    intArrayOf(0x00, 0x00, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x0C, 0x00, 0x00, 0x00) , // [36] 4x11 'D' 0x44
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x08, 0x0C, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [37] 4x11 'E' 0x45
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x08, 0x0C, 0x08, 0x08, 0x00, 0x00, 0x00) , // [38] 4x11 'F' 0x46
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x08, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [39] 4x11 'G' 0x47
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0E, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [40] 4x11 'H' 0x48
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [41] 2x11 'I' 0x49
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x02, 0x02, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [42] 4x11 'J' 0x4A
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0C, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [43] 4x11 'K' 0x4B
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x08, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [44] 4x11 'L' 0x4C
    intArrayOf(0x00, 0x00, 0x00, 0x3C, 0x2A, 0x2A, 0x2A, 0x2A, 0x00, 0x00, 0x00) , // [45] 6x11 'M' 0x4D
    intArrayOf(0x00, 0x00, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [46] 4x11 'N' 0x4E
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [47] 4x11 'O' 0x4F
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0E, 0x08, 0x08, 0x00, 0x00, 0x00) , // [48] 4x11 'P' 0x50
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x04, 0x02, 0x00) , // [49] 4x11 'Q' 0x51
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0C, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [50] 4x11 'R' 0x52
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x08, 0x0E, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [51] 4x11 'S' 0x53
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [52] 4x11 'T' 0x54
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [53] 4x11 'U' 0x55
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x04, 0x00, 0x00, 0x00) , // [54] 4x11 'V' 0x56
    intArrayOf(0x00, 0x00, 0x00, 0x2A, 0x2A, 0x2A, 0x2A, 0x14, 0x00, 0x00, 0x00) , // [55] 6x11 'W' 0x57
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x04, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [56] 4x11 'X' 0x58
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [57] 4x11 'Y' 0x59
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x02, 0x04, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [58] 4x11 'Z' 0x5A
    intArrayOf(0x00, 0x00, 0x06, 0x04, 0x04, 0x04, 0x04, 0x04, 0x06, 0x00, 0x00) , // [59] 3x11 '[' 0x5B
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x08, 0x04, 0x04, 0x02, 0x02, 0x00, 0x00) , // [60] 4x11 '\' 0x5C
    intArrayOf(0x00, 0x00, 0x06, 0x02, 0x02, 0x02, 0x02, 0x02, 0x06, 0x00, 0x00) , // [61] 3x11 ']' 0x5D
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x0A, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [62] 4x11 '^' 0x5E
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x0E, 0x00, 0x00) , // [63] 4x11 '_' 0x5F
    intArrayOf(0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [64] 1x11 '`' 0x60
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x02, 0x0E, 0x0E, 0x00, 0x00, 0x00) , // [65] 4x11 'a' 0x61
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x0C, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [66] 4x11 'b' 0x62
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [67] 4x11 'c' 0x63
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x06, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [68] 4x11 'd' 0x64
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [69] 4x11 'e' 0x65
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x04, 0x0E, 0x04, 0x04, 0x00, 0x00, 0x00) , // [70] 4x11 'f' 0x66
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x06, 0x0A, 0x0A, 0x0E, 0x02, 0x0E, 0x00) , // [71] 4x11 'g' 0x67
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x0C, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [72] 4x11 'h' 0x68
    intArrayOf(0x00, 0x00, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [73] 2x11 'i' 0x69
    intArrayOf(0x00, 0x00, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x04, 0x00) , // [74] 3x11 'j' 0x6A
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x0A, 0x0C, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [75] 4x11 'k' 0x6B
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [76] 2x11 'l' 0x6C
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x3C, 0x2A, 0x2A, 0x2A, 0x00, 0x00, 0x00) , // [77] 6x11 'm' 0x6D
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [78] 4x11 'n' 0x6E
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [79] 4x11 'o' 0x6F
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0C, 0x0A, 0x0A, 0x0E, 0x08, 0x08, 0x00) , // [80] 4x11 'p' 0x70
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x06, 0x0A, 0x0A, 0x0E, 0x02, 0x02, 0x00) , // [81] 4x11 'q' 0x71
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x08, 0x08, 0x08, 0x00, 0x00, 0x00) , // [82] 4x11 'r' 0x72
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x0C, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [83] 4x11 's' 0x73
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x0E, 0x04, 0x04, 0x02, 0x00, 0x00, 0x00) , // [84] 4x11 't' 0x74
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [85] 4x11 'u' 0x75
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x04, 0x00, 0x00, 0x00) , // [86] 4x11 'v' 0x76
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x2A, 0x2A, 0x2A, 0x14, 0x00, 0x00, 0x00) , // [87] 6x11 'w' 0x77
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0A, 0x04, 0x04, 0x0A, 0x00, 0x00, 0x00) , // [88] 4x11 'x' 0x78
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x02, 0x0C, 0x00) , // [89] 4x11 'y' 0x79
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x04, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [90] 4x11 'z' 0x7A
    intArrayOf(0x00, 0x00, 0x06, 0x04, 0x04, 0x0C, 0x04, 0x04, 0x06, 0x00, 0x00) , // [91] 4x11 '{' 0x7B
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00) , // [92] 2x11 '|' 0x7C
    intArrayOf(0x00, 0x00, 0x0C, 0x04, 0x04, 0x06, 0x04, 0x04, 0x0C, 0x00, 0x00) , // [93] 4x11 '}' 0x7D
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x0A, 0x14, 0x00, 0x00, 0x00, 0x00) , // [94] 5x11 '~' 0x7E
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x02, 0x00, 0x02, 0x02, 0x02, 0x00, 0x00) , // [95] 2x11 '¡' 0xA1
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x04, 0x0E, 0x08, 0x0E, 0x04, 0x00, 0x00) , // [96] 4x11 '¢' 0xA2
    intArrayOf(0x00, 0x00, 0x00, 0x0C, 0x08, 0x1C, 0x08, 0x1E, 0x00, 0x00, 0x00) , // [97] 5x11 '£' 0xA3
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x12, 0x0C, 0x0C, 0x12, 0x00, 0x00, 0x00) , // [98] 5x11 '¤' 0xA4
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x04, 0x0E, 0x04, 0x00, 0x00, 0x00) , // [99] 4x11 '¥' 0xA5
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x00, 0x02, 0x02, 0x02, 0x00, 0x00) , // [100] 2x11 '¦' 0xA6
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x08, 0x0E, 0x0E, 0x02, 0x0E, 0x00, 0x00) , // [101] 4x11 '§' 0xA7
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [102] 4x11 '¨' 0xA8
    intArrayOf(0x00, 0x00, 0x3C, 0x42, 0x5A, 0x5A, 0x42, 0x3C, 0x00, 0x00, 0x00) , // [103] 7x11 '©' 0xA9
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x06, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00) , // [104] 3x11 'ª' 0xAA
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0A, 0x14, 0x0A, 0x00, 0x00, 0x00, 0x00) , // [105] 5x11 '«' 0xAB
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x1E, 0x02, 0x02, 0x00, 0x00, 0x00, 0x00) , // [106] 5x11 '¬' 0xAC
    IntArray(0), // blank font char '­' 0xAD
    intArrayOf(0x00, 0x00, 0x3C, 0x42, 0x5A, 0x56, 0x42, 0x3C, 0x00, 0x00, 0x00) , // [108] 7x11 '®' 0xAE
    intArrayOf(0x00, 0x00, 0x0E, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [109] 4x11 '¯' 0xAF
    intArrayOf(0x00, 0x00, 0x06, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [110] 3x11 '°' 0xB0
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x04, 0x0E, 0x04, 0x0E, 0x00, 0x00, 0x00) , // [111] 4x11 '±' 0xB1
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x04, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00) , // [112] 3x11 '²' 0xB2
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x02, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00) , // [113] 3x11 '³' 0xB3
    intArrayOf(0x00, 0x00, 0x02, 0x04, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00) , // [114] 3x11 '´' 0xB4
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x08, 0x00, 0x00) , // [115] 4x11 'µ' 0xB5
    intArrayOf(0x00, 0x00, 0x00, 0x1E, 0x1A, 0x1A, 0x0A, 0x0A, 0x0A, 0x00, 0x00) , // [116] 5x11 '¶' 0xB6
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x00, 0x00, 0x00, 0x00, 0x00) , // [117] 2x11 '·' 0xB7
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0x04, 0x00) , // [118] 3x11 '¸' 0xB8
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00, 0x00, 0x00) , // [119] 2x11 '¹' 0xB9
    intArrayOf(0x00, 0x00, 0x00, 0x06, 0x06, 0x00, 0x06, 0x00, 0x00, 0x00, 0x00) , // [120] 3x11 'º' 0xBA
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x14, 0x0A, 0x14, 0x00, 0x00, 0x00, 0x00) , // [121] 5x11 '»' 0xBB
    intArrayOf(0x00, 0x00, 0x00, 0x48, 0x48, 0x56, 0x26, 0x22, 0x00, 0x00, 0x00) , // [122] 7x11 '¼' 0xBC
    intArrayOf(0x00, 0x00, 0x00, 0x48, 0x48, 0x56, 0x24, 0x26, 0x00, 0x00, 0x00) , // [123] 7x11 '½' 0xBD
    intArrayOf(0x00, 0x00, 0x00, 0xC8, 0x48, 0xD6, 0x26, 0x22, 0x00, 0x00, 0x00) , // [124] 8x11 '¾' 0xBE
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x04, 0x00, 0x04, 0x08, 0x08, 0x0E, 0x00) , // [125] 4x11 '¿' 0xBF
    intArrayOf(0x08, 0x04, 0x00, 0x0E, 0x0A, 0x0E, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [126] 4x11 'À' 0xC0
    intArrayOf(0x02, 0x04, 0x00, 0x0E, 0x0A, 0x0E, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [127] 4x11 'Á' 0xC1
    intArrayOf(0x04, 0x0A, 0x00, 0x0E, 0x0A, 0x0E, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [128] 4x11 'Â' 0xC2
    intArrayOf(0x0A, 0x04, 0x00, 0x0E, 0x0A, 0x0E, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [129] 4x11 'Ã' 0xC3
    intArrayOf(0x00, 0x0A, 0x00, 0x0E, 0x0A, 0x0E, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [130] 4x11 'Ä' 0xC4
    intArrayOf(0x04, 0x0A, 0x04, 0x0E, 0x0A, 0x0E, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [131] 4x11 'Å' 0xC5
    intArrayOf(0x00, 0x00, 0x00, 0x3E, 0x28, 0x3C, 0x28, 0x2E, 0x00, 0x00, 0x00) , // [132] 6x11 'Æ' 0xC6
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x08, 0x08, 0x08, 0x0E, 0x04, 0x08, 0x00) , // [133] 4x11 'Ç' 0xC7
    intArrayOf(0x08, 0x04, 0x00, 0x0E, 0x08, 0x0C, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [134] 4x11 'È' 0xC8
    intArrayOf(0x02, 0x04, 0x00, 0x0E, 0x08, 0x0C, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [135] 4x11 'É' 0xC9
    intArrayOf(0x04, 0x0A, 0x00, 0x0E, 0x08, 0x0C, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [136] 4x11 'Ê' 0xCA
    intArrayOf(0x00, 0x0A, 0x00, 0x0E, 0x08, 0x0C, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [137] 4x11 'Ë' 0xCB
    intArrayOf(0x00, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [138] 2x11 'Ì' 0xCC
    intArrayOf(0x02, 0x04, 0x00, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [139] 3x11 'Í' 0xCD
    intArrayOf(0x04, 0x0A, 0x00, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [140] 4x11 'Î' 0xCE
    intArrayOf(0x00, 0x0A, 0x00, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [141] 4x11 'Ï' 0xCF
    intArrayOf(0x00, 0x00, 0x00, 0x0C, 0x0A, 0x1A, 0x0A, 0x0C, 0x00, 0x00, 0x00) , // [142] 5x11 'Ð' 0xD0
    intArrayOf(0x0A, 0x04, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [143] 4x11 'Ñ' 0xD1
    intArrayOf(0x08, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [144] 4x11 'Ò' 0xD2
    intArrayOf(0x02, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [145] 4x11 'Ó' 0xD3
    intArrayOf(0x04, 0x0A, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [146] 4x11 'Ô' 0xD4
    intArrayOf(0x0A, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [147] 4x11 'Õ' 0xD5
    intArrayOf(0x00, 0x0A, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [148] 4x11 'Ö' 0xD6
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0A, 0x04, 0x0A, 0x00, 0x00, 0x00, 0x00) , // [149] 4x11 '×' 0xD7
    intArrayOf(0x00, 0x00, 0x02, 0x1C, 0x14, 0x1C, 0x14, 0x1C, 0x00, 0x00, 0x00) , // [150] 5x11 'Ø' 0xD8
    intArrayOf(0x08, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [151] 4x11 'Ù' 0xD9
    intArrayOf(0x02, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [152] 4x11 'Ú' 0xDA
    intArrayOf(0x04, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [153] 4x11 'Û' 0xDB
    intArrayOf(0x00, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [154] 4x11 'Ü' 0xDC
    intArrayOf(0x02, 0x04, 0x00, 0x0A, 0x0A, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [155] 4x11 'Ý' 0xDD
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x0C, 0x0A, 0x0C, 0x08, 0x00, 0x00, 0x00) , // [156] 4x11 'Þ' 0xDE
    intArrayOf(0x00, 0x00, 0x00, 0x0C, 0x12, 0x14, 0x12, 0x14, 0x00, 0x00, 0x00) , // [157] 5x11 'ß' 0xDF
    intArrayOf(0x00, 0x08, 0x04, 0x00, 0x0E, 0x02, 0x0E, 0x0E, 0x00, 0x00, 0x00) , // [158] 4x11 'à' 0xE0
    intArrayOf(0x00, 0x02, 0x04, 0x00, 0x0E, 0x02, 0x0E, 0x0E, 0x00, 0x00, 0x00) , // [159] 4x11 'á' 0xE1
    intArrayOf(0x00, 0x04, 0x0A, 0x00, 0x0E, 0x02, 0x0E, 0x0E, 0x00, 0x00, 0x00) , // [160] 4x11 'â' 0xE2
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0E, 0x02, 0x0E, 0x0E, 0x00, 0x00, 0x00) , // [161] 4x11 'ã' 0xE3
    intArrayOf(0x00, 0x00, 0x0A, 0x00, 0x0E, 0x02, 0x0E, 0x0E, 0x00, 0x00, 0x00) , // [162] 4x11 'ä' 0xE4
    intArrayOf(0x00, 0x04, 0x0A, 0x04, 0x0E, 0x02, 0x0E, 0x0E, 0x00, 0x00, 0x00) , // [163] 4x11 'å' 0xE5
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x3E, 0x0E, 0x38, 0x3E, 0x00, 0x00, 0x00) , // [164] 6x11 'æ' 0xE6
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x08, 0x08, 0x0E, 0x04, 0x08, 0x00) , // [165] 4x11 'ç' 0xE7
    intArrayOf(0x00, 0x08, 0x04, 0x00, 0x0E, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [166] 4x11 'è' 0xE8
    intArrayOf(0x00, 0x02, 0x04, 0x00, 0x0E, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [167] 4x11 'é' 0xE9
    intArrayOf(0x00, 0x04, 0x0A, 0x00, 0x0E, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [168] 4x11 'ê' 0xEA
    intArrayOf(0x00, 0x00, 0x0A, 0x00, 0x0E, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [169] 4x11 'ë' 0xEB
    intArrayOf(0x00, 0x00, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [170] 2x11 'ì' 0xEC
    intArrayOf(0x00, 0x02, 0x04, 0x00, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [171] 3x11 'í' 0xED
    intArrayOf(0x00, 0x04, 0x0A, 0x00, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [172] 4x11 'î' 0xEE
    intArrayOf(0x00, 0x00, 0x0A, 0x00, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [173] 4x11 'ï' 0xEF
    intArrayOf(0x00, 0x00, 0x08, 0x1E, 0x04, 0x1C, 0x14, 0x1C, 0x00, 0x00, 0x00) , // [174] 5x11 'ð' 0xF0
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [175] 4x11 'ñ' 0xF1
    intArrayOf(0x00, 0x08, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [176] 4x11 'ò' 0xF2
    intArrayOf(0x00, 0x02, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [177] 4x11 'ó' 0xF3
    intArrayOf(0x00, 0x04, 0x0A, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [178] 4x11 'ô' 0xF4
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [179] 4x11 'õ' 0xF5
    intArrayOf(0x00, 0x00, 0x0A, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [180] 4x11 'ö' 0xF6
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x00, 0x0E, 0x00, 0x04, 0x00, 0x00, 0x00) , // [181] 4x11 '÷' 0xF7
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x1C, 0x14, 0x1C, 0x1C, 0x00, 0x00, 0x00) , // [182] 5x11 'ø' 0xF8
    intArrayOf(0x00, 0x08, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [183] 4x11 'ù' 0xF9
    intArrayOf(0x00, 0x02, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [184] 4x11 'ú' 0xFA
    intArrayOf(0x00, 0x04, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [185] 4x11 'û' 0xFB
    intArrayOf(0x00, 0x00, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [186] 4x11 'ü' 0xFC
    intArrayOf(0x00, 0x02, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x02, 0x0C, 0x00) , // [187] 4x11 'ý' 0xFD
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x08, 0x0C, 0x0A, 0x0C, 0x08, 0x08, 0x00) , // [188] 4x11 'þ' 0xFE
    intArrayOf(0x00, 0x00, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x02, 0x0C, 0x00) , // [189] 4x11 'ÿ' 0xFF
    intArrayOf(0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x0E, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [190] 4x11 'Ā' 0x100
    intArrayOf(0x00, 0x00, 0x0E, 0x00, 0x0E, 0x02, 0x0E, 0x0E, 0x00, 0x00, 0x00) , // [191] 4x11 'ā' 0x101
    intArrayOf(0x0A, 0x04, 0x00, 0x0E, 0x0A, 0x0E, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [192] 4x11 'Ă' 0x102
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0E, 0x02, 0x0E, 0x0E, 0x00, 0x00, 0x00) , // [193] 4x11 'ă' 0x103
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0E, 0x0A, 0x0A, 0x04, 0x02, 0x00) , // [194] 4x11 'Ą' 0x104
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x02, 0x0E, 0x0E, 0x04, 0x02, 0x00) , // [195] 4x11 'ą' 0x105
    intArrayOf(0x02, 0x04, 0x00, 0x0E, 0x08, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [196] 4x11 'Ć' 0x106
    intArrayOf(0x00, 0x02, 0x04, 0x00, 0x0E, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [197] 4x11 'ć' 0x107
    intArrayOf(0x04, 0x0A, 0x00, 0x0E, 0x08, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [198] 4x11 'Ĉ' 0x108
    intArrayOf(0x00, 0x04, 0x0A, 0x00, 0x0E, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [199] 4x11 'ĉ' 0x109
    intArrayOf(0x00, 0x04, 0x00, 0x0E, 0x08, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [200] 4x11 'Ċ' 0x10A
    intArrayOf(0x00, 0x00, 0x04, 0x00, 0x0E, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [201] 4x11 'ċ' 0x10B
    intArrayOf(0x0A, 0x04, 0x00, 0x0E, 0x08, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [202] 4x11 'Č' 0x10C
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0E, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [203] 4x11 'č' 0x10D
    intArrayOf(0x0A, 0x04, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x0C, 0x00, 0x00, 0x00) , // [204] 4x11 'Ď' 0x10E
    intArrayOf(0x00, 0x00, 0x02, 0x0A, 0x18, 0x28, 0x28, 0x38, 0x00, 0x00, 0x00) , // [205] 6x11 'ď' 0x10F
    intArrayOf(0x00, 0x00, 0x00, 0x0C, 0x0A, 0x1A, 0x0A, 0x0C, 0x00, 0x00, 0x00) , // [206] 5x11 'Đ' 0x110
    intArrayOf(0x00, 0x00, 0x0E, 0x04, 0x0C, 0x14, 0x14, 0x1C, 0x00, 0x00, 0x00) , // [207] 5x11 'đ' 0x111
    intArrayOf(0x00, 0x0E, 0x00, 0x0E, 0x08, 0x0C, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [208] 4x11 'Ē' 0x112
    intArrayOf(0x00, 0x00, 0x0E, 0x00, 0x0E, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [209] 4x11 'ē' 0x113
    intArrayOf(0x0A, 0x04, 0x00, 0x0E, 0x08, 0x0C, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [210] 4x11 'Ĕ' 0x114
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0E, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [211] 4x11 'ĕ' 0x115
    intArrayOf(0x00, 0x04, 0x00, 0x0E, 0x08, 0x0C, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [212] 4x11 'Ė' 0x116
    intArrayOf(0x00, 0x00, 0x04, 0x00, 0x0E, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [213] 4x11 'ė' 0x117
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x08, 0x0C, 0x08, 0x0E, 0x04, 0x02, 0x00) , // [214] 4x11 'Ę' 0x118
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x0E, 0x08, 0x0E, 0x04, 0x02, 0x00) , // [215] 4x11 'ę' 0x119
    intArrayOf(0x0A, 0x04, 0x00, 0x0E, 0x08, 0x0C, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [216] 4x11 'Ě' 0x11A
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0E, 0x0E, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [217] 4x11 'ě' 0x11B
    intArrayOf(0x04, 0x0A, 0x00, 0x0E, 0x08, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [218] 4x11 'Ĝ' 0x11C
    intArrayOf(0x00, 0x04, 0x0A, 0x00, 0x06, 0x0A, 0x0A, 0x0E, 0x02, 0x0E, 0x00) , // [219] 4x11 'ĝ' 0x11D
    intArrayOf(0x0A, 0x04, 0x00, 0x0E, 0x08, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [220] 4x11 'Ğ' 0x11E
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x06, 0x0A, 0x0A, 0x0E, 0x02, 0x0E, 0x00) , // [221] 4x11 'ğ' 0x11F
    intArrayOf(0x00, 0x04, 0x00, 0x0E, 0x08, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [222] 4x11 'Ġ' 0x120
    intArrayOf(0x00, 0x00, 0x04, 0x00, 0x06, 0x0A, 0x0A, 0x0E, 0x02, 0x0E, 0x00) , // [223] 4x11 'ġ' 0x121
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x08, 0x0A, 0x0A, 0x0E, 0x00, 0x04, 0x04) , // [224] 4x11 'Ģ' 0x122
    intArrayOf(0x00, 0x04, 0x04, 0x00, 0x06, 0x0A, 0x0A, 0x0E, 0x02, 0x0E, 0x00) , // [225] 4x11 'ģ' 0x123
    intArrayOf(0x04, 0x0A, 0x00, 0x0A, 0x0A, 0x0E, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [226] 4x11 'Ĥ' 0x124
    intArrayOf(0x04, 0x0A, 0x00, 0x08, 0x0C, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [227] 4x11 'ĥ' 0x125
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0E, 0x0A, 0x0E, 0x0A, 0x00, 0x00, 0x00) , // [228] 4x11 'Ħ' 0x126
    intArrayOf(0x00, 0x00, 0x0C, 0x08, 0x0C, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [229] 4x11 'ħ' 0x127
    intArrayOf(0x0A, 0x04, 0x00, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [230] 4x11 'Ĩ' 0x128
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [231] 4x11 'ĩ' 0x129
    intArrayOf(0x00, 0x0E, 0x00, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [232] 4x11 'Ī' 0x12A
    intArrayOf(0x00, 0x00, 0x0E, 0x00, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [233] 4x11 'ī' 0x12B
    intArrayOf(0x0A, 0x04, 0x00, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [234] 4x11 'Ĭ' 0x12C
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [235] 4x11 'ĭ' 0x12D
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x02, 0x00) , // [236] 2x11 'Į' 0x12E
    intArrayOf(0x00, 0x00, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x04, 0x02, 0x00) , // [237] 3x11 'į' 0x12F
    intArrayOf(0x00, 0x02, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [238] 2x11 'İ' 0x130
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x02, 0x00, 0x00, 0x00) , // [239] 2x11 'ı' 0x131
    intArrayOf(0x00, 0x00, 0x00, 0x16, 0x12, 0x12, 0x02, 0x1C, 0x00, 0x00, 0x00) , // [240] 5x11 'Ĳ' 0x132
    intArrayOf(0x00, 0x00, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x02, 0x04, 0x00) , // [241] 4x11 'ĳ' 0x133
    intArrayOf(0x04, 0x0A, 0x00, 0x0C, 0x04, 0x04, 0x04, 0x18, 0x00, 0x00, 0x00) , // [242] 5x11 'Ĵ' 0x134
    intArrayOf(0x00, 0x04, 0x0A, 0x00, 0x04, 0x04, 0x04, 0x04, 0x04, 0x08, 0x00) , // [243] 4x11 'ĵ' 0x135
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0C, 0x0A, 0x0A, 0x00, 0x04, 0x04) , // [244] 4x11 'Ķ' 0x136
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x0A, 0x0C, 0x0A, 0x0A, 0x00, 0x04, 0x04) , // [245] 4x11 'ķ' 0x137
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0A, 0x0C, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [246] 4x11 'ĸ' 0x138
    intArrayOf(0x04, 0x08, 0x00, 0x08, 0x08, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [247] 4x11 'Ĺ' 0x139
    intArrayOf(0x02, 0x04, 0x00, 0x04, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [248] 3x11 'ĺ' 0x13A
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x08, 0x08, 0x08, 0x0E, 0x00, 0x04, 0x04) , // [249] 4x11 'Ļ' 0x13B
    intArrayOf(0x00, 0x00, 0x00, 0x02, 0x02, 0x02, 0x02, 0x02, 0x00, 0x02, 0x02) , // [250] 2x11 'ļ' 0x13C
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x08, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [251] 4x11 'Ľ' 0x13D
    intArrayOf(0x00, 0x00, 0x02, 0x0A, 0x08, 0x08, 0x08, 0x08, 0x00, 0x00, 0x00) , // [252] 4x11 'ľ' 0x13E
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x08, 0x0A, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [253] 4x11 'Ŀ' 0x13F
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x08, 0x0A, 0x08, 0x08, 0x00, 0x00, 0x00) , // [254] 4x11 'ŀ' 0x140
    intArrayOf(0x00, 0x00, 0x00, 0x08, 0x08, 0x0C, 0x18, 0x0E, 0x00, 0x00, 0x00) , // [255] 5x11 'Ł' 0x141
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x06, 0x0C, 0x04, 0x04, 0x00, 0x00, 0x00) , // [256] 4x11 'ł' 0x142
    intArrayOf(0x02, 0x04, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [257] 4x11 'Ń' 0x143
    intArrayOf(0x00, 0x02, 0x04, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [258] 4x11 'ń' 0x144
    intArrayOf(0x00, 0x00, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x0A, 0x00, 0x04, 0x04) , // [259] 4x11 'Ņ' 0x145
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x00, 0x04, 0x04) , // [260] 4x11 'ņ' 0x146
    intArrayOf(0x0A, 0x04, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [261] 4x11 'Ň' 0x147
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [262] 4x11 'ň' 0x148
    intArrayOf(0x00, 0x10, 0x10, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [263] 5x11 'ŉ' 0x149
    intArrayOf(0x00, 0x00, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x0A, 0x02, 0x04, 0x00) , // [264] 4x11 'Ŋ' 0x14A
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0C, 0x0A, 0x0A, 0x0A, 0x02, 0x04, 0x00) , // [265] 4x11 'ŋ' 0x14B
    intArrayOf(0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [266] 4x11 'Ō' 0x14C
    intArrayOf(0x00, 0x00, 0x0E, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [267] 4x11 'ō' 0x14D
    intArrayOf(0x0A, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [268] 4x11 'Ŏ' 0x14E
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0E, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [269] 4x11 'ŏ' 0x14F
    intArrayOf(0x12, 0x04, 0x00, 0x1C, 0x14, 0x14, 0x14, 0x1C, 0x00, 0x00, 0x00) , // [270] 5x11 'Ő' 0x150
    intArrayOf(0x00, 0x12, 0x24, 0x00, 0x1C, 0x14, 0x14, 0x1C, 0x00, 0x00, 0x00) , // [271] 6x11 'ő' 0x151
    intArrayOf(0x00, 0x00, 0x00, 0x3E, 0x28, 0x2C, 0x28, 0x3E, 0x00, 0x00, 0x00) , // [272] 6x11 'Œ' 0x152
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x3E, 0x2E, 0x28, 0x3E, 0x00, 0x00, 0x00) , // [273] 6x11 'œ' 0x153
    intArrayOf(0x02, 0x04, 0x00, 0x0E, 0x0A, 0x0C, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [274] 4x11 'Ŕ' 0x154
    intArrayOf(0x00, 0x02, 0x04, 0x00, 0x0E, 0x08, 0x08, 0x08, 0x00, 0x00, 0x00) , // [275] 4x11 'ŕ' 0x155
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x0A, 0x0C, 0x0A, 0x0A, 0x00, 0x04, 0x04) , // [276] 4x11 'Ŗ' 0x156
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x08, 0x08, 0x08, 0x00, 0x08, 0x08) , // [277] 4x11 'ŗ' 0x157
    intArrayOf(0x0A, 0x04, 0x00, 0x0E, 0x0A, 0x0C, 0x0A, 0x0A, 0x00, 0x00, 0x00) , // [278] 4x11 'Ř' 0x158
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0E, 0x08, 0x08, 0x08, 0x00, 0x00, 0x00) , // [279] 4x11 'ř' 0x159
    intArrayOf(0x02, 0x04, 0x00, 0x0E, 0x08, 0x0E, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [280] 4x11 'Ś' 0x15A
    intArrayOf(0x00, 0x02, 0x04, 0x00, 0x0E, 0x0C, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [281] 4x11 'ś' 0x15B
    intArrayOf(0x04, 0x0A, 0x00, 0x0E, 0x08, 0x0E, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [282] 4x11 'Ŝ' 0x15C
    intArrayOf(0x00, 0x04, 0x0A, 0x00, 0x0E, 0x0C, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [283] 4x11 'ŝ' 0x15D
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x08, 0x0E, 0x02, 0x0E, 0x04, 0x08, 0x00) , // [284] 4x11 'Ş' 0x15E
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0E, 0x0C, 0x02, 0x0E, 0x04, 0x08, 0x00) , // [285] 4x11 'ş' 0x15F
    intArrayOf(0x0A, 0x04, 0x00, 0x0E, 0x08, 0x0E, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [286] 4x11 'Š' 0x160
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0E, 0x0C, 0x02, 0x0E, 0x00, 0x00, 0x00) , // [287] 4x11 'š' 0x161
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x04, 0x04, 0x04, 0x04, 0x02, 0x04, 0x00) , // [288] 4x11 'Ţ' 0x162
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x0E, 0x04, 0x04, 0x02, 0x02, 0x04, 0x00) , // [289] 4x11 'ţ' 0x163
    intArrayOf(0x0A, 0x04, 0x00, 0x0E, 0x04, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [290] 4x11 'Ť' 0x164
    intArrayOf(0x00, 0x00, 0x02, 0x0A, 0x1C, 0x08, 0x08, 0x04, 0x00, 0x00, 0x00) , // [291] 5x11 'ť' 0x165
    intArrayOf(0x00, 0x00, 0x00, 0x0E, 0x04, 0x0E, 0x04, 0x04, 0x00, 0x00, 0x00) , // [292] 4x11 'Ŧ' 0x166
    intArrayOf(0x00, 0x00, 0x00, 0x04, 0x0E, 0x04, 0x0E, 0x02, 0x00, 0x00, 0x00) , // [293] 4x11 'ŧ' 0x167
    intArrayOf(0x0A, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [294] 4x11 'Ũ' 0x168
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [295] 4x11 'ũ' 0x169
    intArrayOf(0x00, 0x0E, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [296] 4x11 'Ū' 0x16A
    intArrayOf(0x00, 0x00, 0x0E, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [297] 4x11 'ū' 0x16B
    intArrayOf(0x0A, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [298] 4x11 'Ŭ' 0x16C
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [299] 4x11 'ŭ' 0x16D
    intArrayOf(0x04, 0x0A, 0x04, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [300] 4x11 'Ů' 0x16E
    intArrayOf(0x00, 0x04, 0x0A, 0x04, 0x0A, 0x0A, 0x0A, 0x0E, 0x00, 0x00, 0x00) , // [301] 4x11 'ů' 0x16F
    intArrayOf(0x12, 0x04, 0x00, 0x14, 0x14, 0x14, 0x14, 0x1C, 0x00, 0x00, 0x00) , // [302] 5x11 'Ű' 0x170
    intArrayOf(0x00, 0x12, 0x04, 0x00, 0x14, 0x14, 0x14, 0x1C, 0x00, 0x00, 0x00) , // [303] 5x11 'ű' 0x171
    intArrayOf(0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0A, 0x0E, 0x04, 0x02, 0x00) , // [304] 4x11 'Ų' 0x172
    intArrayOf(0x00, 0x00, 0x00, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x04, 0x02, 0x00) , // [305] 4x11 'ų' 0x173
    intArrayOf(0x08, 0x14, 0x00, 0x2A, 0x2A, 0x2A, 0x2A, 0x14, 0x00, 0x00, 0x00) , // [306] 6x11 'Ŵ' 0x174
    intArrayOf(0x00, 0x08, 0x14, 0x00, 0x2A, 0x2A, 0x2A, 0x14, 0x00, 0x00, 0x00) , // [307] 6x11 'ŵ' 0x175
    intArrayOf(0x04, 0x0A, 0x00, 0x0A, 0x0A, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [308] 4x11 'Ŷ' 0x176
    intArrayOf(0x00, 0x04, 0x0A, 0x00, 0x0A, 0x0A, 0x0A, 0x0E, 0x02, 0x0C, 0x00) , // [309] 4x11 'ŷ' 0x177
    intArrayOf(0x00, 0x0A, 0x00, 0x0A, 0x0A, 0x04, 0x04, 0x04, 0x00, 0x00, 0x00) , // [310] 4x11 'Ÿ' 0x178
    intArrayOf(0x02, 0x04, 0x00, 0x0E, 0x02, 0x04, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [311] 4x11 'Ź' 0x179
    intArrayOf(0x00, 0x02, 0x04, 0x00, 0x0E, 0x04, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [312] 4x11 'ź' 0x17A
    intArrayOf(0x00, 0x04, 0x00, 0x0E, 0x02, 0x04, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [313] 4x11 'Ż' 0x17B
    intArrayOf(0x00, 0x00, 0x04, 0x00, 0x0E, 0x04, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [314] 4x11 'ż' 0x17C
    intArrayOf(0x0A, 0x04, 0x00, 0x0E, 0x02, 0x04, 0x08, 0x0E, 0x00, 0x00, 0x00) , // [315] 4x11 'Ž' 0x17D
    intArrayOf(0x00, 0x0A, 0x04, 0x00, 0x0E, 0x04, 0x08, 0x0E, 0x00, 0x00, 0x00)   // [316] 4x11 'ž' 0x17E
),
            widths = intArrayOf(
    5,2,4,6,4,6,5,2,3,3,           // ' '..')' 0x20
    4,4,2,3,2,4,4,4,4,4,           // '*'..'3' 0x2A
    4,4,4,4,4,4,2,3,4,4,           // '4'..'=' 0x34
    4,4,5,4,4,4,4,4,4,4,           // '>'..'G' 0x3E
    4,2,4,4,4,6,4,4,4,4,           // 'H'..'Q' 0x48
    4,4,4,4,4,6,4,4,4,3,           // 'R'..'[' 0x52
    4,3,4,4,1,4,4,4,4,4,           // '\'..'e' 0x5C
    4,4,4,2,3,4,2,6,4,4,           // 'f'..'o' 0x66
    4,4,4,4,4,4,4,6,4,4,           // 'p'..'y' 0x70
    4,4,2,4,5,2,4,5,5,4,           // 'z'..'¥' 0x7A
    2,4,4,7,3,5,5,1,7,4,           // '¦'..'¯' 0xA6
    3,4,3,3,3,4,5,2,3,2,           // '°'..'¹' 0xB0
    3,5,7,7,8,4,4,4,4,4,           // 'º'..'Ã' 0xBA
    4,4,6,4,4,4,4,4,2,3,           // 'Ä'..'Í' 0xC4
    4,4,5,4,4,4,4,4,4,4,           // 'Î'..'×' 0xCE
    5,4,4,4,4,4,4,5,4,4,           // 'Ø'..'á' 0xD8
    4,4,4,4,6,4,4,4,4,4,           // 'â'..'ë' 0xE2
    2,3,4,4,5,4,4,4,4,4,           // 'ì'..'õ' 0xEC
    4,4,5,4,4,4,4,4,4,4,           // 'ö'..'ÿ' 0xF6
    4,4,4,4,4,4,4,4,4,4,           // 'Ā'..'ĉ' 0x100
    4,4,4,4,4,6,5,5,4,4,           // 'Ċ'..'ē' 0x10A
    4,4,4,4,4,4,4,4,4,4,           // 'Ĕ'..'ĝ' 0x114
    4,4,4,4,4,4,4,4,4,4,           // 'Ğ'..'ħ' 0x11E
    4,4,4,4,4,4,2,3,2,2,           // 'Ĩ'..'ı' 0x128
    5,4,5,4,4,4,4,4,3,4,           // 'Ĳ'..'Ļ' 0x132
    2,4,4,4,4,5,4,4,4,4,           // 'ļ'..'Ņ' 0x13C
    4,4,4,5,4,4,4,4,4,4,           // 'ņ'..'ŏ' 0x146
    5,6,6,6,4,4,4,4,4,4,           // 'Ő'..'ř' 0x150
    4,4,4,4,4,4,4,4,4,4,           // 'Ś'..'ţ' 0x15A
    4,5,4,4,4,4,4,4,4,4,           // 'Ť'..'ŭ' 0x164
    4,4,5,5,4,4,6,6,4,4,           // 'Ů'..'ŷ' 0x16E
    4,4,4,4,4,4,4                  //    ..'ž'
        )
    )
    }
}
