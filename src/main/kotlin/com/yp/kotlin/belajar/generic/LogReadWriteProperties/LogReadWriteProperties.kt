package com.yp.kotlin.belajar.generic.LogReadWriteProperties

import com.yp.kotlin.belajar.generic.Class.Person

fun main(){

    val data1 = Person("Farhan")

    println(data1.data)
    data1.data = "yp"
    println(data1.data)

}