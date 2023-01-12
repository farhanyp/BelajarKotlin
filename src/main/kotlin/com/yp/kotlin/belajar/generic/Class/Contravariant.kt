package com.yp.kotlin.belajar.generic.Class

// Contoh penggunaan Covariant
class Contravariant<in T> {

//    Hanya bisa menginput data
    fun sayHello(param: T){
        println("Hello $param")
    }

//    Tidak bisa mengoutputkan data
//    fun getHello(): T{
//
//    }
}