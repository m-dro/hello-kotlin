@file:JvmName("Test") // with this you can call below methods in Java using Test.methodName() instead of Main.methodName()
package pl.mirekdrozd.hello_kotlin

import java.io.InvalidClassException

fun main(args: Array<String>) {
    println("Hello World!")

    val name = "Mirek"
    println("Hello, $name")
    printText(name)

    println("Hello, ${getName()}")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")


    val immutableList = listOf("Item")
//    immutableList.add("Compiler error")

    val mutableList = mutableListOf("Item")
    mutableList.add("Can add new items")

    showSeparator() // using default values
    showSeparator('@') // specifying only first argument
    showSeparator(times = 3) // if you want to specify second arg, you must use its name
    showSeparator(times = 4, character = '^') // you can use args in any order as long as you provide their names

    val ifIsExpressionInKotlin = if (name == "Mirek") true else false

}

fun getName(): String {
    return "Piotr"
}

fun printText(text: String) {  // return type is Unit - analogue of Java's void
    fun thisIsLocalFunction() = " >>> Local function called"
    println(text + thisIsLocalFunction())

}

// Note: package-level functions in Kotlin can be called in Java as static methods, e.g. Main.getName()

fun withExpressionBody(a: Int, b: Int): Int = a + b

@JvmOverloads // with this you can use this function in Java with only some arguments specified
// (without this annotation, you'd have to specify all args)
fun showSeparator(character: Char='*', times: Int=10) {
    repeat(times) {
        print(character)
    }
}

fun makeSound(pet: Animal) {
    when(pet) {
        is Cat -> pet.meow()
        is Dog -> pet.woof()
        else -> throw InvalidClassException("Must be Animal")
    }
}


