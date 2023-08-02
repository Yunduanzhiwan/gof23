package com.yefeng.behavioral.strategy;

import java.io.File;

/**
 * 文件压缩算法
 */
public interface ICompressionProcessor {
    void compress(File file);
}
