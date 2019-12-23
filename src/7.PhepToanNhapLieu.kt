fun main() {
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
        '/' ->  if (b == 0.0)
                    println("Không chia được cho số 0.")
                else
                    println("$a / $b = ${a / b}")
        else -> print("Phép nhập ko chính xác.")
    }
}