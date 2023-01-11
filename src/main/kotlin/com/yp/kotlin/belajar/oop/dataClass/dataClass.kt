package com.yp.kotlin.belajar.oop.dataClass

import com.yp.kotlin.belajar.oop.Class.Product

fun main (){

    val indomie = Product("Indomie", 2500)
    val sarimi = indomie.copy("Indomie")

    println(indomie)
    println(sarimi)
}