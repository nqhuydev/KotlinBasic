fun main() {
    khaibaoMang2Chieu()
}

private fun khaibaoMang2Chieu() {
    val mang2chieu = Array(10 /*Dòng*/) { IntArray(5) /*Cột*/ }
    //Thêm dữ liệu vào mảng
    for (i in mang2chieu.indices) {
        for (j in mang2chieu[i].indices) {
            mang2chieu[i][j] = (0..9).random()
        }
    }

    //In ra màn hình dữ liệu của mảng phẩn tử
    mang2chieu.forEach { hang ->
        hang.forEach { cot ->
            print("$cot \t")
        }
        println()
    }
    //In ra màn hình dữ liệu của mảng phẩn tử: có filter() và sort()
    println()
    mang2chieu.forEach { hang ->
        hang.sort()
        hang.filter { it >= 0 }.forEach { cot ->
            print("$cot \t")
        }
        println()
    }

}

