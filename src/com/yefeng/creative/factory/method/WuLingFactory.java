package com.yefeng.creative.factory.method;

import com.yefeng.creative.factory.simple.Car;
import com.yefeng.creative.factory.simple.WuLing;

public class WuLingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
