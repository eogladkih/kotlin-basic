package `hw-6`

import java.util.*

//На вход подается массив чисел, содержащий минимум одно число.
// Нужно вывести через пробел: минимальное, среднее и максимальное числа из этого массива.
//
//Ответ три числа через пробел.
//
//Пример:
//
//Входные данные:
//7 54 56 23 4 45 8 10 9
//
//Ответ:
//4 24 56

fun main() {
    val input = Scanner(System.`in`)
    val inputNumber = input.nextLine().split(" ").map{it.toInt()}.toList()

    println("${inputNumber.min()} ${inputNumber.average().toInt()} ${inputNumber.max()}")
}