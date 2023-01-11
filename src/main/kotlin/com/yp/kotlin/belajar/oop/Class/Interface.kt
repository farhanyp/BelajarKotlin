package com.yp.kotlin.belajar.oop.Class

interface Interface {
    val name: String
//    (Concrete Function) Mendeklarasikan body function langsung di interface, tanpa harus mengoverride lagi di class manusia
    fun hello(name : String){
        println("Hello $name i'm ${this.name}. Ini dari interface Interface")
    }
}

// menginheritance interface dalam interface
interface Interface2 {
    val name: String
    fun hello(name : String){
        println("Hello $name i'm ${this.name}. Ini dari interface Interface2")
    }
}

open class Coba

// menginheritance 1 Class dan 2 interface dalam 1 class
class Manusia (override val name : String) : Coba(), Interface,Interface2{

    override fun hello(name: String) {
        super<Interface>.hello(name)
        super<Interface2>.hello(name)
        print("Hello $name i'm ${this.name}. Ini dari class Manusia")
    }

}