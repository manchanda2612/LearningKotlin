package sapi.com.learningkotlin.functional_prg


fun main(args : Array<String>) {

    // lambdas

    { x  : Int -> x * 2 }

    val addTwoValue : (Int, Int) -> Int = {x : Int, y : Int -> x + y }
    print(addTwoValue.invoke(2,4))


    //  higher order function
    val list = (1..100).toList()

    print("\n")
    print(list.filter { x -> x % 2 == 0 })

    print("\n")
    print(list.filter { it % 2 == 0 })

    print("\n")
    print(list.filter { it.even() })


    // this is function pointer
    print("\n")
    print(list.filter(::isEven))

    print("\n")
    print(list.filter(::isEven2))


}

// Extension Function
fun Int.even() = this % 2 == 0

//
fun isEven(x : Int) : Boolean {
   return x % 2 == 0
}

fun isEven2(x : Int) = x % 2 == 0

