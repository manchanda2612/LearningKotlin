package sapi.com.learningkotlin.object_oriented

/**
 *1) Covariance means you can use a more derived type. We can use a "more derived" type so in other words subtype.
 */
fun main() {

    val people : MutableList<Person> = mutableListOf(Person(), Person(), Person())
    people.add(Student())   // Best example of covariance

    // Being does not fulfill the contract of more derived class
   //  people.add(Being())

    // another example of covariance
    val person : Person = Student()

    // Read only collection are covariant
    val student : List<Person> = listOf<Student>()


    // this is not possible because you can add
    // val student2 : MutableList<Person> = mutableListOf<Student>()
    //     student2.add(Person())

}

open class Being
open class Person : Being()
class Student : Person()
