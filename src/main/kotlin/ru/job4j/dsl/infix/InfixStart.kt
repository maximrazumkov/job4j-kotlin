package ru.job4j.dsl.infix

import java.util.function.Predicate

fun main() {
    val value = InfixTest(10);
    println(value eq 5 * 2)
    println(value notEq  5 * 2)
    println(value isTrue Predicate { it < 10 } )
}