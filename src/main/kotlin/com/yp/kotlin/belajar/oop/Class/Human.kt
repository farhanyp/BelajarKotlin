package com.yp.kotlin.belajar.oop.Class


class Human {
//    Penggunaan late ini untuk variabel name
    lateinit var name : String
//    Menginisialisasikan late init name dengan cara menggunakan funcition atau bisa langsung dari fun main
    fun lateinitName(name: String){
        println("Menginisalisasi lateinit name")
        this.name = name
    }

// Contoh penggunaan setter dan getter
//        get(){
//        println("Memanggil getter")
//        return field
//    }
//
//        set(value){
//            println("Memanggil setter")
//            field = value
//        }
}