class Book: Visitable {
    var price: Double = 0.0
    var weight: Double = 0.0

    constructor(price: Double, weight: Double) {
        this.weight = weight
        this.price = price
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

}