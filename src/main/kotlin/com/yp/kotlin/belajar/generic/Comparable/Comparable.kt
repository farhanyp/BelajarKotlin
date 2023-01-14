package com.yp.kotlin.belajar.generic.Comparable

import com.yp.kotlin.belajar.generic.Class.Fruit

fun main (){

    val data1 = Fruit("Apple", 100)
    val data2 = Fruit("Apple", 10)

    println(data1 > data2)

}