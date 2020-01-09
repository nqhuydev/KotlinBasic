import java.util.function.Predicate
import kotlin.collections.sortWith as sortWith1

fun main() {
    khoitao()
    xulyDuLieuCollection()
}

//Giới thiệu về
/*
* Mutable Collections: Tập các lớp dùng để lưu trữ danh sách dữ liệu có thể thay đổi kích thước và phần tử
* Immutable Collections: Tập các lớp dùng để lưu trữ danh sách dữ liệu không thể thay đổi kích thước và phần tử
* Thường sử dụng nhiều 2 dạng:
* 1. MultableList
* 2. List
* */

private fun khoitao() {
    println("Khai báo.")
    //MutableList: Thay đổi dễ dàng dữ liệu và kích thước
    val dsMultableList = mutableListOf('C', "Huy", 4, 3.0)
    println(dsMultableList)

    //List: không thêm sửa hay xóa dữ liệu hay kích thước của tâp danh sách được
    val dsList = listOf('C', "Huy", 4, 3.0)
    println(dsList)
}

/*
* MutableList: Xử lý dữ liệu
*
* */

private fun xulyDuLieuCollection() {
    println("Xử lý dữ liệu.")
    val ds = mutableListOf('C', "Huy", 4, 3.0)

    //Thêm dữ liệu vào ds
    ds.add("Chang")
    val dsThem = listOf('a', 0.6, true)
    println(ds)
    ds.addAll(dsThem) // Thêm vào 1 tập dữ liệu
    println(ds)

    // Chỉnh sửa giá trị của phần tử: 2 cách
    ds.set(0, "Ong")
    ds[0] = "Ong"
    println(ds)

    // Xóa phần tử
    val dsSo = mutableListOf(1, 5, 2, 9, 1, 0, 2, 5, 6)
    dsSo.removeAt(0) // Xóa theo vị trí
    println(dsSo)
    dsSo.remove(0) // Xóa theo dữ liệu
    println(dsSo)
    dsSo.removeAll { item -> item % 2 == 0 } // Xòa phần tử theo điều kiện
    println(dsSo)
    dsSo.removeAll(listOf(1, 0, 3)) //Xóa phần từ theo danh sách cho trước
    println(dsSo)
    dsSo.removeIf { it < 9 && it % 5 == 0 } // Xóa phần tử theo điều kiện
    println(dsSo)
    dsSo.clear() // Xóa toàn bộ danh sách
    println(dsSo)

    // Sắp xếp phần tử
    val dsMobile = mutableListOf(
        Mobile("Iphone", 1000),
        Mobile("Samsung", 850),
        Mobile("Sony", 900),
        Mobile("LG", 400),
        Mobile("Ipad", 1150)
    )
    dsMobile.sortBy { it.name }
    println(dsMobile)
    dsMobile.sortBy { it.price }
    println(dsMobile)
    dsMobile.sortByDescending { it.price }
    println(dsMobile)

    dsMobile.sortWith1(Comparator { o1, o2 -> //Sắp xếp theo điều kiện
        when{
            o1.price > o2.price -> 1
            o1.price == o2.price -> 0
            else -> 0
        }
    })
    println(dsMobile)

    dsMobile.removeIf { it.name.startsWith("L", true) } // Xóa đối tượng theo tên bắt đầu bằng chữ "I"
    println(dsMobile)

    // Lọc danh sách
    val dsApple = dsMobile.filter { it.name.startsWith("I", true) }
    println(dsApple)

    //Kiểm tra Collection(danh sách) có phần tử nào đó hay không
    val so = listOf(1, 5, 9, 0, 2, 6, 9, 3, 8, 4)
    println(so.contains(9))

}

data class Mobile(val name: String, val price: Int)
