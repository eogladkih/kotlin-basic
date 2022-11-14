package `hw-5`

import java.util.*

//Реализуйте метод, который будет валидировать пароль. Пароль должен быть достаточно сложным,
// поэтому должны выполняться следующие минимальные правила:
//
//Длина минимум 6 символов.
//Минимум одна цифра.
//Минимум одна заглавная буква.
//Не должно быть 3 одинаковых символа подряд.*

fun main() {
    val input = Scanner(System.`in`)
    var pass = input.nextLine()


    println(check(pass))
}

fun len(s: String): Boolean{
     return (s.length >= 6)

}

fun digit(s: String): Boolean{
    for (i in s) {
        if (i.isDigit()) {
            return true
            break
        }
    }
    return false
}

fun capital(s: String): Boolean {
    for (i in s) {
        if (i.isLetter() && i.toString() == i.uppercase()) {
            return true
            break
        }
    }
    return false
}

fun same3(s: String): Boolean {
    for (i in 0..s.length-3){
        if (s[i] == s[i+1] && s[i] == s[i+2]) {
            return false
            break
        }
    }
    return true
}

fun check(s: String): Boolean = len(s) && digit(s) && capital(s) && same3(s)