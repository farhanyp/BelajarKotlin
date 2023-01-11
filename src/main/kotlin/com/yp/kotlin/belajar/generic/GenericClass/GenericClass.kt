package com.yp.kotlin.belajar.generic.GenericClass

import com.yp.kotlin.belajar.generic.Class.MyData

fun main(){

    val data1 : MyData<Int, String> = MyData(10, "Yp")
    data1.showData()

    val data2 : MyData<String, Int> = MyData("Farhan", 100)
    data2.showData()

}