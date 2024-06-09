package lesson_1

fun getIntSetTime(num: Int): String {
    val time: String = num.toString()
    return when (time.length) {
        1 -> "0$time"
        2 -> time
        else -> "Incorrect num"
    }
}

fun main() {
    var seconds: Int = 6480

    var minutes: Int = seconds / 60
    seconds %= 60

    val hours: Int = minutes / 60
    minutes %= 60

    println("${getIntSetTime(hours)}:${getIntSetTime(minutes)}:${getIntSetTime(seconds)}")
}