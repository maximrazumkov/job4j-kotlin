package ru.job4j.oop

class SimpleLinkedList<T> : Iterable<T?> {
    private var head : Node<T>? = null
    private var size = 0

    fun add(value: T) {
        val node = Node(value)
        node.next = head
        head = node
        ++size
    }

    fun get(index : Int) : T? {
        var res = head
        for (i in 0 until index) {
            res = res?.next;
        }
        return res?.value
    }

    fun size() = size

    fun isEmpty() = size == 0

    override fun iterator(): Iterator<T?> {
        return LinkedIt()
    }

    inner class LinkedIt : Iterator<T?> {

        var currentNode = head

        override fun hasNext(): Boolean {
            return currentNode != null
        }

        override fun next(): T? {
            if (!hasNext()) {
                throw NoSuchElementException()
            }
            val res = currentNode?.value
            currentNode = currentNode?.next
            return res
        }

    }

    class Node<K>(val value: K, var next: Node<K>? = null)
}

fun main() {
    val node = SimpleLinkedList.Node("Kotlin")
    val list = SimpleLinkedList<String>()
    for (value in list) {
        println(value)
    }
}