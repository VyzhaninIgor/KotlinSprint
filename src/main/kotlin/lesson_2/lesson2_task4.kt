package lesson_2

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val materialExtractionBuff: Double = 0.2

    print("Кристаллическая руда(бонус): ${(crystalOre * materialExtractionBuff).toInt()}\n" +
            "Железная руда(бонус): ${(ironOre * materialExtractionBuff).toInt()}")

}