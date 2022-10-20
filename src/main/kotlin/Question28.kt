fun main() {
    val cl = Calculate()
    println( cl.add(25,90))
    println( cl.add(90.6,60.5))
    println("\n ****----*****\n")
    println( cl.Substract(90,25))
    println( cl.Substract(90.6,60.5))

}

 class Calculate {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }



    fun Substract(a: Int, b: Int): Int {
        return a - b
    }
    fun Substract(a: Double, b: Double): Double {
        return a - b
    }

}
