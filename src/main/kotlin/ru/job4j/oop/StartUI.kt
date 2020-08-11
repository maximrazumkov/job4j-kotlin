package ru.job4j.oop

import java.util.*

fun main() {
    StartUI().init();
}

class StartUI {

    private val tracker = Tracker()
    private val scanner = Scanner(System.`in`)
    private var included = true

    fun init() {
        while(included) {
            showMenu()
            println("Выберите номер пункта меню: ")
            val select = scanner.nextLine()
            action(select)
        }
    }

    private fun showMenu() {
        println(" 1. - добавить заявку")
        println(" 2. - показать все заявки")
        println(" 3. - выйти")
    }

    private fun action(selected : String) {
        when (selected) {
            "1" -> StartUI.add(tracker, scanner)
            "2" -> StartUI.findAll(tracker)
            "3" -> included = false
            else -> println("Выберите существующий пункт меню (Введите цифру пункта меню).")

        }
    }

    companion object {
        fun add(tracker : Tracker, scanner : Scanner) {
            println("Введите названиe: ")
            tracker.add(Item(name = scanner.nextLine()))
        }

        fun findAll(tracker : Tracker) {
            tracker.findAll().forEach { item -> println(item.name) }
        }
    }
}