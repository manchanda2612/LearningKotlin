package sapi.com.learningkotlin.functional_prg

import kotlin.reflect.KFunction0

fun main() {

    modify("Neeraj", ::demo)

}

fun modify(str: String, operation: KFunction0<String>) {

    print(str + operation.toString())

}


fun demo() : String {
    return "Manchanda";
}