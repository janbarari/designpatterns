class CompressionContext {
    var strategy : CompressionStrategy? = null

    fun setCompressionStrategy(strategy: CompressionStrategy) {
        this.strategy = strategy
    }

    fun createArchive(file: String) {
        strategy!!.compressFile(file)
    }
}