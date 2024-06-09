package lesson_1

fun main() {
    val length: ULong = 40_868_600_000UL // расстояние не может принимать быть отрицательным
    val age: UByte = 27U // возраст также не может быть отрицательным значением
    val partOfDay: Float = 0.075F
    val seconds: UShort = 6480U // время, которе ЮГ провёл в космосе не может быть отрицательным значением
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: UInt = 327000U // Апогей - расстояние до самой дальней точки чего-то. Расстояние неотрицательное

    println("$length\n$age\n$partOfDay\n$seconds\n$partOfYear\n$apogee")


}