fun main() {
//   xulyCollections()
    quanLySinhVien()
}

private fun xulyCollections() {
    println("Nhập chuỗi các số nguyên cách nhau bằng dấu cách(Space): ")
    val s = readLine() ?: return
    val arr = s.split(" ").filter { it.isNotEmpty() }
    val arrInt = List(arr.size) { arr[it].toInt() }
    var mutableList = mutableListOf<Int>()
    mutableList.addAll(arrInt)
    mutableList.forEach { print("$it \t") }
    println()

    //Sửa  giá trị ở vị trí số 0
    println("Nhập vị trị muốn sửa: ")
    val pos = readLine() ?: return
    println("Nhập giá trị muốn sửa: ")
    val value = readLine() ?: return
    mutableList[pos.toInt()] = value.toInt()
    mutableList.forEach { print("$it \t") }
    println()

    //Xóa giá trị ở vị trí - Xóa vị trí
    println("Nhập vị trị muốn xóa: ")
    val posEdit = readLine() ?: return
    println("Đã xóa vị trí $posEdit có giá trị ${mutableList[posEdit.toInt()]} ")
    mutableList.removeAt(posEdit.toInt())
    mutableList.forEach { print("$it \t") }
    println()

    println("Nhập vào số muốn tìm:")
    val soTim = readLine()?.toInt() ?: return
    print("Giá trị $soTim có vị trí: ")
    mutableList.forEachIndexed { index, i -> if (i == soTim) print("$index\t") }
    println()

    println("Sắp xếp tăng dần: ")
    mutableList.sort()
    mutableList.forEach { print("$it \t") }
    println()

    println("Sắp xếp giảm dần: ")
    mutableList.sortDescending()
    mutableList.forEach { print("$it \t") }
    println()
}

/*
* Bài tập về Collections:
* Viết chương trình quản lý sinh viên dưới dạng console, dùng MutableList và có các chức năng
* 1. Thêm
* 2. Xuất danh sách
* 3. Sửa
* 4. Xóa
* 5. Tìm kiếm
* 6. Sắp xếp
* 7. Xuất ra số lượng
* */

private fun quanLySinhVien() {
    println("===== Quản Lý Sinh Viên =====")

    println("1. Thêm Sinh viên")
    println("2. Xuất ra danh sách Sinh viên")
    println("3. Sửa Sinh viên")
    println("4. Xóa Sinh viên có tên bất ký")
    println("5. Tìm Sinh viên mà tên có chữ \'An\'")
    println("6. Sắp xếp Sinh viên")
    println("7. Xuất ra số lượng Sinh viên")

    println("Nhập vào số của chức năng để chọn: ")
    val so = readLine()?.toInt() ?: return
    val dsSinhVien = mutableListOf<String>()
    when (so) {
        1 -> {
            while (true){
                println("Nhập vào tên Sinh viên: ")
                val ten = readLine() ?: return
                dsSinhVien.add(ten)
                println("Thêm sinh viên nữa không (c/k) ?")
                val kt = readLine() ?: return
                if (kt.compareTo("k", true) == 0){
                    break
                }
            }
        }
        2 -> {

        }
        3 -> {

        }
        4 -> {

        }
        5 -> {

        }
        6 -> {

        }
        7 -> {

        }
    }
}