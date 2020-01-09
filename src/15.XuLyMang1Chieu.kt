import kotlin.random.Random

fun main() {
//    demo()
    locTimKiemDuLieu()
}

private fun demo() {
    var mang = IntArray(10)
    for (i in mang.indices)
        mang[i] = Random.nextInt(100)
    println("Mang sau khi thêm giá trị vào ô nhớ.")
    for (i in mang) println(i)
    println("Mang sau khi thêm giá trị vào ô nhớ.")
    for (i in mang.indices) println(mang[i])

    println("Max = ${mang.max()}")
    println("Min = ${mang.min()}")
}

/*
* Filter(): Lọc , tìm kiểu dữ liệu
* */

private fun locTimKiemDuLieu() {
    val mang = IntArray(10)
    for (i in mang.indices)
        mang[i] = Random.nextInt(100)
    for (so in mang) print("$so\t")
    println()
    val dsChan = mang.filter { item -> item % 2 == 0 }
    println("Các số chẵn: $dsChan")
    val dsLe = mang.filter { item -> item % 2 != 0 }
    println("Các số lẻ: $dsLe")
}