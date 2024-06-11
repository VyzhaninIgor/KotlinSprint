package lesson_2

import kotlin.math.pow

fun calculateCompoundInterest(startDeposit: Int, interestRate: Double, depositPeriod: Int): Double =
    startDeposit * ((1 + interestRate / 100).pow(depositPeriod))

fun main() {
    val startDeposit: Int = 70_000
    val interestRate: Double = 16.7
    val depositPeriod: Int = 20
    println("%.3f".format(calculateCompoundInterest(startDeposit, interestRate, depositPeriod)))
}