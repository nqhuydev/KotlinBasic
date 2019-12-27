import kotlin.math.pow

fun main() {
    println("${TimUCLN(0, 8)}")
    KiemTraSoHoanThien(28)
    KiemTraChuSoChan(424)
    TinhBieuThucS(1.0, 1)
    println("${GiaiThua(3)} va ")
}

/*
* Nhập vào số a, b nguyên dương: Tìm Ước số chung lớn nhất
* */
private fun TimUCLN(a: Int, b: Int): Int {
    if (a == 0 || b == 0) {
        return a + b
    } else {
        var min = if (a < b) a else b
        var ucln = 1
        for (i in min downTo 2) {
            if (a % i == 0 && b % i == 0) {
                ucln = i
                break
            }
        }
        return ucln
    }
}

/*
* Nhập vào số a nguyên dương: Kiểm tra xem số a có phải là số hoàn thiện hay không
* (số hoàn thiện là số có tổng các ước số (trừ chính nó) bằng nó)
* */
private fun KiemTraSoHoanThien(a: Int) {
    var tong = 0
    for (i in 1..a) {
        if (a % i == 0) {
            if (i == a) break
            tong += i
        }
    }
    if (tong == a) println("So $a là số hoàn thiện.")
    else println("So $a không phải là số hoàn thiện.")
}

/*
* Nhập vào số a nguyên dương. Kiểm tra xem số a có các chữ số toàn là số chẵn hay không
* */

private fun KiemTraChuSoChan(a: Int) {
    var s = a.toString()
    var dem = 0
    for (i in s) {
        if (i.toInt() % 2 == 0) dem++
    }
    if (dem == s.length) println("Số $a có các chữ số toàn là số chẵn.")
    else println("Số $a có các chữ số chẵn và lẻ.")
}

/*
*                                           x^3         x^5                x^(2n + 1)
* Nhập vào số x và n tính: S(x, n) = x + _________ + _________ + ... +  ______________
*                                           3!          5!                 (2n + 1)!
* */

fun TinhBieuThucS(x: Double, n: Int) {
    var tong = 0.0
    for (i in 0..n) {
        var so = 2 * i + 1
        tong += (x.pow(so)) / GiaiThua(so)
    }
    println("S($x, $n) = $tong")
}

private fun GiaiThua(so: Int): Int {
    var gt = 1
    for (i in 2..so) {
        gt *= i
    }
    return gt
}