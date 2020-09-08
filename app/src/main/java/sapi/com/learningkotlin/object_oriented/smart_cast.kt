package sapi.com.learningkotlin.object_oriented

/**
 * "InstanceOf" operator is "is" operator in kotlin.
 */
fun main() {


    /**
     * I am creating an object vehicle of type Drivable1 and then instantiate this to bicycle.
     * So at this point during the execution, the vehicle variable or object is always the type of Drivable to the compiler,
     * even though it is actually instantiated with the more concrete class Bicycle.
     *
     * It is always a good practise to always have an instantiate of an most abstract class or interface
     * (here I mean to say that only create an instance of those class that actually need)
     */
    val vehicle : Drivable = Bicycle()

    /**
     * This is smart cast here like we do in Java using instanceOf().
     * In Java we do
     * if(vehicle instanceOf Bicycle) {
     *      val vehicle = ((Bicycle)vehicle)
     * }
     * When you hover on green vehicle it will show you smart cast
     */
    if(vehicle is Bicycle) {
        vehicle.nameOfVehicle()
    } else if (vehicle is MoterCycle) {
        vehicle.nameOfMotorCycleVehicle()
    }

    if(vehicle is Bicycle && vehicle.nameOfVehicle()) {
            // TODO perform operation here
    }

    if(vehicle !is Bicycle || vehicle.nameOfVehicle()) {
            // TODO perform operation here
    }

    if(vehicle !is MoterCycle) {
        return
    }

    vehicle.nameOfMotorCycleVehicle()



}