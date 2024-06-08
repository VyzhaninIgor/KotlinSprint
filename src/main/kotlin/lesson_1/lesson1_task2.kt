package lesson_1

fun main() {
    val totalOrders: Int = 75
    val congratulationsMessage: String = "Спасибо за покупку! Мы ценим ваш выбор!"

    println("Количество заказов: $totalOrders\nТекст с благодарностью за покупку: $congratulationsMessage")

    var totalWorkers: Int = 2000
//    println("Количество работников: $totalWorkers")
    totalWorkers -= 1
    println("Количество работников: $totalWorkers")
}