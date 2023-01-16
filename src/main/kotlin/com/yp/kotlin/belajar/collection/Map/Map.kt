package com.yp.kotlin.belajar.collection.Map

fun main(){

//    Menggunakan immutable Map
    val map: Map<Any, Any> = mapOf(
        1 to "a",
        2 to "b",
        3 to "c"
    )

//    Menggunakan Mutable Map
    val mutableMap: MutableMap<Any, Any> = mutableMapOf(
        1 to "c",
        2 to "d",
        3 to "e"
    )

    for ((key, value ) in map){
        println("$key = $value")
    }

    for ((key, value ) in mutableMap){
        println("$key = $value")
    }


}