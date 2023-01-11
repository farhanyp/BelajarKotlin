package com.yp.kotlin.belajar.fundamental

fun main(){

    var counter = 0

    val lambdaInc: () -> Unit = {
        counter++
        println("Incemenet $counter")
    }

    lambdaInc()
}