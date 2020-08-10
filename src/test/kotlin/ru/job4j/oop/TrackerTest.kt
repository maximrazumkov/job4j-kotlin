package ru.job4j.oop

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class TrackerTest : StringSpec({
    "Add new item and get new item" {
        val tracker = Tracker()
        val item = Item(name = "item1")
        tracker.add(item)
        tracker.findById(item.id) shouldBe item
    }

    "Replace item's name" {
        val tracker = Tracker()
        val item = Item(name = "item1")
        tracker.add(item)
        val itemNewName = Item()
        itemNewName.name = "ItemBest";
        tracker.replace(item.id, itemNewName) shouldBe true
    }

    "Delete item" {
        val tracker = Tracker()
        val item = Item(name = "item1")
        tracker.add(item)
        tracker.delete(item.id) shouldBe true
    }

    "Find all items" {
        val tracker = Tracker()
        val item = Item(name = "item1")
        tracker.add(item)
        val item2 = Item(name = "item2")
        tracker.add(item2)
        val item3 = Item(name = "item3")
        tracker.add(item3)
        val expect = ArrayList<Item>()
        expect.add(item)
        expect.add(item2);
        expect.add(item3);
        tracker.findAll() shouldBe expect
    }

    "Find by name item" {
        val tracker = Tracker()
        val item = Item(name = "item1")
        tracker.add(item)
        val item2 = Item(name = "item2")
        tracker.add(item2)
        val item3 = Item(name = "item3")
        tracker.add(item3)
        val expect = ArrayList<Item>()
        expect.add(item2)
        tracker.findByName("item2") shouldBe expect
    }

    "Find by id item" {
        val tracker = Tracker()
        val item = Item(name = "item1")
        tracker.add(item)
        val item2 = Item(name = "item2")
        tracker.add(item2)
        val item3 = Item(name = "item3")
        tracker.add(item3)
        tracker.findById(item3.id) shouldBe item3
    }
})