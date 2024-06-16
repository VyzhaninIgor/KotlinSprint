package lesson_4

const val OPTIMAL_CREW_NUMBER = 70
const val MINIMAL_CREW_NUMBER = 55
const val OPTIMAL_NUMBER_BOXES_PROVISIONS = 50

fun canShipGoToTravel(isShipNotDamaged: Boolean, crewNumber: Int, numberBoxesProvisions: Int, isWeatherGood: Boolean): Boolean {
    val isOptimalCrewNumber: Boolean = crewNumber in (MINIMAL_CREW_NUMBER until OPTIMAL_CREW_NUMBER)
    val isPerfectCrewNumber: Boolean = crewNumber == OPTIMAL_CREW_NUMBER
    val isOptimalNumberBoxesProvisions: Boolean = numberBoxesProvisions > OPTIMAL_NUMBER_BOXES_PROVISIONS
    val isPerfectNumberBoxesProvisions: Boolean = numberBoxesProvisions >= OPTIMAL_NUMBER_BOXES_PROVISIONS

    return (isShipNotDamaged && isOptimalCrewNumber && isOptimalNumberBoxesProvisions) ||
            (isPerfectCrewNumber && isPerfectNumberBoxesProvisions && isWeatherGood)
}

fun main() {
    val isShipNotDamaged: Boolean = readln().toBoolean()
    val crewNumber: Int = readln().toInt()
    val numberBoxesProvisions: Int = readln().toInt()
    val isWeatherGood: Boolean = readln().toBoolean()

    println(canShipGoToTravel(isShipNotDamaged, crewNumber, numberBoxesProvisions, isWeatherGood))
}
