package com.yp.kotlin.belajar.fundamental

fun main(){
    var firstname: String = "Farhan"
    var lastname: String = "Yp"

    // tanpa Trim Margin
    var fullname: String = """
    Farhan
    Yudha
    Pratama
    """

    // Menggunakan Trim Margin
    var fullname2: String = """
    |Farhan
    |Yudha
    |Pratama
    """.trimMargin()

    // Menggunakan Trim Margin Costum
    var fullname3: String = """
    >Farhan
    >Yudha
    >Pratama
    """.trimMargin(">")

    // Menggunakan String Template
    var fullname4 : String = "$firstname $lastname"
    var fullname5 : String = "banyak char dari $fullname4 adalah ${fullname4.length}"

    print(firstname)
    print(lastname)
    println(fullname)
    println(fullname2)
    println()
    println(fullname3)
    println()
    println(fullname4)
    println()
    println(fullname5)
}