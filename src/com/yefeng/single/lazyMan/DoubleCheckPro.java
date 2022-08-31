package com.yefeng.single.lazyMan;

//双检锁 --没有禁止重排序  第一次升级，防第一道反射
//DCL懒汉式 有问题
public class DoubleCheckPro {
    private DoubleCheckPro() {
        synchronized (DoubleCheckPro.class){
            if (lazyMan!=null){
                throw new RuntimeException("不许搞反射哦");
            }
        }

        System.out.println(Thread.currentThread().getName() + "创建了一个实例");
    }

    private static DoubleCheckPro lazyMan;

    public static DoubleCheckPro getInstance() {
        if (lazyMan == null) {
            synchronized (DoubleCheckPro.class) {
                if (lazyMan == null) {
                    lazyMan = new DoubleCheckPro();//非原子性操作
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
