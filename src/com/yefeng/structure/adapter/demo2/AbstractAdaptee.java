package com.yefeng.structure.adapter.demo2;


/**
 * @author 夜枫
 */
public interface AbstractAdaptee {

    /**
     * 110V电压供电
     */
    default void chargeBy110V() {
        System.out.println(
                "默认110v的实现"
        );
    }


    /**
     * 220V电压供电
     */
    default void chargeBy220V() {
        System.out.println(
                "默认220v的实现"
        );
    }
}