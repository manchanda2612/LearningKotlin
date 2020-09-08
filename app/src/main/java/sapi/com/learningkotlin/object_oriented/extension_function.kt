package sapi.com.learningkotlin.object_oriented

/**
 * 1) With extension Function you can basically extend the API or the interface of any class you like and you don't actually even need to access to
 * the source code; you just need to access the binaries and you can then just add a new function to any class you like.
 * 2) This is a very powerful concept that allow you to get rid of any Utils or Helper classes that you're probably very familiar with Java.
 * 3) Those Utils and helper class often come with just loads of static methods. So we can get rid of all those static methods by using extension function
 * in Kotlin.
 * 4)
 *
 */
fun main() {

    val list = listOf(22, 17, 9, 64, 98,52)
    val prime = list.filter { it.isEven() }
    println("Print all prime Number ${prime.joinToString()}")

    // or
    println("Print all prime Number ${list.filter { it.isEven() }.joinToString()}")

    println(7.isEven())
    println(10.isEven())


    val city = City()
    city.name = "Amsterdam"
    city.population = 9_50_000
    println("Is population of ${city.name} is One million ${city.isLarge()}")

}

/**
 * Let's go ahead and extend the Int class and just add a new method on it called isEven(), which just gonna return
 * whether an integer is even.
 */
fun Int.isEven() : Boolean {
       return this % 2 == 0
}

/**
 * Shorthand version of isEven()
 */
fun Int.shortOfIsEven() = this % 2 == 0


/**
 * Let's take another example and this time it is for our own custom class i.e City.
 * To show you that we can extend the functionality of any class in Android using extension function
 */
fun City.isLarge() = population > 1_000_000