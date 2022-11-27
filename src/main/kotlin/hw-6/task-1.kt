package `hw-6`

import java.util.*

//
//На вход подается целое натуральное число N. Далее через пробел подаются N чисел от 0 до 100000.
//Нужно вывести эти числа в сортировоном виде от меньшего к большему через пробел.
//
//Пример:
//
//Входные данные:
//15
//6 45 2 5 65 7 672 3 12 9 87 45 76 355 326
//
//Ответ:
//2 3 5 6 7 9 12 45 45 65 76 87 326 355 672
//

fun main() {
    val input = Scanner(System.`in`)
    val inputNumber = input.nextLine()
    val numberList = input.nextLine().split(" ").map{it.toInt()}.toList()



    println(numberList
        .sorted()
        .toString()
        .replace("""[\[,\]]""".toRegex(),"")
    )
}
