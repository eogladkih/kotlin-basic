package `hw-8`

import java.util.Date

class Department(
    name: String,
    employees: Set<Employee>): PersonCount {

    fun addEmployee(emp: Employee): Unit{}
    fun removeEmployee(emp: Employee): Unit {}
    override fun personCount() {}
}

class Employee(
    override var surname: String,
    override var name: String,
    val pastPosition: Set<PastPosition>,
    val department: Department,
    val position: String,
    val room: Set<Room>
): Man(surname, name) {
    lateinit var idCard: IdCard

    fun deletePastPosition(pastPos: PastPosition): Unit {}
    fun deleteRoom(room: Room): Unit {}
}

class PastPosition(
    name: String,
    department: Department
) {}

class IdCard(
    number: Int,
    dateExpire: Date) {}

class Room(number: Int) {}


abstract class Man(
    open val surname: String,
    open val name: String
){

}

interface PersonCount {
    fun personCount()
}