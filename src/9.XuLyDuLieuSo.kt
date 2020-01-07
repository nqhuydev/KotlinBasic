import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

fun main() {
    lamtronso()
    dinhdangtiente()
}

// Làm tròn số
fun lamtronso() {
    var d: Float = 10.0f / 3.0f
    println(d)
    println("%.2f".format(d))
}

// Định dạng số thành tiền tệ
fun dinhdangtiente() {
    var x = 92348234534
    var dcf = DecimalFormat("#,###") // Định dạng mặc định
//    var dcfs = DecimalFormatSymbols(Locale.getDefault())
//    dcfs.groupingSeparator = "."[0]// đặt lại dấu ngăn cách
//    dcf.decimalFormatSymbols = dcfs // Đặt lại dấu
    println(x)
    println(dcf.format(x))
}