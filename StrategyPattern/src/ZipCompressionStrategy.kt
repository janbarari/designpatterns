class ZipCompressionStrategy : CompressionStrategy {

    override fun compressFile(file: String) {
        println("$file compressed with Zip format.")
    }
}