package com.yp.kotlin.belajar.generic.Class

interface Hello{
    fun sayHello(name:String)
}

open class Employee

class VicePresident : Employee()

class Manager: Employee()

// Class Company hanya menerima object dari class Employee (Generic Constrain)
class Company<T: Employee>(val name: T): Employee(), Hello{
    override fun sayHello(name: String) {

    }
}

// Class Office hanya menerima object dari class Employee dan juga dari interface Hello dengan mengguankan keyword Where (Generic Constrain)
class  Office <T>(val name: T) where T: Employee, T: Hello