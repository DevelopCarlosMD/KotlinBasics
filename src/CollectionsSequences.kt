import kotlin.random.Random

fun m(i: Int): Int {
    print("m$i")
    return i
}

fun f(i: Int): Boolean {
    print("f$i")
    return i % 2 == 0
}

fun main() {

    val sequence = listOf(1, 2, 3).asSequence()
    val mapResult = sequence.map { it * it }

    val filterResult = mapResult.filter { it % 2 == 1 }

    val list = listOf(1, 2, 3)
        .map { it * it }
        .filter { it % 2 == 1 }.maxOf { it }

    val seqBetter = listOf(1, 2, 3, 4)
        .asSequence()
        .map { it * it }
        .filter { it % 2 == 1 }
        .maxOf { it }

    println(seqBetter)

    //print(list)

    val list2 = listOf(1, 2, 3, 4)
    // println(list2.map(::m).filter(::f)) // Horizontal Travel -> /
    // println(list2.asSequence().map(::m).filter(::f).toList()) // Vertical travel v
    println(list2.asSequence().filter(::f).map(::m).toList())

    val seq = generateSequence {
        Random.nextInt(5).takeIf { it > 0 }
    }
    println(seq.toList())

    val input = generateSequence {
        readLine().takeIf { it != "exit" }
    }
    println(input.toList())

    val numbers = sequence {
        var x = 0
        while(true) {
            yield(x++)
        }
    }
    println(numbers.take(5).toList())

}