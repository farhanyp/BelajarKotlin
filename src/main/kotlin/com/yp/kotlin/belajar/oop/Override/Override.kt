package com.yp.kotlin.belajar.oop.Override

import com.yp.kotlin.belajar.oop.Class.*

fun main(){

    val Employee1 = Employee("Farhan")
    val Employee2 = Employee("Yudha")
    val Ceo1 = Ceo("Yudha")

    Employee1.sayHello("Employee")
    Employee2.sayHello("Employee")
    Ceo1.sayHello("Ceo")
}