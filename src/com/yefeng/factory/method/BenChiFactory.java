package com.yefeng.factory.method;

import com.yefeng.factory.simple.BenChi;
import com.yefeng.factory.simple.Car;

public class BenChiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new BenChi();
    }
}
