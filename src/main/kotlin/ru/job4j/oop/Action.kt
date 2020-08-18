package ru.job4j.oop

import java.util.*

interface Action {
    fun exec(tracker : Tracker, scanner : Scanner) : Boolean;
}