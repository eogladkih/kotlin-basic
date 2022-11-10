package `hw-3`
//На вход подается целое неотрицательное число 𝑋, 𝑋<100.
//Требуется перевести это число в римскую систему счисления.
//
//Ответ должен быть в виде строки.
//
//Пример:
//
//Входные данные:
//68
//
//Ответ:
//LXVIII




import java.util.*
import kotlin.system.exitProcess


fun main() {

    val input = Scanner(System.`in`)
    var a = input.nextInt()

    var ones = when (a%10) {
        0 -> ""
        1 -> "I"
        2 -> "II"
        3 -> "III"
        4 -> "IV"
        5 -> "V"
        6 -> "VI"
        7 -> "VII"
        8 -> "VIII"
        9 -> "IX"
        else -> {
            println("ERROR: Check your input")
            exitProcess(1)
        }
    }


    var tenth = when (a/10) {
        1 -> "X"
        2 -> "XX"
        3 -> "XXX"
        4 -> "XL"
        5 -> "L"
        6 -> "LX"
        7 -> "LXX"
        8 -> "LXXX"
        9 -> "XC"
        else -> {
            println("ERROR: Check your input")
            exitProcess(1)
        }

    }

    println("$tenth$ones")


}