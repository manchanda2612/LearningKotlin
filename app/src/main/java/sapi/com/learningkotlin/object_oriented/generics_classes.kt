package sapi.com.learningkotlin.object_oriented

import java.util.*

/**
 * As the name implies a generic class allow you to write classes and their methods in more generic way so that they can also be used in more different situations.
 *
 */
fun main() {

    val timeline = Timeline<Int>()
    timeline.add(2)
    println(timeline.getLatestEntry())

    val events : Timeline<Person> = timelineOf()
    val student : List<Student> = listOf(Student(), Student())
    events.addAll(student)

}

/**
 * E stand for "Element" or you can use T stand for "Type"
 */
class Timeline<E> {

    val date2Data : MutableMap<Date, E> = mutableMapOf()

    fun add(element : E) {
        date2Data.put(Date(), element)
    }

    fun addAll(elements : Collection<E>) {
        elements.forEach( { add(it) } )
    }

    fun getLatestEntry () : E {
        return date2Data.values.last()
    }
}


