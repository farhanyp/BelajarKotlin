package com.yp.kotlin.belajar.oop.Class

class Student(val name: String, val age: Int) {

}

class Angka(val value: Int) {

}

// Menggunakan extension Functions
fun Student.tambahumur(age: Int): Int{
    return age * this.age
}

// Menggunakan extension Properties
val Angka.pangkat2: Int
    get() = this.value * this.value
