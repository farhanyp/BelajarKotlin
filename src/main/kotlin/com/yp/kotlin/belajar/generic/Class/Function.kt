package com.yp.kotlin.belajar.generic.Class

class Function <U>(val name: U) {

    fun <T> sayHello(param: T){
        println("Hello $param, i am $name")
    }
}