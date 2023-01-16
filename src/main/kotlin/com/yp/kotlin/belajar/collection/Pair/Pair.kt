package com.yp.kotlin.belajar.collection.Pair

fun main (){

    val pair1: Pair<String, String> = Pair("Yp", "Farhan")
    val pair2: Pair<String, String> = "Yp" to "Farhan"

    println(pair1.first)
    println(pair2.first)
    println(pair1.second)
    println(pair2.second)

}