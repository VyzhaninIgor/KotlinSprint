package lesson_4

const val WINTER_SEASON = "winter"
const val OPTIMAL_HUMIDITY_PERCENT = 20

fun isNotWinterSeasonNow(season: String): Boolean = season != WINTER_SEASON

fun isOptimalHumidityPercentage(humidityPercentage: Int): Boolean = humidityPercentage == OPTIMAL_HUMIDITY_PERCENT

fun main() {
    val isSunnyToday: Boolean = true
    val isTentOpen: Boolean = true
    val humidityPercentage: Int = 20
    val season: String = "winter"

    val areBeanConditionsMet: Boolean = isSunnyToday && isTentOpen && isNotWinterSeasonNow(season) && isOptimalHumidityPercentage(humidityPercentage)

    println("Благоприятные ли условия сейчас для роста бобовых? $areBeanConditionsMet")
}