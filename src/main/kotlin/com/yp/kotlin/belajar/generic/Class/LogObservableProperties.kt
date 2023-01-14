package com.yp.kotlin.belajar.generic.Class

import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperties<T>(val data: T): ObservableProperty<T>(data) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before Change $data")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After Change $newValue")

    }
}

class Car(brand: String, years: Int){
    var brand: String by LogObservableProperties(brand)
    var years: Int by LogObservableProperties(years)
}