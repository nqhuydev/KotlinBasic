fun main() {
    // Câu lệnh điều kiện If trong Kotlin
    println("Tính năm nhuận, Vui lòng nhập số năm: ")
    var year: Int?
    year = readLine()?.toInt()
    if (year != null) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            println("Năm $year là năm nhuận.")
        } else {
            println("Năm $year không phải là năm nhuận")
        }
    }

    // Cách viết khác trong Kotlin

    println("Nhập số năm: ")
    year = readLine()?.toInt()
    if (year != null){
        if ((year.rem(4) == 0 && year.rem(100) != 0 )|| year.rem(400) == 0){
            println("Năm $year là năm nhuận.")
        } else {
            println("Năm $year không phải là năm nhuận")
        }
    }
}