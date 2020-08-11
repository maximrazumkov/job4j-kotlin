package ru.job4j.oop

class Programmer(name : String) : Profession(name) {
    override fun action() {
        super.action()
        println("programming")
    }

    override fun getName(): String {
        val name = super.getName()
        return "Programmer $name"
    }
}