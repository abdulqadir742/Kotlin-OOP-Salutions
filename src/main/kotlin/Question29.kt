fun main() {

    val hl = Holiday()
    val bd = BirthDay()
    val vl = Valentine()

    println( hl.Greetings("Happy Holiday"))
    println(bd.Greetings("Happy Birthday"))
    println(vl.Greetings("HAppy Valentine's"))
}

open class Card
{

    open fun Greetings(a:String):String
   {
       return a.uppercase()
   }
//   open fun Holiday():String
//   {
//       return "Season's Greetings".uppercase()
//   }
//
//    open fun BirthDay():String
//    {
//        return "Happy Birth Day".uppercase()
//    }
//
//    open fun Valentine():String
//    {
//        return "Happy Valentine's Day".uppercase()
//    }
}


class Valentine : Card()
{
    override fun Greetings(a: String): String {
        return super.Greetings(a)
    }
}

class Holiday : Card() {
    override fun Greetings(a: String): String {
        return super.Greetings(a)
    }
}

    class BirthDay : Card() {
        override fun Greetings(a: String): String {
            return super.Greetings(a)
        }
    }
