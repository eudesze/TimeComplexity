package org.example

import kotlin.time.measureTime

fun main() {
    val timeTaken = measureTime {
        //findSum1(999999999)
        findSum2(999999999)
    }

    println("Time taken: $timeTaken")
}

fun findSum1(n: Long) {
    val result = n*(n+1)/2
    println("The result is: $result")
}

fun findSum2(n: Long) {
    var sum = 0L
    for (i in 0..n) sum += i
    println("The result is: $sum")
}