package com.yp.kotlin.belajar.oop.secondCons

import com.yp.kotlin.belajar.oop.Class.Animal
import com.yp.kotlin.belajar.oop.Class.Land

fun main(){
    val Leon = Animal("leon", "Mamalia", "20")
    val Shark = Animal("Shark", "Mamalia")
    val Monkey = Animal("Monkey")

    val Heyna = Land("Anjing")

    Leon.Hello("leon")
    Shark.Hello("Shark")
    Monkey.Hello("Monkey")

    Heyna.Says()

}