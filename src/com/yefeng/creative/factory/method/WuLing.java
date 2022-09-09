package com.yefeng.creative.factory.method;

public class WuLing implements Car {
    @Override
    public String brandName() {
        System.out.println("我是五菱宏光");
        return "我是五菱宏光";
    }

    @Override
    public boolean start() {
        System.out.println("五菱开启");
        return true;
    }

    @Override
    public String[] kills() {
        return new String[]{"开机", "手动摇窗"};
    }
}
