fun main() {
    val Students = mutableListOf<String>("Abdul Qadir", "Muhammad Qasim","Kashif","Bilal","Usama")
    println(Students)
    println("after deleting record no 3")
    Students.removeAt(2)
    println("$Students")

}