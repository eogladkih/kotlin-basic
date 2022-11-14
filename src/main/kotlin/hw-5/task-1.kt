package `hw-5`

import java.util.*

//На вход подается 4 целых числа. Напишите метод, который будет возвращать минимальное из этих чисел.

fun main() {
    val input = Scanner(System.`in`)
    var a1 = input.nextInt()
    var a2 = input.nextInt()
    var a3 = input.nextInt()
    var a4 = input.nextInt()

    val aaa = listOf(a1,a2,a3,a4)
    println(aaa.min())
}
