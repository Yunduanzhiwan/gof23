package com.yefeng.structure.bridging.demo2;

/**
 * @author 夜枫
 */
public class Desktop extends Computer {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        brand.info();
        System.out.println("台式机");
    }
}
