import java.lang.StringBuilder

class StringUtilKit{

    fun String.repeat(n: Int): String {
        val sb = StringBuilder(n * length)
        for (i in 1..n) {
            sb.append(this)
        }

        return sb.toString()
    }

    infix fun <A, B> A.to(that: B) = Pair(this, that)




}


