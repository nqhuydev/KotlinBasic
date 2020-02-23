fun main() {
    // InnerClass là lớp nằm trong lớp
    // InnerClass có thể truy xuất được thông tin lớp ngoài chứa nó

    val demo = OuterInner().InnerNew().foo()
    println(demo)
}

class OuterInner{
    private val bar : Int = 100
    inner class InnerNew {
        fun foo() = bar
    }
}