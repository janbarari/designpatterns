class ProxyInternet : Internet {
    var internet : Internet = RealInternet()
    var bannedSites : ArrayList<String> = arrayListOf()

    init {
        bannedSites.add("jani.com")
    }

    override fun connectTo(serverHost: String) {
        if (bannedSites.contains(serverHost.toLowerCase()))
            throw Exception("access denied!")
        internet.connectTo(serverHost)
    }
}