fun main() {
    try {
        chia(5, 0)
    } catch (e: java.lang.Exception) {
        println(e.message)
    } finally {
        println("Phep chia thanh cong.") //Luôn luôn được thực hiện
    }
}

fun chia(a: Int, b: Int): Int {
    if (b == 0) throw Exception("Mau so = 0. Khong chia duoc.")
    return a / b
}