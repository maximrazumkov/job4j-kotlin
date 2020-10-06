package ru.job4j.dsl

class ItemStore: Store<Item> {
    override fun save(model: Item) {
        println("saved")
    }
}