package com.yp.kotlin.belajar.oop.Constructor

import com.yp.kotlin.belajar.oop.Class.*

// Penggunaan Constructor yang diambil dari class Person
fun main(){
//    Pendeklarasian constructor di objek
    val Honda = Car("Honda Civic", 10)

//    Pengambilan atau menampilkan data properties
    println(Honda.Merk)

//    pengambilan atau menampilkan data properties
    println("umur ${Honda.Merk} sekarang: ${Honda.Age}")

//    Mengganti data pada properties
    Honda.Age = 50
    println("umur ${Honda.Merk} setelah diubah: ${Honda.Age}")
}