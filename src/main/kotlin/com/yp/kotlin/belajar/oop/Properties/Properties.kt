package com.yp.kotlin.belajar.oop.Properties

import com.yp.kotlin.belajar.oop.Class.*

// Penggunaan Properties yang diambil dari class Person
fun main(){
    val yp = Person()

//    Pengambilan atau menampilkan data properties
    println(yp.name)

    println("umur yp sekarang: ${yp.age}")
//    Mengganti data pada properties
    yp.age = 50
    println("umur yp setelah diubah: ${yp.age}")

}