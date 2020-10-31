data class Hero(
    val name: String,
    val age : Int,
    val gender: Gender?
)
enum class Gender { MALE, FEMALE}

fun main() {

    val heroes = listOf(
        Hero("The Captain", 60, Gender.MALE),
        Hero("Frenchy", 42, Gender.MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, Gender.FEMALE),
        Hero("First Mate", 29, Gender.MALE),
        Hero("Sir Stephen", 37, Gender.MALE))

    println(heroes.last().name)

    heroes.firstOrNull { it.age == 30 }?.name

    // Retunr only numbers that are different!! in  a list
    println(heroes.map { it.age }.distinct().size)

    // Give us the value from a filter rule

    println(heroes.filter { it.age < 30 }.size)

    val (youngest, oldest) = heroes.partition { it.age < 30 }

    println(oldest[0].name)
    println(oldest.size)

    println(heroes.maxByOrNull { it: Hero -> it.age }?.name)

    println( heroes.all { it.age < 50 })

    println(heroes.any { it.gender == Gender.FEMALE })


    val mapByAge: Map<Int, List<Hero>> =
        heroes.groupBy { it.age }

    val (age, group) = mapByAge.maxBy { (_, group) ->
        group.size
    }!!

     println(age)


    val mapByName: Map<String, Hero> =
        heroes.associateBy { it.name }

    // mapByName using key can return a null value
    println(mapByName["Frenchy"]?.age)

    // If you set the value to unknown throws an exception
    println(mapByName.getValue("The Kid").age)

    val mapByName2 = heroes.associateBy { it.name }
    val unknownHero = Hero("Unknown", 0, null)
    mapByName2.getOrElse("unknown") { unknownHero }.age


    val allPossiblePairs = heroes
        .flatMap {  first -> heroes.map { second -> first to second }
        }

    // maxBy give us the oldest and youngest from  a hashTable
    val (oldest2, youngest2) = allPossiblePairs
        .maxBy { it.first.age - it.second.age }!!

    // We can replace the code up with this two sentences
    val oldestL = heroes.maxBy { it.age }
    val youngestL = heroes.minBy { it.age }

    println(oldest2.age)
    println(youngest2.age)



}

