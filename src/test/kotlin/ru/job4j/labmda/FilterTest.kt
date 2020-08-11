package ru.job4j.labmda

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class FilterTest : StringSpec({
    "filter when name = Ivan  and balance > 0" {
        val listAccount = ArrayList<Account>()
        listAccount.add(Account(name = "Ivan", balance = 521.25))
        listAccount.filter { it.name == "Ivan" && it.balance > 0 }.isEmpty() shouldBe false
    }
})