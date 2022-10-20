import java.util.*


fun main(args: Array<String>) {
    val nums = arrayOf(2, 1, 12,5, 89, 23, 76, 43, 12)
    Sort(nums)
    println(Arrays.toString(nums))

}


fun Sort(array: Array<Int>):Array<Int>{

    for (i in 0 until (array.size -1 )){
        for (j in 0 until (array.size - i - 1)) {
            if (array[j].compareTo(array[j + 1]) > 0)
            {
                val temp = array[j]
                array[j] = array[j+1]
                array[j + 1 ] = temp
            }

        }
    }

    return array
}


