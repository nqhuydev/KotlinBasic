fun main() {
    try {
        chia(5, 0)
    } catch (e: java.lang.Exception) {
        e.printStackTrace()//nên dùng in màn hình như thế này để biết lỗi ở đâu
    } finally {
        println("Phep chia thanh cong.") //Luôn luôn được thực hiện
    }
}

fun chia(a: Int, b: Int): Int {
    if (b == 0)
        throw Exception("Mau so = 0. Khong chia duoc.") // ném thông báo lỗi ra ngoài để thông báo
    return a / b
}