fun main() {
    // Là lớp được biệt của Kolin.
    // Lưu trữ 1 vài thông tin
    // Nằm trong 1 lớp nào đó thôi
    // Dùng để lưu trữ dữ liệu phức hợp

    val user1 : User = User("huynguyen", "123456")
    var user1Coppy = user1.copy()
    var user1CoppyPassword = user1.copy(passWord = "1234")

    println("${user1.userName}")
    println("${user1Coppy.userName}")
    println("${user1CoppyPassword.passWord}")
}

data class User(var userName: String, var passWord : String)