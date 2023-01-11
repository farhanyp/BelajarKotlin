package com.yp.kotlin.belajar.oop.Exception

import com.yp.kotlin.belajar.oop.Class.Exception.ValidatonException

// menggunakan kostum exception
fun Validation ( name: String){
    if (name.isBlank()){
        throw ValidatonException("Kosong bang")
    }else{
        println(name)
    }
}

fun main(){
//    Menggunakan Try Catch
    try {
        Validation("yp")
        Validation("")
    }catch (error: ValidatonException){
        println("Error with message: $error")
    }catch (error: Throwable){
        println("Error with message: $error")
    }finally {
        println("Program selesai")
    }
}