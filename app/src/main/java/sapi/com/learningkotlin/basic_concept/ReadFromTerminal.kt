package sapi.com.learningkotlin.basic_concept

fun main(args : Array<String>) {

    println("\n-------------------------------------------")
    var name : String?
    println("Please enter your name")
    name = readLine()

    if(name != null && name.isNotEmpty()) {
        print("Welcome $name to the world of Kotlin")
    } else {
        print("Conscious about your privacy, eh?")
    }

}