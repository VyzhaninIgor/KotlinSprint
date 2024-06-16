package lesson_5

import kotlin.random.Random

fun main() {
    val winList: List<Int> = List(3) { Random.nextInt(0, 42) }
    val userList: List<Int> = List(3) { readln().toInt() }

    val sameNumberSet = userList.intersect(winList.toSet())

    when (sameNumberSet.size) {
        3 -> println("джекпот")
        2 -> println("крупный приз")
        1 -> println("утешительный приз")
        else -> println("Неудача")
    }

    print("Выигрышные числа: ${winList.joinToString()}")
}