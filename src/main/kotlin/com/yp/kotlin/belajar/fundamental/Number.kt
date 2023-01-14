package com.yp.kotlin.belajar.fundamental

fun main(){

    // fun Upper(value: String): String = value.toUpperCase()

    // Contoh lambda
    val lambdaTwo: (Int) -> (Int) = { value: Int -> value * 2}

    // Contoh lambda menggunakan ( it )
    // val lambdaTwo: (Int) -> Int = { it * 2}

    // Contoh lambda menggunakan method references
    // val toUpper: (String) -> String = ::Upper

    println(lambdaTwo(2))

    // println(toUpper("yp"))

}