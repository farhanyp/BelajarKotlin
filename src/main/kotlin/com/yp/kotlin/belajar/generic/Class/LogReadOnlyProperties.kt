package com.yp.kotlin.belajar.generic.Class

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LogReadOnlyProperties(val name: String): ReadOnlyProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Mengambil data properti ${property.name} yaitu $name ")
        return name.toLowerCase()
    }
}

class NameWithLog(val param: String){
    val name : String by LogReadOnlyProperties(param)
}