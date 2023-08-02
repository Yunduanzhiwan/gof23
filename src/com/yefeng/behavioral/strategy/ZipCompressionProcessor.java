package com.yefeng.behavioral.strategy;

import java.io.File;

public class ZipCompressionProcessor implements ICompressionProcessor{
    @Override
    public void compress(File file) {
        System.out.println("zip compressing...");
    }
}
