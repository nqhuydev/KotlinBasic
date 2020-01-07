import kotlin.random.Random

fun main() {
    randomSoNguyen()
    randomChar()
    randomDouble()
    gameDoanSo()
}

/*
* Random: số nguyên
*/
fun randomSoNguyen() {
    var x = Random.nextInt(5) // Từ 0 gần đến 5
    var y = (-1..1).random() // Từ 10 đến 20
    var z = (0 until 20).random()// từ 0 gần đến 20
    println("$x, $y, $z")
}

/*
* Random: số Ký tự
*/
fun randomChar() {
    var a = ('A'..'Z').random() // Từ A đến Z
    var b = ('a' until 'z').random() // từ A gần đến Z
    println("$a, $b")
}

/*
* Random: số Thực [0..1]
*/
fun randomDouble() {
    var x = Random.nextDouble() // CHạy từ 0->1
    var y = Random.nextDouble() * 10 // CHạy từ 0->10
    println("$x, $y")
}

/*
* Trò chơi đoán số.
* */

fun gameDoanSo() {
    while (true){
        println("Chào mừng bạn đến với game đoán số!")
        game()
        println("Bạn có muốn chới tiếp không (y/n)?")
        val s = readLine()
        if (s?.compareTo("k", true) == 0) break // compareTo - Không phân biệt chữ hoa hay chữ thường
    }
}
private fun game(){
    val soMay = (0..100).random()
    var soLanDoan = 0
    println("Máy đã tạo ra 1 số trong đoạn từ 0 đến 100!")
    println("Mời bạn đoán số (Bạn có 7 lần đoán): ")
    while (true) {
        soLanDoan++
        if (soLanDoan > 7){
            println("Bạn đã hết số lần đoán. số của máy là: $soMay")
            break
        }else{
            println("Bạn đoán lần thứ $soLanDoan/7.")
        }
        val soNguoiChoi = readLine()?.toInt()
        if (soNguoiChoi == null) return

        if (soNguoiChoi == soMay) {
            println("Chúc mừng bạn đã đoán đúng số của máy là : $soMay.")
            break
        } else if (soNguoiChoi > soMay) {
            println("Số bạn đoán > số của máy. mời bạn đoán lại")
        } else if (soNguoiChoi < soMay) {
            println("Số bạn đoán < số của máy. mời bạn đoán lại")
        }
    }
}