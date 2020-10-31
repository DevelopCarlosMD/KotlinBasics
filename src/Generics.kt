import java.lang.StringBuilder
import java.util.function.BiPredicate

/*interface List<E> {
    fun get(index: Int): E
}

fun foo(ints: List<Int>) {}

fun bar(strings: List<String>) {
}

fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T>? {
    val destination = ArrayList<T>()

    for (element in destination) {
        if (predicate(element)) destination.add(element)
    }

    //return destination make a review why is asking destination? like a list

    return null
}*/


fun <T : Number?> oneHalf(value: T): Double? {
    if (value == null) return null
    return value.toDouble() / 2.0
}

fun <T : Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

fun <T> ensureTrailingPeriod(seq: T)
        where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
}

fun main() {
    val helloWorld = StringBuilder("Hello, World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
}