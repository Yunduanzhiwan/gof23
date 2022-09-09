package com.yefeng.creative.single.lazyMan;

public class SynchronizedOnFun {
    private static SynchronizedOnFun lazyMan;

    private SynchronizedOnFun() {
        System.out.println(Thread.currentThread().getName() + "创建了一个实例");
    }

    public static synchronized SynchronizedOnFun getInstance() {
        if (lazyMan == null) {
            lazyMan = new SynchronizedOnFun();
        }
        return lazyMan;
    }
}
