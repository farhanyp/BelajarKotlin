package com.yp.kotlin.belajar.oop.cast

import com.yp.kotlin.belajar.oop.Class.Gelas
import com.yp.kotlin.belajar.oop.Class.Piring

fun printAny(any: Any){
//    Cast any menggunakan If
//    if (any is Gelas){
//        println("ini Class Gelas dengan nama ${any.name}")
//    }else if(any is Piring){
//        println("ini Class Gelas dengan nama ${any.name}")
//    }else{
//        println("Ini bukan class")
//    }

//    Cast any menggunakan when
    when(any){
        is Gelas -> println("ini Class Gelas dengan nama ${any.name}")
        is Piring -> println("ini Class Gelas dengan nama ${any.name}")
        else -> println("Ini bukan class")

    }
}

fun main(){

    var gelas =
    printAny(Gelas("Kuning"))
    printAny(Piring("Merah", 15))


}