fun main() {

    // Đối tượng được khai báo kiểu dữ liệu là class Cha và Hình thái (giá trị) là 1 trong các class con mong muốn
    // sau này có thể thay đổi kiểu dữ liệu cho đối tượng qua lại giữa các class con.
    var employee: Employee = Manager()
    val payment1 = employee.salary(30)

    // Đối tượng được chuyển qua hình thái khác
    employee = PartTimeEmployee()
    val payment2 = employee.salary(30)

    println("Lương lúc làm Quản lý : $payment1$")
    println("Lương lúc làm Nhân viên quèn : $payment2$")
}


/*
*  ------------Tính đa hình:
*   - Tại từng thời điểm đối tượng sẽ có các hình thái khác nhau trong những hoàn cảnh khác nhau
*   - Tạo ra trong việc kế thừa:
*                   - Kế thừa từ class
*                   - Kế thừa từ Interface
* */

private abstract class Employee {
    abstract fun salary(workDay: Int): Int
}

private class Manager : Employee() {
    override fun salary(workDay: Int): Int {
        return workDay * 500 + 500
    }

}

private class PartTimeEmployee : Employee() {
    override fun salary(workDay: Int): Int {
        return workDay * 300 + 300
    }

}