import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.timer

fun main() {
    var calendar = Calendar.getInstance() // Lấy Calendar hiện tại
    var year = calendar.get(Calendar.YEAR)
    var month = calendar.get(Calendar.MONTH) // MONTH chạy từ 0
    var day = calendar.get(Calendar.DAY_OF_MONTH)
    println("$day, ${month + 1}, $year")

    // Lấy cả ngày tháng năm
    var date = calendar.time
    println(date)
    var df =
        SimpleDateFormat("dd/MMM/yyyy, hh:mm:ss aaa")  // h - định dạng 12h, còn H - 24 h. m - định dạng phút, còn M - định dạng tháng
    // aaa- AM hay PM tự động xuất
    // MMM - tháng thành chữ sỗ
    println(df.format(date))
    tinhtuoi()

}

/*
* Ví dụ: Nhập ngày tháng năm sinh rồi tính ra tuổi
* */

fun tinhtuoi() {
    val df = SimpleDateFormat("dd/MM/YYYY")
    println("Nhap vao ngay thanh nam sinh (dd/MM/yyyy): ")
    val s = readLine()
    if (s == null) return
    val timeBirthday = df.parse(s)
    val birthday = Calendar.getInstance()
    birthday.time = timeBirthday
    val now = Calendar.getInstance()

    var yearBirthday = birthday.get(Calendar.YEAR)
    var yearNow = now.get(Calendar.YEAR)
    println("Tuoi cua ban tinh den hiện tại là : ${yearNow - yearBirthday}")

}