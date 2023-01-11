package com.yp.kotlin.belajar.oop.Class

class Teacher (val name: String) {
//    menggunakan modifier public yang bisa diakses dimana aja
    fun hello(){
        println("")
    }

//    menggunakan modifier private yang hanya bisa diakses di class ini saja
    private fun hello2(){
    println("")
    }

//    menggunakan modifier protected yang hanya bisa diakses di class ini dan juga turunannya
    protected fun hello3(){

    }

//    menggunakan modifier internal yang hanya bisa diakses di project ini saja
    internal fun hello4(){

    }
}