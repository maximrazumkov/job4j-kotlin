package ru.job4j.oop

import java.util.*

class FindAllAction : Action {
    override fun exec(tracker: Tracker, scanner: Scanner): Boolean {
        tracker.findAll().forEach { item -> println(item.name) }
        return true
    }
}