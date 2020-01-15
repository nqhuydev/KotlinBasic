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

    // Ví dụ về khai báo phương thức
    val hinhChuNhat = HinhChuNhat(4.5, 7.6)
    println("Thông tin hình chữ nhật vừa nhập:")
    hinhChuNhat.xuatThongTin()
    println("Chỉ xuất diện tích: ${hinhChuNhat.dienTich()}")
    println(hinhChuNhat.toString())


    //Ví dụ về Overloading Method
    val product = Product(1, "Coca", 10000)

    // Ví dụ về varavg: thoải mái nhập đối số
    println(product.sum(1, 2, 3, 4, 5, 6))
    println(product.sum(90, 20, 10, 23))

    //Ví dụ về Tính kế thừa, Kế thừa Class
    val nvMoi = NhanVienChinhThuc()
    val anhAn = NhanVienChinhThuc(1, "Nguyen AN")
    val anhBinh = NhanVienBanThoiGian(2, "Nguyen Binh")
    println("Lương của $nvMoi = ${nvMoi.tinhLuong(5)}")
    println("Lương của anh $anhAn = ${anhAn.tinhLuong(30)}")
    println("Lương của anh $anhBinh = ${anhBinh.tinhLuong(10)}")

    // Ví dụ về Interface

    val lopcon = LopCon()
    lopcon.doSomeThing()
    lopcon.makeSomeThing()

    val lopdemo =LopDemo()
    lopdemo.doSomeThing()
    lopdemo.makeSomeThing()
    lopdemo.new("Nguyen Huy")
    lopdemo.old("Huy Nguyen")


    // Ví dụ về Overriding Method
    val congnhan1 = CongNhanChinhThuc(1, "1102", 1935, "Nguyen A")
    val congnhan2 = CongNhanThoiVu()
    congnhan2.Ma = 2
    congnhan2.CMNN = "1103"
    congnhan2.NamSinh = 1992
    congnhan2.Ten= "Nguyen Huy"

    val luongCongNhan1 = congnhan1.TinhLuong(30)
    val luongCongNhan2 = congnhan2.TinhLuong(15)
    println("Công nhân: ${congnhan1} có lương là : $luongCongNhan1")
    println("Công nhân: ${congnhan2} có lương là : $luongCongNhan2")
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

/*
* Tham chiếu This:
* Có hai loại biến
* 1. Instance variable: các thuộc tính các biến khai báo trong lớp và ngoài hàm. Các hàm trong lớp có thể truy xuất được
* 2. Local variable: Là biến được khai báo trong đối số của hàm hoặc trong nội dung của hàm. chỉ có các hàm chứa
* mới có thể truy xuất được. và đối số  trong hàm thường được mặc định là readOnly(val)
*
* Trong hàm có cả biến Instance và Local thì biến Local sẽ được ưu tiên hơn.
* */

//==================================================================

/*
* ====================== Overloading Method ============================
* Overloading Method là đặc điểm trong cùng một lớp có nhiều phương thức(hàm) cùng tên
* nhưng khác nhau về Signature
* - Signature bao gồm:
*       - số lượng các đối số
*       - thứ tự các đối số
*       - khác nhau về kiểu dữ liệu của đối số
* - Kiểu dữ liệu trả về không được tính trong Signature
* - Overloading là khả năng tái sử dụng lại phương thức(hàm)  và giúp việc gọi hàm linh hoạt hơn
* - Constructors là trường hợp đặc biệt của Overloading

 */
class Product {
    private var id: Int = -1
    private var name: String = ""
    private var price: Int = -1

    // Đây là 3 constructor method khác nhau về số lượng đối số
    // Là dạng được biệt của OverLoading Method
    constructor()

    constructor(id: Int, name: String, price: Int) {
        this.id = id
        this.name = name
        this.price = price
    }

    constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }

    // Overloading Method
    fun xuatThongTin() {
        println("Product: $id, $name, $price")
    }

    fun xuatThongTin(product: Product) {
        println("Product: ${product.id}, ${product.name}, ${product.price}")
    }


    //vararg là một dạng của Overloading: số lượng của đối số nhập vào
    fun sum(vararg arr: Int): Int {
        var s: Int = 0
        for (i in arr) {
            s += i
        }
        return s
    }
}


/*
* ====================== Kế thừa từ Class ============================
* Khai báo trừa tượng: khi một phương thức chưa được thể hiện hành vi cụ thể, chỉ đưa ra luật và định nghĩa chung.
* Lớp tổng quát hóa (lớp Cha): được khai báo : open abstract class TenLop{ public abstract fun tenHam(Đối số) : TenKieu }
* Lớp chuyên biệt hóa (lớp Con): lơp con sẽ được bổ sung và mở rộng thêmư
*
* Abstract class : các phương thức trong abstract class có thể là trừu tượng, không thể định nghĩa trước nội dung
* Ví dụ: Cách khai báo
*  */
// Lớp Cha
private abstract class NhanVien {
    private var ma: Int = -1
    private var ten: String = ""
    var Ma: Int
        get() {
            return ma
        }
        set(value) {
            this.ma = value
        }
    var Ten: String
        get() {
            return ten

        }
        set(value) {
            this.ten = value
        }


