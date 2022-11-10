package `hw-4`
import java.util.*

//ДЗ-4 | Задача 2
//На вход подается натуральное число N. Напишите код, который будет вычислять факториал числа N.
//Важный момент: функционал по вычислению факториала должен быть вынесен в отдельную функцию, принимающую на вход N и возвращающую факториал числа
//
//Ответ должен содержать одно число.
//
//Пример:
//
//Входные данные:
//9
//
//Ответ:
//362880


fun main() {

    val input = Scanner(System.`in`)
    var number = input.nextLong()


    println(factorial(number))

}

fun factorial(input_number: Long, accum: Long = 1): Long {
    val soFar = input_number * accum
    return if (input_number <= 1) {
        soFar
    } else {
        factorial(input_number - 1, soFar)
    }
}
