package com.yp.kotlin.belajar.oop.Class

//class Car(Merk: String = "",
//          Age: Int = 0) {
//
////    Penggunaan Initialization block
//    init {
//        println("$Merk Dibuat")
//    }
//
//    var merk: String = Merk
//    var age: Int = Age
//}

// Class dengan menggunakan properties di constructor
class Car(var Merk: String = "",
          var Age: Int = 0) {

    //    Penggunaan Initialization block
    init {
        println("$Merk Dibuat")
    }
}