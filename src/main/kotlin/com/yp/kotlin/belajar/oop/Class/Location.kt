package com.yp.kotlin.belajar.oop.Class

// membuat abstrack class, properti dan juga function
abstract class Location(){
    abstract val name: String
    abstract fun walk()
}

class City(): Location(){
    override val name: String = "Medan"
    override fun walk() {
        println("$name City")
    }

}