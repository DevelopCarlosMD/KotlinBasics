enum class Color(val r: Int, val g: Int, val b: Int) {
    BLUE(0, 0, 255),
    ORANGE(255, 165, 0),
    RED(255, 0, 0),
    GREEN(0, 255, 0);

    fun rgb() = (r * 256 + g) * 256 + b

}

fun main() {
    println(Color.BLUE.r)
    println(Color.BLUE.rgb())
}

data class Bar(val first: Int, val second: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Bar) return false
        return (first == other.first
                && second == other.second)
    }

    override fun hashCode(): Int {
        return first * 31 + second
    }
}