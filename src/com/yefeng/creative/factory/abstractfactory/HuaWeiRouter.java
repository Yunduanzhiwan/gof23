package com.yefeng.creative.factory.abstractfactory;

/**
 * @author 夜枫
 */
public class HuaWeiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("华为路由开机");
    }

    @Override
    public void down() {
        System.out.println("华为路由关机");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由打开wifi");
    }

    @Override
    public void selectWifi() {
        System.out.println("华为路由选择wifi");
    }
}
