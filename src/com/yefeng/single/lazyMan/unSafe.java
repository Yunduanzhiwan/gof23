package com.yefeng.single.lazyMan;

//线程不安全
public class unSafe {
    private unSafe() {
        System.out.println(Thread.currentThread().getName() + "创建了一个实例");
    }

    private static unSafe lazyMan;

    public static unSafe getInstance() {
        if (lazyMan == null) {
            lazyMan = new unSafe();
        }
        return lazyMan;
    }
}
