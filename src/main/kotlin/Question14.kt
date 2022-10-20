
fun main(args: Array<String>) {
    val email = "abqadirkhan742@gmail.com"

    val UserName = email.subSequence(0, 11)
    println("The User Name is : " + UserName)

    val DomainName = email.subSequence(14, 20)
    println("The Domain Name is : " + DomainName)

    val Extension = email.subSequence(20, 24)
    println("The Extension is : " + Extension)
}