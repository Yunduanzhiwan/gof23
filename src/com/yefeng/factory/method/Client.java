package com.yefeng.factory.method;

import com.yefeng.factory.simple.Car;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        WuLingFactory wuLingFactory = new WuLingFactory();
        Car car = wuLingFactory.getCar();


        BenChiFactory benChiFactory = new BenChiFactory();
        Car car1 = benChiFactory.getCar();

        System.out.println(Arrays.toString(car.kills()));
        System.out.println(Arrays.toString(car1.kills()));

    }
}
