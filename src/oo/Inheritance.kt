package oo

abstract class Person(open val name: String, open var age: Int) {
    abstract fun speak()

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2016 - age
}

class Student(override val name: String, override var age: Int, val studentID: Long): Person(name, age) {
    fun isIntelligent() = true

    override fun speak() {
        println("Hi there, I'm a student!")
    }
}

class Employee(override val name: String, override var age: Int): Person(name, age){
    fun receivePayment() {
        println("Received payment.")
    }

    override fun speak() {
        println("Hi I'm a employee!")
    }
}

fun main(args: Array<String>) {
    val student = Student("John", 25, 100)
    student.speak()

    println(student.isIntelligent())

    val employee = Employee("Mary", 32)
    employee.getYearOfBirth()

    employee.receivePayment()
    employee.speak()
}
