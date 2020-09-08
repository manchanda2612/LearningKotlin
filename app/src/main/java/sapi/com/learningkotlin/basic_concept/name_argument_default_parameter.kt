package sapi.com.learningkotlin.basic_concept

fun main(args : Array<String>) {


    println("\n------------------Name Argument and Default Parameter-------------------------")
    val listOfString = listOf("Neeraj", "Amit", "Joginder", "Manish", "Apurv")
    val result = concatenate(separator = ": ", str = listOfString)
    println(result)

}

fun concatenate(str : List<String>, separator : String = ", ") : String {

    return str.joinToString(separator)

}