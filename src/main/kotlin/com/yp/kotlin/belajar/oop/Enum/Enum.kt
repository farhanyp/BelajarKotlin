package com.yp.kotlin.belajar.oop.Enum

import com.yp.kotlin.belajar.oop.Class.Genders

fun main(){

//    Pemakaian data dari enum
    val man = Genders.Male
    val woman = Genders.Female
//    val allGenders : Array<Genders> = Genders.values()

//    Dari string menjadi object
//    val manFromString = Genders.valueOf("Male")


//    println(man)
//    println(woman)
//    println(manFromString)
//    println(allGenders.toList())

    man.showDesc()
    woman.showDesc()

}