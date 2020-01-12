fun main() {
    val product = Product(1, "Coca", 10000)

    // Ví dụ về varavg: thoải mái nhập đối số
    println(product.sum(1, 2, 3, 4, 5, 6))
    println(product.sum(90, 20, 10, 23))
}

/*
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