package com.yefeng.creative.builder.demo2;

/**
 * @author 夜枫
 */
public class Woker extends Builder {

    Product product;

    public Woker() {
        this.product = new Product();
    }

    @Override
    Builder builderA(String msg) {
        product.setStepA(msg);
        System.out.println("设置步骤A");
        return this;
    }

    @Override
    Builder builderB(String msg) {
        product.setStepB(msg);
        System.out.println("设置步骤B");
        return this;
    }

    @Override
    Builder builderV(String msg) {
        product.setStepC(msg);
        System.out.println("设置步骤C");
        return this;
    }

    @Override
    Builder builderD(String msg) {
        product.setStepD(msg);
        System.out.println("设置步骤D");
        return this;
    }

    public Product getProduct() {
        return product;
    }
}
