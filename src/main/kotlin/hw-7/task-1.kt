package `hw-7`

/*
Необходимо описать класс, описываемый дробные числа (например, 1/2, 3/5).
Также реализовать методы сложения и вычитания объектов.
*/

//
data class Num(var a: Int, var b: Int) {
    init {
        if (b<=0) {
            throw IllegalArgumentException("zerodevision")
        }
    }
    override fun toString(): String {
        return "$a/$b"
    }
    operator fun plus(other: Num): Num {
        return Num(a*other.b + other.a*b, b*other.b)
    }

    operator fun minus(other: Num): Num {
        return Num(a*other.b - other.a*b, b*other.b)
    }

}

fun main(){
    val num1 = Num(10,2)
    val num2 = Num(10,2)

    println(num1 + num2)
    println(num1 - num2)
}
