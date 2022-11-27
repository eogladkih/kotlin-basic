package `hw-5`

import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

//На вход подается 4 целых числа x1, x2, y,1, у2 (-10000<x1,x2,y,1,у2<10000).
// Напишите метод, который будет возвращать вещественное число типа double -
// длину отрезка с концами в точках (x1,y1) и (x2,y2).


fun main() {
    val input = Scanner(System.`in`)
    val x1 = input.nextInt()
    val x2 = input.nextInt()
    val y1 = input.nextInt()
    val y2 = input.nextInt()

    println(coord(x1,x2,y1,y2) ?: "points out of limits")

}

fun coordCalc(a: Int,b: Int): Double {
    return (a.toDouble() - b.toDouble()).pow(2.0)
}

fun ckeckLimits(a: Int,b: Int,c: Int,d: Int): Boolean {
    val coordList = listOf<Int>(a,b,c,d)
    return coordList.all { -10000 < it && it < 10000}

}

fun coord(a: Int,b: Int,c: Int,d: Int): Double? {
    if (!ckeckLimits(a, b, c, d))
        return null
    return sqrt(coordCalc(b, a) + coordCalc(d, c))

}
