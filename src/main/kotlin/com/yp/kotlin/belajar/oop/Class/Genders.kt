package com.yp.kotlin.belajar.oop.Class

// Menambahkan properties dan function kedalam enum
enum class Genders(val desc: String) {
    Male("Laki-laki"),
    Female("Perempuan");

    fun showDesc(){
        println(desc)
    }
}