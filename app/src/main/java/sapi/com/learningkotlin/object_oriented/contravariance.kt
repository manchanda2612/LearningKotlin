package sapi.com.learningkotlin.object_oriented

/**
 *
 */
fun main() {

    val strSource : Source<String> = Source("Producer")

    //any is the super type of any other type in kotlin
    // so we  could actually  use any source here
    // this is again covariance. You can use a subtype because
    // now kotlin cannot infer that well there might not be a function here
    val anySource : Source<Any> = strSource
    anySource.produceT()


    // this is contravariance
    // in this child or inheritence  relationship is basically inversed
    // so any is a super type of string, so that in this case the sink of any is
    // actually a subtype of sink of string. 
    val anySink : Sink<Any> = Sink()
    val strSink : Sink<String> = anySink
    // it can consume element and object of any type
    strSink.consumerT("Consumer")
}

/**
 * A source class which actually only ever returns value of type t, but never takes in any parameter
 * into method of type t.Now classes of this type are called PRODUCER because they only ever produce
 * elements of type t of the generic type parameter but never ever consume any.
 * Now in those cases you can actually tell Kotlin that this class will only ever produce elements
 * of this type and never consume any by pre-planning the out keyword here.
 */
class Source <out T>(val t : T) {

    fun produceT() : T {
        return t
    }

}


/**
 * Let's create a contravariant class.
 * This class can only have methods that take in parameter of type t, but you can't have a function that return the t.
 *
 */
class Sink<in T> {

    fun consumerT(t: T) {

    }

    // you can only have this method if you remove "in"
    /*fun add() : T? {
        return null
    }*/


}