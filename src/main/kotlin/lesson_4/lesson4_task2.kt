package lesson_4

fun main() {
    val averageWeightMin = 35
    val averageWeightMax = 100
    val averageVolumeMax = 100

    val weightCargo1 = 20
    val volumeCargo1 = 80
    val weightCargo2 = 50
    val volumeCargo2 = 100

    println(
        "Груз с весом $weightCargo1 кг и объемом $volumeCargo1 л соответствует категории 'Average': " +
        "${weightCargo1 > averageWeightMin && weightCargo1 <= averageWeightMax && volumeCargo1 < averageVolumeMax}"
    )
    println(
        "Груз с весом $weightCargo2 кг и объемом $volumeCargo2 л соответствует категории 'Average': " +
        "${weightCargo2 > averageWeightMin && weightCargo2 <= averageWeightMax && volumeCargo2 < averageVolumeMax}"
    )


}