package com.yp.kotlin.belajar.oop.Class

class Boss(val name: String) {

//    Pemakaian inner class
    inner class Employee(val name: String){
        fun sayHello (name: String){
            println("my name is $name, my employee name is ${this.name} and my boss name is ${this@Boss.name}")
        }
    }
}