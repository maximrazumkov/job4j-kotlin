package ru.job4j.base

fun main() {
    /*
    val plus = summ(27, 73)
    println("27 + 73 = $plus")

    val minus = subtraction(96, 34)
    println("96 - 34 = $minus")

    val prod = multiplication(15, 15)
    println("15 * 15 = $prod")

    val div = division(64, 16)
    println("64 / 16 = $div")

     */
    draw(8)
}

fun summ(first : Int, second : Int) : Int {
    return first + second;
}

fun subtraction(first : Int, second : Int) : Int {
    return first - second;
}

fun multiplication(first : Int, second : Int) : Int {
    return first * second;
}

fun division(first : Int, second : Int) : Int {
    return first / second;
}

fun max(first : Int, second: Int, thrid : Int) : Int {
    val rsl = if (first > second) first else second
    return if (rsl > thrid) rsl else thrid
}

fun draw(size : Int) {
    for (i in 1 .. size) {
        for (j in 1 .. size) {
            if (i == j || (i + j) == (size + 1)) print("x") else print(" ")
        }
        println()
    }
}