import java.util.Scanner

fun main() {
 val BA = BankAccount()
    BA.deposit()
    BA.withdraw()
    BA.display()
}

class BankAccount{
    var balance = 10000

    fun deposit()
    {
        val Scanner = Scanner(System.`in`)
        println("Account Balance :  $balance")
        println("Enter Your Deposit Amount")
        val dep_amount = Scanner.nextInt()
        balance =   balance + dep_amount
        println("Your Total Ammount is $balance")

    }

    fun withdraw()
    {
        val Scanner = Scanner(System.`in`)
        println("How many amount do you want to withdraw")
        val withdraw_Amount = Scanner.nextInt()


        if (withdraw_Amount > balance)
        {
            println("you have not a sufficient balance")
        }
        else
        {
            balance = balance - withdraw_Amount
            println("Your total amount is $balance")

        }
    }

    fun display()
    {
        val Scanner = Scanner(System.`in`)
        println("\n")
        var  AccountName = "Abdul Qadir"
        var  AccountNumber = "0833369582147"
        var  Contact  = "03126575366"

        println("Account Name is $AccountName")
        println("Account Number is $AccountNumber")
        println("Contact Number is $Contact")
        println("Total balance in the account is :$balance")

        println("for changing Acount title and contact number press 'y'")
        val user = Scanner.next()
        if (user == "y" || user == "Y")
        {
            println("Enter Your New Account Title")
            val new = Scanner.next()
            println("Enter Your New contact number")
            val cn = Scanner.nextBigInteger()

            var  AccountName = new
            var  AccountNumber = "0833369582147"
            var  Contact  = cn
            println("Account New Name is $AccountName")
            println("Account Number is $AccountNumber")
            println("Contact New Number is $Contact")


        }
        if (user == "n" || user== "N")
        {
            println("Thank You")
        }


    }
}