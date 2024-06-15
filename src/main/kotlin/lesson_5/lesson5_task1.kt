package lesson_5

fun main() {
    val firstSummand: Int = readln().toInt()
    val secondSummand: Int = readln().toInt()
    val sumOfTheNumbers: Int = readln().toInt()

    if (firstSummand + secondSummand == sumOfTheNumbers)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")

}