package ru.job4j.oop

import java.util.*

class ExitAction : Action {
    override fun exec(tracker: Tracker, scanner: Scanner) = false
}