private val function = { i: Int -> i % 2 == 0 }

fun main() {

    val sum: (Int, Int) -> Int = { x, y -> x + y }
    val isEven = { i: Int -> i % 2 == 0 }

    val isEven2: (Int) -> Boolean = { i: Int -> i % 2 == 0 }

    println(isEven2(23))

    val list = listOf(1, 2, 3, 15, 124)

    list.any(isEven)
    println(list.filter(isEven2))

    val runnable = Runnable { println(42) }
    postponeComputation(runnable)

    // You cannot pass a function in  a variable next the way to fix
    // that
    fun isEvenFn(i: Int): Boolean {
        return i % 2 == 0
    }

    val predicate2 = ::isEvenFn

    println(predicate2.invoke(1255))

    val predicate = { i: Int -> isEvenFn(i) }
    println(predicate.invoke(34))

    val lst2 = listOf(1,2,5,67)
    lst2.any(::isEvenFn)
    lst2.filter(::isEvenFn)

}

fun postponeComputation(runnable: Runnable) {
    runnable.run()
}
