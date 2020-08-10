package ru.job4j.oop

import java.util.*
import kotlin.collections.ArrayList

class Tracker {
    private val items = ArrayList<Item>()

    fun add(item : Item) : Item {
        item.id = generateId()
        items.add(item)
        return item
    }

    fun replace(id : String, item : Item) : Boolean {
        for (it in items) {
            if (it.id == id) {
                it.name = item.name
                return true
            }
        }
        return false
    }

    fun findAll() : ArrayList<Item> {
        return items
    }

    fun delete(id : String) : Boolean {
        return items?.removeIf{t: Item ->  t.id == id}
    }

    fun findByName(name : String) : List<Item?> {
        return items?.filter{it.name == name}
    }

    fun findById(id : String) : Item? {
        return items?.first{it.id == id}
    }

    private fun generateId() : String = (Random().nextLong() + System.currentTimeMillis()).toString()

}