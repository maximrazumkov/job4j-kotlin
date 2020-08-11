package ru.job4j.oop

class Manager(name : String) : Profession(name) {
    override fun action() {
        super.action()
        println("sell")
    }

    override fun getName(): String {
        val name = super.getName()
        return "Manager $name"
    }
}