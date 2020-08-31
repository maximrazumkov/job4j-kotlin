package ru.job4j.safe

import java.util.*

class Promotion(
        private var name : String = "",
        private var currency : String = "",
        private var date : Date = Date(System.currentTimeMillis())
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other?.javaClass != javaClass) {
            return false
        }
        other as Promotion
        return other.name == this.name
                && other.currency == this.currency
                && other.date == this.date
    }

    override fun hashCode(): Int {
        var res = 17
        res = 31 * res + name.hashCode()
        res = 31 * res + currency.hashCode()
        res = 31 * res + date.hashCode()
        return res
    }
}