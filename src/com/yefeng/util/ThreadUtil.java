package com.yefeng.util;

public class ThreadUtil {

    /*
    并发测速任务
     */
    public static void ConcurrencyTest(Runnable runnable, ThreadCounts threadCounts)  {

        System.out.println(threadCounts.getCounts());
        for (int i = 0; i < threadCounts.getCounts(); i++) {
            Thread thread = new Thread(runnable);
            System.out.println(thread.getName()+"执行开始");
            thread.start();
            System.out.println(thread.getName()+"执行结束");
//            thread.join();
        }
    }

    /*
    并发测速任务 默认10 线程
     */
    public static void ConcurrencyTest(Runnable runnable) {
        for (int i = 0; i < 10; i++) {
            new Thread(
                    runnable
            ).start();
        }
    }
}
