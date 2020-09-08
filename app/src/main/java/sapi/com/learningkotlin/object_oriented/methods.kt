package sapi.com.learningkotlin.object_oriented

class Robot(val name : String) {

    fun greetHuman() {
        println("Hello Human, My name is $name")
    }

    fun knowItsName() : Boolean = name.isNotBlank()

}


fun main() {

    val robot = Robot("Chithi")

    if(robot.knowItsName()) {
        robot.greetHuman()
    }

}