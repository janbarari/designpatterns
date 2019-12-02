class RealInternet : Internet {

    override fun connectTo(serverHost: String) {
        println("Connecting to $serverHost")
    }
}