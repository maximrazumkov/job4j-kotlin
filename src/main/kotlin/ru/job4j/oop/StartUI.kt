package ru.job4j.oop

import java.util.*

fun main() {
    val actions = HashMap<String, Action>()
    actions.put("1", AddAction())
    actions.put("2", FindAllAction())
    actions.put("3", ExitAction())
    StartUI(actions, Tracker(), Scanner(System.`in`)).init();
}

class StartUI(
        private val actions : HashMap<String, Action>,
        private val tracker : Tracker,
        private val scanner : Scanner
) {

    fun init() {
        var included = true
        while(included) {
            showMenu()
            println("Выберите номер пункта меню: ")
            val select = scanner.nextLine()
            if (actions.containsKey(select)) {
                included = actions.get(select)!!.exec(tracker, scanner)
            }
        }
    }

    private fun showMenu() {
        println(" 1. - добавить заявку")
        println(" 2. - показать все заявки")
        println(" 3. - выйти")
    }
}