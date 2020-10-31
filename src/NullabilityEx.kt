import kotlin.test.fail


class NullabilityEx {

    fun exampleString() {
        val a: Int? = null
        val b: Int? = 1
        val c = 2
        val s: String? = null

        val s1 = (a ?: 0) + c // 2
        val s2 = (b ?: 0) + c // 3
        print("$s1$s2")


        if (s == null) return //fail() // return or fail
        s.length

        val t1: String? = null
        print(t1) // throws NPE if the variable is null dude!!

    }

    fun isFoo1(n: String) = "foo"
    fun isFoo2(n: String?) = "foo"
    // fun isFoo3(n: String?) = n !=  null && n = "foo"

    fun reviewNullStrings() {

    }

    /*
    *
    * #1 fun isFoo1(n: Name) = n.value == "foo"
    * #2 fun isFoo2(n: Name?) = n.value == "foo"
    * #3 fun isFoo3(n: Name?) = n != null && n.value == "foo"
    * #4 fun isFoo4(n: Name?) = n?.value == "foo"
    * fun main(args: Array<String>) {
    * #5   isFoo1(null)
    * #6   isFoo2(null)
    * #7   isFoo3(null)
    * #8   isFoo4(null)
    * }
    * */


    fun foo(list1: List<Int?>, list2: List<Int>?) {
        list1.size
        list2?.size

        val i: Int? =
            list1.get(0)
        val j: Int? =
            list2?.get(0)
    }

}
