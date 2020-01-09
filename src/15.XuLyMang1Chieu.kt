import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*
import kotlin.Comparator
import kotlin.random.Random

fun main() {
//    demo()
//    locTimKiemDuLieu()
    sapxepPhantu()
}

private fun demo() {
    var mang = IntArray(10)
    for (i in mang.indices)
        mang[i] = Random.nextInt(100)
    println("Mang sau khi thêm giá trị vào ô nhớ.")
    for (i in mang) println(i)
    println("Mang sau khi thêm giá trị vào ô nhớ.")
    for (i in mang.indices) println(mang[i])

    println("Max = ${mang.max()}")
    println("Min = ${mang.min()}")
    println("TỔng giá trị của mảng = ${mang.sum()}")
}

/*
* Filter(): Lọc , tìm kiểu dữ liệu
* */

private fun locTimKiemDuLieu() {
    val mang = IntArray(10)
    for (i in mang.indices)
        mang[i] = Random.nextInt(100)
    for (so in mang) print("$so\t")
    println()
    val dsChan = mang.filter { item -> item % 2 == 0 } // lamda
    println("Các số chẵn: $dsChan")
    val dsLe = mang.filter { item -> item % 2 != 0 }
    println("Các số lẻ: $dsLe")

    var soLonHon = mang.filter { x -> x > 50 }
    println("Các số lớn hơn 50: $soLonHon")
}

/*
* sort(): Sắp xếp phần tử trong mảng
* sortBy(): Có thể sắp xếp theo giá trị trả về của 1 hàm
* sortWith(): Sắp xếp bằng so sánh
* */

private fun sapxepPhantu() {
    val mang = IntArray(10)
    for (i in mang.indices)
        mang[i] = Random.nextInt(100)
    mang.forEach { so -> print("$so\t") }
    println()

    // Sắp xếp mảng
    //tăng dần
    mang.sort()
    mang.forEach { so -> print("$so\t") }
    println()
    //giảm dần
    mang.sortDescending()
    mang.forEach { so -> print("$so\t") }
    println()
    // sắp xếp giới hạn phần tử
    mang.sort(0, 4)
    mang.forEach { so -> print("$so\t") }
    println()


    // Mảng String
    val sArray = arrayOf("Nguyen", "Huy", "Quoc")
    sArray.sort()
    sArray.forEach { print("$it\t") }
    println()

    /* ========= Ví dụ về sortBy() and sortWith() =====*/
    val peoples = arrayOf(
        People("Nguyen Z", 18),
        People("Nguyen A", 26),
        People("Nguyen D", 15),
        People("Nguyen N", 10)
    )
    peoples.sortBy { sortWithAge(it) } // sortBy dùng hàm để trả về giá trị
    peoples.forEach { print("$it\t") }
    println()

    peoples.sortByDescending { it.age }
    peoples.forEach { print("$it\t") }
    println()


    // SortWith();
    peoples.sortWith(Comparator { o1, o2 ->
        when{
            o1.age > o2.age -> 1
            o1.age == o2.age -> 0
            else -> -1
        }
    })

    peoples.forEach { print("$it\t") }
    println()
}

data class People(val name: String, val age: Int)
private fun sortWithAge(people: People) = people.age // Dùng để sort