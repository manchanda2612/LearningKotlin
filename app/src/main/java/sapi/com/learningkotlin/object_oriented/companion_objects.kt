package sapi.com.learningkotlin.object_oriented


/**
 * 1) Instead of having static in class, in kotlin we're gonna use so called companion objects.
 * 2) This is like a Static block where you only have static properties and static methods.
 * 3) Whatever we write in companion object block we can access it with class name directly we don't need to create an object.
 * 4) By default companion object block name is "Companion" so you don't need to write it, to make it redundant. Even though you can give any other name to it. BUT still
 * it is optional.
 * 5) While accessing companion object member you can use class.companion.property or method, but as I said earlier companion is automatically infer by Kotlin so
 * you don't need to write it again.
 * 6) In Companion object block we can't access the class member. We can only access the object companion member.
 * 7) Companion and object both are keyword in Kotlin.
 * 8) Companion object block data is of class specific not a object specific object
 * 9) Companion object is indeed an object at run time, which means you can extend the class or implement the interfaces as well.
 */
fun main() {

    val normalHouse = House.getNormalHouse()
    println("${normalHouse.numbersOfRoom} rooms in Normal House at Rs${normalHouse.price}")

    val luxuryHouse = House.getLuxuryHouse()
    println("${luxuryHouse.numbersOfRoom} rooms in Luxury House at Rs${luxuryHouse.price}")

    println("Total no of Houses at sale ${House.HOUSES_FOR_SALE}")

}

interface HouseFactory {
    fun createHouse() : House
}

class House(val numbersOfRoom : Int, val price : Double) {

    companion object : HouseFactory {
        val HOUSES_FOR_SALE = 10
        fun getNormalHouse() : House = House(6, 199.90)
        fun getLuxuryHouse() : House = House(42, 7_00_000.00)
        /*override fun createHouse(): House {
            return getNormalHouse()
        }*/
                // OR
        override fun createHouse() = getNormalHouse()

    }

}