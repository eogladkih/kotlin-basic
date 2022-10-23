//На вход подается 3 натуральных числа A, B, C - стороны треугольника.
//Определите тип треугольника (остроугольный, тупоугольный, прямоугольный) с данными сторонами.
//
//Ответ должен быть в виде строки с ответом на вопрос.
//
//Пример:
//
//Входные данные:
//5 8 6
//
//Ответ:
//тупоугольный




import java.util.*
import kotlin.system.exitProcess


fun main() {

    val input = Scanner(System.`in`)
    val ai = input.nextInt()
    val bi = input.nextInt()
    val ci = input.nextInt()
//
//    val a=0
//    val b=0
//    val c=0

    if (ai+bi<ci || ai>bi+ci || ai+ci<bi) {
        println("ERROR: Check your input. Wrong size")
        exitProcess(1)
    }


    if ((ai >= bi && ai > ci) || (ai > bi && ai >= ci)) {
        val a = ai
        val b = bi
        val c = ci

        if (a*a == b*b +c*c ){
            println("прямоуголный")
        }
        else if (a*a >= b*b +c*c ){
            println("тупоуголный")
        }
        else if (a*a < b*b +c*c ){
            println("остроуголный")
        }
    }

    if ((bi >= ai && bi > ci) || (bi > ai && bi >= ci)) {
        val a = bi
        val b = ai
        val c = ci

        if (a*a == b*b +c*c ){
            println("прямоуголный")
        }
        else if (a*a >= b*b +c*c ){
            println("тупоуголный")
        }
        else if (a*a < b*b +c*c ){
            println("остроуголный")
        }
    }

    if ((ci >= ai && ci > bi) || (ci > ai && ci >= bi)) {
        val a = ci
        val b = bi
        val c = ai

        if (a*a == b*b +c*c ){
            println("прямоуголный")
        }
        else if (a*a >= b*b +c*c ){
            println("тупоуголный")
        }
        else if (a*a < b*b +c*c ){
            println("остроуголный")
        }
    }



 }
