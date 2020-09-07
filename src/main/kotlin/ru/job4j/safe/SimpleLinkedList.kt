package ru.job4j.safe

class SimpleLinkedList<T> : Iterable<T?>, ListIterator<T> {
    private var head : Node<T>? = null
    private var current : Node<T>? = head
    private var idx : Int = 0
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

    class Node<K>(val value: K, var next: Node<K>? = null, var prev: Node<K>? = null)

    override fun hasNext() = current != null

    override fun hasPrevious() = current!!.prev != null

    override fun next(): T {
        val res = current!!.value
        current = current!!.next
        ++idx
        return res
    }

    override fun nextIndex() = idx

    override fun previous(): T {
        val res = current!!.prev!!.value
        current = current!!.prev
        --idx
        return res
    }

    override fun previousIndex() = idx - 1
}

fun main() {
    val list = SimpleLinkedList<String>()
    for (value in list) {
        println(value)
    }
}