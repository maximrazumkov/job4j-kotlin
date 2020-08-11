package ru.job4j.labmda

fun main() {
    val decrement = {x : Int -> x - 1}
    val powSquare = {x : Int -> x * x}

    var rsl = decrement(5)
    println(rsl)

    rsl = powSquare(5)
    println(rsl)
}