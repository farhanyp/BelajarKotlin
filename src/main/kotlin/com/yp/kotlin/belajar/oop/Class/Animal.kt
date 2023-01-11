package com.yp.kotlin.belajar.oop.Class


// Mencoba Super Constructor dan juga secondary Constructur
open class Animal(var name: String, val species: String?, val DateIn: String?) {

    constructor(name: String, species: String?) : this(name, species, null){
    }

    constructor(name: String) : this(name, null){
    }

    open fun Hello(name : String){
        this.name = name
        println("Ini Constructor yang memiliki name: ${this.name} species: ${this.species} date in: ${this.DateIn} ")
    }
}

class Land : Animal {
    constructor(name: String) : super(name,null,null){
//        println("Ini Constructor yang memiliki name: ${this.name} species: ${this.species} date in: ${this.DateIn} ")
    }
//    constructor() : super("")

    fun Says() {
        println("Ini Constructor yang memiliki name: ${this.name} species: ${this.species} date in: ${this.DateIn} ")
    }

}