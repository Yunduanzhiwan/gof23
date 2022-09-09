package com.yefeng.factory.abstractfactory;

/**
 * @author 夜枫
 */
public class HuaWeiPhone implements IPhoneProduct {
    @Override
    public void start() {
        System.out.println("华为手机开机");
    }

    @Override
    public void down() {
        System.out.println("华为手机开机");

    }

    @Override
    public void call() {
        System.out.println("华为手机开机");

    }

    @Override
    public void sendMsg() {
        System.out.println("华为手机开机");

    }
}
