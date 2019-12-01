package io.github.janbarari;

public class RarCompressionStrategy implements CompressionStrategy
{
    @Override
    public void compressFile(String file) {
        System.out.println(String.format("%s compressed with Rar format.", file));
    }
}
