fun main() {
    /*
    * Vòng lặp Do-While thực hiện xong câu lệnh xong mới kiểm tra điều kiện
    * Vòng lặp ít nhất được thực thi câu lệnh 1 lần
    * break: Thoát vòng lặp chứa nó
    * continue: Nhảy nhanh qua vòng lặp kế tiếp, bỏ qua các câu lệnh sau nó
    * Ví dụ: Tính giai thừa
    */

    var gt = 1
    var so = 5
    var i = 1
    do {
        gt *= i
        i++
    }while (i <= so)
    println("$so! = $gt")

}