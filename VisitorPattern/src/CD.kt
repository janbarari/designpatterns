class CD: Visitable {
    var price: Double = 0.0
    var stroage: Double = 0.0

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}