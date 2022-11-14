package `hw-5`

import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

//На вход подается 4 целых числа x1, x2, y,1, у2 (-10000<x1,x2,y,1,у2<10000).
// Напишите метод, который будет возвращать вещественное число типа double -
// длину отрезка с концами в точках (x1,y1) и (x2,y2).


fun main() {
    val input = Scanner(System.`in`)
    var x1 = input.nextInt()
    var x2 = input.nextInt()
    var y1 = input.nextInt()
    var y2 = input.nextInt()


    println(sqrt(coord(x2,x1) + coord(y2,y1)))
}

fun coord(a: Int,b: Int): Double {
    return (a.toDouble() - b.toDouble()).pow(2.0)
}