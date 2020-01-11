fun main() {
    val sinhVien = SinhVien(1, "Nguyen Huy") // Nhảy vào luôn hàm khởi tạo trong constructors và init()
    val sinhVien1 = SinhVien1(2, "Nguyen Gia An")

    val sanPham = SanPham()
    val sanPham1 = SanPham(102, "Pham Chang", 10000)

    val oto = Oto(109, " Mazda")
    val oto1 = Oto()
    oto1.Ma = 100
    oto1.Ten = "Audi"
    println(oto1.toString())
    oto1.xuatThongtin()

    val hinhChuNhat = HinhChuNhat(4.5, 7.6)
    println("Thông tin hình chữ nhật vừa nhập:")
    hinhChuNhat.xuatThongTin()
    println("Chỉ xuất diện tích: ${hinhChuNhat.dienTich()}")
    println(hinhChuNhat.toString())
}
/*

=================== KHAI BÁO ======================
* Kotlin hỗ trợ 2 loại Constructors
* Constructors (Nhưng hàm đặc biệt, mặc định để khởi tạo các giá trị ban đầu cho các đối tượng khi cấp phát bộ nhớ)

* */

/*
* 1. Primary Constructor:
* Không thể chứa bất kỹ đoạn mã nào trong constructors ,
* nếu muốn khởi tạo giá trị mặc định cho các biến thì ta phải dùng khối lệnh
*       init{}
* */

class SinhVien constructor(id: Int, name: String) {
    init {
        println("Đây là primary constructors")
        println("Max: $id; tên: $name")
    }
}

class SinhVien1(id: Int, name: String) {
    init {
        println("Đây là primary constructors")
        println("Mã: $id; tên: $name")
    }
}


/*
* 2. Secondary Constructors:
*
* */

class SanPham {
    constructor() {
        println("Đây là secondary constructors không có đối số.")
    }

    constructor(id: Int, name: String, price: Int) {
        println("Đây là secondary constructors có  3 đối số.")
        println("Mã: $id; tên: $name; giá: $price")
    }
}

/*
* Khai báo thuộc tính
* Xác định Phạm vi hay độ truy cập vào các thuộc tính của class
* public: các thuộc tính có thể được gọi ở bất cứ đâu: Class, Package, Subclass, bên Ngoài
* protected: các thuộc tình có thể được gọi ở bất cứ đâu trừ bên Ngoài
* default (không có modifier): các thuộc tình có thể được gọi ở bất cứ đâu trừ bên Ngoài
* private: Chỉ có trong class mới đc phép truy cập
* */


/*
* Getter and Setter trong Kotlin
* */
class Oto {
    private var ma: Int = 0
    private var ten: String = ""

    // Getter and Setter
    // Đảm bảo tính đóng gói không truy xuất trược tiếp vào thuộc tính
    var Ma: Int
        get() {
            return ma
        }
        set(value) {
            ma = value
        }

    var Ten: String
        get() {
            return ten
        }
        set(value) {
            ten = value
        }


    constructor() {
        println("Secondary constructor 0 đối số.")
    }

    constructor(ma: Int, ten: String) {
        println("Secondary constructor 2 đối số.")
        this.ma = ma
        this.ten = ten
        println("$ma - $ten")
    }

    override fun toString(): String {
        return "Oto(ma=$ma, ten='$ten')"
    }

    fun xuatThongtin() {
        println("Mã: $ma, Tên: $ten")
    }
}

/*
* Khai báo Phương thức:
* Phương thức(Method) có 2 loại:
* 1. Service Method: là cá phương thức public để cung cấp ra ngoài sử dụng
* 2. Support Method là các phương thức private dùng để hỗ trợ cho các Servuce method. các đối tượng ở ngoài không truy xuất được
* */

private class HinhChuNhat {

    // Các THUỘC TÍNH (Đặc điểm của đối tượng)
    private var chieudai: Double = 0.0
    private var chieurong: Double = 0.0

    // Getter and Setter
    var ChieuDai: Double
        get() {
            return chieudai
        }
        set(value) {
            chieudai = value
        }

    var ChieuRong: Double
        get() {
            return chieurong
        }
        set(value) {
            chieurong = value
        }
    //--------------------------------

    // Hàm xây dựng - khai báo
    constructor()

    constructor(chieudai: Double, chieurong: Double) {
        this.chieudai = chieudai
        this.chieurong = chieurong
    }

    //----------------------------------
    // Khai báo Phương thức
    // Các PHƯƠNG THỨC (Các hành vi của đối tượng)

    //Support method
    private fun chuVi(): Double {
        return (chieurong + chieudai) * 2
    }

    //Service method
    fun dienTich(): Double {
        return chieudai * chieurong
    }

    //Service method
    fun xuatThongTin() {
        println("Chiều dài = $chieudai")
        println("Chiều rộng = $chieurong")
        println("Chu vi = ${chuVi()}")
        println("Diện tích = ${dienTich()}")
    }
    //-------------------------------

    override fun toString(): String {
        return "Diện tích = ${dienTich()}, Chu vi = ${chuVi()}"
    }

}
