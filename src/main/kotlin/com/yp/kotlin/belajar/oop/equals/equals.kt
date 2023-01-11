package com.yp.kotlin.belajar.oop.equals

import com.yp.kotlin.belajar.oop.Class.Mangkok

fun main(){
    val burung = Mangkok("burung")
    val elang = Mangkok("burung")
    val macam = Mangkok("Macan")

//    sekarang function == dan != telah diubah dan dioverride ke dalam fungsi mangkok
    println(burung == macam) // hasilnya false karena name dari properties class yang dimasukan beda
    println(burung == elang) // hasilnya true karena name dari properties class yang dimasukan sama
}