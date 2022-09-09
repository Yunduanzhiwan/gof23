package com.yefeng.factory.abstractfactory;

/**
 * @author 夜枫
 */
public class XiaoMiPhone implements IPhoneProduct {

    @Override
    public void start() {
        System.out.println("小米手机开机");
    }

    @Override
    public void down() {
        System.out.println("小米手机关机");

    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendMsg() {
        System.out.println("小米手机发短信");
    }
}
