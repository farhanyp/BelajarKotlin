package com.yp.kotlin.belajar.generic.Class


// Menggunakan dan mengoverride comperaTo dan interface Comparable dimana di case ini mengcompere qty pada class fruit
class Fruit(val name: String, val qty: Int): Comparable<Fruit> {
    override fun compareTo(other: Fruit): Int {
        return qty.compareTo(other.qty)
    }
}