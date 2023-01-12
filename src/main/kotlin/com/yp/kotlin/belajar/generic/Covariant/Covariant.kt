package com.yp.kotlin.belajar.generic.Covariant

import com.yp.kotlin.belajar.generic.Class.Covariant

fun main(){

    val CovariantString = Covariant<String>("Farhan")
    val CovariantAny: Covariant<Any> = CovariantString

    println(CovariantAny.data())

}