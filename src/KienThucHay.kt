fun main() {
    nhapSoTangDan()
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
