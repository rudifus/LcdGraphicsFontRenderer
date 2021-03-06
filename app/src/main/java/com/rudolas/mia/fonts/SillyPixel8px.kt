package com.rudolas.mia.fonts

class SillyPixel8px {
    companion object {
        val font = FontItem( // FONT 8px silly_pixel.ttf
            "SILLY_PIXEL_8PX",
            charBytes = arrayOf(
                intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00),                                       // [0] 2x5 ' ' 0x20
                intArrayOf(0x02, 0x02, 0x02, 0x00, 0x02),                                       // [1] 2x5 '!' 0x21
                intArrayOf(0x0A, 0x0A, 0x00, 0x00, 0x00),                                       // [2] 4x5 '"' 0x22
                intArrayOf(0x0A, 0x14, 0x0A, 0x14, 0x0A),                                       // [3] 5x5 '#' 0x23
                intArrayOf(0x1E, 0x14, 0x1E, 0x0A, 0x1E),                                       // [4] 5x5 '$' 0x24
                intArrayOf(0x00, 0x12, 0x04, 0x08, 0x12),                                       // [5] 5x5 '%' 0x25
                intArrayOf(0x0C, 0x12, 0x1E, 0x12, 0x1C),                                       // [6] 5x5 '&' 0x26
                intArrayOf(0x02, 0x02, 0x00, 0x00, 0x00),                                       // [7] 2x5 ''' 0x27
                intArrayOf(0x0E, 0x08, 0x08, 0x08, 0x0E),                                       // [8] 4x5 '(' 0x28
                intArrayOf(0x0E, 0x02, 0x02, 0x02, 0x0E),                                       // [9] 4x5 ')' 0x29
                intArrayOf(0x04, 0x02, 0x00, 0x00, 0x00),                                       // [10] 3x5 '*' 0x2A
                intArrayOf(0x00, 0x04, 0x0E, 0x04, 0x00),                                       // [11] 4x5 '+' 0x2B
                intArrayOf(0x00, 0x00, 0x00, 0x00, 0x02),                                       // [12] 2x5 ',' 0x2C
                intArrayOf(0x00, 0x00, 0x0E, 0x00, 0x00),                                       // [13] 4x5 '-' 0x2D
                intArrayOf(0x00, 0x00, 0x00, 0x00, 0x02),                                       // [14] 2x5 '.' 0x2E
                intArrayOf(0x02, 0x06, 0x04, 0x0C, 0x08),                                       // [15] 4x5 '/' 0x2F
                intArrayOf(0x1E, 0x12, 0x12, 0x12, 0x1E),                                       // [16] 5x5 '0' 0x30
                intArrayOf(0x06, 0x02, 0x02, 0x02, 0x02),                                       // [17] 3x5 '1' 0x31
                intArrayOf(0x1E, 0x02, 0x1E, 0x10, 0x1E),                                       // [18] 5x5 '2' 0x32
                intArrayOf(0x1E, 0x02, 0x1E, 0x02, 0x1E),                                       // [19] 5x5 '3' 0x33
                intArrayOf(0x12, 0x12, 0x1E, 0x02, 0x02),                                       // [20] 5x5 '4' 0x34
                intArrayOf(0x1E, 0x10, 0x1E, 0x02, 0x1E),                                       // [21] 5x5 '5' 0x35
                intArrayOf(0x1E, 0x10, 0x1E, 0x12, 0x1E),                                       // [22] 5x5 '6' 0x36
                intArrayOf(0x1E, 0x02, 0x02, 0x02, 0x02),                                       // [23] 5x5 '7' 0x37
                intArrayOf(0x1E, 0x12, 0x1E, 0x12, 0x1E),                                       // [24] 5x5 '8' 0x38
                intArrayOf(0x1E, 0x12, 0x1E, 0x02, 0x1E),                                       // [25] 5x5 '9' 0x39
                intArrayOf(0x00, 0x02, 0x00, 0x02, 0x00),                                       // [26] 2x5 ':' 0x3A
                intArrayOf(0x00, 0x02, 0x00, 0x02, 0x02),                                       // [27] 2x5 ';' 0x3B
                intArrayOf(0x02, 0x04, 0x08, 0x04, 0x02),                                       // [28] 4x5 '<' 0x3C
                intArrayOf(0x00, 0x1E, 0x00, 0x1E, 0x00),                                       // [29] 5x5 '=' 0x3D
                intArrayOf(0x08, 0x04, 0x02, 0x04, 0x08),                                       // [30] 4x5 '>' 0x3E
                intArrayOf(0x1E, 0x02, 0x0E, 0x00, 0x08),                                       // [31] 5x5 '?' 0x3F
                intArrayOf(0x1E, 0x12, 0x16, 0x10, 0x1E),                                       // [32] 5x5 '@' 0x40
                intArrayOf(0x1E, 0x12, 0x1E, 0x12, 0x12),                                       // [33] 5x5 'A' 0x41
                intArrayOf(0x1C, 0x14, 0x1E, 0x12, 0x1E),                                       // [34] 5x5 'B' 0x42
                intArrayOf(0x1E, 0x10, 0x10, 0x10, 0x1E),                                       // [35] 5x5 'C' 0x43
                intArrayOf(0x1C, 0x16, 0x12, 0x16, 0x1C),                                       // [36] 5x5 'D' 0x44
                intArrayOf(0x1E, 0x10, 0x1C, 0x10, 0x1E),                                       // [37] 5x5 'E' 0x45
                intArrayOf(0x1E, 0x10, 0x1C, 0x10, 0x10),                                       // [38] 5x5 'F' 0x46
                intArrayOf(0x1E, 0x10, 0x16, 0x12, 0x1E),                                       // [39] 5x5 'G' 0x47
                intArrayOf(0x12, 0x12, 0x1E, 0x12, 0x12),                                       // [40] 5x5 'H' 0x48
                intArrayOf(0x0E, 0x04, 0x04, 0x04, 0x0E),                                       // [41] 4x5 'I' 0x49
                intArrayOf(0x1E, 0x04, 0x04, 0x04, 0x1C),                                       // [42] 5x5 'J' 0x4A
                intArrayOf(0x14, 0x14, 0x1E, 0x12, 0x12),                                       // [43] 5x5 'K' 0x4B
                intArrayOf(0x08, 0x08, 0x08, 0x08, 0x0E),                                       // [44] 4x5 'L' 0x4C
                intArrayOf(0x22, 0x36, 0x2A, 0x22, 0x22),                                       // [45] 6x5 'M' 0x4D
                intArrayOf(0x12, 0x1E, 0x16, 0x12, 0x12),                                       // [46] 5x5 'N' 0x4E
                intArrayOf(0x1E, 0x12, 0x12, 0x12, 0x1E),                                       // [47] 5x5 'O' 0x4F
                intArrayOf(0x0E, 0x0A, 0x0E, 0x08, 0x08),                                       // [48] 4x5 'P' 0x50
                intArrayOf(0x1E, 0x12, 0x12, 0x16, 0x1E),                                       // [49] 5x5 'Q' 0x51
                intArrayOf(0x1E, 0x12, 0x1E, 0x14, 0x14),                                       // [50] 5x5 'R' 0x52
                intArrayOf(0x1E, 0x10, 0x1E, 0x02, 0x1E),                                       // [51] 5x5 'S' 0x53
                intArrayOf(0x0E, 0x04, 0x04, 0x04, 0x04),                                       // [52] 4x5 'T' 0x54
                intArrayOf(0x12, 0x12, 0x12, 0x12, 0x1E),                                       // [53] 5x5 'U' 0x55
                intArrayOf(0x12, 0x12, 0x12, 0x12, 0x0C),                                       // [54] 5x5 'V' 0x56
                intArrayOf(0x22, 0x22, 0x22, 0x2A, 0x14),                                       // [55] 6x5 'W' 0x57
                intArrayOf(0x0A, 0x0A, 0x04, 0x0A, 0x0A),                                       // [56] 4x5 'X' 0x58
                intArrayOf(0x0A, 0x0E, 0x04, 0x04, 0x04),                                       // [57] 4x5 'Y' 0x59
                intArrayOf(0x1E, 0x02, 0x1E, 0x10, 0x1E),                                       // [58] 5x5 'Z' 0x5A
                intArrayOf(0x06, 0x04, 0x04, 0x04, 0x06),                                       // [59] 3x5 '[' 0x5B
                intArrayOf(0x10, 0x18, 0x0C, 0x06, 0x02),                                       // [60] 5x5 '\' 0x5C
                intArrayOf(0x06, 0x02, 0x02, 0x02, 0x06),                                       // [61] 3x5 ']' 0x5D
                intArrayOf(0x04, 0x0A, 0x0A, 0x00, 0x00),                                       // [62] 4x5 '^' 0x5E
                intArrayOf(0x00, 0x00, 0x00, 0x00, 0x1E),                                       // [63] 5x5 '_' 0x5F
                intArrayOf(0x00, 0x00, 0x00, 0x00, 0x00),                                       // [64] 1x5 '`' 0x60
                intArrayOf(0x0E, 0x02, 0x0E, 0x0A, 0x0E),                                       // [65] 4x5 'a' 0x61
                intArrayOf(0x08, 0x08, 0x0E, 0x0A, 0x0E),                                       // [66] 4x5 'b' 0x62
                intArrayOf(0x0E, 0x08, 0x08, 0x08, 0x0E),                                       // [67] 4x5 'c' 0x63
                intArrayOf(0x02, 0x02, 0x0E, 0x0A, 0x0E),                                       // [68] 4x5 'd' 0x64
                intArrayOf(0x0E, 0x0A, 0x0E, 0x08, 0x0E),                                       // [69] 4x5 'e' 0x65
                intArrayOf(0x0E, 0x08, 0x0C, 0x08, 0x08),                                       // [70] 4x5 'f' 0x66
                intArrayOf(0x0E, 0x0A, 0x0E, 0x02, 0x0E),                                       // [71] 4x5 'g' 0x67
                intArrayOf(0x08, 0x08, 0x0E, 0x0A, 0x0A),                                       // [72] 4x5 'h' 0x68
                intArrayOf(0x02, 0x00, 0x02, 0x02, 0x02),                                       // [73] 2x5 'i' 0x69
                intArrayOf(0x02, 0x00, 0x02, 0x02, 0x06),                                       // [74] 3x5 'j' 0x6A
                intArrayOf(0x08, 0x0A, 0x0C, 0x0A, 0x0A),                                       // [75] 4x5 'k' 0x6B
                intArrayOf(0x02, 0x02, 0x02, 0x02, 0x02),                                       // [76] 2x5 'l' 0x6C
                intArrayOf(0x0A, 0x0E, 0x0A, 0x0A, 0x0A),                                       // [77] 4x5 'm' 0x6D
                intArrayOf(0x06, 0x0A, 0x0A, 0x0A, 0x0A),                                       // [78] 4x5 'n' 0x6E
                intArrayOf(0x0E, 0x0A, 0x0A, 0x0A, 0x0E),                                       // [79] 4x5 'o' 0x6F
                intArrayOf(0x0E, 0x0A, 0x0E, 0x08, 0x08),                                       // [80] 4x5 'p' 0x70
                intArrayOf(0x0E, 0x0A, 0x0E, 0x02, 0x02),                                       // [81] 4x5 'q' 0x71
                intArrayOf(0x0E, 0x08, 0x08, 0x08, 0x08),                                       // [82] 4x5 'r' 0x72
                intArrayOf(0x0E, 0x08, 0x0E, 0x02, 0x0E),                                       // [83] 4x5 's' 0x73
                intArrayOf(0x08, 0x08, 0x0C, 0x08, 0x0E),                                       // [84] 4x5 't' 0x74
                intArrayOf(0x0A, 0x0A, 0x0A, 0x0A, 0x0E),                                       // [85] 4x5 'u' 0x75
                intArrayOf(0x0A, 0x0A, 0x0A, 0x0A, 0x04),                                       // [86] 4x5 'v' 0x76
                intArrayOf(0x0A, 0x0A, 0x0A, 0x0E, 0x0A),                                       // [87] 4x5 'w' 0x77
                intArrayOf(0x0A, 0x0A, 0x04, 0x0A, 0x0A),                                       // [88] 4x5 'x' 0x78
                intArrayOf(0x0A, 0x0A, 0x0E, 0x02, 0x0E),                                       // [89] 4x5 'y' 0x79
                intArrayOf(0x0E, 0x02, 0x0E, 0x08, 0x0E),                                       // [90] 4x5 'z' 0x7A
                intArrayOf(0x06, 0x04, 0x08, 0x04, 0x06),                                       // [91] 4x5 '{' 0x7B
                intArrayOf(0x02, 0x02, 0x02, 0x02, 0x02),                                       // [92] 2x5 '|' 0x7C
                intArrayOf(0x0C, 0x04, 0x02, 0x04, 0x0C),                                       // [93] 4x5 '}' 0x7D
                intArrayOf(0x00, 0x02, 0x1E, 0x10, 0x00),                                       // [94] 5x5 '~' 0x7E
                intArrayOf(0x02, 0x00, 0x02, 0x02, 0x02),                                       // [95] 2x5 '¡' 0xA1
                intArrayOf(0x1E, 0x14, 0x14, 0x14, 0x1E),                                       // [96] 5x5 '¢' 0xA2
                intArrayOf(0x06, 0x08, 0x0C, 0x08, 0x0E),                                       // [97] 4x5 '£' 0xA3
                intArrayOf(0x00, 0x0A, 0x04, 0x0A, 0x00),                                       // [98] 5x5 '¤' 0xA4
                intArrayOf(0x0A, 0x0E, 0x04, 0x0E, 0x04),                                       // [99] 4x5 '¥' 0xA5
                intArrayOf(0x02, 0x02, 0x00, 0x02, 0x02),                                       // [100] 2x5 '¦' 0xA6
                intArrayOf(0x0E, 0x08, 0x0E, 0x02, 0x0E),                                       // [101] 4x5 '§' 0xA7
                intArrayOf(0x0A, 0x00, 0x00, 0x00, 0x00),                                       // [102] 4x5 '¨' 0xA8
                intArrayOf(0x1E, 0x12, 0x12, 0x12, 0x1E),                                       // [103] 5x5 '©' 0xA9
                intArrayOf(0x04, 0x0C, 0x0E, 0x00, 0x00),                                       // [104] 5x5 'ª' 0xAA
                intArrayOf(0x00, 0x0A, 0x14, 0x0A, 0x00),                                       // [105] 5x5 '«' 0xAB
                intArrayOf(0x00, 0x00, 0x0E, 0x02, 0x00),                                       // [106] 4x5 '¬' 0xAC
                IntArray(0), // blank font char '­' 0xAD
                intArrayOf(0x1E, 0x12, 0x12, 0x12, 0x1E),                                       // [108] 5x5 '®' 0xAE
                intArrayOf(0x1E, 0x00, 0x00, 0x00, 0x00),                                       // [109] 5x5 '¯' 0xAF
                intArrayOf(0x0E, 0x0A, 0x0E, 0x00, 0x00),                                       // [110] 5x5 '°' 0xB0
                intArrayOf(0x04, 0x0E, 0x04, 0x00, 0x0E),                                       // [111] 4x5 '±' 0xB1
                intArrayOf(0x06, 0x02, 0x06, 0x00, 0x00),                                       // [112] 4x5 '²' 0xB2
                intArrayOf(0x06, 0x02, 0x06, 0x00, 0x00),                                       // [113] 4x5 '³' 0xB3
                intArrayOf(0x02, 0x04, 0x00, 0x00, 0x00),                                       // [114] 3x5 '´' 0xB4
                intArrayOf(0x12, 0x12, 0x1E, 0x12, 0x10),                                       // [115] 5x5 'µ' 0xB5
                intArrayOf(0x1A, 0x1A, 0x0A, 0x0A, 0x0A),                                       // [116] 5x5 '¶' 0xB6
                intArrayOf(0x00, 0x00, 0x02, 0x00, 0x00),                                       // [117] 2x5 '·' 0xB7
                intArrayOf(0x00, 0x00, 0x00, 0x02, 0x06),                                       // [118] 3x5 '¸' 0xB8
                intArrayOf(0x06, 0x02, 0x02, 0x00, 0x00),                                       // [119] 4x5 '¹' 0xB9
                intArrayOf(0x0E, 0x0A, 0x0E, 0x00, 0x00),                                       // [120] 5x5 'º' 0xBA
                intArrayOf(0x00, 0x14, 0x0A, 0x14, 0x00),                                       // [121] 5x5 '»' 0xBB
                intArrayOf(0x00, 0x12, 0x04, 0x08, 0x12),                                       // [122] 5x5 '¼' 0xBC
                intArrayOf(0x00, 0x12, 0x04, 0x08, 0x12),                                       // [123] 5x5 '½' 0xBD
                intArrayOf(0x00, 0x12, 0x04, 0x08, 0x12),                                       // [124] 5x5 '¾' 0xBE
                intArrayOf(0x04, 0x00, 0x1C, 0x10, 0x1E),                                       // [125] 5x5 '¿' 0xBF
                intArrayOf(0x0C, 0x1E, 0x12, 0x1E, 0x12),                                       // [126] 5x5 'À' 0xC0
                intArrayOf(0x0C, 0x1E, 0x12, 0x1E, 0x12),                                       // [127] 5x5 'Á' 0xC1
                intArrayOf(0x0C, 0x1E, 0x12, 0x1E, 0x12),                                       // [128] 5x5 'Â' 0xC2
                intArrayOf(0x0C, 0x1E, 0x12, 0x1E, 0x12),                                       // [129] 5x5 'Ã' 0xC3
                intArrayOf(0x0C, 0x1E, 0x12, 0x1E, 0x12),                                       // [130] 5x5 'Ä' 0xC4
                intArrayOf(0x0C, 0x1E, 0x12, 0x1E, 0x12),                                       // [131] 5x5 'Å' 0xC5
                intArrayOf(0x1E, 0x14, 0x1E, 0x14, 0x16),                                       // [132] 5x5 'Æ' 0xC6
                intArrayOf(0x1E, 0x10, 0x10, 0x1E, 0x08),                                       // [133] 5x5 'Ç' 0xC7
                intArrayOf(0x1E, 0x10, 0x1C, 0x10, 0x1E),                                       // [134] 5x5 'È' 0xC8
                intArrayOf(0x1E, 0x10, 0x1C, 0x10, 0x1E),                                       // [135] 5x5 'É' 0xC9
                intArrayOf(0x1E, 0x10, 0x1C, 0x10, 0x1E),                                       // [136] 5x5 'Ê' 0xCA
                intArrayOf(0x1E, 0x10, 0x1C, 0x10, 0x1E),                                       // [137] 5x5 'Ë' 0xCB
                intArrayOf(0x06, 0x04, 0x04, 0x04, 0x04),                                       // [138] 3x5 'Ì' 0xCC
                intArrayOf(0x06, 0x04, 0x04, 0x04, 0x04),                                       // [139] 3x5 'Í' 0xCD
                intArrayOf(0x06, 0x04, 0x04, 0x04, 0x04),                                       // [140] 3x5 'Î' 0xCE
                intArrayOf(0x06, 0x04, 0x04, 0x04, 0x04),                                       // [141] 3x5 'Ï' 0xCF
                intArrayOf(0x1C, 0x16, 0x1A, 0x16, 0x1C),                                       // [142] 5x5 'Ð' 0xD0
                intArrayOf(0x12, 0x1E, 0x16, 0x12, 0x12),                                       // [143] 5x5 'Ñ' 0xD1
                intArrayOf(0x1E, 0x12, 0x12, 0x12, 0x1E),                                       // [144] 5x5 'Ò' 0xD2
                intArrayOf(0x1E, 0x12, 0x12, 0x12, 0x1E),                                       // [145] 5x5 'Ó' 0xD3
                intArrayOf(0x1E, 0x12, 0x12, 0x12, 0x1E),                                       // [146] 5x5 'Ô' 0xD4
                intArrayOf(0x1E, 0x12, 0x12, 0x12, 0x1E),                                       // [147] 5x5 'Õ' 0xD5
                intArrayOf(0x1E, 0x12, 0x12, 0x12, 0x1E),                                       // [148] 5x5 'Ö' 0xD6
                intArrayOf(0x00, 0x0A, 0x04, 0x0A, 0x00),                                       // [149] 4x5 '×' 0xD7
                intArrayOf(0x1E, 0x16, 0x16, 0x1A, 0x1E),                                       // [150] 5x5 'Ø' 0xD8
                intArrayOf(0x12, 0x12, 0x12, 0x12, 0x1E),                                       // [151] 5x5 'Ù' 0xD9
                intArrayOf(0x12, 0x12, 0x12, 0x12, 0x1E),                                       // [152] 5x5 'Ú' 0xDA
                intArrayOf(0x12, 0x12, 0x12, 0x12, 0x1E),                                       // [153] 5x5 'Û' 0xDB
                intArrayOf(0x12, 0x12, 0x12, 0x12, 0x1E),                                       // [154] 5x5 'Ü' 0xDC
                intArrayOf(0x0A, 0x0E, 0x04, 0x04, 0x04),                                       // [155] 4x5 'Ý' 0xDD
                intArrayOf(0x08, 0x0E, 0x0A, 0x0E, 0x08),                                       // [156] 4x5 'Þ' 0xDE
                intArrayOf(0x1C, 0x14, 0x1E, 0x12, 0x1E),                                       // [157] 5x5 'ß' 0xDF
                intArrayOf(0x0E, 0x02, 0x0E, 0x0A, 0x0E),                                       // [158] 4x5 'à' 0xE0
                intArrayOf(0x0E, 0x02, 0x0E, 0x0A, 0x0E),                                       // [159] 4x5 'á' 0xE1
                intArrayOf(0x0E, 0x02, 0x0E, 0x0A, 0x0E),                                       // [160] 4x5 'â' 0xE2
                intArrayOf(0x0E, 0x02, 0x0E, 0x0A, 0x0E),                                       // [161] 4x5 'ã' 0xE3
                intArrayOf(0x0E, 0x02, 0x0E, 0x0A, 0x0E),                                       // [162] 4x5 'ä' 0xE4
                intArrayOf(0x0E, 0x02, 0x0E, 0x0A, 0x0E),                                       // [163] 4x5 'å' 0xE5
                intArrayOf(0x00, 0x00, 0x1E, 0x14, 0x1E),                                       // [164] 5x5 'æ' 0xE6
                intArrayOf(0x0E, 0x08, 0x0E, 0x04, 0x08),                                       // [165] 4x5 'ç' 0xE7
                intArrayOf(0x0E, 0x0A, 0x0E, 0x08, 0x0E),                                       // [166] 4x5 'è' 0xE8
                intArrayOf(0x0E, 0x0A, 0x0E, 0x08, 0x0E),                                       // [167] 4x5 'é' 0xE9
                intArrayOf(0x0E, 0x0A, 0x0E, 0x08, 0x0E),                                       // [168] 4x5 'ê' 0xEA
                intArrayOf(0x0E, 0x0A, 0x0E, 0x08, 0x0E),                                       // [169] 4x5 'ë' 0xEB
                intArrayOf(0x02, 0x00, 0x02, 0x02, 0x02),                                       // [170] 2x5 'ì' 0xEC
                intArrayOf(0x02, 0x00, 0x02, 0x02, 0x02),                                       // [171] 2x5 'í' 0xED
                intArrayOf(0x02, 0x00, 0x02, 0x02, 0x02),                                       // [172] 2x5 'î' 0xEE
                intArrayOf(0x02, 0x00, 0x02, 0x02, 0x02),                                       // [173] 2x5 'ï' 0xEF
                intArrayOf(0x0C, 0x02, 0x0E, 0x0A, 0x0E),                                       // [174] 4x5 'ð' 0xF0
                intArrayOf(0x08, 0x0E, 0x0A, 0x0A, 0x0A),                                       // [175] 4x5 'ñ' 0xF1
                intArrayOf(0x0E, 0x0A, 0x0A, 0x0A, 0x0E),                                       // [176] 4x5 'ò' 0xF2
                intArrayOf(0x0E, 0x0A, 0x0A, 0x0A, 0x0E),                                       // [177] 4x5 'ó' 0xF3
                intArrayOf(0x0E, 0x0A, 0x0A, 0x0A, 0x0E),                                       // [178] 4x5 'ô' 0xF4
                intArrayOf(0x0E, 0x0A, 0x0A, 0x0A, 0x0E),                                       // [179] 4x5 'õ' 0xF5
                intArrayOf(0x0E, 0x0A, 0x0A, 0x0A, 0x0E),                                       // [180] 4x5 'ö' 0xF6
                intArrayOf(0x04, 0x00, 0x0E, 0x00, 0x04),                                       // [181] 4x5 '÷' 0xF7
                intArrayOf(0x0E, 0x0A, 0x0E, 0x0A, 0x0E),                                       // [182] 4x5 'ø' 0xF8
                intArrayOf(0x0A, 0x0A, 0x0A, 0x0A, 0x0E),                                       // [183] 4x5 'ù' 0xF9
                intArrayOf(0x0A, 0x0A, 0x0A, 0x0A, 0x0E),                                       // [184] 4x5 'ú' 0xFA
                intArrayOf(0x0A, 0x0A, 0x0A, 0x0A, 0x0E),                                       // [185] 4x5 'û' 0xFB
                intArrayOf(0x0A, 0x0A, 0x0A, 0x0A, 0x0E),                                       // [186] 4x5 'ü' 0xFC
                intArrayOf(0x0A, 0x0E, 0x02, 0x02, 0x0E),                                       // [187] 4x5 'ý' 0xFD
                intArrayOf(0x08, 0x0E, 0x0A, 0x0E, 0x08),                                       // [188] 4x5 'þ' 0xFE
                intArrayOf(0x00, 0x0A, 0x04, 0x08, 0x10),                                       // [189] 5x5 'ÿ' 0xFF
                intArrayOf(0x0E, 0x0E, 0x1F, 0x1F, 0x19),                                       // [190] 5x5 'Ā' 0x100
                intArrayOf(0x07, 0x0F, 0x0F, 0x0F, 0x0F),                                       // [191] 4x5 'ā' 0x101
                intArrayOf(0x0E, 0x0E, 0x1F, 0x1F, 0x19),                                       // [192] 5x5 'Ă' 0x102
                intArrayOf(0x07, 0x0F, 0x0F, 0x0F, 0x0F),                                       // [193] 4x5 'ă' 0x103
                intArrayOf(0x0E, 0x0E, 0x1F, 0x1F, 0x19),                                       // [194] 5x5 'Ą' 0x104
                intArrayOf(0x07, 0x0F, 0x0F, 0x0F, 0x0F),                                       // [195] 4x5 'ą' 0x105
                intArrayOf(0x1B, 0x19, 0x18, 0x1B, 0x1F),                                       // [196] 5x5 'Ć' 0x106
                intArrayOf(0x07, 0x0F, 0x0D, 0x0D, 0x0F),                                       // [197] 4x5 'ć' 0x107
                intArrayOf(0x1B, 0x19, 0x18, 0x1B, 0x1F),                                       // [198] 5x5 'Ĉ' 0x108
                intArrayOf(0x0F, 0x0F, 0x0D, 0x0D, 0x0F),                                       // [199] 4x5 'ĉ' 0x109
                intArrayOf(0x1B, 0x19, 0x18, 0x1B, 0x1F),                                       // [200] 5x5 'Ċ' 0x10A
                intArrayOf(0x07, 0x0F, 0x0D, 0x0D, 0x0F),                                       // [201] 4x5 'ċ' 0x10B
                intArrayOf(0x1B, 0x19, 0x18, 0x1B, 0x1F),                                       // [202] 5x5 'Č' 0x10C
                intArrayOf(0x07, 0x0F, 0x0D, 0x0D, 0x0F),                                       // [203] 4x5 'č' 0x10D
                intArrayOf(0x1F, 0x1B, 0x1B, 0x1B, 0x1F),                                       // [204] 5x5 'Ď' 0x10E
                intArrayOf(0x0F, 0x1E, 0x1A, 0x1A, 0x1E),                                       // [205] 5x5 'ď' 0x10F
                intArrayOf(0x1B, 0x1D, 0x1D, 0x1B, 0x1F),                                       // [206] 5x5 'Đ' 0x110
                intArrayOf(0x0F, 0x1E, 0x1A, 0x1A, 0x1E),                                       // [207] 5x5 'đ' 0x111
                intArrayOf(0x18, 0x1E, 0x1E, 0x18, 0x1F),                                       // [208] 5x5 'Ē' 0x112
                intArrayOf(0x07, 0x0F, 0x0F, 0x0F, 0x0F),                                       // [209] 4x5 'ē' 0x113
                intArrayOf(0x18, 0x1E, 0x1E, 0x18, 0x1F),                                       // [210] 5x5 'Ĕ' 0x114
                intArrayOf(0x07, 0x0F, 0x0F, 0x0F, 0x0F),                                       // [211] 4x5 'ĕ' 0x115
                intArrayOf(0x18, 0x1E, 0x1E, 0x18, 0x1F),                                       // [212] 5x5 'Ė' 0x116
                intArrayOf(0x07, 0x0F, 0x0F, 0x0F, 0x0F),                                       // [213] 4x5 'ė' 0x117
                intArrayOf(0x18, 0x1E, 0x1E, 0x18, 0x1F),                                       // [214] 5x5 'Ę' 0x118
                intArrayOf(0x07, 0x0F, 0x0F, 0x0F, 0x0F),                                       // [215] 4x5 'ę' 0x119
                intArrayOf(0x18, 0x1E, 0x1E, 0x18, 0x1F),                                       // [216] 5x5 'Ě' 0x11A
                intArrayOf(0x07, 0x0F, 0x0F, 0x0F, 0x0F),                                       // [217] 4x5 'ě' 0x11B
                intArrayOf(0x1B, 0x18, 0x1F, 0x19, 0x1F),                                       // [218] 5x5 'Ĝ' 0x11C
                intArrayOf(0x1E, 0x1E, 0x1A, 0x1A, 0x1E),                                       // [219] 5x5 'ĝ' 0x11D
                intArrayOf(0x1B, 0x18, 0x1F, 0x19, 0x1F),                                       // [220] 5x5 'Ğ' 0x11E
                intArrayOf(0x0E, 0x1E, 0x1A, 0x1A, 0x1E),                                       // [221] 5x5 'ğ' 0x11F
                intArrayOf(0x1B, 0x18, 0x1F, 0x19, 0x1F),                                       // [222] 5x5 'Ġ' 0x120
                intArrayOf(0x0E, 0x1E, 0x1A, 0x1A, 0x1E),                                       // [223] 5x5 'ġ' 0x121
                intArrayOf(0x1B, 0x18, 0x1F, 0x19, 0x1F),                                       // [224] 5x5 'Ģ' 0x122
                intArrayOf(0x0E, 0x1E, 0x1A, 0x1A, 0x1E),                                       // [225] 5x5 'ģ' 0x123
                intArrayOf(0x33, 0x3F, 0x3F, 0x33, 0x33),                                       // [226] 6x5 'Ĥ' 0x124
                intArrayOf(0x0F, 0x0F, 0x0D, 0x0D, 0x0D),                                       // [227] 4x5 'ĥ' 0x125
                intArrayOf(0x3F, 0x3F, 0x3F, 0x33, 0x33),                                       // [228] 6x5 'Ħ' 0x126
                intArrayOf(0x1E, 0x1E, 0x1A, 0x1A, 0x1A),                                       // [229] 5x5 'ħ' 0x127
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [230] 2x5 'Ĩ' 0x128
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [231] 2x5 'ĩ' 0x129
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [232] 2x5 'Ī' 0x12A
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [233] 2x5 'ī' 0x12B
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [234] 2x5 'Ĭ' 0x12C
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [235] 2x5 'ĭ' 0x12D
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [236] 2x5 'Į' 0x12E
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [237] 2x5 'į' 0x12F
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [238] 2x5 'İ' 0x130
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [239] 2x5 'ı' 0x131
                intArrayOf(0x62, 0x62, 0x62, 0x7E, 0x7E),                                       // [240] 7x5 'Ĳ' 0x132
                intArrayOf(0x0F, 0x0F, 0x0F, 0x0F, 0x0F),                                       // [241] 4x5 'ĳ' 0x133
                intArrayOf(0x01, 0x01, 0x01, 0x0F, 0x0F),                                       // [242] 4x5 'Ĵ' 0x134
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [243] 2x5 'ĵ' 0x135
                intArrayOf(0x1F, 0x1E, 0x1E, 0x1F, 0x1B),                                       // [244] 5x5 'Ķ' 0x136
                intArrayOf(0x0F, 0x0F, 0x0E, 0x0F, 0x0F),                                       // [245] 4x5 'ķ' 0x137
                intArrayOf(0x0D, 0x0F, 0x0E, 0x0F, 0x0F),                                       // [246] 4x5 'ĸ' 0x138
                intArrayOf(0x0C, 0x0C, 0x0C, 0x0C, 0x0F),                                       // [247] 4x5 'Ĺ' 0x139
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [248] 2x5 'ĺ' 0x13A
                intArrayOf(0x0C, 0x0C, 0x0C, 0x0C, 0x0F),                                       // [249] 4x5 'Ļ' 0x13B
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [250] 2x5 'ļ' 0x13C
                intArrayOf(0x0F, 0x0C, 0x0C, 0x0C, 0x0F),                                       // [251] 4x5 'Ľ' 0x13D
                intArrayOf(0x07, 0x06, 0x06, 0x06, 0x06),                                       // [252] 3x5 'ľ' 0x13E
                intArrayOf(0x0C, 0x0F, 0x0F, 0x0C, 0x0F),                                       // [253] 4x5 'Ŀ' 0x13F
                intArrayOf(0x06, 0x07, 0x07, 0x06, 0x06),                                       // [254] 3x5 'ŀ' 0x140
                intArrayOf(0x0C, 0x0E, 0x0C, 0x0C, 0x0F),                                       // [255] 4x5 'Ł' 0x141
                intArrayOf(0x03, 0x03, 0x03, 0x03, 0x03),                                       // [256] 2x5 'ł' 0x142
                intArrayOf(0x3B, 0x3F, 0x3F, 0x37, 0x37),                                       // [257] 6x5 'Ń' 0x143
                intArrayOf(0x0F, 0x0F, 0x0D, 0x0D, 0x0D),                                       // [258] 4x5 'ń' 0x144
                intArrayOf(0x3B, 0x3F, 0x3F, 0x37, 0x37),                                       // [259] 6x5 'Ņ' 0x145
                intArrayOf(0x0F, 0x0F, 0x0D, 0x0D, 0x0D),                                       // [260] 4x5 'ņ' 0x146
                intArrayOf(0x3B, 0x3F, 0x3F, 0x37, 0x37),                                       // [261] 6x5 'Ň' 0x147
                intArrayOf(0x0F, 0x0F, 0x0D, 0x0D, 0x0D),                                       // [262] 4x5 'ň' 0x148
                intArrayOf(0x0F, 0x0F, 0x0D, 0x0D, 0x0D),                                       // [263] 4x5 'ŉ' 0x149
                intArrayOf(0x3A, 0x3E, 0x3E, 0x3E, 0x36),                                       // [264] 6x5 'Ŋ' 0x14A
                intArrayOf(0x1E, 0x1E, 0x1A, 0x1A, 0x1A),                                       // [265] 5x5 'ŋ' 0x14B
                intArrayOf(0x3E, 0x33, 0x33, 0x36, 0x3E),                                       // [266] 6x5 'Ō' 0x14C
                intArrayOf(0x0E, 0x1F, 0x1B, 0x1B, 0x1E),                                       // [267] 5x5 'ō' 0x14D
                intArrayOf(0x3E, 0x33, 0x33, 0x36, 0x3E),                                       // [268] 6x5 'Ŏ' 0x14E
                intArrayOf(0x0E, 0x1F, 0x1B, 0x1B, 0x1E),                                       // [269] 5x5 'ŏ' 0x14F
                intArrayOf(0x3E, 0x33, 0x33, 0x36, 0x3E),                                       // [270] 6x5 'Ő' 0x150
                intArrayOf(0x0E, 0x1F, 0x1B, 0x1B, 0x1E),                                       // [271] 5x5 'ő' 0x151
                intArrayOf(0xD8, 0xDE, 0xDE, 0xD8, 0xFF),                                       // [272] 8x5 'Œ' 0x152
                intArrayOf(0x3F, 0x7F, 0x6F, 0x6F, 0x7F),                                       // [273] 7x5 'œ' 0x153
                intArrayOf(0x1B, 0x1B, 0x1F, 0x1F, 0x1B),                                       // [274] 5x5 'Ŕ' 0x154
                intArrayOf(0x07, 0x07, 0x06, 0x06, 0x06),                                       // [275] 3x5 'ŕ' 0x155
                intArrayOf(0x1B, 0x1B, 0x1F, 0x1F, 0x1B),                                       // [276] 5x5 'Ŗ' 0x156
                intArrayOf(0x07, 0x07, 0x06, 0x06, 0x06),                                       // [277] 3x5 'ŗ' 0x157
                intArrayOf(0x1B, 0x1B, 0x1F, 0x1F, 0x1B),                                       // [278] 5x5 'Ř' 0x158
                intArrayOf(0x07, 0x07, 0x06, 0x06, 0x06),                                       // [279] 3x5 'ř' 0x159
                intArrayOf(0x1B, 0x1C, 0x0F, 0x1B, 0x1F),                                       // [280] 5x5 'Ś' 0x15A
                intArrayOf(0x07, 0x0F, 0x0F, 0x0F, 0x0F),                                       // [281] 4x5 'ś' 0x15B
                intArrayOf(0x1B, 0x1C, 0x0F, 0x1B, 0x1F),                                       // [282] 5x5 'Ŝ' 0x15C
                intArrayOf(0x0F, 0x0F, 0x0F, 0x0F, 0x0F),                                       // [283] 4x5 'ŝ' 0x15D
                intArrayOf(0x1B, 0x1C, 0x0F, 0x1B, 0x1F),                                       // [284] 5x5 'Ş' 0x15E
                intArrayOf(0x07, 0x0F, 0x0F, 0x0F, 0x0F),                                       // [285] 4x5 'ş' 0x15F
                intArrayOf(0x1B, 0x1C, 0x0F, 0x1B, 0x1F),                                       // [286] 5x5 'Š' 0x160
                intArrayOf(0x07, 0x0F, 0x0F, 0x0F, 0x0F),                                       // [287] 4x5 'š' 0x161
                intArrayOf(0x04, 0x04, 0x04, 0x04, 0x04),                                       // [288] 5x5 'Ţ' 0x162
                intArrayOf(0x07, 0x07, 0x06, 0x06, 0x07),                                       // [289] 3x5 'ţ' 0x163
                intArrayOf(0x04, 0x04, 0x04, 0x04, 0x04),                                       // [290] 5x5 'Ť' 0x164
                intArrayOf(0x07, 0x07, 0x06, 0x06, 0x07),                                       // [291] 3x5 'ť' 0x165
                intArrayOf(0x04, 0x0E, 0x04, 0x04, 0x04),                                       // [292] 5x5 'Ŧ' 0x166
                intArrayOf(0x07, 0x07, 0x07, 0x06, 0x07),                                       // [293] 3x5 'ŧ' 0x167
                intArrayOf(0x1B, 0x1B, 0x1B, 0x1B, 0x1F),                                       // [294] 5x5 'Ũ' 0x168
                intArrayOf(0x0F, 0x0D, 0x0D, 0x0D, 0x0F),                                       // [295] 4x5 'ũ' 0x169
                intArrayOf(0x1B, 0x1B, 0x1B, 0x1B, 0x1F),                                       // [296] 5x5 'Ū' 0x16A
                intArrayOf(0x0D, 0x0D, 0x0D, 0x0D, 0x0F),                                       // [297] 4x5 'ū' 0x16B
                intArrayOf(0x1B, 0x1B, 0x1B, 0x1B, 0x1F),                                       // [298] 5x5 'Ŭ' 0x16C
                intArrayOf(0x0F, 0x0D, 0x0D, 0x0D, 0x0F),                                       // [299] 4x5 'ŭ' 0x16D
                intArrayOf(0x1B, 0x1B, 0x1B, 0x1B, 0x1F),                                       // [300] 5x5 'Ů' 0x16E
                intArrayOf(0x0F, 0x0D, 0x0D, 0x0D, 0x0F),                                       // [301] 4x5 'ů' 0x16F
                intArrayOf(0x1B, 0x1B, 0x1B, 0x1B, 0x1F),                                       // [302] 5x5 'Ű' 0x170
                intArrayOf(0x0F, 0x0D, 0x0D, 0x0D, 0x0F),                                       // [303] 4x5 'ű' 0x171
                intArrayOf(0x1B, 0x1B, 0x1B, 0x1B, 0x1F),                                       // [304] 5x5 'Ų' 0x172
                intArrayOf(0x0D, 0x0D, 0x0D, 0x0D, 0x0F),                                       // [305] 4x5 'ų' 0x173
                intArrayOf(0x7F, 0x7F, 0x7F, 0x36, 0x36),                                       // [306] 7x5 'Ŵ' 0x174
                intArrayOf(0x3D, 0x3F, 0x3F, 0x3F, 0x1E),                                       // [307] 6x5 'ŵ' 0x175
                intArrayOf(0x1B, 0x0E, 0x0E, 0x04, 0x04),                                       // [308] 5x5 'Ŷ' 0x176
                intArrayOf(0x0F, 0x0F, 0x0F, 0x0E, 0x06),                                       // [309] 4x5 'ŷ' 0x177
                intArrayOf(0x0A, 0x0E, 0x04, 0x04, 0x04),                                       // [310] 4x5 'Ÿ' 0x178
                intArrayOf(0x07, 0x06, 0x0C, 0x1C, 0x1F),                                       // [311] 5x5 'Ź' 0x179
                intArrayOf(0x0F, 0x0F, 0x06, 0x0E, 0x0F),                                       // [312] 4x5 'ź' 0x17A
                intArrayOf(0x07, 0x06, 0x0C, 0x1C, 0x1F),                                       // [313] 5x5 'Ż' 0x17B
                intArrayOf(0x0F, 0x0F, 0x06, 0x0E, 0x0F),                                       // [314] 4x5 'ż' 0x17C
                intArrayOf(0x07, 0x06, 0x0C, 0x1C, 0x1F),                                       // [315] 5x5 'Ž' 0x17D
                intArrayOf(0x0F, 0x0F, 0x06, 0x0E, 0x0F)                                         // [316] 4x5 'ž' 0x17E
            ),
            widths = intArrayOf(
                2, 2, 4, 5, 5, 5, 5, 2, 4, 4,           // ' '..')' 0x20
                3, 4, 2, 4, 2, 4, 5, 3, 5, 5,           // '*'..'3' 0x2A
                5, 5, 5, 5, 5, 5, 2, 2, 4, 5,           // '4'..'=' 0x34
                4, 5, 5, 5, 5, 5, 5, 5, 5, 5,           // '>'..'G' 0x3E
                5, 4, 5, 5, 4, 6, 5, 5, 4, 5,           // 'H'..'Q' 0x48
                5, 5, 4, 5, 5, 6, 4, 4, 5, 3,           // 'R'..'[' 0x52
                5, 3, 4, 5, 1, 4, 4, 4, 4, 4,           // '\'..'e' 0x5C
                4, 4, 4, 2, 3, 4, 2, 4, 4, 4,           // 'f'..'o' 0x66
                4, 4, 4, 4, 4, 4, 4, 4, 4, 4,           // 'p'..'y' 0x70
                4, 4, 2, 4, 5, 2, 5, 4, 5, 4,           // 'z'..'¥' 0x7A
                2, 4, 4, 5, 5, 5, 4, 1, 5, 5,           // '¦'..'¯' 0xA6
                5, 4, 4, 4, 3, 5, 5, 2, 3, 4,           // '°'..'¹' 0xB0
                5, 5, 5, 5, 5, 5, 5, 5, 5, 5,           // 'º'..'Ã' 0xBA
                5, 5, 5, 5, 5, 5, 5, 5, 3, 3,           // 'Ä'..'Í' 0xC4
                3, 3, 5, 5, 5, 5, 5, 5, 5, 4,           // 'Î'..'×' 0xCE
                5, 5, 5, 5, 5, 4, 4, 5, 4, 4,           // 'Ø'..'á' 0xD8
                4, 4, 4, 4, 5, 4, 4, 4, 4, 4,           // 'â'..'ë' 0xE2
                2, 2, 2, 2, 4, 4, 4, 4, 4, 4,           // 'ì'..'õ' 0xEC
                4, 4, 4, 4, 4, 4, 4, 4, 4, 5,           // 'ö'..'ÿ' 0xF6
                5, 4, 5, 4, 5, 4, 5, 4, 5, 4,           // 'Ā'..'ĉ' 0x100
                5, 4, 5, 4, 5, 5, 5, 5, 5, 4,           // 'Ċ'..'ē' 0x10A
                5, 4, 5, 4, 5, 4, 5, 4, 5, 5,           // 'Ĕ'..'ĝ' 0x114
                5, 5, 5, 5, 5, 5, 6, 4, 6, 5,           // 'Ğ'..'ħ' 0x11E
                2, 2, 2, 2, 2, 2, 2, 2, 2, 2,           // 'Ĩ'..'ı' 0x128
                7, 4, 4, 2, 5, 4, 4, 4, 2, 4,           // 'Ĳ'..'Ļ' 0x132
                2, 4, 3, 4, 3, 4, 2, 6, 4, 6,           // 'ļ'..'Ņ' 0x13C
                4, 6, 4, 4, 6, 5, 6, 5, 6, 5,           // 'ņ'..'ŏ' 0x146
                6, 5, 8, 7, 5, 3, 5, 3, 5, 3,           // 'Ő'..'ř' 0x150
                5, 4, 5, 4, 5, 4, 5, 4, 5, 3,           // 'Ś'..'ţ' 0x15A
                5, 3, 5, 3, 5, 4, 5, 4, 5, 4,           // 'Ť'..'ŭ' 0x164
                5, 4, 5, 4, 5, 4, 7, 6, 5, 4,           // 'Ů'..'ŷ' 0x16E
                4, 5, 4, 5, 4, 5, 4                  //    ..'ž'
            )
        )
    }
}
// Max Bitmap 8 x 5
// Mass Matrix #######. 0
// Mass Matrix #######. 1
// Mass Matrix #######. 2
// Mass Matrix #######. 3
// Mass Matrix ######## 4
