package com.yp.kotlin.belajar.generic.LogObservableProperties

import com.yp.kotlin.belajar.generic.Class.Car

fun main(){

    val car1 = Car("Toyota", 2000)

    println(car1.brand)
    car1.brand = "Sedan"
    println(car1.brand)

}