fun main() {

    val cart: ShoppingCart = ShoppingCart()
    cart.items.add(CD())
    cart.items.add(Book(5.0, 1.2))

    println("total amount: ${cart.calculatePostage()}")
}