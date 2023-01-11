package com.yp.kotlin.belajar.oop.Sealed

import com.yp.kotlin.belajar.oop.Class.Tambah
import com.yp.kotlin.belajar.oop.Class.Kurang
import com.yp.kotlin.belajar.oop.Class.Operation

// Menggunakan when dan sealed Class
fun operation(value1: Int, value2 : Int, name: Operation): Int{
    return when(name){
        is Tambah -> value1 + value2
        is Kurang -> value1 - value2
    }
}

fun main (){

    println(operation(1, 2, Tambah()))
    println(operation(1, 2, Kurang()))
}