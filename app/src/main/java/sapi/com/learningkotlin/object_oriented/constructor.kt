package sapi.com.learningkotlin.object_oriented

/**
 * In Kotlin, we can define the constructive parameter right at the top of the class definition
 */
class Country(nameOfCountry : String, areaSqKm : Int) {


    /**
     * this is the FIRST way we can initialize the property.
     */
    var name : String = nameOfCountry
    var area : Int = areaSqKm


    /**
     * init block is executed whenever user create a new object
     * So this is the SECOND way we can initialize the properties of class
     */
    /*init {
        this.name = nameOfCountry
        this.area = areaSqKm
    }*/


}


/**
 * This is the THIRD way of initializing the property.
 * We basically remove the boiler plate code that we write in Java to initialize the properties.
 */
class Restaurant (val nameOfRestaurant : String, val rating : Int) {

    /**
     * You can also have multiple constructor in Kotlin.
     * You have to define the one constructor as Primary constructor and you can define any number of secondary constructors by using the constructor keyword.
     * We're gonna have to delegate the primary constructor
     * Secondary constructor always have to delegate or refer to primary constructor
     */
    constructor(nameOfRestaurant: String) : this(nameOfRestaurant, 0) {
        // TODO write your logic here
    }

    constructor(twoPersonBill : Double) : this("",0) {
        // TODO write your logic here
    }


    fun print() = "${nameOfRestaurant}, ${rating} Star"

}


fun main() {

    val sethi = Restaurant("Sethi", 4)

    // Because the variable is val I can't change the value of it. It doesn't have setter method internally.
   // sethi.nameOfRestaurant = "Pirates of Grills"

    println("Name of Restaurant : ${sethi.nameOfRestaurant}")
    println("Rating of Restaurant : ${sethi.rating}")

    println(sethi.print())

    val piratesOfGrill = Restaurant("PirateOfGrills")
    println("Name of Restaurant : ${piratesOfGrill.nameOfRestaurant}")
    println("Rating of Restaurant : ${piratesOfGrill.rating}")

}