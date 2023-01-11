package com.yp.kotlin.belajar.oop.Class

// Penggunaan sealed Class
sealed class Operation(val name: String)

class Tambah : Operation("Tambah")
class Kurang : Operation("Kurang")