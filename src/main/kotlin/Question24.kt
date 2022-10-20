fun main() {

    val mt = Math()
    println( mt.minimum(10,20))
    println( mt.maximum(10,20))
    println( mt.abs(-10))
    println( mt.ceil(23.1))
}

class Math
{

    fun minimum(value1:Int , value2:Int)
    {
        if (value1 < value2)
        {
            println("The Minimum value is : $value1")
        }
        else
        {
            println("The Minimum value is : $value2")
        }
    }
    fun maximum(value1:Int , value2:Int){
        if (value1 > value2) {
            println("The Maximum value is :  $value1")
        }
        else
        {
            println("The Maximum value is : $value2")
        }
    }

    fun ceil(b:Double)
    {
        var x = b.toInt()+1
        println(x)
    }

    fun abs(a: Int): Int {
        return if (a <= 0) 0 - a else a
    }
}