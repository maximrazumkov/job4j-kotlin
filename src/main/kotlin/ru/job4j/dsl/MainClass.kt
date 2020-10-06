package ru.job4j.dsl

fun Item.save() {
    val store = ItemStore()
    store.save(this)
}

fun main() {
    val item = Item()
    item.save()
}