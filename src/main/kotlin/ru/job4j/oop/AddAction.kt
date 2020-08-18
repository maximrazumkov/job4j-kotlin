package ru.job4j.oop

import java.util.*

class AddAction : Action {
    override fun exec(tracker: Tracker, scanner: Scanner): Boolean {
        println("Введите названиe: ")
        tracker.add(Item(name = scanner.nextLine()))
        return true;
    }
}