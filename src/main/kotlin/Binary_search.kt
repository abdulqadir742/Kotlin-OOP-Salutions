import kotlin.random.Random

fun main() {
    val myRandomValues = MutableList(100) { Random.nextInt(0, 100) }

   // println(myRandomValues)
    val sort = myRandomValues.sorted()
    println(sort)
    val binary = sort.binarySearch(5)
    if (binary>=0)
    {
        println("Binary Number Include : The Index Of Binary search is :  $binary")
    }
    else
        println("Try Again")


}