package ru.job4j.oop

open class Profession(private val name : String = "") {
    open fun action() {
        println("execute some actions")
    }

    open fun getName() : String = name
}