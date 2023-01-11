package com.yp.kotlin.belajar.oop.Class

open class Gelas(val name: String)

class Piring(name: String, ukuran: Int):Gelas(name)

class Mangkok(name: String) : Gelas(name) {

//    Mengoverride fungsi bawaan class any yaitu toString
//    override fun toString(): String{
//        return "Ini fungsin toString"
//    }

//    Mengoverride fungsi bawaan class any yaiut equal
//    override fun equals(other: Any?): Boolean {
//        return when(other){
//            is Mangkok -> other.name == this.name
//            else -> false
//        }
//    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}