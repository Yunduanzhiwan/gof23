package com.yefeng.creative.factory.method;

import com.yefeng.creative.factory.simple.BenChi;
import com.yefeng.creative.factory.simple.Car;

public class BenChiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BenChi();
    }
}
