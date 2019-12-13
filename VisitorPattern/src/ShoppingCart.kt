class ShoppingCart {
    val items:ArrayList<Visitable> = arrayListOf()

    fun calculatePostage(): Double {
        var visitor: PostageVisitor = PostageVisitor()
        for (item in items) {
            item.accept(visitor)
        }
        return visitor.totalPostageForCart
    }
}