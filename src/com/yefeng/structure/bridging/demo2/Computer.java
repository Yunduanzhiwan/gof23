package com.yefeng.structure.bridging.demo2;

/**
 * @author 夜枫
 */
public abstract class Computer {
    protected Brand brand;


    public Computer(Brand brand) {
        this.brand = brand;
    }


    /**
     * 打印信息
     */
    abstract public void info();

}
