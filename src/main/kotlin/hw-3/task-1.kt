//Напишите программу, которая вводит с клавиатуры номер месяца и день, и определяет,
//сколько дней осталось до Нового Года. При вводе неверных данных должно быть выведено
//сообщение об ошибке. Считается, что год невисокосный.
//На вход подается два натуральных числа: месяц и день.
//
//Ответ должен содержать натуральное число - кол-во дней до Нового Года.
//
//Пример:
//
//Входные данные:
//8 1
//
//Ответ:
//152




import java.util.*
import kotlin.system.exitProcess


fun main() {
    val input = Scanner(System.`in`)
    var month = input.nextInt()
    var day = input.nextInt()

    var res = 0

// TODO: обернуть when в функцию и реализовать более точную проверку для числа дней
    if (month in 1..12 && day in 1..31) {
        for (i in 1 until (month)) {
            val nDays = when (i) {
                1, 3, 5, 6, 8, 10, 12 -> 31
                2 -> 28
                else -> 30
            }
            res += nDays
        }
        res += day

    }
    else {
        println("ERROR: Check your input")
        exitProcess(1)
    }



    println(365-res)
}