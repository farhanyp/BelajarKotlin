package com.yp.kotlin.belajar.fundamental

// Constant immutabel adalah variabel yang bisa diakses global
const val APP = "Kotlin"
const val VERSION = "1.0.0"


fun main(){

    // Val merupakan variabel immutabel (Tidak dapat berubah)
    val firstname: String = "Farhan"

    // Var merupakan variabel mutabel (dapat berubah)
    var lastname= "Yp"

    print(firstname)
    print(lastname)
    println()

    // Nullable
    var name: String? = "hello"
    println(name)

    //Jika ingin mengakses nullable harus menggunakan tanda tanya
    println(name?.length)

    println()

    println("$APP : $VERSION")
}