package com.yefeng.structure.bridging.demo1;

/**
 * @author 夜枫
 * 所有远程控制器的通用接口
 */
public interface Remote {


    /**
     * 电源切换
     */
    void power();

    /**
     * 调低声音
     */
    void volumeDown();

    /**
     * 调高声音
     */
    void volumeUp();

    /**
     * 往下调一台频道
     */
    void channelDown();

    /**
     * 往上调一台频道
     */
    void channelUp();
}