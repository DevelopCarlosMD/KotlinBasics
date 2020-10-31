fun duplicateNonZero(list: List<Int>): List<Int> {

    // normal way!!
    /*return list.flatMap {
        if (it == 0)
            return listOf()
        else
            listOf(it, it)
    }*/

    // is this way we can return  a lambda
    return list.flatMap {
        if (it == 0) return@flatMap listOf<Int>() //@flatMap listOf<Int>()
        listOf(it, it)
    }

}

// Example local function
fun duplicateNonZeroLocalFunction(list: List<Int>): List<Int> {
    fun duplicateNonZeroElement(e: Int): List<Int> {
        if (e == 0) return listOf()
        return listOf(e, e)
    }

    return list.flatMap(::duplicateNonZeroElement)
}

fun duplicateNonZeroAnonymus(list: List<Int>): List<Int> {
    return list.flatMap(fun(e): List<Int> {
        if (e == 0) return listOf()
        return listOf(e, e)
    })
}

fun containsZero(list: List<Int>): Boolean {

    list.forEach {
        if (it == 0) return true
    }
    return false

}

// Examples return

fun printList(list: List<Int>) {

    list.forEach() {
        if (it == 0) return@forEach
        print(it)
    }

    for (element in list) {
        if (element == 0) continue
        print(element)
    }
}

fun main() {
    val lst = listOf(1, 2, 0, 512, 23, 64, 2)
    print(duplicateNonZero(lst))

    print(duplicateNonZeroLocalFunction(lst))

}