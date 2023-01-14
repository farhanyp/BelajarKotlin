package com.yp.kotlin.belajar.fundamental

// Function tanpa parameter
fun hello(){
    println("Hello World")
}

// Function terdapat parameter
fun hello1(firstName: String, lastName: String){
    println("Hello $firstName $lastName")
}

// Function terdapat default parameter
fun hello2(firstName: String, lastName: String = "YP"){
    println("Hello $firstName $lastName")
}

// Funtion terdapat named argument
fun hello3(firstName: String, middleName: String, lastName: String){
    println("Hello $firstName $middleName $lastName")
}

// Unit Returning Function / mengembalikan default nilai yaitu unit
fun hello4(): Unit{
    println("Hello World")
}

// Unit Returning Function / mengembalikan default nilai yaitu unit
fun hello5(): Unit = println("Hello World")


// Return Function
fun sum(a: Int, b: Int): Int{
    if(b == 0){
        return 0
    }else{
        var total = a + b
        return total
    }
}

// Parameter varargs
fun hitungTotal(vararg values: Int): Int{
    var total = 0

    for(value in values){
        total += value
    }

    return total
}

// Extension Function
fun String.sapa(): Int = this.length

// Infix Notation
infix fun Int.kali2(type: Int): Int{
    if (type == 2) {
        return this*2
    }else{
        return this
    }
}

// return if & when
fun sayhello(sapa: String = ""): String{

    return when(sapa){
        "" -> "hello gaes"
        else -> "hello $sapa"
    }

    // Pakai return if
    // return if(sapa == ""){
    //     "hello gaes"
    // }else{
    //     "hello $sapa"
    // }
}

// Recursive Function
fun faktorial(value: Int): Int{

    return when(value){
        1 -> 1
        else -> value * faktorial(value-1)
    }
}

// Tail Recursive Function
tailrec fun faktorialTail (value: Int, total: Int = 1): Int{

    return when(value){
        1 -> total
        else -> faktorialTail(value -1, total*value)
    }
}

// Anonymous Function
val anony = fun(value: String): String{
    if(value.isBlank()){
        return "ups"
    }
    return value.toUpperCase()
}
fun main(){

    // hello()
    // hello1("Farhan", "Yp")
    // hello2("Farhan")
    // hello3(middleName = "Yudha", lastName = "Pratama", firstName = "Farhan")
    // hello4()
    // println(sum(1, 2))
    // hello5()
    // println(hitungTotal(10,10,10,10))
    // println("Farhan".sapa())
    // var result = 5 kali2 3
    // println(result)
    // println(sayhello("TOD"))
    // println(faktorial(5))
    // println(faktorialTail(4))
    println(anony("hello"))

}