package ru.job4j.dsl.orm

import java.lang.RuntimeException
import java.sql.Connection
import java.sql.Statement
import java.util.ArrayList

class Store {
    fun create(item: Item, connection: Connection) : Item {
        val query = "insert into item(name) values (?)"
        connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS).use {
            it.setString(1, item.name)
            it.executeUpdate()
            val rs = it.getGeneratedKeys()
            if (rs.next()) {
                item.id = rs.getInt("id")
            }
        }
        return item
    }

    fun update(item: Item, connection: Connection) {
        val query = "update item set name = ? where id = ?"
        connection.prepareStatement(query).use {
            it.setString(1, item.name)
            it.setInt(2, item?.let { throw RuntimeException("Not found id for updater element") })
            it.executeUpdate()
        }
    }

    fun delete(id: Int, connection: Connection) {
        val query = "delete from item where id = ?";
        connection.prepareStatement(query).use {
            it.setInt(1, id)
            it.executeUpdate()
        }
    }

    fun findAll(connection: Connection) : List<Item> {
        val query = "select * from item"
        val items = ArrayList<Item>()
        connection.createStatement().use {
            val result = it.executeQuery(query)
            while (result.next()) {
                items.add(Item(result.getInt("id"), result.getString("name")))
            }
        }
        return items
    }

    fun findById(id: Int, connection: Connection) : Item? {
        val query = "select * from item where id = ?"
        var item: Item? = null
        connection.prepareStatement(query).use {
            it.setInt(1, id)
            val result = it.executeQuery()
            if (result.next()) {
                item = Item(result.getInt("id"), result.getString("name"))
            }
        }
        return item
    }
}