    constructor() {
        this.ma = 0
        this.ten = ""
    }

    constructor(ma: Int, ten: String) {
        this.ma = ma
        this.ten = ten
    }

    abstract fun tinhLuong(ngayCong: Int): Int

    override fun toString(): String {
        return "NhanVien(ma=$ma, ten='$ten')"
    }


}


// Lớp con
private class NhanVienChinhThuc : NhanVien {
    constructor() : super()
    constructor(ma: Int, ten: String) : super(ma, ten) {
        println("Đây làn nhân viên Chính thức.")
    }

    override fun tinhLuong(ngayCong: Int): Int {
        if (ngayCong > 22)
            return 10000000
        return 10000000 - 100000 * (22 - ngayCong)
    }

}

private class NhanVienBanThoiGian : NhanVien {
    constructor() : super()
    constructor(ma: Int, ten: String) : super(ma, ten) {
        println("Đây làn nhân viên Bán thời gian.")
    }

    override fun tinhLuong(ngayCong: Int): Int {
        return ngayCong * 150000
    }


}

/*
* ====================== Kế thừa từ Interface ===========================
* Interface: Định nghĩa ra giao diện tương tác, các giao ước và luật.
*            Mặc định tất cả các phương thức là trừa tượng nếu chưa định nghĩa cả nội dung.
*            Phương thức nào được định nghĩa nội dung thì sẽ không được lớp con Kế thừa
* Tất cả lớp kế thừa từ Interface cũng phải định nghĩa lại toàn bộ phương thức trừa tượng của nó
*
* Interface có quyền da thừa kế
* */

private interface MyInterFace {
    fun doSomeThing() {
        println("MyInterFace Đây là doSomeThing")
    }

    fun makeSomeThing()
}

private interface OtherInterFace {
    fun new(s : String)
    fun old(s : String){
        println("OtherInterface : $s")
    }
}

private class LopCon : MyInterFace {
    override fun doSomeThing() {
        super.doSomeThing() // Kế thừa toàn bộ lệnh từ lớp cha
        println("Đây là lớp con doSomeThing")

    }

    // Chỉ có phương thức nào được định nghĩ thì mới dùng super để kế thừa toàn bộ hành vi của lớp Cha
    // Phương thức không có nội dung hay hành nào được thực hiên {} thì sẽ ko được super
    override fun makeSomeThing() {
        println("Đây là lớp con makeSomeThing")
    }

}
private class LopDemo : MyInterFace, OtherInterFace {
    override fun new(s: String) {
        println("LopDemo: $s")
    }

    override fun makeSomeThing() {
        println("LopDemo: makeSomeThing")
    }

    override fun doSomeThing() {
        super.doSomeThing()
        println("LopDemo: DoSomeThing")
    }

    override fun old(s: String) {
        super.old(s)
        println("LopDemo: $s")
    }

}

/*
* ====================== Overriding Method===========================
* Overriding Method: Xảy ra Trong 1 tập các lớp có mối quan hệ kế thừa với nhau:
*   - tất cả các phương thức giống nhau về số lượng đối sổ, kiểu dữ liệu đối số, thứ tự đối số,
*   - Khác nhau nội dung bên trong method
*
*Overloading Method: Xảy ra trong một lớp có nhiều phương thức cùng tên:
*   - nhưng khác nhau về số lượng đối số, kiểu dữ liệu đối số, thứ tự của đối số
* */

/*
* Ví dụ:
* */

private abstract class CongNhan {
    private var ma : Int = -1
    private var cmnd :String = ""
    private var namsinh : Int = -1
    private var ten : String = ""
    var Ma : Int
    get() {return  ma}
    set(value) {ma = value}

    var CMNN : String
    get(){return cmnd}
    set(value) {cmnd = value}

    var NamSinh: Int
    get() {return  namsinh}
    set(value) {namsinh = value}

    var Ten : String
    get() {return  ten}
    set(value) {ten = value}

    constructor()

    constructor(ma: Int, cmnd: String, namsinh: Int, ten: String) {
        this.ma = ma
        this.cmnd = cmnd
        this.namsinh = namsinh
        this.ten = ten
    }

    abstract fun TinhLuong(ngayCong: Int) : Int

    override fun toString(): String {
        return "CongNhan(ma=$ma, cmnd='$cmnd', namsinh=$namsinh, ten='$ten')"
    }


}

private class CongNhanChinhThuc : CongNhan {
    constructor() : super()
    constructor(ma: Int, cmnd: String, namsinh: Int, ten: String) : super(ma, cmnd, namsinh, ten)

    override fun TinhLuong(ngayCong: Int) : Int {
        if (ngayCong > 22)
            return 10000000
        return 10000000 - 100000 * (22 - ngayCong)
    }

}

private class CongNhanThoiVu : CongNhan {
    constructor() : super()
    constructor(ma: Int, cmnd: String, namsinh: Int, ten: String) : super(ma, cmnd, namsinh, ten)

    override fun TinhLuong(ngayCong: Int) : Int {
        return ngayCong * 150000 + 300
    }

}