fun main() {
    demoChuoiStringBuilder()
    chuoiTrongKotlin()
}

/*
* StringBuilder:
* Khởi tạo:
* - StringBuilder(): Mặc định. tạo ra đối tượng có thể lưu trữ được 16 ký tự
* - StringBuilder(int capacity): giới hạn capacity ký tự
* - StringBuilder(String s): cho trước 1 chuỗi và lấy thông tin từ chuỗi đó
*
* Phương thức:
* - append() : nối chuỗi
* - insert() : chèn chuỗi
* - delete() :  xóa
* - reverse() : đảo chuỗi
* */

private fun demoChuoiStringBuilder() {
    val chuoi = StringBuilder("Nguyễn Huy")
    println(chuoi)

    chuoi.insert(7, "Quốc ")
    println(chuoi)

    chuoi.append(" Bố Em Ong")
    println(chuoi)

    chuoi.delete(6, 11)
    println(chuoi)

    chuoi.reverse()
    println(chuoi)
}
/*
* Chuỗi trong Kotlin: String: là chuỗi các ký tự, trong Kotlin là lớp quản lý dữ liệu dạng văn bản
* Nên khai báo kiểu dữ liệu cho biến để đỡ mất thời gian nội suy
*
* */
private fun chuoiTrongKotlin(){
    //Khai báo
    var  s : String = "Nguyen Huy" // Chuỗi s quản lý ký tự đầu tiên "N"
    println(s)
    println("Chiều dài chuỗi: ${s.length}")
    for (i in s){
        print("$i \t")
    }
    println()


    /* Các hàm tìm chuỗi */
    // Tìm vị trí của ký tự có trong chuỗi ( ký tự đầu tiên được tìm thấy). không tìm thấy trả về -1
    println("${s.indexOf("H")}")
    // Tìm vị trí của ký tự trong chuỗi (Ký tự cuối cùng được tìm thấy) . không tìm thấy trả về -1
    println("${s.lastIndexOf("y")}")
    // Kiểm tra xem một chuỗi có nằm trong chuỗi kia không
    if (s.contains("huy", true)) println("Có") else println("Không") // true: không phân biệt chữ hoa hay chữ thường

}