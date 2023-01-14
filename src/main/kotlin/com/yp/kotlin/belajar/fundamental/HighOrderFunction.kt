package com.yp.kotlin.belajar.fundamental


// High Order Function dimana sebuah function berisi lambda
fun operation(value: Int, transformer: (Int) -> Int): Int{

    var transformLambda = transformer(value)

    return transformLambda

}

fun main(){

    // Memanggil fungsi dengan lambda default
    println(operation(2, {value: Int -> value*2}))

    // Memanggil fungsi dengan trailing lambda
    println(operation(2) {value: Int -> value/2})

}
