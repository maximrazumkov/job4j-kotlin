package ru.job4j.dsl.orm

import java.sql.DriverManager

fun main() {

    val store = Store()
    val connection = DriverManager.getConnection(
            "jdbc:postgresql://127.0.0.1:5432/parsersite",
            "postgres",
            "postgres"
    ).use {
        var item1 = store.create(Item(name = "element 1"), it)
        var item2 = store.create(Item(name = "element 2"), it)
        var items = store.findAll(it)
        item2.name = "element updated"
        store.update(item2, it)
    }
}