import java.lang.Exception

fun main() {
    val internet: Internet = ProxyInternet()
    try {
        internet.connectTo("google.com")
        internet.connectTo("jani.com")
    } catch (e: Exception) {
        println(e.message)
    }
}