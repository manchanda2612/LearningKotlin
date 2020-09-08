package sapi.com.learningkotlin.basic_concept

import java.util.*
import kotlin.collections.ArrayList

fun main(args : Array<String>) {

    println("\n-------------------------------------------")

    var mutableList : MutableList<Int> = ArrayList()    // var mutableList = mutableListOf<Int>()

    for(i in 1..100) {
        mutableList.add(getRandomNumber())
    }

    var j = 0


    for(i in 1..100) {
        if(i < mutableList.size && mutableList.get(i) <= 10) {
            println(mutableList.get(i))
        }
    }
}

fun getRandomNumber() : Int
{
    return Random(System.nanoTime()).nextInt(100)
}