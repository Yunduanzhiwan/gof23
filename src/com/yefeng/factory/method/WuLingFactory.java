package com.yefeng.factory.method;

import com.yefeng.factory.simple.Car;
import com.yefeng.factory.simple.WuLing;

public class WuLingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
