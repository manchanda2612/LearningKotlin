package sapi.com.learningkotlin.functional_prg

fun main(args : Array<String>) {

    val list =  (1..100).toList()

    println(list.take(10).toList())

    println(list.drop(50))

    println(list.first())

    println(list.last())

}