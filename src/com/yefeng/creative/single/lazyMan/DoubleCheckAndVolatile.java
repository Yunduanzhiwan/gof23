package com.yefeng.creative.single.lazyMan;

//双检索 有禁止重排序
public class DoubleCheckAndVolatile {
    private static volatile DoubleCheckAndVolatile lazyMan;//volatile 禁止重排

    private DoubleCheckAndVolatile() {
        System.out.println(Thread.currentThread().getName() + "创建了一个实例");
    }

    public static DoubleCheckAndVolatile getInstance() {
        if (lazyMan == null) {
            synchronized (DoubleCheckAndVolatile.class) {
                if (lazyMan == null) {
                    lazyMan = new DoubleCheckAndVolatile();
                }
            }
        }
        return lazyMan;
    }
}
