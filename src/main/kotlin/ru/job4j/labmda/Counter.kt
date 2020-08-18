package ru.job4j.labmda

fun count(list: ArrayList<Int>) : Long {
    return list
            .stream()
            .filter { it % 2 == 0 }
            .map { it + 1 }
            .count()
}