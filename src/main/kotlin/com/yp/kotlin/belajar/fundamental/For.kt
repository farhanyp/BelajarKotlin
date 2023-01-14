package com.yp.kotlin.belajar.fundamental

fun main(){

    val names = arrayOf("YP", "Farhan", "Yudha")
    // val numbers = 100 downTo 0 step 2
    val arraySize = names.size - 1

    // for in array
    // for (name in names){
    //     println("ini adalah ${name}")
    // }

    // for in range
    // for(value in 0..10){
    //     print(value)
    // }

    // for in range with operation math
    // for(value in numbers){
    //     var number = value / 2
    //     print("$number ")
    // }

    // for in range mix array
    for(i in 0..arraySize){
        println(names.get(i))
    }
}