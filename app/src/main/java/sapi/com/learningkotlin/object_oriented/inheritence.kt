package sapi.com.learningkotlin.object_oriented

/**
 * 1) In Kotlin, types or classes are FINAL by default. It means you can't inherit the class unless you explicitly say so and the way you do this is to declare class
 * with OPEN keyword
 * 2) We can make our class, method or property inheritable by making them as OPEN.
 * 3) To extend a class or implement an interface in Kotlin we use : (colon).
 * 4) In Kotlin, we have override keyword to override any property or method from Parent class
 * 5) : Shape(name) this is how we call a Parent class constructor
 * 6) We can only inherit the class, method or property if they are Open else they are private(close) by default. To override the method or property we use override keyword.
 */
open class Base

class Child : Base()

open class Shape(val name: String) {

    open fun area() = 0.0

}

/**
 * If you have noticed, In Kotlin we have to write less code as compare to Java. We have define parameterized constructor with radius property and take name to pass it to
 * parent class in just one line in Java we first create class then property and then parameterized constructor.
 */
class Circle(name: String, val radius: Double) : Shape(name) {

    override fun area() = Math.PI * Math.pow(radius, 2.0)



}


fun main() {

    val smallCircle = Circle("Small Circle", 2.0)

    println("${smallCircle.name} ${smallCircle.radius}")
    println(smallCircle.name)
    println(smallCircle.radius)
    println(smallCircle.area())

    val shape = Shape("Triangle")
    println(shape.name)
    print(shape.area())

}




