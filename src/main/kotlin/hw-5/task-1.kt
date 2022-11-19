package `hw-5`

import java.util.*

//На вход подается 4 целых числа. Напишите метод, который будет возвращать минимальное из этих чисел.

fun main() {
    val input = Scanner(System.`in`)
    val num1 = input.nextInt()
    val num2 = input.nextInt()
    val num3 = input.nextInt()
    val num4 = input.nextInt()

    val numList = listOf(num1,num2,num3,num4)
    println(numList.min())
}
