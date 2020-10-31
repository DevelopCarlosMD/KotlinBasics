import java.awt.Point

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.times(scale: Int): Point {
    return Point(x * scale, y * scale)
}

operator fun Board.get(x: Int, y: Int): Char {
    if (x == 1 && y == 2)
        return 'x'
    else
        return 'o'
}

class Board {


}


fun main() {

    println(Point(1, 2) + Point(2, 3))
    println(Point(1, 45) * 23)

    // Example List in a correct way dude!
    val list1 = mutableListOf(1, 2, 3)
    val list2 = list1

    list1 += 4
    println(list1)
    println(list2)

    val s = "hola enfermera"

    if (s in "abc".."def")
        println("you get it")

    for (i in 1..2) {
        println("how to use in")
    }

    val lim = 100
    val oneTo100: IntRange = 1..lim
    for (i in oneTo100) {
        if (i == lim)
            println("Val from the last element $i")
    }

}
//Operators name
/*
*  +     plus
*  -     minus
*  *     times
*  /     div
*  %     mod
* */
