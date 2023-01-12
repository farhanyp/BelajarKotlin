package com.yp.kotlin.belajar.generic.Contravariant

import com.yp.kotlin.belajar.generic.Class.Contravariant

fun main(){

    val ContravariantAny: Contravariant<Any> = Contravariant<Any>()
    ContravariantAny.sayHello("Farhan")

    val ContravariantString: Contravariant<String> = ContravariantAny
    ContravariantString.sayHello("Yp")

//    ContravariantAny.getHello()

}