package sapi.com.learningkotlin.object_oriented

/**
 * In Kotlin we only have properties(are meant to be public in Scope) and not fields(are meant to be private and protected in Scope).
 * The properties in Kotlin has Getter and Setter defined by itself or automatically.
 *
 */
class City {

    var name: String = " "
    // HOW TO OVERRIDE THE GETTER METHOD?
        /**
         *  Field is an implicit backing field in which it store actual data. When you access GETTER AND SETTER you can access the backing field using the
         *  field variable here, so get() here in this case simply return the stored value
         *  This is the default implementation of Getter method
         */
        get() = field

    //HOW TO OVERRIDE THE SETTER METHOD?
        /**
         * In Setter we are using implicit backing field to store the value
         */
        set(value) {
            if (value.isNotBlank())
                field = value
        }


    var population: Int = 0


}

fun main() {

    val berlin = City()
    /**
     * When we are calling "berlin.name = "Berlin"" then we are not actually accessing the name attribute directly, but instead this will implicitly call the SETTER method
     * of the name property in order to SET value.
     */
    berlin.name = "Berlin"
    berlin.population = 3_500_000

    berlin.name = "  "


    /**
     * when we calling "berlin.name" then we are not actually accessing the name attribute directly, but instead this will implicitly call the GETTER method of the name
     * property in order to GET the value.
     */
    println("Name of city : ${berlin.name}")
    println("Population of city : ${berlin.population}")

}