package sapi.com.learningkotlin.basic_concept

import java.io.IOException

/**
 * 1. "new" keyword doesn't exist in Kotlin
 * 2. Try Catch block is also an expression in Kotlin.
 * 3. In Kotlin, We don't have checked Exception. We only have Unchecked Exception.
 * What is checked and UnChecked Exception
 * <p>The class {@code Exception} and any subclasses that are not also
 * subclasses of {@link RuntimeException} are <em>checked
 * exceptions</em>.  Checked exceptions need to be declared in a
 * method or constructor's {@code throws} clause if they can be thrown
 * by the execution of the method or constructor and propagate outside
 * the method or constructor boundary.
 *
 */
fun main(args: Array<String>) {


    val input = try {
        throwException()
        "Try block Called"
    } catch (ex: IOException) {
        ex.printStackTrace()
        "Catch block Called"
    } finally {
        println("Finally Executed")
    }

    print(input)

}


fun throwException(): String {

    val input : String?
    println("Please enter your Name")
    input = readLine()

    if(null != input && input.isNotBlank()) {
       return "Your name is $input"
    } else {
        throw IOException("Could not read external input")
    }
}