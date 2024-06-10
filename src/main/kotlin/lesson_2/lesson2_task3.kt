package lesson_2

const val MINUTES_PER_HOUR: Int = 60


fun main() {
    val (startTripHours, startTripMinutes) = "9:39".split(":").map { it.toInt() }
    val tripSpentTimeInMinutes: Int = 457
    val endTripHours: Int
    val endTripMinutes: Int

    if (tripSpentTimeInMinutes % MINUTES_PER_HOUR + startTripMinutes >= MINUTES_PER_HOUR) {
        endTripMinutes =
            tripSpentTimeInMinutes % MINUTES_PER_HOUR + startTripMinutes - MINUTES_PER_HOUR
        endTripHours = tripSpentTimeInMinutes / MINUTES_PER_HOUR + startTripHours + 1
    } else {
        endTripMinutes = tripSpentTimeInMinutes % MINUTES_PER_HOUR + startTripMinutes
        endTripHours = tripSpentTimeInMinutes / MINUTES_PER_HOUR + startTripHours
    }

    print("%02d:%02d".format(endTripHours, endTripMinutes))
}