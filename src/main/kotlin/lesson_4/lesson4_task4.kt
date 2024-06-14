package lesson_4

fun isEven(num: Int): Boolean = num % 2 == 0

fun main() {
    val dayOfExercises: Int = 1
    val isTodayEvenDay: Boolean = isEven(dayOfExercises)

    print("""
        Упражнения для рук: ${!isTodayEvenDay}
        Упражнения для ног: $isTodayEvenDay
        Упражнения для спины: $isTodayEvenDay
        Упражнения для пресса: ${!isTodayEvenDay}
        """.trimIndent())
}