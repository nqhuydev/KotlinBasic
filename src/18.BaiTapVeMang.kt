import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
//    BaiTapVeMang()
//    mangSoNgauNhienKhongTrungNhau()
//    nhapSoTangDan()
//    sapXepDaySoThuc()
    baiToanVoiMang()
}


/*
* Mảng
* */
private fun BaiTapVeMang() {
    println("Nhập vào số lượng phần tử N: ")
    val s = readLine() ?: return
    val n = s.toInt()
    val mang = IntArray(n)
    for (i in mang.indices) {
        mang[i] = (0..100).random()
    }
    mang.forEach { print("$it\t") }
    println()
    println("Tổng các rối trong mảng: ${mang.sum()}")
    println("Nhập số K và tìm xem K xuất hiện bao lần: ")
    val k = readLine()?.toInt()
    var dem = 0
    val mangCoK = mang.filter { it == k }
    println("Trong mảng N có ${mangCoK.size} số $k")

    println("Phần tử lớn nhất trong mang: ${mang.max()}")
    println("Phần tử nhỏ nhất trong mang: ${mang.min()}")

    print("Các số nguyên tố có trong mảng: ")
    mang.forEach { if (kiemtraSoNguyenTo(it)) print("$it\t") }
    println()

    mang.sort()
    println("Mảng sắp xếp tăng dần: ")
    mang.forEach { print("$it\t") }
    println()

    mang.sortDescending()
    println("Mảng sắp xếp giảm dần: ")
    mang.forEach { print("$it\t") }
    println()
}

private fun kiemtraSoNguyenTo(so: Int): Boolean {
    if (so < 2) return false
    val half = sqrt(so.toDouble()).toInt()
    for (i in 2..half) {
        if (so % i == 0) return false
    }
    return true
}

/*
* Nhập mảng có N phần tử , giá trị các phần tử được Random ngẫu nhiên mà không trùng giá trị.
* N <= Max khoảng giá trị cần Random
*
*
* */
private fun mangSoNgauNhienKhongTrungNhau() {
    println("Nhập vào số N các phần tử, các phần tử sẽ có giá trị trong khoảng (0..100):")
    val n = readLine()?.toInt() ?: return
    val mang = IntArray(n)
    mang.forEachIndexed { index, _ -> mang[index] = checkTrungLap(getRandom(), mang) }
    mang.forEach { print("$it\t") }
    println()
}

private fun checkTrungLap(so: Int, array: IntArray): Int {
    var soNew = so
    while (true) {
        if (array.contains(soNew)) {
            soNew = getRandom()
        } else {
            break
        }
    }
    return soNew
}

private fun getRandom(): Int {
    return (0..100).random()
}

/*
* CHương trình nhập vào 1 dãy các số theo thứ tự tăng, nhập sai quy cách thì yêu cầu nhập lại
* In dãy số ra khi xong
* */

private fun nhapSoTangDan() {
    println("Nhập vào N kích thước của dãy số: ")
    val n = readLine()?.toInt() ?: return
    println("Nhập vào từng phần tử cho dãy số trên theo thứ tự tăng dần.")
    val arr = IntArray(n)
    arr.forEachIndexed lit@{ index, _ ->
        loop@ while (true) {
            println("Nhập vào giá trị của vị trí $index: ")
            val tmp: Int = readLine()?.toInt() ?: return@lit
            if (index == 0) {
                arr[index] = tmp
                break@loop
            }
            if (tmp >= arr[index - 1]) {
                arr[index] = tmp
                break@loop
            } else {
                println("Vui lòng nhập lại.")
            }
        }
    }

    arr.forEachIndexed { index, value -> print("$index: $value\t") }
    println()
}

/*
* Chương trình nhập vào N số thức từ bàn phím và sắp xếp chúng. In ra kết quả nhận được
* */

private fun sapXepDaySoThuc() {
    println("Nhập vào N kích thước của dãy số: ")
    val n = readLine()?.toInt() ?: return
    val arrDouble = DoubleArray(n)
    for (i in arrDouble.indices) {
        arrDouble[i] = Random.nextDouble(1.0) * 10
    }
    arrDouble.forEachIndexed { index, value -> print("[$index, $value]") }
    println()

    println("Dãy số đã sắp xếp tăng dần: ")
    arrDouble.sort()
    arrDouble.forEachIndexed { index, value -> print("[$index, $value]") }
    println()

    println("Dãy số đã sắp xếp giảm dần: ")
    arrDouble.sortDescending()
    arrDouble.forEachIndexed { index, value -> print("[$index, $value]") }
    println()
}

/*
* Nhập vào một mảng rồi làm các phép toán bằng filter()
* */

private fun baiToanVoiMang() {
    println("Nhập vào kích thước của mảng số nguyên: ")
    val n = readLine()?.toInt() ?: return
    val arrSoTuNhien = IntArray(n)
    for (i in arrSoTuNhien.indices) {
        arrSoTuNhien[i] = (0..100).random()
    }
    arrSoTuNhien.forEach { print("$it\t") }
    println()

    val dsSoLe = arrSoTuNhien.filter { it % 2 != 0 }
    println("Danh sách có ${dsSoLe.size} số chẵn: $dsSoLe")

    val dsSoChan = arrSoTuNhien.filter { it % 2 == 0 }
    println("Danh sách có ${dsSoChan.size} số lẻ: $dsSoChan")

    val dsSoNguyenTo = arrSoTuNhien.filter {
        kiemtraSoNguyenTo(it)
    }
    println("Danh sách có ${dsSoNguyenTo.size} nguyên tố: $dsSoNguyenTo")


    val dsSoKhongPhaiLaSoNguyenTo = arrSoTuNhien.filter { !kiemtraSoNguyenTo(it) }
    println("Danh sách có ${dsSoKhongPhaiLaSoNguyenTo.size} không phải là số nguyên tố: $dsSoKhongPhaiLaSoNguyenTo")
}