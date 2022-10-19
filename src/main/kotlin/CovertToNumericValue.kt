fun main() {
      val sl = Solution()

    println("Enter Your First Value")
    val takeinput = readLine()

    println("Enter Your First Value")
    val takeinput2 = readLine()

    val add = Integer.valueOf(takeinput) + Integer.valueOf(takeinput2)

    println("Sum Of Given value in words : $add \n"+sl.convertToWords(Integer.valueOf(add)))

}


class Solution{
    val  one = arrayOf("","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen ")
    val tens = arrayOf("","","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety")

    fun NumToWords(n:Int , s:String): String {
        var str = ""
        if(n>19){
            str+=tens[n/10]+one[n%10];
        }else{
            str+=one[n];
        }
        if(n!=0){
            str+=s;
        }
        return str
    }

    fun convertToWords(n:Int): String {
        var ans:String = ""

        ans += NumToWords((n/10000000),"crore ")
        ans+=NumToWords(((n/100000)%100),"lakh ")
        ans+=NumToWords(((n/1000)%100),"thousand ")
        ans+=NumToWords(((n/100)%10),"hundred ")
        if(n>100 && n%100>0){
            ans+="and ";
        }
        ans+=NumToWords((n%100),"")

        return ans
    }
}



