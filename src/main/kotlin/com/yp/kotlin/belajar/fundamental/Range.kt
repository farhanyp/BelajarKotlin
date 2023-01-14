package com.yp.kotlin.belajar.fundamental

fun main (){

    // tipe data range yang menampung angka 1 - 100
    // val range = 1..100

    // membuat range kebalikan
    // val range = 100 downTo 1

    // membuat range dengan step 2
    val range = 100 downTo 1 step 1+2

    // membuat range dengan step 2
    // val range = 100 downTo 1 step 2

    println(range)

    // fungsi untuk mendapatkan total data range
    println(range.count())

    // fungsi untuk mengecek apakah terdapat value tersebut
    println(range.contains(200))

    // fungsi untuk melihat value pertama
    println(range.first)

    // fungsi untuk melihat value terakhir
    println(range.last)

    // fungsi untuk melihat kenaikan
    println(range.step)



}