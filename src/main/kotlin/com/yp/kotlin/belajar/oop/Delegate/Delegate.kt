package com.yp.kotlin.belajar.oop.Delegate

import com.yp.kotlin.belajar.oop.Class.DelegationBase
import com.yp.kotlin.belajar.oop.Class.MyBase

fun main(){

    val base = MyBase()

    val Delegate = DelegationBase(base)
    Delegate.sayHello("Yp")
    Delegate.upperWord("farhan")

}