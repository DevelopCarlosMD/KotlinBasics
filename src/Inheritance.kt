open class Parent {

    init {
        print("parent ")
    }
}
class Child : Parent(){
    init {
        print("child ")
    }
}

open class ParentNum {
    open val foo = 1
    init {
        println(foo)
    }
}

class ChildN : ParentNum(){
    // Not possible to override fields in kotlin you override the get not the field dude
    override val foo = 2
}

fun main(){
    Child()
    ChildN()
}