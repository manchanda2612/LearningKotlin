package sapi.com.learningkotlin.object_oriented

import android.view.View
/**
 * In kotlin you can alias for imports as well.
 */
import sapi.com.learningkotlin.object_oriented.House.Companion.getNormalHouse as createNormalHouse
import sapi.com.learningkotlin.object_oriented.House.Companion.getLuxuryHouse

/**
 * 1) Now object declaration in Kotlin, are declaration where you can actually define objects just like you define a class.
 * But an object by definition is only there once so there's only one instance of that and this is what you also commonly refer to as a singleton.
 * 2) Just as class definition, define object but in contrast to classes, you don't have constructor for this because while you can create objects of this only
 * one object at any time in system. So doesn't make any sense to have a constructor, which is just useful to create many objects of same class.
 * 3) Another measure reason to use object declaration as singleton when you require to use ANONYMOUS classes.
 * 4) Whenever you need to create singleton pattern just go for Object Declaration in Kotlin.
 *
 * VERY IMPORTANT
 * In Java creating a singleton or the easiest way to create a singleton in Java would be to use the enum keyword. So you just create an enum, you can also
 * add a method to that and you only define one possible instance of the enum. You can just that one instance like it's done in singleton pattern which means you don't
 * have to care about making the singleton thread safe, serializable and so on yourself.
 *
 */
fun main() {
    // you need to call the member by using the same
    println(CountryFactory.a)
    println(CountryFactory.createCountry.name)
    // this is alias of House.getNormalHouse()
    createNormalHouse()
    getLuxuryHouse()


}

/**
 * Now this way, now you have this one object you can always use when you want to pass in some default click listener,
 * meaning that you don't have to create ANONYMOUS class like in Java
 */
object DefaultClickListener : View.OnClickListener {

    override fun onClick(v: View?) {
        println("User Clicked on View")
    }

}

object CountryFactory {

    val a = 10
    val createCountry : Country = Country("Australia", 98_00_0000)

}