package lesson_3

fun main() {
    val fullMove: String = "D2-D4;0"

    val startPosition: String = fullMove.split('-')[0]
    val endPosition: String = fullMove.split('-')[1].split(';')[0]
    val moveNumber: Int = fullMove.split(';')[1].toInt()

    println(startPosition)
    println(endPosition)
    println(moveNumber)
}