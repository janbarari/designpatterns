class RarCompressionStrategy : CompressionStrategy {

    override fun compressFile(file: String) {
        println("$file compressed with Rar format.")
    }
}