package com.yefeng.factory.abstractfactory;

/**
 * @author 夜枫
 */
public interface IPhoneProduct {
    /**
     * 手机开机
     *
     * @author 夜枫
     */
    void start();

    /**
     * 关机
     *
     * @author 夜枫
     */
    void down();

    /**
     * 打电话
     *
     * @author 夜枫
     */
    void call();


    /**
     * send msg
     * @author 夜枫
     */
    void sendMsg();
}
