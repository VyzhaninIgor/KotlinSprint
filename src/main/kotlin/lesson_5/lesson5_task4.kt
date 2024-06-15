package lesson_5

fun main() {
    val listOfPassengers: MutableMap<String, String> = mutableMapOf("Zaphod" to "PanGalactic")
    val passengerPassword: String

    println(
        """
        Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold". [вздыхает...]
        Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.
        Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...]
        Да, вперед, пожалуйста, вводите свои данные...
        """.trimIndent()
    )
    val passengerLog: String = readln()

    if (passengerLog in listOfPassengers.keys) {
        println(
        """
        [вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь "$passengerLog"
        Введите пароль: 
        """.trimIndent()
        )
        passengerPassword = readln()

        if (listOfPassengers[passengerLog] == passengerPassword) {
            println(
            """
            вам разрешено входить на борт корабля "Heart of Gold". Хотя мне всё равно... Ну вперед, войдите...
            Если вам так уж надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание
            здесь больше, чем мне.
            """.trimIndent()
            )

        } else println("Неверный пароль")

    }
    else
        println("Вас нет в списке. Хотите зарегистрироваться?")
}