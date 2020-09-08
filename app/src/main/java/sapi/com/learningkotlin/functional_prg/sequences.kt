package sapi.com.learningkotlin.functional_prg

import kotlin.system.measureTimeMillis

fun main(args : Array<String>) {

    /*val veryLongList = (1..999999).toList()

    val sumOfNonSequence = veryLongList
        .filter { it >  50 }
        .map { it * 2 }
        .take(1000)
        .sum()

    println("Sum of Non-sequence ${sumOfNonSequence}")


    val seqenceSum = veryLongList
        .asSequence()
        .filter { it >  50 }
        .map { it * 2 }
        .take(1000)
        .sum()

    println("Sum of Non-sequence ${seqenceSum}")

    val  seq = generateSequence(1, { it + 1})
    println(seq.take(10).toList())*/


    // performance measure of sequence and list with small data
    /*val longList = (1..9999L).toList()
    var sum = 0L
    var lazySum = 0L

    val withoutSeq = measureTimeMillis {
        sum = longList
            .filter { it > 50 }
            .map { it * 2 }
            .take(1000)
            .sum()
    }

    val withSeq = measureTimeMillis {
        lazySum = longList
            .asSequence()
            .filter { it>50 }
            .map { it*2 }
            .take(1000)
            .sum()
    }
    println("Non-lazy : ${withoutSeq} , Result: ${sum}"  )
    println("lazy : ${withSeq} , Result: ${lazySum}"  )*/





// performance measure of sequence and list with large data
    val longList = (1..999999L).toList()
    var sum = 0L
    var lazySum = 0L

    val withoutSeq = measureTimeMillis {
        sum = longList
            .filter { it>50 }
            .map { it*2 }
            .take(1000)
            .sum()
    }

    val withSeq = measureTimeMillis {
        lazySum = longList
            .asSequence()
            .filter { it>50 }
            .map { it*2 }
            .take(1000)
            .sum()
    }
    println("Non-lazy : ${withoutSeq} , Result: ${sum}"  )
    println("lazy : ${withSeq} , Result: ${lazySum}"  )















}