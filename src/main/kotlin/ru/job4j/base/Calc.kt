package ru.job4j.base

fun main() {
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
            when (true) {
                i == j, (i + j) == (size + 1) -> print("x")
                else -> print(" ")
            }
        }
        println()
    }
}

fun defragment(array: Array<String?>) : Array<String?> {
    val newArray = arrayOfNulls<String>(array.size)
    var idx = 0
    for (str in array) {
        if (str != null) {
            newArray[idx++] = str
        }
    }
    return newArray;
}