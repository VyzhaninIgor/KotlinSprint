package lesson_5

import java.time.*

const val AGE_OF_MAJORITY: Int = 18

fun main() {
    val currentYear: Int = LocalDate.now().year
    val yearOfBirth: Int
    val personAge: Int

    print("Введите год своего рождения: ")

    yearOfBirth = readln().toInt()
    personAge = currentYear - yearOfBirth

    if (personAge >= AGE_OF_MAJORITY)
        print("Показать экран со скрытым контентом")
    else
        print("Вернуться на главный экран")
}