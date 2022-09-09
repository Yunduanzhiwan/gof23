package com.yefeng.creative.factory.simple;

//奔驰
public class BenChi implements Car {


    @Override
    public String brandName() {
        System.out.println("我是奔驰车");
        return "奔驰";
    }


    @Override
    public boolean start() {
        System.out.println("奔驰已经开启了");
        return true;
    }


    @Override
    public String[] kills() {
        return new String[]{"开机,开空调", "电动门", "星空顶", "百公里0.1秒"};
    }
}
