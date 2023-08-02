package com.yefeng.behavioral.strategy;

import java.io.File;

public class RarCompressionProcessor implements ICompressionProcessor{
    @Override
    public void compress(File file) {
        System.out.println("rar compressing...");
    }
}
