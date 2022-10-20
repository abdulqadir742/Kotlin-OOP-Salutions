fun main() {

    val Sentence = "TheWild ,CatRan?Over TheLazyDog"
    //println(Solution(Sentence))
     var counter = 0
     val character = listOf<Char>(' ', '!', '@', '£', '%', '^', '&', '*', ')', '(', '-', '+', ',', ',', '/', '?','1', '2', '3', '4', '5', '6', '7', '8', '9', '0')
    // val digits = listOf<Char>()

     for (i in Sentence) {
         for (j in character) {
                 if (i == j) {
                     counter++
               //      println("Sentence Error please remove space , special character & digits")
                 }
            }

     }
     if (counter==0 && Sentence == Sentence.capitalize())
     {
         println(Sentence)
     }
     else{
         println("Sentence Error please remove space , special character & digits \ntotal mistake is $counter")

       // println(Sentence.capitalize())
     }

 }




