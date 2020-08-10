package ru.job4j.base

import io.kotlintest.should
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

    "5 < 7 < 10. 10 is max" {
        max(7,5, 10) shouldBe 10
    }

    "inputArray = {\"I\", null, \"wanna\", null, \"be\", null, \"compressed\"} " +
    "expect {\"I\", \"wanna\", \"be\", \"compressed\", null, null, null}" {
        val value = arrayOfNulls<String>(7)
        value[0] = "I"
        value[1] = "null"
        value[2] = "wanna"
        value[3] = "null"
        value[4] = "be"
        value[5] = "null"
        value[6] = "compressed"

        value[1] = null
        value[3] = null
        value[5] = null

        val expect = arrayOfNulls<String>(7)
        expect[0] = "I"
        expect[1] = "wanna"
        expect[2] = "be"
        expect[3] = "compressed"
        defragment(value) shouldBe expect
    }
})