package com.yefeng.builder.demo2;

/**
 * @author 夜枫
 */
public abstract class Builder {
    abstract Builder builderA(String msg);

    abstract Builder builderB(String msg);

    abstract Builder builderV(String msg);

    abstract Builder builderD(String msg);

    abstract Product getProduct();

}
