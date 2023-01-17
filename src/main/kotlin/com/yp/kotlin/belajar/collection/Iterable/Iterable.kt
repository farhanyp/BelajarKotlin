package com.yp.kotlin.belajar.collection.Iterable

// contoh fungsi untuk immutable iterable
fun <T> displayIterable(iterable: Iterable<T>){
    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }
}

fun <T> displayMutableIterable(iterable: MutableIterable<T>){
    val iterator = iterable.iterator()
    while (iterator.hasNext()){
//        iterator.remove()
        println(iterator.next())

    }
}

fun main (){
//    displayIterable(listOf("farhan"))
    displayMutableIterable(mutableListOf("farhan", "yp"))
}