package ru.job4j.oop

class Doctor(name : String) : Profession(name) {
    override fun action() {
        super.action()
        println("help ")
    }

    override fun getName() : String {
        val name = super.getName()
        return "Doctor $name"
    }
}