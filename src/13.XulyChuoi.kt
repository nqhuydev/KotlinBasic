fun main() {
    demoChuoiStringBuilder()
    chuoiTrongKotlin()
    trichLoc()
    doiChuoi()
    xoaKhoangTrang()
    soSanhChuoi()
    noiChenChuoi()
    tachChuoi()
    baitapTachChuoi()
//    kiemtrachuoiPanlynDrome()
    toiUuChuoi()
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
* index
* */
private fun chuoiTrongKotlin() {
    //Khai báo
    var s: String = "Nguyen Huy" // Chuỗi s quản lý ký tự đầu tiên "N"
    println(s)
    println("Chiều dài chuỗi: ${s.length}")
    for (i in s) {
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

/*
* Trích lọc chuỗi: substring()
* */

private fun trichLoc() {
    var s = "Nguyen Quoc Huy"
    println(s.substring(7)) // từ vị trí đc chọn đến cuối cùng
    println(s.substring(0, 7))
}

/*
* Thay đổi chuỗi: replace()
* */

private fun doiChuoi() {
    var s = "Nguyen Quoc Huy"
    s = s.replace("Quoc ", "", true) //biến true để không phân biệt hoa thường
    println(s)

    var newS = "huy xin chao Huy"
    newS = newS.replaceFirst("Huy", "Ong", true) // replaceFirst() : Chỉ đổi chuỗi đầu tiên được tìm thấy
    println(newS)
}

/*
* Xóa khoảng trắng: trim(), trimStart(), trimEnd()
* */
private fun xoaKhoangTrang() {
    var s = "   Nguyen Quoc Huy     "
    println(s.trimStart())
    println(s.trimEnd())
    println(s.trim())
}

/*
* So sánh chuỗi: compareTo(), compareToIgnoreCase()
* */
private fun soSanhChuoi() {
    var s1 = "Nguyen Huy"
    var s2 = "Nguyen huy"
    val x = s1.compareTo(s2, false)// không phân biệt chữ hoa chữ thường
    println("$x")
    val y = s1.compareTo(s2, true)// không phân biệt chữ hoa chữ thường
    println("$y")

    /*
    * x = 0 : hai chuỗi bằng nhau
    * x > 0 : s1 > s2
    * x < 0 : s1 < s2
    */
}

/*
* Nối chèn chuỗi: builder.append(), s.plus(),  +
* */

private fun noiChenChuoi() {
    var s1 = "Xin Chao!"
    var s2 = "Nguyen huy"
    // Bằng plus
    println(s1.plus(" ").plus(s2))
    // Bằng StringBuilder
    var builder = StringBuilder(s1)
    println(builder.append(" ").append(s2).insert(0, "Bat Dau!").toString())

    // Bằng + truyền thống
    println(s1 + " " + s2)
}

/*
* Tách chuỗi: split(): Thành mảng chuỗi
* Đổi chữ Hoa - Thường
* */

private fun tachChuoi() {
    val name = "Nguyen Quoc Huy"
    var arr = name.split(" ")
    for (s in arr) {
        println(s.toLowerCase())// Biến toàn bộ thành chữ thường
        println(s.toUpperCase())// Biến toàn bộ thành chữ hoa
    }
}

/*
* Bài tập Tách chuỗi
* */

private fun baitapTachChuoi() {
    var s = "D:/me/music/download/ring.mp3"
    var tach = s.split("/")
    println("Cách 1: " + tach[tach.size - 1])
    println("Cách 2: " + s.substring(s.lastIndexOf("/") + 1))

    println("Lấy mỗi tên: " + s.substring(s.lastIndexOf("/") + 1, s.indexOf(".")))
}

/*
* Kiểm tra chuỗi: PanlynDrome (Đảo ngược chuỗi vẫn bằng chính nó)
* */

private fun kiemtrachuoiPanlynDrome() {
    while (true) {
        println("Nhập vào chuỗi đểm kiểm tra(Panlyndrome):")
        var s = readLine()
        if (s == null) return

        if (s.compareTo(s.reversed(), true) == 0) println("Là chuỗi Panlyndrome.")
        else println("Không phải là chuỗi Panlyndrome.")

        println("Bạn có muốn chơi tiếp không (c/k)?")
        val c = readLine()
        if (c == null || c.compareTo("k", true) == 0) break
    }

    println(cach2KiemtraChuoiPanlynDrome("madam"))
}

private fun cach2KiemtraChuoiPanlynDrome(s: String): Boolean {
    for (i in s.indices) {
        if (s[i] != s[s.length - 1 - i]) {
            return false
        }
    }
    return true
}

/*
* Bài tập tối ưu chuỗi
* */

private fun toiUuChuoi() {
    var chuoi = "  NguyEn    quOC    HUy     "
    var arr = chuoi.trim().split(" ")
    var finally = ""
    for (word in arr) {
        if (word.isNotEmpty()){
            var newWord = word.toLowerCase()
            finally+= newWord.replaceFirst(newWord[0], newWord[0].toUpperCase()).plus(" ")
        }
    }
    println(finally)
}