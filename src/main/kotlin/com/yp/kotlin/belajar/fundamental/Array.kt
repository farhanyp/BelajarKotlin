fun main(){
    val names: Array<String> = arrayOf("YP","Maman")

    // Size untuk mengetahui panjang array
    println(names.size)

    // Untuk mengakses array
    println(names[0])

    // Untuk mengubah array
    names[1] = "Racing"

    println(names[1])

    // Array dengan menggunakan nullable
    val numbers: Array<Int?> = arrayOfNulls(5)

    numbers[0] = 1
    numbers[1] = 2
    numbers[2] = 3

    println()
    println(numbers[3])
}