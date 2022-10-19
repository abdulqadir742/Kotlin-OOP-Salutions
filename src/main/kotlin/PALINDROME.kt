import java.util.Scanner

fun main() {
    val Scanner = Scanner(System.`in`)
    println("Enter Any Word")
    val input =  Scanner.next().uppercase()
    println(solution(input))
}

fun solution(input:String):String
{
    if (input.reversed() == input)
    {
        return "the word is polindrome $input"
    }
    return "Try Again"
}
