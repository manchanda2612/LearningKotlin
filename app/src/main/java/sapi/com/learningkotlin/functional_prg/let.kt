package sapi.com.learningkotlin.functional_prg

import java.io.File
import java.util.*

fun main(args : Array<String>) {

    // Let for Scoping

    val reader = File("example.txv").bufferedReader()
    /**
     * Now I want to perform some operations on reader
     * but I don't reader to be visible means if it is
     * visible I can use it anywhere. I want to restrict
     * it's scope so for this I will use let higher order
     * function
     */

    File("example.txt").bufferedReader().let {
        if(it.ready()) {
            print(it.readLine())
        }
    }


    // Let for Nullable
    val name : String? = "Kotlin for beginners"

    /*if(name?.isNotEmpty()) { // it is giving an error because name can give null

    }*/

    /*if(name!!.isNotEmpty()) { // it is also not the good approach as name can be null
        name.toLowerCase(Locale.getDefault())
    }*/

    name?.let { // this let block only be executed if name is not null. If it is null kotlin compiler simply ignore the block
        if(name.isNotEmpty()) {
            name.toLowerCase(Locale.getDefault())
        }
    }



}