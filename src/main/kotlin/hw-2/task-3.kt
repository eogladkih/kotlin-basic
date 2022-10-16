//На вход подается два натуральных числа: A и B. Они являются сторонами прямоугольника.
//Требуется вычислить квадрат диагонали прямоугольника.
//
//Ответ должен содержать одно действительное число, округленное до 3 знаков после запятой.
//
//Пример:
//
//Входные данные:
//10 3
//
//Ответ:
//10.440

import java.util.*
import kotlin.math.sqrt

fun main() {
    val input = Scanner(System.`in`)
    val a = input.nextDouble()
    val b = input.nextDouble()

    val res = sqrt( a*a + b*b )

    println(String.format("%.3f", res)) // output result
}


