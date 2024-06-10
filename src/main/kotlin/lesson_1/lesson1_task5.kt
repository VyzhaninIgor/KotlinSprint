package lesson_1

const val SECONDS_PER_MINUTE: Int = 60
const val MINUTES_PER_HOUR: Int = 60


fun main() {
    val timeInSpaceSec: Int = 6480
    val seconds: Int = timeInSpaceSec % SECONDS_PER_MINUTE
    val minutes: Int =
        timeInSpaceSec / SECONDS_PER_MINUTE % MINUTES_PER_HOUR
    val hours: Int =
        timeInSpaceSec / SECONDS_PER_MINUTE / MINUTES_PER_HOUR

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}