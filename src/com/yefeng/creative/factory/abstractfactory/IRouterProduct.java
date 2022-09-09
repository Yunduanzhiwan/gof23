package com.yefeng.creative.factory.abstractfactory;

/**
 * @author 夜枫
 */
public interface IRouterProduct {
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
     * 打开wifi
     */
    void openWifi();

    /**
     * 选择wifi
     */
    void selectWifi();
}
