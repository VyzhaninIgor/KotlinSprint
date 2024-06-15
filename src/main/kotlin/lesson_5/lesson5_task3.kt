package lesson_5

fun main() {
    val winNumbers: IntArray = intArrayOf(27, 32)
    val firstUserNumber: Int
    val secondUserNumber: Int

    print(
        """
        Уххххххх... 
        Тебя ждёт такой большой выигрыш, что с ним можно стать настоящей рок звездой. 
        Главное не попади в клуб к Кобейну и Хендриксу. А теперь введи первое число: 
        """.trimIndent()
    )
    firstUserNumber = readln().toInt()

    print(
        """
          Отлично, осталось ввести последнее число. Кстати, мы же тут все крутые программисты,
          которые шарят за computer science. Например каждый программист знает, что такое ip-адрес и
          несомненно помнит каким количеством бит он кодируется.
          Ну так о чём я, введи второе число: 
          """.trimIndent()
    )
    secondUserNumber = readln().toInt()

    when {
        firstUserNumber in winNumbers && secondUserNumber in winNumbers -> println("Поздравляем! Вы выиграли главный приз!")
        firstUserNumber in winNumbers || secondUserNumber in winNumbers -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }

    print("Правильные значения: ${winNumbers.joinToString()}")
}