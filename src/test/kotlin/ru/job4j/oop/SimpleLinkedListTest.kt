package ru.job4j.oop

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class SimpleLinkedListTest : StringSpec({
    "Add new element and get its" {
        val list = SimpleLinkedList<String>()
        list.size() shouldBe 0
        list.isEmpty() shouldBe true
        list.add("Hello")
        list.get(0) shouldBe "Hello"
        list.size() shouldBe 1
        list.isEmpty() shouldBe false
    }

    "For Earch Itr" {
        val list = SimpleLinkedList<String>()
        list.add("Hello")
        list.add("How are you?")
        list.add("Fine!")
        val itr = list.LinkedIt()
        itr.hasNext() shouldBe true
        itr.next() shouldBe "Fine!"
        itr.hasNext() shouldBe true
        itr.next() shouldBe "How are you?"
        itr.hasNext() shouldBe true
        itr.next() shouldBe "Hello"
        itr.hasNext() shouldBe false
    }
})