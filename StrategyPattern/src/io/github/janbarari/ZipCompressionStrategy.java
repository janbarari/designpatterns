package io.github.janbarari;

public class ZipCompressionStrategy implements CompressionStrategy {

    @Override
    public void compressFile(String file) {
        System.out.println(String.format("%s compressed with Zip format.", file));
    }
}
