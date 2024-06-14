package lesson_4

fun isEven(num: Int): Boolean = num % 2 == 0

fun main() {
    val dayOfExercises: Int = 2

    val isTodayEvenDay: Boolean = isEven(dayOfExercises)

    val armsExercises: Boolean = !isTodayEvenDay
    val legsExercises: Boolean = isTodayEvenDay
    val backExercises: Boolean = isTodayEvenDay
    val pressExercises: Boolean = !isTodayEvenDay

    print("""
        Упражнения для рук: $armsExercises
        Упражнения для ног: $legsExercises
        Упражнения для спины: $backExercises
        Упражнения для пресса: $pressExercises
        """.trimIndent())
}