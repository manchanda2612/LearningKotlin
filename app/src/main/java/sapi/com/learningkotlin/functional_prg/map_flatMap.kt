package sapi.com.learningkotlin.functional_prg

fun main(args : Array<String>) {


    // Map
    val list = (1..100).toList()
    println(list)


    val double = list.map { x -> x * 2}
    println(double)

    val average = list.average()
    println(average)

    val shifted = list.map { x -> x - average }
    println(shifted)

    // FlatMap
    val nestedList = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )


    val notFlattened = nestedList.map { it.sortedDescending() }
    println(notFlattened)

    val flattened = nestedList.flatMap { it.sortedDescending() }
    println(flattened)

    val flattened2  = nestedList.map { it.sortedDescending() }.flatten()
    println(flattened2)



}