val fibonnaci = sequence {

    yield(1)
    var cur = 1
    var next = 1

    while (true){
        yield(next)
        val tmp = cur + next
        cur = next
        next = tmp
    }
}


fun main(){
    print(fibonnaci.take(10).joinToString())

    val lstAges = listOf(23,45,10,5,64,15,67,24,1)

    lstAges.count { it < 21 }

    lstAges.sortedByDescending { it }

    lstAges.mapNotNull { person ->
        person.takeUnless { it > 0 }
        //person.takeIf { it.isPublicProfile }?.name
    }

    //people.mapNotNull { person ->
     //   person.takeIf { it.isPublicProfile }?.name
    //}

    /*
    val map = mutableMapOf<Int, MutableList<Person>>()
for (person in people) {
  if (person.age !in map) {
    map[person.age] = mutableListOf()
  }
  map.getValue(person.age) += person
}
    val map = people.groupBy { it.age }
     */



}