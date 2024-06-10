package lesson_2

const val SECONDS_IN_MINUTE_AND_MINUTES_IN_HOUR: Int = 60


fun main() {
    val (startTripHours, startTripMinutes) = "9:39".split(":").map { it.toInt() }
    val timeSpentOnTheTripInMinutes: Int = 457
    val endTripHours: Int
    val endTripMinutes: Int

    if (timeSpentOnTheTripInMinutes % SECONDS_IN_MINUTE_AND_MINUTES_IN_HOUR + startTripMinutes >= SECONDS_IN_MINUTE_AND_MINUTES_IN_HOUR) {
        endTripMinutes =
            timeSpentOnTheTripInMinutes % SECONDS_IN_MINUTE_AND_MINUTES_IN_HOUR + startTripMinutes - SECONDS_IN_MINUTE_AND_MINUTES_IN_HOUR
        endTripHours = timeSpentOnTheTripInMinutes / SECONDS_IN_MINUTE_AND_MINUTES_IN_HOUR + startTripHours + 1
    } else {
        endTripMinutes = timeSpentOnTheTripInMinutes % SECONDS_IN_MINUTE_AND_MINUTES_IN_HOUR + startTripMinutes
        endTripHours = timeSpentOnTheTripInMinutes / SECONDS_IN_MINUTE_AND_MINUTES_IN_HOUR + startTripHours
    }

    print("%02d:%02d".format(endTripHours, endTripMinutes))
}