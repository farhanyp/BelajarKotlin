package com.yp.kotlin.belajar.generic.Class

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LogReadWriteProperties(var name: String): ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Get value ${property.name}")
        return name
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("Set value ${property.name} from $name to $value")
        name = value
    }
}

class Person(var param: String){
    var data: String by LogReadWriteProperties(param)
}