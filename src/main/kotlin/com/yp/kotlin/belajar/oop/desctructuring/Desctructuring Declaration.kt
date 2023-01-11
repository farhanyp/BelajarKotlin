package com.yp.kotlin.belajar.oop.desctructuring

import com.yp.kotlin.belajar.oop.Class.Games
import com.yp.kotlin.belajar.oop.Class.Login
import com.yp.kotlin.belajar.oop.Class.Minmax
import javax.security.sasl.AuthorizeCallback

// Menggunakan destructuring Declaration pada function
fun minmax(value1: Int, value2: Int) : Minmax {
    return when{
        value1 > value2 -> Minmax(value1, value2)
        else -> Minmax(value1, value2)
    }
}

// Menggunakan destructuring Declaration pada lambda
fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main(){

//    val game = Games("Batman", 1_000_000)
//    val (name, price) = game
//
//    println(name)
//    println(price)

//    val (min, max) = minmax(10, 1)
//    println(min)
//    println(max)

    val Login = Login("yp", "123")
    println( login(Login) { (username, password)->
        username == "yp" && password == "123"
    })


}