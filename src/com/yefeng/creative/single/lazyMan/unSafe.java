package com.yefeng.creative.single.lazyMan;

//线程不安全
public class unSafe {
    private static unSafe lazyMan;

    private unSafe() {
        System.out.println(Thread.currentThread().getName() + "创建了一个实例");
    }

    public static unSafe getInstance() {
        if (lazyMan == null) {
            lazyMan = new unSafe();
        }
        return lazyMan;
    }
}
