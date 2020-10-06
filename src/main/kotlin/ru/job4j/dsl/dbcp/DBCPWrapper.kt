package ru.job4j.dsl.dbcp

import org.apache.commons.dbcp2.BasicDataSource
import javax.sql.DataSource

class DBCPWrapper private constructor(
    private val dataSource: DataSource?
) {
    fun getPool() = dataSource

    companion object Builder {
        private var driverClassName: String? = null
        private var url: String? = null
        private var username: String? = null
        private var password: String? = null
        private var minIdle: Int? = null
        private var maxIdle: Int? = null
        private var maxOpenPreparedStatements: Int? = null

        fun driver(driver: String) = apply { driverClassName = driver }
        fun url(url: String) = apply { Builder.url = url }
        fun username(username: String) = apply { Builder.username = username }
        fun password(password: String) = apply { Builder.password = password }
        fun minIdle(count: Int) = apply { minIdle = count }
        fun maxIdle(count: Int) = apply { maxIdle = count }
        fun maxOpenPreparedStatements(count: Int) = apply { maxOpenPreparedStatements = count }

        fun build() : DBCPWrapper {
            val dataSource = BasicDataSource().apply {
                setDriverClassName(driverClassName)
                setUrl(url)
                setUsername(username)
                setPassword(password)
                setMinIdle(minIdle)
                setMaxIdle(maxIdle)
                setMaxOpenPreparedStatements(maxOpenPreparedStatements)
            }
            return DBCPWrapper(dataSource)
        }
    }
}