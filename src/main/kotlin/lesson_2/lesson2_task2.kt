package lesson_2

fun main() {
    val totalStaffers: Int = 50
    val totalTrainees: Int = 30
    val staffersSalary: Int = 30_000
    val traineesSalary: Int = 20_000

    val totalSalaryOfStaffersCosts: Int = totalStaffers * staffersSalary
    val totalSalaryOfAllWorkersCosts: Int = totalSalaryOfStaffersCosts + totalTrainees * traineesSalary
    val averageSalaryInCompany: Int = totalSalaryOfAllWorkersCosts / (totalStaffers + totalTrainees)

    print("Расходы на выплату зарплаты постоянных сотрудников: $totalSalaryOfStaffersCosts\n" +
            "Общие расходы по ЗП после прихода стажеров: $totalSalaryOfAllWorkersCosts\n" +
            "Среднее ЗП одного сотрудника после устройства стажеров: $averageSalaryInCompany")
}