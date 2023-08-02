package com.yefeng.behavioral.strategy;

import java.io.File;

public class FileCompressionHandler {
    private final ICompressionProcessor compressionProcessor;

    public FileCompressionHandler(ICompressionProcessor compressionProcessor) {
        this.compressionProcessor = compressionProcessor;
    }

    public void compressFile(File file) {
        compressionProcessor.compress(file);
    }
}
