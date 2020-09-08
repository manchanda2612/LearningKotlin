package sapi.com.learningkotlin.functional_prg

fun main(array: Array<String>) {

    val data = mapOf(

        "users1.csv" to listOf(32, 45, -1, 34),
        "users2.csv" to listOf(19, -1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)

    )

    val average = data.map { it.value.average() }.filter { it > 0 }
    println("Average age of User =  ${average}")

    val names = data.filter { it.value.any { it < 0 } }.map { it.key }
    println("Files with faulty data = ${names}")

    val faultyEntries = data.count { it.value.any { it < 0 } }
    println("Total faulty enteries = ${faultyEntries}")


    val numberOfFaults = data.flatMap { it.value }
        .filter { it < 0 }
        .count()

    println("Total faulty enteries = ${numberOfFaults}")
}