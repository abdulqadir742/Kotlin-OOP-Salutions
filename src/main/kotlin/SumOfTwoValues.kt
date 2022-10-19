import java.util.Scanner
import kotlin.random.Random.Default.nextLong

fun main() {
    println("Please Enter Your First Value")
    val input1 = readLine()

    println("Please Enter Your 2nd value")
    val input2 = readLine()



    if (Integer.valueOf(input1) in 1..50000 && Integer.valueOf(input2) in 1..50000) {

        val sum = Integer.valueOf(input1) + Integer.valueOf(input2)
        println("Total Sum Of input 1 and input 2 is : $sum")
        for (i in "$sum")
        {
            println(i)
        }
    }
    else
    {
        println("Please Enter a value between 1 to 50000")
    }



}






