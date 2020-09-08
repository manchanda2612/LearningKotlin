package sapi.com.learningkotlin.functional_prg

fun main(array : Array<String>) {

    val inputRow = listOf(
        mapOf("input01.csv" to listOf(99,23,45,23453,-999)),
        mapOf("input01.csv" to listOf(6,25,54,-2342)),
        mapOf("input01.csv" to listOf(34,14,2834, -233)),
        mapOf("input01.csv" to listOf()),
        mapOf("input01.csv" to listOf(15, -345,-234, -9845))
    )

    //  fetch only those value who are in between 1 to 100
    val cleaned = inputRow.flatMap { it.values }
        .flatten()
        .filter { it in 1..100 }
        .toIntArray()
        .joinToString()
    println(cleaned)


}