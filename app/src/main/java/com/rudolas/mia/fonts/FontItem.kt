package com.rudolas.mia.fonts

/**
 * 
 */
data class FontItem(
    var name: String,
    var charBytes: Array<IntArray>,
    var widths: IntArray
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FontItem

        if (name != other.name) return false
        if (!widths.contentEquals(other.widths)) return false
        if (!charBytes.contentDeepEquals(other.charBytes)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + widths.contentHashCode()
        result = 31 * result + charBytes.contentDeepHashCode()
        return result
    }

    companion object {
        /**
         * sample font item usage template - therefore with no content
         */
        val font = FontItem(
            "",
            charBytes = arrayOf(),
            widths = intArrayOf()
        )
    }
}