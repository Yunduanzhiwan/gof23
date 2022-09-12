package com.yefeng.structure.bridging.demo2;

/**
 * @author 夜枫
 */
public class Notebook extends Computer {

    public Notebook(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        brand.info();
        System.out.println("笔记本");
    }
}
