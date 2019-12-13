class PostageVisitor: Visitor {

    var totalPostageForCart: Double = 0.0

    override fun visit(book: Book) {
        if (book.price < 10.0) {
            totalPostageForCart += book.price + book.weight * 2
        }
    }

    override fun visit(cd: CD) {
        //...
    }
}