package com.yp.kotlin.belajar.collection.Collection

//Collection merupakan super class dari list, set dll
// fungsi untuk menangkap semua struktur data yang turunan dari Collection
fun <T> displayCollection(param: Collection<T>){
    for(value in param){
        println("$value")
    }
}

// fungsi untuk menangkap semua struktur data yang turunan dari mutableCollection
fun <T> displayMutableCollection(param: MutableCollection<T>){
    for(value in param){
        println("$value")
    }
}

fun main (){

    displayCollection(listOf(1,2,3,4,5)) // Bisa
    displayCollection(setOf(1,2,3,4,5)) // bisa
//  displayCollection(mapOf<>(1,2,3,4,5)) // tidak bisa karena bukan turunan dari collection

    displayMutableCollection(mutableListOf(1,2,3,4,5)) // Bisa
    displayMutableCollection(mutableSetOf(1,2,3,4,5)) // bisa


}