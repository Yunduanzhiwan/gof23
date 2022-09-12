package com.yefeng.structure.bridging.demo1;

/**
 * @author 夜枫
 * <p>
 * 高级远程控制器
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    /**
     * 静音
     */
    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}