package com.yefeng.creative.single;

//单例 --饿汉模式
//如果成员属性占内存大，将很浪费内存
public class Hunger {
    private static Hunger hunger = new Hunger();

    private Hunger() {
        System.out.println("Hunger " + Thread.currentThread().getName() + " 创建了一个实例");

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(
                    Hunger::getInstance
            ).start();
        }
//        ThreadUtil.ConcurrencyTest(Hunger::getInstance, ThreadCounts.Ten);
    }

    public static Hunger getInstance() {
        return hunger;
    }
}
