package lesson_3

fun main() {
    val personName: String = "Татьяна"
    var personSurname: String = "Андреева"
    val personPatronymic: String = "Сергеевна"
    var personAge: Int = 20

    println("$personSurname $personName $personPatronymic, $personAge")

    personAge = 22
    personSurname = "Сидорова"

    println("$personSurname $personName $personPatronymic, $personAge")
}