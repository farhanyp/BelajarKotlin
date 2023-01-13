package com.yp.kotlin.belajar.generic.Covariant

import com.yp.kotlin.belajar.generic.Class.Covariant

fun main(){

    val CovariantString = Covariant<String>("Farhan")
    val CovariantAny: Covariant<Any> = CovariantString

    println("ini adalah data covariant dari String${CovariantString.data()}")
    println("ini adalah data covariant dari ANY${CovariantAny.data()}")

}