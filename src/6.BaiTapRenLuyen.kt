import kotlin.math.pow

fun main() {
//    GiaiPhuongTrinhBac2()
//    PhepToanNhapLieu()
//    TinhDaySoToanHoc()
    tamgiacA(10)
    tamgiacB(10)
    tamgiacC(10)
    hinhhocE(11)
}


/*
* Giải phương trình bậc 2
* */
fun GiaiPhuongTrinhBac2() {
    while (true) {
        println("Giải PT Bậc 2")
        var a: Double?
        var b: Double?
        var c: Double?
        print(" Nhập số a: ")
        a = readLine()?.toDouble()
        println()
        print(" Nhập số b: ")
        b = readLine()?.toDouble()
        println()
        print(" Nhập số c: ")
        c = readLine()?.toDouble()
        println()

        if (a == null || b == null || c == null) return

        var kq = giaiPTB2(a, b, c)
        println("$kq")
        println("Bạn có muốn tiếp tục ko? (y/n).")
        var s = readLine()
        if (s?.compareTo("n") == 0) break
    }
}

fun giaiPTB2(a: Double, b: Double, c: Double): String {
    if (a == 0.0) {
        // a = 0 -> Phương trình về phương trình bậc 1: bX + c = 0
        if (b == 0.0 && c == 0.0)
            return "Phương trình vô số nghiệm."
        if (b == 0.0 && c != 0.0)
            return "Phương trình vô nghiệm."

        var x = -c / b
        return "Nghiệm của PT là: $x"
    } else {
        //Giải phương trình bậc 2:
        //Tính Delta
        var delta = b * b - 4 * a * c
        if (delta < 0)
            return "Phương trình vô nghiệm."
        if (delta == 0.0) {
            var x = -b / (2 * a)
            return "Phương trình có nghiệm kép: x1=x2= $x"
        }

        var x1 = (-b - Math.sqrt(delta)) / (2 * a)
        var x2 = (-b + Math.sqrt(delta)) / (2 * a)
        return "Phương trình có hai nghiệm x1 = $x1 và x2 = $x2"
    }
}


/*
* Phép toán nhập liệu
* */
fun PhepToanNhapLieu() {
    var a: Double?
    var b: Double?
    var pt: Char?

    println("Nhập số a:")
    a = readLine()?.toDouble()
    println("Nhập số b:")
    b = readLine()?.toDouble()
    println("Nhập phép toán (+,-,*,/):")
    pt = readLine()?.get(0)

    if (a == null || b == null || pt == null) return

    when (pt) {
        '+' -> println("$a + $b = ${a + b}")
        '-' -> println("$a - $b = ${a - b}")
        '*' -> println("$a * $b = ${a * b}")
        '/' -> if (b == 0.0)
            println("Không chia được cho số 0.")
        else
            println("$a / $b = ${a / b}")
        else -> print("Phép nhập ko chính xác.")
    }
}

/*
* Dãy số toán học
*                  x^2          x^3                     x^n
* S(x,n) = x + _________ + __________ + ... + _____________________
*               1 + 2       1 + 2 + 3           1 + 2 + 3 + ... + n
* */

fun TinhDaySoToanHoc() {
    var x: Double?
    var n: Int?

    println("Nhập số x:")
    x = readLine()?.toDouble()
    println("Nhập số n:")
    n = readLine()?.toInt()

    if (n == null || x == null) return

    var s = 0.0
    var mau = 0.0
    for (i in 1..n) {
        mau += i
        s += (x.pow(i)) / mau
    }

    println("Tong Day so da cho S(x, n) = $s")
}


/*
* VẼ HÌNH TAM GIÁC
* */
//Vẽ hình tam giá
/* A,
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
* */
fun tamgiacA(so: Int) {
    for (i in so downTo 1) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

/* B,
* *
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* */
fun tamgiacB(so: Int) {
    for (i in 1..so) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

/* C,
* *
              *
            * *
          * * *
        * * * *
      * * * * *
    * * * * * *
  * * * * * * *
* * * * * * * *
* */
fun tamgiacC(so: Int) {
    for (i in so downTo 1) {
        for (j in 1..so) {
            if (j >= i) print("* ")
            else print("  ")
        }
        println()
    }
}

/* D,
*
* * * * * * * *
  * * * * * * *
    * * * * * *
      * * * * *
        * * * *
          * * *
            * *
              *
* */
fun tamgiacD(so: Int) {
    for (i in 1..so) {
        for (j in 1..so) {
            if (j >= i) print("* ")
            else print("  ")
        }
        println()
    }
}

/* E,
*
        * * * *
        *   *
        * *
        *
        *
      * *
    *   *
  * * * *
* */
fun hinhhocE(so: Int) {
//    if (so % 2 == 0) {
//        println("Vui lòng nhập vào số Lẻ")
//        return
//    }
    for (i in 0 until so) {
        for (j in 0 until so) {
            if (j == so / 2 || (j + i == so - 1) || (i == so - 1 && j <= so / 2) || (i == 0 && j >= so / 2)) print("* ")
            else print("  ")

        }
        println()
    }
}
