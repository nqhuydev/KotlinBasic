fun main() {
//    nhapSoTangDan()
    phanSo()
}


/*
* Break and Continue Labels : loop@ for.while... break@loop
* Return at Labels:  lit@ for.forEach .. return@lit
* Elvis Operator: readLine() ?: return = null -> return - !null -> continue
* */
private fun nhapSoTangDan() {
    println("Nhập vào N kích thước của dãy số: ")
    val n = readLine()?.toInt() ?: return
    println("Nhập vào từng phần tử cho dãy số trên theo thứ tự tăng dần.")
    val arr = IntArray(n)
    arr.forEachIndexed lit@{ index, _ ->
        loop@ while (true) {
            println("Nhập vào giá trị của vị trí $index: ")
            val tmp: Int = readLine()?.toInt() ?: return@lit
            if (index == 0) {
                arr[index] = tmp
                break@loop
            }
            if (tmp >= arr[index - 1]) {
                arr[index] = tmp
                break@loop
            } else {
                println("Vui lòng nhập lại.")
            }
        }
    }

    arr.forEachIndexed { index, value -> print("$index: $value\t") }
    println()
}


/*
* Alias and Garbage collection
* ví dụ: val a : Int = 5
*        val b : Int = 10
*  2 biến này quản lý hai ô nhớ độc lập
*
*  khi ta gán: a = b
*  thì: - a được trỏ tới ô nhớ của b
*       - ô nhớ của b được a và b quản lý - Alias
*       - ô nhớ của a được thu hồi - Garbage Collection
*
* => - Alias là tại một ở nhớ có trên hai đối tượng trỏ tới,
*      bất kỳ đối tượng nào làm thay đổi thông tin trên ô nhớ này cũng làm cho đối tượng khác được thay đổi thông tin theo ô nhớ
*    - Garbage Collection: Ô nhớ không được đối tượng nào quản lý sẽ tự động bị thu hồi
*
*
* Ví dụ:
* */
private fun phanSo() {
    var psA = PhanSo(3, 1)
    var psB = PhanSo(30, 110)
    psA = psB // psA trỏ tới vùng nhớ của psB đang quản lý vậy psA và psB đều quản lý 1 vùng nhớ
    psB.tu = 190
    println("Phân số A có tử số = ${psA.tu}") // => Bất kỳ thay đổi nào của psB thì psA cũng thấy được sự thay đổi đó
    var psC = psA // psC trỏ tới vùng nhớ của psA đang quản lý, mà psA cũng đang quản lý vùng nhớ của psB
    psC.mau = 50
    println("Phân số B có mẫu số = ${psB.mau}") // => Bất kỳ thay đổi nào của psC thì psB cũng thấy được sự thay đổi đó
    var psD = PhanSo(111, 222)
    psB = psD // psB sẽ chuyển sang trỏ vùng nhớ của psD, còn psA và psC vẫn quản lý vùng nhớ của psB cũ
    psD.tu = 333
    println("Phân số B có tử số = ${psB.tu}")
    println("Phân số A có tử số = ${psA.tu}")
    println("Phân số C có tử số = ${psC.tu}")
}

private class PhanSo {
    var tu: Int = 1
    var mau: Int = 1

    constructor(tu: Int, mau: Int) {
        this.tu = tu
        this.mau = mau
    }
}