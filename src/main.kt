import kotlinversion.Location


fun main() {
    val factory = Location(3, 7)
    var node: Node? = Node(factory.calculateDistance(Location(1, 4)))
    node!!.appendToEnd(factory.calculateDistance(Location(1, 10)))
    node.appendToEnd(factory.calculateDistance(Location(2, 1)))
    node.appendToEnd(factory.calculateDistance(Location(5, 2)))
    node.appendToEnd(factory.calculateDistance(Location(6, 5)))
    node.appendToEnd(factory.calculateDistance(Location(8, 4)))
    node.appendToEnd(factory.calculateDistance(Location(9, 2)))
    node.appendToEnd(factory.calculateDistance(Location(8, 9)))

    node.printNodes()
    println(node.sumOfNodes())

    while (node != null) {
        node = node.deleteNode(node, node.data)
    }

}