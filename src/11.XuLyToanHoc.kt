fun main() {
    println("Tính số PI = " + Math.PI)
    println("Tính giá trị tuyệt đối của -5 = " + Math.abs(-5))
    println("Tính số lớn nhất 9 và 2 = " + Math.max(9, 2))
    println("Tính số lớn nhất 9 và 2 = " + Math.min(9, 2))
    println("Tính căn bậc 2 của 25 = " + Math.sqrt(25.0))
    println("Tính 4^3 = " + Math.pow(4.0, 3.0))

    // Tính lượng giác
    var goc = 30
    var radian = Math.PI * goc / 180
    println("Tính sin($goc) = " + Math.sin(radian))
    println("Tính cos($goc) = " + Math.cos(radian))
    println("Tính tan($goc) = " + Math.tan(radian))
    println("Tính cotan($goc) = " + Math.cos(radian) / Math.sin(radian) + ", hay = " + 1 / Math.tan(radian)) // cotan = cos / sin hay 1 / tan
}