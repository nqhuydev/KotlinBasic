fun main() {
    /*
    * Vòng lặp vĩnh cửu. Kiểm tra biểu thức xogn mới thực hiện câu lệnh
    * break: thoát vòng lặp chứa nó
    * continue: Nhảy nhanh qua vòng lặp kế tiếp, bỏ qua các câu lệnh sau nó
    * Vòng lặp while có thể không được gọi lần nào
    */

    //Ví dụ: Tính giai thừa

    while (true) {
        println("Nhập giá trị cần tính giai thừa: ")
        var gt = 1
        var n: Int? = null
        n = readLine()?.toInt()
        if (n == null) return
        var i = 1
        while (i <= n) {
            gt *= i
            i++
        }
        println("$n! = $gt")
        print("Bạn có muốn tính số khác không? (c/k)")
        var s: String? = readLine()
        if (s?.compareTo("k", true) == 0) break
    }
}