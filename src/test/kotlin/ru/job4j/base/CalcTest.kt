package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class CalcTest : StringSpec({
    "1 + 1 = 2" {
        summ(1, 1) shouldBe 2
    }

    "1 - 1 = 0" {
        subtraction(1, 1) shouldBe 0
    }

    "8 * 9 = 72" {
        multiplication(8, 9) shouldBe 72
    }

    "64 / 16 = " {
        division(64, 16) shouldBe 4
    }
})