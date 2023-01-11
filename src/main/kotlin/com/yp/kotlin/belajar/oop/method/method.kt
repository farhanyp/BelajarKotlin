package com.yp.kotlin.belajar.oop.method

import com.yp.kotlin.belajar.oop.Class.Person

// memanggil method dari class person
fun main(){

    val yp = Person()
    yp.name = "Farhan"
    yp.middlename = "Yudha"
    yp.lastname = "Pratama"

    yp.sayHello("Roronoa")
    yp.sayHello("Zoro", 20)
    var fullname = yp.getFullname()

    println(fullname)
}