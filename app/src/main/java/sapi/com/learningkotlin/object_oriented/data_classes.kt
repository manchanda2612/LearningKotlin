package sapi.com.learningkotlin.object_oriented

/**
 * A completely new feature in Kotlin that doesn't exist in Java.
 * Data classes automatically generates hashCode(), toString(), equals(), copy(), destructuring Operator
 * 1) toString() - represent the string representation of string
 * 2) Referential Equality (===) - It will check for an address of object.
 * 3) Structuring Equality (==) - It will check for content or data of an object.
 * 4) Copy() - It will clone the object
 * 5) Destructuring Operator - Create and initializes multiple variables at once. These multiple variable correspond to the properties of the class.
 * These variable can be used independently in any way you want. The destructuring operator work on the concept of component Function. The number of variable
 * destructing operator define, the data class generate those number of component functions, starting from component1(), component2() etc.
 *
 */
fun main() {

    val address1 = Address("Om Vihar", 22, 110059, "New Delhi")
    val address2 = Address("Mahavir Nagar", 80, 110058, "New Delhi")
    val address3 = Address("Om Vihar", 22, 110059, "New Delhi")


    // toString
    println("String representation of an Object  $address1")

    // check for referential equality
    println("Check for referential equality ${address1 === address2}")
    println("Check for referential equality ${address1 === address3}")

    // check for structuring equality
    println("Check for structuring equality ${address1 == address3}")
    println("Check for structuring equality ${address1 == address2}")

    // clone the object
    val address4 = address1.copy()
    println("Object is cloned $address4")

    val address5 = address2.copy(number = 77)
    println("Object is cloned with one value changed $address5")


    // destructuring operator
    //The data class in Kotlin by default generate component functions.
    println("Component function of Address1 object of street property ${address1.component1()}")
    println("Component function of Address4 object of city property ${address4.component3()}")

    val(streetAddress, houseNumber, postalCode, cityName) = address1
    println("$houseNumber, $streetAddress $cityName - $postalCode")
    // If you want to ignore a variable in destructing operator. To do so, put an underscore in place of its name.
    // In this case, the component function for the given variable isn't invoked.
    val(_,_,_,city) = address2
    println(city)


    // destructing operator with lambdas
    val map = mutableMapOf<Int, String>()
    map.put(1, "Neeraj")
    map.put(2, "Bharti")
    map.put(3, "Ojas")
    map.put(4, "Sharad")
    map.put(5, "Neelam")

    val newMap1 = map.mapValues { (key, value) -> "${key + 1} Hello ${value}"}
    val newMap2 = map.mapValues { (_,value) -> value }
    println(newMap1)
    println(newMap2)



}


data class Address(val Street : String, val number : Int, val postCode : Int, val city : String)


