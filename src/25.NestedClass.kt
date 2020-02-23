fun main() {
    // Lớp nằm trong lớp
    // Các thuộc tính bên trong của NestedClass không thể truy xuất được thông tin lớp ngoài của nó
    val demo = Outer.Nested().foo()
    println(demo)
}

class Outer{
    private val bar : Int= 1
    class Nested{
        fun foo() = 113
    }
}