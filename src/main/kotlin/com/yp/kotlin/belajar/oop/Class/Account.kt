package com.yp.kotlin.belajar.oop.Class

import kotlin.properties.Delegates

// Memakai properti delegasi yaitu lazy
class Account(desc: String) {
    val name : String by lazy {
        println(" Lazy Called")
        "farhan"
    }

    // Memakai properti delegasi yaitu observable
    var desc : String by Delegates.observable(desc) {
        property, oldValue, newValue -> println("$property from $oldValue to $newValue")
    }
}