package com.yefeng.single.lazyMan;

//双检锁 --没有禁止重排序  第2次升级，加入防第一道反射，并加入标志位/红绿灯，算第二道防火墙，仍有可能被攻破
//DCL懒汉式 有问题
public class DoubleCheckProMax {

    private static boolean flag=false;

    private DoubleCheckProMax() {
        synchronized (DoubleCheckProMax.class) {
            if (!flag) {//第一次初始化
                flag = true;
            } else {
//                if (lazyMan != null) {
                    throw new RuntimeException("不许搞反射哦");
//                }
            }
        }

        System.out.println(Thread.currentThread().getName() + "创建了一个实例");
    }

    private static DoubleCheckProMax lazyMan;

    public static DoubleCheckProMax getInstance() {
        if (lazyMan == null) {
            synchronized (DoubleCheckProMax.class) {
                if (lazyMan == null) {
                    lazyMan = new DoubleCheckProMax();//非原子性操作
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
