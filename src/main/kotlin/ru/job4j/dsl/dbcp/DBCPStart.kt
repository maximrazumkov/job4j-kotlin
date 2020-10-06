package ru.job4j.dsl.dbcp

fun main() {
    val connections = DBCPWrapper
            .driver("org.postgresql.Driver")
            .url("jdbc:postgresql://127.0.0.1:5432/tracer")
            .username("demo")
            .password("qwerty")
            .minIdle(5)
            .maxIdle(20)
            .maxOpenPreparedStatements(20)
            .build()
    val source = connections.getPool()
}