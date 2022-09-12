package com.yefeng.structure.bridging.demo1;

/**
 * @author 夜枫
 * 所有设备的通用接口
 */
public interface Device {
    /**
     * 是否未开机
     *
     * @return 开机状态  是否未开机
     */
    boolean isEnabled();

    /**
     * 开机
     */
    void enable();

    /**
     * 关机
     */
    void disable();

    /**
     * 获取音量
     *
     * @return 音量
     */
    int getVolume();

    /**
     * 设置音量
     *
     * @param percent 音量
     */
    void setVolume(int percent);

    /**
     * 获取频道
     *
     * @return 频道
     */
    int getChannel();

    /**
     * 设置频道
     *
     * @param channel 频道
     */
    void setChannel(int channel);

    /**
     * 状态打印
     */
    void printStatus();
}