fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false

    // Example using cast
    val s = ""
    println(s as? Int)
    //println(s as Int?)


}

private fun String?.isEmptyOrNull(): Boolean {
    return this == null || this.isEmpty()
}
