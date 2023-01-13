package com.yp.kotlin.belajar.generic.Class

// Contoh penggunaan Covariant
class Covariant<out T>(val name: T) {

     fun data(): T{
         return name
    }

//    Tidak bisa membuat funtion untuk mengubah data dengan parameter generic
//    fun SetData(param: T){
//        name = param
//    }

}