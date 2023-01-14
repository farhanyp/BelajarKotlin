package com.yp.kotlin.belajar.generic.GenericExtentionFunction

class Data<T>(val data: T)

fun Data<String>.print(){
    val value = this.data
    println(value)
}
fun main(){

    val data1 = Data<String> ("Farhan")

    data1.print()

}