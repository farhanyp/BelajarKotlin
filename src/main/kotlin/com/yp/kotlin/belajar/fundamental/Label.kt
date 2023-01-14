package com.yp.kotlin.belajar.fundamental

// Penggunaan label
fun label(){

    loopi@ for(i in 1..10){
        loopj@ for(j in 1..10){
            println("$i x $j")
            if(j == 5){
                break@loopi
            }
        }
    }

}

fun main(){

    label()
}