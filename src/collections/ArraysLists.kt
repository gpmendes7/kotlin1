package collections

fun main(args: Array<String>) {
    val array = arrayOf("Texas", "Iowa", "California")
    val mixed = arrayOf("Kotlin", 117, 3.0, false)
    val numbers = intArrayOf(1,2,3,4,5)
    println(mixed[0])
    mixed[2] = 3.1415
    println(mixed[2])
    val str = "Udemy"
    println(str[0])

    val states = arrayOf("Nevada", "Florida")
    val allStates = array + states

    println(allStates.size)

    val empty: Boolean = numbers.isEmpty()

    if(states.contains("Kentucky")) {
        println("It contains Kentucky")
    } else {
        println("It does not")
    }

    val list = listOf("Orange", "Apple", "Bananas")

    val arrayList = arrayListOf("Patrick", "Michael", "Sarah")
    arrayList.add("Sandra")
}
