package com.yp.kotlin.belajar.generic.Constrain

import com.yp.kotlin.belajar.generic.Class.Company
import com.yp.kotlin.belajar.generic.Class.Employee
import com.yp.kotlin.belajar.generic.Class.Office
import com.yp.kotlin.belajar.generic.Class.VicePresident

fun main(){


    val data1 = Employee()
    val data2 = VicePresident()
    val data3 = Company(data1)
    val data4 = Company(data2)
//    val data5 = Company("String") // Error karena hanya boleh menerima data dari object Employee
    val data6 = Office(data4)
//    val data7 = Office(data2) // Error karena tidak menerima object dari interface Hello

}