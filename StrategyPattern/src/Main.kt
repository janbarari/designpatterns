fun main() {
    val ctx = CompressionContext()
    ctx.setCompressionStrategy(ZipCompressionStrategy())
    ctx.createArchive("file")
}