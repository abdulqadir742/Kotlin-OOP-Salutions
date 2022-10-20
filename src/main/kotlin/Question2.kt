fun main(args: Array<String>) {
    var low = 1
    var high = 100

    while (low < high) {
        if (checkPrimeNumber(low))
            print(low.toString() + " ")

        ++low
    }

}

fun checkPrimeNumber(num: Int): Boolean {
    var result = true

    for (i in 2..num/2) {

        if (num % i == 0) {
            result = false
            break
        }
    }

    return result
}