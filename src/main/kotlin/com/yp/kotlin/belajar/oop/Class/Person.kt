package com.yp.kotlin.belajar.oop.Class

class Person {
    var name = ""
    var middlename: String = ""
    var lastname = ""
    var age = 0

    fun sayHello(name: String){
        return println("Hello $name, My name is ${this.name}")
    }

//    contoh function overloading dimana tipe paramater atau jumlah parameter harus berbeda dengan function yang sama
    fun sayHello(name: String, age: Int){
        return println("Hello $name, i'm $age years old")
    }

    fun getFullname(): String{
        return "$name $middlename $lastname"
    }
}