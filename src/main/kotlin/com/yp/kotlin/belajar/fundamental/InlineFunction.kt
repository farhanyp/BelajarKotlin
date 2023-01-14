package com.yp.kotlin.belajar.fundamental


// inline function Membuat performa fungsi lebih optimal
// inline fun hello (name: () -> String): String{
//     return "Hello ${name()}"
// }

// inline function menggunakan parameter noinline
inline fun sayHello (name: () -> String, noinline umur: () -> Int): String{
    return "Hello ${name()} berumur ${umur()}"
}

fun main(){

    // println(hello{"Yp"})
    println(sayHello({"Yp"}, {5}))
}