package lesson_3

fun main() {
    val fullMove: String = "D2-D4;0"

    val (startPosition: String, endPosition: String, moveNumberStr: String) = fullMove.split('-', ';')
    val moveNumber: Int = moveNumberStr.toInt()

    println(startPosition)
    println(endPosition)
    print(moveNumber)
}