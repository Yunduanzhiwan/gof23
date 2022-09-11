package com.yefeng.structure.adapter.demo1;


/**
 * @author 夜枫
 */
public interface Adaptee {
    /**
     * 现有接口，美国供电器——通过110V电压供电
     */
    void chargeBy110V();


    /**
     * 220v
     */
    void chargeBy220V();
}