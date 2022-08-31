package com.yefeng.single.lazyMan;

//双检锁 --没有禁止重排序
//DCL懒汉式 有问题
public class DoubleCheck {
    private DoubleCheck() {
        System.out.println(Thread.currentThread().getName() + "创建了一个实例");
    }

    private static DoubleCheck lazyMan;

    public static DoubleCheck getInstance() {
        if (lazyMan == null) {
            synchronized (DoubleCheck.class) {
                if (lazyMan == null) {
                    lazyMan = new DoubleCheck();//非原子性操作
                    /*
                        1.分配内存空间
                        2.初始化对象，执行构造方法
                        3.把对象指向这个空间（引用）
                     */

                }
            }
        }
        return lazyMan;
    }
}
