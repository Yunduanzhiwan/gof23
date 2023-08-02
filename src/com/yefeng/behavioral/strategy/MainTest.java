package com.yefeng.behavioral.strategy;

public class MainTest {
    public static void main(String[] args) {
        FileCompressionHandler fileCompressionHandler = new FileCompressionHandler(new ZipCompressionProcessor());
        fileCompressionHandler.compressFile(null);
        fileCompressionHandler = new FileCompressionHandler(new RarCompressionProcessor());
        fileCompressionHandler.compressFile(null);
    }
}
