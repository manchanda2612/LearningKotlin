package sapi.com.learningkotlin.object_oriented

/**
 * 1) We can't create an object of Interface
 * 2) In interface, we don't have any concrete method. They also can't have any state
 * 3) Interface can't have any constructors. Major difference between Interface and Abstract class or Normal classes.
 * 4) In Interface we can define the default implementation of methods. But for good practise we should avoid this. In Some cases it can be required but most of
 * the cases it doesn't require or you better go to abstract class approach if you want to define method implementation.
 * 5) Override is KEYWORD in Kotlin not a annotation like in java
 */
fun main() {

    val drivable : Drivable = Bicycle()
    println(drivable.speed)
    drivable.drive()
    drivable.vehicleType()
    // I am going to cover this in smart_cast class
    if(drivable is Bicycle) {
        drivable.nameOfVehicle()
    }

    val motorCycle  = MoterCycle()
    println(motorCycle.speed)
    motorCycle.drive()
    motorCycle.vehicleType()
    motorCycle.nameOfMotorCycleVehicle()

}


interface Drivable {
    // by default this property is abstract
    val speed : Double
    // this method is also abstract here
    fun drive()
    // you can define method body in interface as well like in Java8
    fun vehicleType() {
        println("Vehicle Type")
    }
}

class Bicycle : Drivable {

    /*override val speed: Double
        get() = 50.0*/

            //or
    override val speed = 50.0

    override fun drive() {
        println("Driving Bicycle")
    }

    override fun vehicleType() {
        super.vehicleType()
        println("Bicycle")
    }

    fun nameOfVehicle() : Boolean {
        println("Neelam")
        return true
    }

}

class MoterCycle : Drivable {

    override val speed: Double
        get() = 120.0

        //or
   // override val speed = 50.0

    override fun drive() {
        println("Driving Motor Cycle")
    }

    override fun vehicleType() {
        super.vehicleType()
        println("Motor Cycle")
    }

    fun nameOfMotorCycleVehicle() {
        println("Hero Honda")
    }

}


