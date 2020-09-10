package ru.job4j.safe

import java.sql.Connection

class DbService {
    private lateinit var connection: Connection

    fun init(connection: Connection) {
        this.connection = connection
    }

    fun exec(sql: String) = connection.createStatement().execute(sql)
}