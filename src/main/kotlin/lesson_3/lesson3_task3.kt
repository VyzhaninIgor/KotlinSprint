package lesson_3

fun main() {
    val firstMultiplier: Int = readln().toInt()
    val multiplicationTable = StringBuilder()

    for (secondMultiplier in 1..9) {
        multiplicationTable.append("$firstMultiplier x $secondMultiplier = ${firstMultiplier * secondMultiplier}\n")
    }

    print(multiplicationTable.trim())
}