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
    var ai = input.nextInt()
    var bi = input.nextInt()
    var ci = input.nextInt()

    var a=0
    var b=0
    var c=0

    if (ai+bi<ci || ai>bi+ci || ai+ci<bi) {
        println("ERROR: Check your input. Wrong size")
        exitProcess(1)
    }


    if ((ai >= bi && ai > ci) || (ai > bi && ai >= ci)) {
        var a = ai
        var b = bi
        var c = ci
    }

    if ((bi >= ai && bi > ci) || (bi > ai && bi >= ci)) {
        var a = bi
        var b = ai
        var c = ci
    }

    if ((ci >= ai && ci > bi) || (ci > ai && ci >= bi)) {
        var a = ci
        var b = bi
        var c = ai
    }

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
