fun main() {
    //Ví dụ về Tính kế thừa, Kế thừa Class
    val nvMoi = NhanVienChinhThuc()
    val anhAn = NhanVienChinhThuc(1, "Nguyen AN")
    val anhBinh = NhanVienBanThoiGian(2, "Nguyen Binh")
    println("Lương của $nvMoi = ${nvMoi.tinhLuong(5)}")
    println("Lương của anh $anhAn = ${anhAn.tinhLuong(30)}")
    println("Lương của anh $anhBinh = ${anhBinh.tinhLuong(10)}")

    // Ví dụ về Tính kế thừa, kế thừa Interface

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