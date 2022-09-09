package com.yefeng.creative.factory.simple;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car car = carFactory.getCar(ECarName.WULING);
        System.out.println(Arrays.toString(car.kills()));

        Car car1 = carFactory.getCar(ECarName.BENCHI);
        System.out.println(Arrays.toString(car1.kills()));
    }
}
