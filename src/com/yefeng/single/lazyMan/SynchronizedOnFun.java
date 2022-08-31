package com.yefeng.single.lazyMan;

public class SynchronizedOnFun {
    private SynchronizedOnFun() {
        System.out.println(Thread.currentThread().getName() + "创建了一个实例");
    }

    private static SynchronizedOnFun lazyMan;

    public static synchronized SynchronizedOnFun getInstance() {
        if (lazyMan == null) {
            lazyMan = new SynchronizedOnFun();
        }
        return lazyMan;
    }
}
