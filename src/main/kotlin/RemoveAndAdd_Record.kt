fun main() {
    val Student_marks = mutableListOf<Int>(80,70,40,30,60)
    println(Student_marks)

    println("deleting first record")
    Student_marks.removeAt(0)
    println(Student_marks)
    println("Add a new first record")
    Student_marks.add(0,100)
    println(Student_marks)


}