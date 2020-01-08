fun main() {
//    gameDoanSo()
    timSoNguyenAmTrongChuoi()
}
/*
* Nhập vào số bất kỳ  trong dãy số đúng với số máy đã tạo ra ngẫu nhiên sẽ được công thêm 1 điêm, sai trừ 1 điểm
* Điểm = 0 sẽ kết thúc trò chơi
* */
private fun gameDoanSo() {
    while (true) {
        println("Chào mừng bạn đến với game đoán số!")
        game()
        println("Bạn có muốn chới tiếp không (y/n)?")
        val s = readLine()
        if (s?.compareTo("n", true) == 0) break // compareTo - Không phân biệt chữ hoa hay chữ thường
    }
}

private fun game() {
    var diem = 5
    while (true) {
        var soMay = (0..5).random()
        println("Máy đã tạo ra 1 số trong đoạn từ 0 đến 5, mời bạn đoán: ")

        val soNguoiChoi = readLine()?.toInt()
        if (soNguoiChoi == null) return

        if (soNguoiChoi == soMay) {
            diem += 1
            println("Bạn được công thêm 1 điểm: $diem. Số máy là:  $soMay")
        } else {
            diem -= 1
            println("Số bạn đoán sai. Bạn bị trừ 1 điểm: $diem, Số máy là:  $soMay")
        }

        if (diem == 0) {
            println("Bạn không còn điểm nào: Game Over!")
            break
        }
    }
}

/*
* Tìm số âm trong chuỗi
* Nhập đối số truyền vào là một chuỗi bất kỳ
* Tìm các số nguyên âm trong chuỗi
* */

private fun timSoNguyenAmTrongChuoi(){
    val s = "huy-1chang--23oi--p" // input
    val arr =s.split("-")
    var sSoNguyenAm = ""
    for (s in arr){
        if (s.isNotEmpty()){
            for (i in s){
                if (i.isDigit()){
                    sSoNguyenAm +=i
                }
            }
            sSoNguyenAm+=" "
        }
    }
    val chuoi = sSoNguyenAm.trim().split(" ")
    print("Có ${chuoi.size} số nguyên âm trong chuỗi: ")
    for (so in chuoi){
        print("-$so, \t")
    }
}