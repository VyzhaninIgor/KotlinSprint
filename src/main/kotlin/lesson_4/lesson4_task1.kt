package lesson_4

const val SEATS_IN_CAFE = 13

fun main() {
    val orderSeatsToday: Int = 13
    val orderSeatsTomorrow: Int = SEATS_IN_CAFE - 4

    print(
        "Доступность столиков на сегодня: ${orderSeatsToday < SEATS_IN_CAFE}\n" +
        "Доступность столиков на завтра: ${orderSeatsTomorrow < SEATS_IN_CAFE}"
    )
}