package com.yefeng.creative.factory.simple;

public class CarFactory {

    public Car getCar(ECarName name) {

        //JDK14以上可用，低版本不行，因为switch没有返回值
        return switch (name) {
            case BENCHI -> new BenChi();
            case WULING -> new WuLing();
        };
    }


}
