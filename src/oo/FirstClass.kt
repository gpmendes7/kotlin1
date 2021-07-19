package oo

class Person {
    var name: String = "Sarah"
    var age: Int = 42
}

fun main(args: Array<String>) {
    val person = Person()
    println(person.name)
    println(person.age)

    person.name = "Peter"
    println(person.name)

    person.age = 22
}