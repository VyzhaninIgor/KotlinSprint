package lesson_2

const val MINUTES_PER_HOUR: Int = 60


fun main() {
    val (startTripHours, startTripMinutes) = "9:39".split(":").map { it.toInt() }
    val tripSpentTimeInMinutes: Int = 457
    val endTripHours: Int
    val endTripMinutes: Int

    val endTripTimeInMinutes: Int = startTripHours * MINUTES_PER_HOUR + startTripMinutes + tripSpentTimeInMinutes
    endTripMinutes = endTripTimeInMinutes % MINUTES_PER_HOUR
    endTripHours = endTripTimeInMinutes / MINUTES_PER_HOUR

    print("%02d:%02d".format(endTripHours, endTripMinutes))
}