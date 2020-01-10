/*
*
* Khai báo, các thao tác với Collections
* Bài tập Quản lý sinh viên
*
* */
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
    val dsSinhVien = mutableListOf<String>()

    mainLoop@ while (true) {
        println("\n")
        println("===== Quản Lý Sinh Viên =====")
        println("1. Thêm Sinh viên")
        println("2. Xuất ra danh sách Sinh viên")
        println("3. Sửa Sinh viên")
        println("4. Xóa Sinh viên có tên bất ký")
        println("5. Tìm Sinh viên theo chữ nhập vào")
        println("6. Sắp xếp Sinh viên")
        println("7. Xuất ra số lượng Sinh viên")

        println("Nhập vào số của chức năng để chọn, nhập số khác bất kỳ để thoát: ")
        val so = readLine()?.toInt() ?: return

        when (so) {
            1 -> {
                println("===== Thêm Sinh viên mới =====")
                myLoop@ while (true) {
                    println("Nhập vào tên Sinh viên: ")
                    val ten = readLine() ?: return
                    dsSinhVien.add(ten)
                    println("Thêm sinh viên nữa không (c/k) ?")
                    val kt = readLine() ?: return
                    if (kt.compareTo("k", true) == 0) {
                        break@myLoop
                    }
                }
            }
            2 -> {
                println("===== Danh sách Sinh viên =====")
                dsSinhVien.forEachIndexed { index, value ->
                    println("${index + 1}. $value")
                }
            }
            3 -> {
                println("===== Sửa Thông tin Sinh viên =====")
                dsSinhVien.forEachIndexed { index, value ->
                    println("${index + 1}. $value")
                }
                println()
                while (true) {
                    println("Nhập vào số thứ tự cần thay đổi:")
                    val soTT = readLine()?.toInt() ?: return
                    if (0 < soTT && soTT <= dsSinhVien.size) {
                        println("Bạn muốn đổi tên là gì: ")
                        val ten = readLine() ?: return
                        dsSinhVien[soTT - 1] = ten
                        println("Thay đổi thành công!")
                        break
                    } else {
                        println("Số bạn nhập không có trong danh sách. Nhập lại: ")
                    }
                }

            }
            4 -> {
                println("===== Xóa Sinh viên =====")
                while (true) {
                    dsSinhVien.forEachIndexed { index, value ->
                        println("${index + 1}. $value")
                    }
                    println()
                    println("Nhập số Thứ tự ứng với Sinh viên cần xóa: ")
                    val soTT = readLine()?.toInt() ?: return
                    if (0 < soTT && soTT <= dsSinhVien.size) {
                        dsSinhVien.removeAt(soTT - 1)
                        println("Bạn có muốn xóa tiếp nữa ko (c/k)?")
                        val kt = readLine() ?: return
                        if (kt.compareTo("k", true) == 0) {
                            break
                        }
                    } else {
                        println("Số bạn nhập không có trong danh sách. Nhập lại: ")
                    }
                }
            }
            5 -> {
                println("===== Tìm Sinh viên =====")
                println("Nhập vào từ khóa để tìm:")
                val tukhoa = readLine() ?: return
                val dsTimThay = dsSinhVien.filter { it.contains(tukhoa, true) }
                if (dsTimThay.isEmpty()) println("Không tìm thấy sinh viên nào với từ: \'$tukhoa\'")
                else {
                    println("Đã tìm thấy ${dsTimThay.size}: ")
                    dsTimThay.forEachIndexed { index, value ->
                        println("${index + 1}. $value")
                    }
                }
            }
            6 -> {
                println("===== Sắp xếp Sinh viên =====")
                println("Theo tên tăng dần: ")
                dsSinhVien.sort()
                dsSinhVien.forEachIndexed { index, value ->
                    println("${index + 1}. $value")
                }
                println()
                println("Theo tên giảm dần: ")
                dsSinhVien.sortDescending()
                dsSinhVien.forEachIndexed { index, value ->
                    println("${index + 1}. $value")
                }
            }
            7 -> {
                println("===== Tổng số Sinh viên =====")
                println("Có ${dsSinhVien.size} Sinh viên")
            }
            else -> {
                println("Đã thoát chương trình!")
                break@mainLoop // hay dùng return cũng đc
            }
        }
    }
}