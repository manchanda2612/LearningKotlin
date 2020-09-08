package sapi.com.learningkotlin.object_oriented

/**
 * You can override val with val or var but not the other way around.
 */
fun main() {

    val sedan = Sedan()
    sedan.drive()
    sedan.honk()

}

abstract class Vehicle (open val name : String = "") {

    open fun drive () {
        println("Driving (Vehicle)")
    }

    abstract fun honk()

}

interface Drivable1 {
    fun drive() {
        println("Driving (Drivable1)")
    }
}

class Sedan(override var name : String = "BRAND") : Vehicle(), Drivable1  {

   /* override fun drive() {
        super<Drivable1>.drive()
    }*/

    /**
     * If we have multiple parent source that have same method name and we want to call particular parent method
     * then we have to separately mention it with super keyword.
      */
    override fun drive() {
        super<Vehicle>.drive()
    }

    override fun honk() {
        println("Monk")
    }

}