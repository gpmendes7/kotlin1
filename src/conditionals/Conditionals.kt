package conditionals

fun main(args: Array<String>) {
   /*
    val age: Int = 24
    if(age < 18) {
        println("You cannot register.")
    } else if(age < 21) {
        println("Well, maybe you can register.")
    } else if(age < 27) {
        println("You should be able to register.")
    } else {
        println("You're good to go!")
    }

    println("The end.")
    */

    val mode: Int = 5

    when(mode) {
        1 -> println("The mode is lazy.")
        2 -> {
            println("The mode is 2.")
            println("So the mode is busy.")
        }
        3 -> println("The mode is super-productive.")
        else -> println("I don't know that mode.")
    }
}