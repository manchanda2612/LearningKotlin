package sapi.com.learningkotlin.object_oriented

/**
 *
 */
fun main() {

    val timeLine = timelineOf(1,2,3,4)

}


/**
 * This is same as listOf() we have made our own custom method with generic function
 */
fun <E> timelineOf(vararg element : E) : Timeline<E> {

    val elements = Timeline<E>()

    for (a in element) {
        elements.add(a)
    }

    return elements

}