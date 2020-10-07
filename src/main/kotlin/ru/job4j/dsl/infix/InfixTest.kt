package ru.job4j.dsl.infix

import java.util.function.Predicate


class InfixTest (
        private var value : Int = 0
) {
    infix fun eq(value: Int) = value == this.value
    infix fun notEq(value: Int) = value != this.value

    infix fun isTrue(predicat: Predicate<Int>) = predicat.test(value)
}