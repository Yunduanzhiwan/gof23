package com.yefeng.structure.adapter.demo1;

import java.io.FileNotFoundException;

/**
 * @author 夜枫
 */
public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        //现在我们有一个美国110V供电站，但我们无法使用
        Adaptee adaptee = new AmericanCharger();

        //我们将这个供电器交给适配器，适配器转换为220V供电器
        Adapter adapter = new Adapter(adaptee);

        //接下来我们通过适配器充电就好了
        adapter.chargeBy220v();

    }
}
