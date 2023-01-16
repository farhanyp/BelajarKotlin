package com.yp.kotlin.belajar.collection.Class

class Person(val name: String) {

//    Menampilkan code dari string name
    override fun hashCode(): Int {
        return name.hashCode()
    }

//    Jika name dengan other. name sama maka nilai tidak ditampilkan
    override fun equals(other: Any?): Boolean {
        return when(other) {
            is Person -> name == other.name
            else -> false
        }
    }

    override fun toString(): String {
        return "$name"
    }
}