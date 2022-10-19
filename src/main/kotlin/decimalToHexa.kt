import java.util.*

fun main() {

 println( DecimalToHex(550))

}

fun DecimalToHex(dec: Int): String {
    var dec = dec
    val hexDigits = charArrayOf(
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F')
    var hex = ""
    while (dec != 0) {
        val reminder = dec % 16
        hex = hexDigits[reminder].toString()+hex
        dec = dec / 16
    }
    return hex
}