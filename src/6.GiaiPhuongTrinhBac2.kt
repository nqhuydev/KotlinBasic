fun main() {
    while (true){
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