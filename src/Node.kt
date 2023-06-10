class Node(var data: Int) {

    var following: Node? = null

    fun appendToEnd(data: Int) {
        val end = Node(data)
        var n: Node? = this
        while (n!!.following != null) {
            n = n.following
        }
        n.following = end
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {
        var n: Node? = this
        do {
            print("--> ${n!!.data} ")
            n = n.following
        } while (n!!.following != null)
        print("--> ${n.data}\n")
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(h: Node?): Int {
        if (h == null) return 0
        var n: Node? = h
        var counter = 0
        do {
            counter++
            n = n!!.following
        } while (n != null)
        return counter
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Int {
        var n: Node? = this
        var sum = 0
        do {
            sum += n!!.data
            n = n.following
        } while (n != null)
        return sum
    }

    fun deleteNode(head: Node, data: Int): Node? {
        val n: Node = head

        if (n.data == data) {
            return head.following
        }
        // TODO:: Implement the proper loop in order to remove given data

        var current: Node? = n
        var previous: Node? = null
        while (current?.data != data) {
            previous = current
            current = current?.following
        }

        previous?.following = current.following

        //
        return head
    }
}