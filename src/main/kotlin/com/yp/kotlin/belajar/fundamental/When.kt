package com.yp.kotlin.belajar.fundamental

fun main(){

    val nilai = "A"
    val name = "MAMAN"
    val nilais = arrayOf("A","B","C")
    val exam = 90


    // when optional answer
    when(nilai){
        "A" -> {println("nilai kamu A")}
        "B" -> {println("nilai kamu B")}
        "C" -> {println("nilai kamu C")}
        else -> {println("nilai kamu D")}
    }

    // when multiple optional answer
    when(nilai){
        "A", "B", "C" -> {println("Kamu lulus")}
        else -> {println("Kamu tidak lulus")}
    }

    // when use in (mengecek apakah ada didalam array)
    when(nilai){
        in nilais -> println("Kamu lulus")
        !in nilais -> println("Kamu tidak slulus")
    }


    // when use is (mengecek tipe data)
    when(name){
        is String -> println("${name} is String")
        !is String -> println("${name} is not String")
    }


    // when use if else
    when{
        exam == 75 -> println("Nilai anda pas")
        exam > 75 -> println("Nilai lulus")
        else -> println("Nilai tidak lulus")
    }

}