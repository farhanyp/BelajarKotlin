package com.yp.kotlin.belajar.oop.extension

import com.yp.kotlin.belajar.oop.Class.Angka
import com.yp.kotlin.belajar.oop.Class.Student
import com.yp.kotlin.belajar.oop.Class.pangkat2
import com.yp.kotlin.belajar.oop.Class.tambahumur

fun main(){

    val yp = Student("Farhan", 3)
    val angka = Angka( 2)

    println(yp.tambahumur(3))

    println(angka.pangkat2)
}