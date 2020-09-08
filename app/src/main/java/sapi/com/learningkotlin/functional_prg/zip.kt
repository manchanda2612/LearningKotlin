package sapi.com.learningkotlin.functional_prg

fun main(args : Array<String>)  {

    val sweets = listOf("Ras", "Gulab", "Ras", "Chhena", "Kaju")
    val name =  listOf("Malai",  "Jamun", "Gulle", "Murgi")

    //Pair<String, String>
    println(sweets.zip(name))

    val list = listOf("Hi", "there", "Kotlin", "fans")
    val containT =  listOf(false,  true, true, false)

    //Pair<String, Boolean>
    println(list.zip(containT))

    println(list.zip(list.map { it.contains("t") }))


}