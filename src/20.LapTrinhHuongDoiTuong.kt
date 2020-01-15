/*
* Lập trình hướng đối tượng : OOP (Object-oriented Programing)
* 1. Tập trung vào dữ liệu thay cho các hàm
* 2. Chương trình chia thành các đối tượng độc lập: Mọi dữ liệu là đều là một đối tượng
* 3. Cấu trúc dữ liệu được thiết kế sao cho đặc tả được các đối tượng
* 4. Dữ liệu được che đi và được bao bọc: Tính đóng gói
* 5. Các đối tượng được trao đổi với nhau thông qua các hàm
* 6. Chương trình được thiết kế theo hướng tiếp cận từ dưới lên (bottom - up): xây dựng từ nhiều thành phần nhỏ và kết hợp chúng lại thành phần chức năng lớn hơn
*                                       và tiếp tục kết hợp thành các thành phần lớn hơn nữa cho đến khi xây dựng được bài toán mong muốn
*
*  ƯU ĐIỂM:
* 1. Dữ liệu không bị thay đổi tự do trong chương trình
* 2. Khi thay đổi cấu trúc dữ liệu của một đối tượng , không cần thay đổi mã nguồn của dối tượng khác
* 3. Có thể sử dụng lại mã nguồn để tiếc kiệm tài nguyên: Tính kế thừa
* 4. Sử dung phù hợp với dự án lớn phức tạp
* Khái niệm đối tượng (Object) giống với khái niệm đối tượng cụ thể trong đời thực
*
*   ##Mỗi đối tượng có các thuộc tính và các hành vi riêng
* 1. Thuộc tính(attribute): mô tả đặc điểm  của đối tượng
* 2. Hành vi: là  phương thức hoạt động của đối tượng gọi là phượng thức (method)
*
* Ví dụ:
* Đối  tượng phân số:
* - Thuộc tính: Đặc điểm của phân số: Tử số, Mẫu số
* - Hành vi: Các thao tác trên Phân số: Cộng ,trừ ,nhân , chia, tối giản, nghịch đảo
*
* Đối tượng xe hơi:
* - Thuộc tính: Đặc điểm của Xe hơi: Thương hiệu, Màu, Số Bánh, Số ghế ...
* - Hành vi: Các thao tác trên xe hơi: Chạy tới, Lùi, Dừng xe ...
*
*
* ## Các đối tượng có Thuộc tính và Hành vi giống nhau được gom thành một lớp để phân biệt với các đối tượng khác và để dễ quản lý hơn
* ## Một lớp (class) là sự phân loại của các đối tượng hay kiểu (style) của đối tượng
* ## Một lớp (class): Đại diện cho một kiểu dữ liệu hay một tập hợp các đối tượng có trong hệ thống
* ## Một Đối tượng (object): Là thành phần đối tượng cụ thể có kiểu lớp (class) nào đó
*
* Lớp sẽ tạo ra đối tượng, lớp phải có trước. Đối tượng được tạo ra từ lớp
*
*  ------------Khái niệm Lớp (Class):
*   - Là một khái niệm trừu tượng, dùng để chỉ một tập hợp các đối tượng có mặt trong hệ thống
*   - Lớp có các thuộc tính vào phương thức:
*       - Thuộc tính của lớp tương ứng với thuộc tính của đối tượng
*       - Phương thức của lớp tương ứng với các hành vi của đối tượng
*   - Một lớp có thể có một trong các khả năng sau:
*       - Không có thuộc tính, không có phương thức
*       - Chỉ có thuộc tính, không có phương thức
*       - Chỉ có phương thức, không có thuộc tính
*       - Có cả thuộc tính và phương thức
*       - Có mối quan hệ với các lớp khác
*
* ------------ Gói (Package):
*   - Một nhóm các lớp (classes) và giao diện (interface) được tổ chức thành một đơn vị theo hình thức không gian tên gọi.
*   - Lợi ích: tổ chức sắp xếp lại hệ thống thông tin các lớp trong dự án một cách khoa học. Giúp cho việc theo dõi và bảo trị dự án được tốt nhất
*
*
*  ------------Tính trừu tượng:
*   - Class là một khái niệm trừa tượng,từ  lớp tạo ra đói tượng. đối tượng là một thể hiện cụ thể của lớp: ví dụ: bản thiết kế của chiếc xe hơi là lớp, chiếc xe hơi được tạo ra từ bản thiết kế là đối tượng
*   (class như là bản thiết kế để tạo ra đối tượng có các thuộc tính(đặc điểm), phương thức(hành vi)\
*   - Từ các đối tượng giống nhau ta trừu tượng hóa thành một lớp
*
*   ------------Tính đóng gói:
*   - Mỗi lớp được xây dựng để thực hiện một nhóm chắc năng đặc biệt của riêng lớp đó
*   - Mọi thao tác truy xuất vào thành phần dữ liệu từ đối tượng này qua đối tượng khác phải thực hiện bởi các phương thức (method) của chính đối tượng cần truy xuất
*   - Cho phép dấu thông tin của dối tượng bằng cách kết hợp thông tin với các phương thức liên quan đến thông tin trong đối tượng
*       (Ở ngoài không được phép truy xuất trực tiếp vào các thuộc tính mà phải thông qua các phương thức)
*
*   ------------Tính kế thừa:
*   - Lớp con kế thừa tất cả các thành phần từ lớp Cha
*   - Có thể mở rộng các thành phần kế thừa và bổ sung các thành phần mới
*
*  ------------Tính đa hình:
*   - Tại từng thời điểm đối tượng sẽ có các hình thái khác nhau trong nhưng hoàn cảnh khác nhau
*
* */


fun main() {
    // Khởi tạo đối tượng Tam giác và gán đối tượng
    val tamgiac = TamGiac(3.0, 4.0, 5.0)
    println("Chu vi: ${tamgiac.chuvi()}, diện tích: ${tamgiac.dientich()}")

    val tamgiac2 = TamGiac()
    //Gán giá trị cho các thuộc tính
    tamgiac2.canhA = 7.0
    tamgiac2.canhB = 6.0
    tamgiac2.canhC = 9.0
    println("Chu vi: ${tamgiac2.chuvi()}, diện tích: ${tamgiac2.dientich()}")
}


/*
* ============== VÍ DỤ
* Tạo Class
* */

private class TamGiac {

    // Các THUỘC TÍNH (Đặc điểm của đối tượng)
    var canhA: Double = 0.0
    var canhB: Double = 0.0
    var canhC: Double = 0.0
    //--------------------------------

    // Hàm xây dựng - khai báo
    constructor()

    constructor(canhA: Double, canhB: Double, canhC: Double) {
        this.canhA = canhA
        this.canhB = canhB
        this.canhC = canhC
    }
    //----------------------------------

    // Các PHƯƠNG THỨC (Các hành vi của đối tượng)
    fun chuvi(): Double {
        return canhA + canhB + canhC
    }

    fun dientich(): Double {
        val p = chuvi() / 2
        return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC))
    }
    //-------------------------------

}







































