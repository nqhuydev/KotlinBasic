fun main() {
    // Tháng thuốc Quí
    var month: Int?
    println("Nhập vào tháng cần tính: ")
    month = readLine()?.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng $month thuộc quí 1.")
        4, 5, 6 -> println("Tháng $month thuộc quí 2.")
        7, 8, 9 -> println("Tháng $month thuộc quí 3.")
        10, 11, 12 -> println("Tháng $month thuộc quí 4.")
        else -> println("Số tháng nhập không hợp lệ.")
    }


    // Tính độ tuổi
    println("Tính độ tuổi, nhập tuổi cần tính: ")
    var tuoi: Int? = 0
    var s: String? = readLine()
    if (s != null)
        tuoi = s.toInt()

    when (tuoi) {
        in 1..5 -> println("Tuổi thiếu nhi")
        in 6..15 -> println("Tuổi nhi đồng")
        in 16..21 -> println("Tuổi thiếu niên")
        in 22..30 -> println("Tuổi thanh niên")
        in 30..45 -> println("Tuổi trung niên")
        !in 1..100 -> println("Vui lòng nhập đúng số tuổi")
        else -> println("Già lắm rồi")
    }


    //Tính trong khoảng - Tính điểm thi demo
    println("Nhập số điểm bạn có: ")
    var diem: Double? = 0.0
    val sdiem: String? = readLine()
    if (sdiem != null) diem = sdiem.toDouble()
    if (diem != null) {
        when (diem) {
            in 0.0..4.9 -> println("Học lực YẾU")
            in 5.0..6.4 -> println("Học lực TRUNG BÌNH")
            in 6.5..7.9 -> println("Học lực KHÁ")
            in 8.0..9.4 -> println("Học lực GIỎI")
            in 9.5..10.0 -> println("Học lực XUẤT XẮC")
            else -> println("Vui lòng nhập đúng điểm")
        }
    }


    // Trả luôn về kết quả cho biến
    var x : Int = 2
    var kq = when(x){
        2 -> 100
        else -> 101
    }
    println("KQ = $kq")


    // Sử dụng biểu thức giống như If, ko cần sử dụng (expression)
    var y :Int = 100
    when{
        y%2 == 0 -> println("$y là số chẵn")
        y%2 != 0 -> println("$y là số lẻ")
    }


}