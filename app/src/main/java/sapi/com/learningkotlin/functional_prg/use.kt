package sapi.com.learningkotlin.functional_prg

import java.io.FileReader

/**
 * Use higher order function is equivalent to try-with-resources in java
 * It is very useful function in order to avoid mistake like forget to close database connection, socket connection and file etc.
 * It is closeable function
 * In Kotlin, use {} is the equivalent of Java's try-with-resources (if you're familiar with that).
 * This means that it will make sure to close whatever resource you're using at the end.
 * Thus, it prevents bugs or memory leaks from forgetting to call close() at the end.
 */
fun main() {


        // so here you don't need to close the file as
        // it automatically close it because we have used "use" higher order function
        FileReader("example.txt").use {
            val str = it.readLines()
            println(str)
           // it.close()
        }
}