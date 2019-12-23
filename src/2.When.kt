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
    when (diem) {
        in 0.0..4.9 -> println("Học lực YẾU")
        in 0.0..4.9 -> println("Học lực YẾU")
        in 0.0..4.9 -> println("Học lực YẾU")
        in 0.0..4.9 -> println("Học lực YẾU")
        in 0.0..4.9 -> println("Học lực YẾU")
        else -> println("Vui lòng nhập đúng điểm")
    }
}