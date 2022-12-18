package `hw-7`

import java.time.LocalDate
import java.time.LocalDateTime
import java.util.Date

/*
Необходимо перенести предложенное текстовое описание структуры класса в код,
сохраняя все требовании и назавние полей или методов.
Методы можно не реализовывать, достаточно сделать их компилируемыми.


Заказ

Класс Order, описывающий заказ на покупку в магазине.

Должен содержать поля с данными:

дата оформления (date: Date)
текущий статус (status: OrderStatus), где OrderStatus - enum из: отправлен, ждет оплаты, оплачен, обрабатывается, получен
покупатель (customer: Customer)
детали заказа (details: OrderDetails)
опциональная оплата (payment: Payment?)

Также должен содержать методы и конструкторы:

конструктор, в который передаются объекты Customer, OrderDetails, опциональная оплата Payment?
calcPrice(): Int
calcWeight(): Int
pay(payment: Payment): Unit

Детали заказа

Класс OrderDetails, описывающий детали заказа

Должен содержать поля с данными:

локация в виде строки (location: String)
список товаров (items: List<OrderItem>)

Также должен содержать методы и конструкторы:

конструктор, в который передается список товаров List<OrderItem>
calcPrice(): Int
calcWeight(): Int
addItem(item: OrderItem): Unit

Товар

Data Класс OrderItem, описывающий каждый товар по отдельности

Должен содержать поля с данными:

название (name: String)
вес (weight: Double)
цена (price: Int)

Также должен содержать методы и конструкторы:

конструктор, в который передаются цена, вес и название товара

Покупатель

Класс Customer, описывающий покупателя в сервисе

Должен содержать поля с данными:

имя (name: String)
опциональный адрес в виде строки (address: String?)
список заказов (orders: List<Order>)

Также должен содержать методы и конструкторы:

конструктор, в который передается имя
конструктор, в который передается имя и адрес (не обязательно создвавать как отдельный конструктор)
calcPrice(): Int
calcWeight(): Int
addItem(item: OrderItem): Unit

Оплата

Класс Payment, описывающий способ оплаты и её состояние. Такой класс можно сделать абстрактным

Должен содержать поля с данными:

кол-во (amount: Int)
тип валюты (currency: Currency), где Currency - enum как минимум из: рубли, доллары, евро. такой enum должен содержать в качестве значения текстовый код валюты, например, для рублей - это "rub"
статус платежа (status: PaymentStatus), где PaymentStatus - enum из: не оплачен, в обработке, оплачен

Также должен содержать методы и конструкторы:

конструктор, в который передается кол-во и тип валюты
performPayment(): Unit

Оплата наличными

Класс CashPayment, который должен наследоваться от Payment и обаладать доп полем:

необходимое кол-во для оплаты (amount: Int)
кол-во, которое было передано (total: Int)
сдача, если нет, то 0 (change: Int)

Также должен быть перезаписан метод performPayment()
Оплата онлайн

Класс OnlinePayment, который должен наследоваться от Payment и обаладать доп полями и функциями:

bankId: String
bankName: String
checkIfSucceed(): PaymentStatus

Также должен быть перезаписан метод performPayment()
Отложенная оплата

Класс DelayedPayment, который должен наследоваться от Payment и обаладать доп полями и функциями:

endDate: Date
partAmount: String
performPartialPayment(amount: Int): Unit

Также должен быть перезаписан метод performPayment()
Footer
*/

enum class OrderStatus{
    отправлен, `ждет оплаты`, оплачен, обрабатывается, получен
}


class Order(customer: Customer,details: OrderDetails, payment: Payment? ){
    val date: LocalDate = LocalDate.now()
    val status: OrderStatus = OrderStatus.получен


    fun calcPrice(): Int {
        return 1
    }
    fun calcWeight(): Int {
        return 1
    }
    fun pay(payment: Payment): Unit {

    }

}

class OrderDetails(items: List<OrderItem>) {

    val location: String = ""

    fun calcPrice(): Int {
        return 1
    }
    fun calcWeight(): Int {
        return 1
    }
    fun addItem(item: OrderItem): Unit {

    }

}

class OrderItem(
    name: String,
    weight: Double,
    price: Int ){

    }

class Customer(
    val name: String,
    val address: String?,
    val orders: List<Order>){


    fun calcPrice(): Int {
        return 1
    }
    fun calcWeight(): Int {
        return 1
    }
    fun addItem(item: OrderItem): Unit {}

}


enum class Currency{
    rub, usd, eu, bhd, cuc, thb

}

enum class PaymentStatus{
    `не оплачен`, `в обработке`, оплачен
}


abstract class Payment(
    open val amount: Int,
    open val currency: Currency){

    lateinit var status: PaymentStatus

    abstract fun performPayment(): Unit

}

class CashPayment(
    val total: Int,
    val change: Int,
    override val amount: Int,
    override val currency: Currency

    ): Payment(amount, currency){



    override fun performPayment() {}
}

class OnlinePayment(
    val bankId: String,
    val bankName: String,
    override val amount: Int,
    override val currency: Currency
    ): Payment(amount, currency){


    fun checkIfSucceed(): PaymentStatus {
        return this.status
    }

    override fun performPayment() {

    }
}

class DelayedPayment(
    val endDate: Date,
    val partAmount: String,
    override val amount: Int,
    override val currency: Currency
    ): Payment(amount, currency) {


    fun performPartialPayment(amount: Int): Unit {

    }

    override fun performPayment() {

    }
}