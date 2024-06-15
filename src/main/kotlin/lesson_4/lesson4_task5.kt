package lesson_4

fun canShipGoToTravel(isShipNotDamaged: Boolean, crewNumber: Int, numberBoxesProvisions: Int, isWeatherGood: Boolean): Boolean {
    val optimalCrewNumber: Boolean = crewNumber in (55 until 70)
    val perfectCrewNumber: Boolean = crewNumber == 70
    val optimalNumberBoxesProvisions: Boolean = numberBoxesProvisions > 50
    val perfectNumberBoxesProvisions: Boolean = numberBoxesProvisions >= 50

    return (isShipNotDamaged && optimalCrewNumber && optimalNumberBoxesProvisions) ||
            (perfectCrewNumber && perfectNumberBoxesProvisions && isWeatherGood)
}

fun main() {
    val isShipNotDamaged: Boolean = readln().toBoolean()
    val crewNumber: Int = readln().toInt()
    val numberBoxesProvisions: Int = readln().toInt()
    val isWeatherGood: Boolean = readln().toBoolean()

    println(canShipGoToTravel(isShipNotDamaged, crewNumber, numberBoxesProvisions, isWeatherGood))
}
