package com.yefeng.creative.builder.demo2;

/**
 * @author 夜枫
 */
public class Client {
    public static void main(String[] args) {
        Woker woker = new Woker();
        Product product = woker.builderB("client").builderA("sss").getProduct();
        System.out.println(product);
    }
}
