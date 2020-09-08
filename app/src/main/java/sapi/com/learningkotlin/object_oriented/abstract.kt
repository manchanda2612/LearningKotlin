package sapi.com.learningkotlin.object_oriented

/**
 * 1) We can't create an object of abstract class.
 * 2) Abstract class only contain abstract method
 * 3) Abstract class are by default or automatically OPEN
 * 4) Difference between abstract and open is that We can create an object of open class but not for abstract class. In Open class we have to give method definition(body)
 * but abstract class contain abstract methods and concrete methods as well.
 * 5) In abstract class you can make concrete method as Open so that it can be overriden by child class. But making that method open is optional for child class
 * to override it or not.
 * 6) Whenever you really want to encapsulate the similarities of   several child classes,
 * but don't want let anyone create an object of that class you make use of abstract class.
 */
fun main() {

    val circle1 = Circle1("Small Circle", 2.0)
    println(circle1.area())

}


abstract class Shape1(name : String) {

    abstract fun area()

}


class Circle1(name : String, val radius : Double) : Shape1(name) {

    override fun area() {
        Math.PI * Math.pow(radius, 2.0)
    }

}