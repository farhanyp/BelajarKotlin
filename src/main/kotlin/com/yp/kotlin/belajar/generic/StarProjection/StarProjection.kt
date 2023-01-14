package com.yp.kotlin.belajar.generic.StarProjection

// Menggunakan star projection untuk mengambil generic tanpa memperdulikan generic parameternya
fun displayLength(Arr: Array<*>){
    println("Panjang arraynya adalah ${Arr.size}")
}

fun main(){

    val ArrayInt: Array<Int> = arrayOf<Int>(1,2,3,4,5)

    displayLength(ArrayInt)

}