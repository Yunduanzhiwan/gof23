package com.yefeng.single;


import com.yefeng.util.ThreadCounts;
import com.yefeng.util.ThreadUtil;

//单例---静态内部类
public class StaticInnerClass {
    private StaticInnerClass(){
        System.out.println(Thread.currentThread().getName()+" 创建了一个实例 StaticInnerClass");
    }
    private static class InnerClass{
        private static final StaticInnerClass innerClass =new StaticInnerClass();
    }

    public static StaticInnerClass getInstance(){
        return InnerClass.innerClass;
    }


    public static void main(String[] args) {
        ThreadUtil.ConcurrencyTest(StaticInnerClass::getInstance, ThreadCounts.Hundred);


        System.out.println("主线程结束");
    }
}
