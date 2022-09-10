package com.yefeng.creative.builder.demo;

/**
 * @author 夜枫
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.createProduct(new Woker());
        System.out.println(product);
    }
}
