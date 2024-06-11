package lesson_3

fun main() {
    val userName: String = "Ivan Ievetrov"

    var greeting: String  = "Добрый день, $userName"
    println(greeting)

    greeting = "Добрый вечер, $userName"
    println(greeting)
}