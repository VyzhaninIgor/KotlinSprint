package lesson_3

fun main() {
    var startPosition: String = "E2"
    var endPosition: String = "E4"
    var moveNumber: Int = 1

    var fullMove: String = "$startPosition-$endPosition,$moveNumber"
    println(fullMove)

    startPosition = "D2"
    endPosition = "D3"
    moveNumber = 2
    fullMove = "$startPosition-$endPosition,$moveNumber"
    println(fullMove)

}