package com.yp.kotlin.belajar.generic.Class

class MyData<T,U> (val value1: T, val value2: U) {

    fun getData1():T = value1
    fun getData2():U = value2

    fun showData(){
        println(" Ini $value1 dan $value2")
    }
}