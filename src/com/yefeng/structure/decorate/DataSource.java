package com.yefeng.structure.decorate;

/**
 * @author 夜枫
 */
public interface DataSource {
    /**
     * 写入数据
     *
     * @param data 写入数据
     */
    void writeData(String data);

    /**
     * 读取数据
     *
     * @return 读取数据
     */
    String readData();
}