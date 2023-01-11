package com.yp.kotlin.belajar.oop.Class

interface Base{
    fun sayHello(name: String)
    fun upperWord(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun upperWord(name: String) {
        println(name.toUpperCase())
    }

}

// mendelegasikan sebuah interface dan class supaya bisa dipakai lagi
class DelegationBase(val name:Base) : Base by name