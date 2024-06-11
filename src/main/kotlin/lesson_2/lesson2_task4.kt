package lesson_2

fun percent(value: Int): Double = value / 100.0

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val materialExtractionBuff: Int = 20

    print(
        "Кристаллическая руда(бонус): ${(crystalOre * percent(materialExtractionBuff)).toInt()}\n" +
        "Железная руда(бонус): ${(ironOre * percent(materialExtractionBuff)).toInt()}"
    )

}