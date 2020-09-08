package sapi.com.learningkotlin.functional_prg
import kotlin.collections.ArrayList


/**
 * It is very useful higher order function in order to perform many calls
 * on the same object without having to repeat the object name.
 * 1. With is very useful if you wanna to call many methods on same object.
 * 2. This is often useful if you have some kind of longer initialization or some transactions with a database.
 */
fun main(args : Array<String>) {

    val props = System.getProperties()

    with(props, {
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home"))
    })


    // it is same if we don't use with
    props.list(System.out)
    println(props.propertyNames().toList())
    println(props.getProperty("user.home"))

}


