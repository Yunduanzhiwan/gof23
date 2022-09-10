package com.yefeng.creative.builder.demo;

/**
 * @author 夜枫
 */
public class Director {


    public Product createProduct(Builder builder) {
        return builder.builderA("1").builderB("2").getProduct();
    }

}
