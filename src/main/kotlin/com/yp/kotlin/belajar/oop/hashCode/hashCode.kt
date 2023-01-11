package com.yp.kotlin.belajar.oop.hashCode

import com.yp.kotlin.belajar.oop.Class.Mangkok

fun main(){
    val burung = Mangkok("maman")
    val elang = Mangkok("maman")

    println(burung.hashCode())
    println(elang.hashCode() ==burung.hashCode())


}