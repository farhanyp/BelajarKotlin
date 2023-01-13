package com.yp.kotlin.belajar.generic.Class

// Class generic tidak bisa diturunkan ke dalam super class Any
open class Invariant<T>(var name: T) {

}

//class Invariant2 (name: T): Invariant<T>(name){
//
//}