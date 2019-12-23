fun main() {

    /*
    * break: thoát vòng lặp chứa nó
    * continue: Nhảy nhanh qua vòng lặp kế tiếp, bỏ qua các câu lệnh sau nó
    * */
    //LOẠI 1 . Duyệt tuần tự hết giá trị trong danh sách (Close range)
    // ví dụ Tính giai thừa
    var gt: Int = 1
    println("Nhập số cần tính giai thừa:")
    var n: Int? = null
    var s: String? = readLine()
    if (s != null) n = s.toInt()
    if (n != null)
        for (i in 2..n) {
            gt *= i
        }
    println("Giai thừa của $n!= $gt")

    //LOẠI 2: Duyệt gần hết giá trị trong danh sách (Half-open range)
    //Until - Gần sát 1 đơn vị. Ví dụ: Tính tổng
    var sum = 0
    var so = 5 //Số
    for (i in 1 until so) {
        sum += i
    }
    println("Tổng của các số trước $n = $sum")

    //LOẠI 3: Điều hướng bước nhảy STEP. Tăng dần mỗi lần duyệt tăng thêm Step đơn vị
    //Ví dụ: Tính tổng số chẵn trong phạm vi
    var sumchan = 0
    var nso = 10
    for (i in 0..10 step 2) {
        sumchan += i
    }
    println("Tổng số chẵn trong $nso= $sumchan")

    //LOẠI 4: Điều hướng bước nhảy DOWNTO. Tự động giảm 1 đơn vị
    // Ví dụ tìm ước chung lớn nhất
    var a: Int?
    var b: Int?
    println("Tính USCLN của a và b:")
    println("Nhập số a: ")
    a = readLine()?.toInt()
    println("Nhập số b: ")
    b = readLine()?.toInt()
    if (a == null || b == null) return

    var uscln = 0
    var min = if (a > b) b else a
    if (a == 0 || b == 0) {
        uscln = a + b
    } else {
        for (i in min downTo 1) {
            if (a % i == 0 && b % i == 0) {
                uscln = i
                break
            }
        }
    }
    println("USCLn của $a và $b là : $uscln")

    /*
    *LOẠI 5: Lặp tập đối tượng: Collection
    */
    //Ví dụ:
    var dsSanpham = arrayOf("Iphone", "Ipad", "Airpods", "Apple Watch")
    //Theo index
    for (i in dsSanpham.indices) {
        println("Sản phẩm $i là sản phẩm: ${dsSanpham[i]}")
    }
    //Theo Item
    for (sp in dsSanpham) {
        println("Sản phẩm: $sp")
    }
    //Theo value và index
    for ((index, value) in dsSanpham.withIndex()) {
        println("Sản phẩm thứ $index có tên là $value")
    }
}