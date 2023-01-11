package com.yp.kotlin.belajar.oop.Class

// Menggunakan tambahan open supaya classnya bisa di Inheritance
open class Employee(open val name: String) {

// Menggunakan tambahan open supaya fungsinya bisa di gunakan kembali di class lain
    open fun sayHello (position: String){
        println("Nama $position ${this.name}")
    }

}

// Mengoverride properties dari clas Employee
class Ceo(override val name: String):Employee(name){
//    memberikan final pada fun say hello yang telah di overrida berfungsi untuk supaya class child yang dibawah
//    class Ceo tidak bisa memakai fungsi tersebut
    final override fun sayHello(position: String) {
//    Menggunakan super untuk mengakses isi dari funciton sayHello
        super.sayHello(position)

    }
}

//class Boss(name: String):Ceo(name){
//
////    Tidak bisa mengoverride fungsi sayhello
//    override fun sayHello() {
//        println("Nama Boss ${this.name}")
//    }
//
//}