package io.github.janbarari;

public class Main {

    public static void main(String[] args) {
        CompressionContext ctx = new CompressionContext();
        ctx.setCompressionStrategy(new ZipCompressionStrategy());
        ctx.createArchive("file");
    }
}
