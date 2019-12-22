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

    when(tuoi){
        in 1..5 -> println("Tuổi thiếu nhi")

    }
}