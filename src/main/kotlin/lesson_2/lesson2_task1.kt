package lesson_2

fun main() {
    val studentGrades: IntArray = intArrayOf(3, 4, 3, 5)
    val averageValue: Double = studentGrades.sum().toDouble() / studentGrades.size

    println("%.2f".format(averageValue))
}