package com.yefeng.structure.adapter.demo2;

/**
 * @author 夜枫
 */
public class ChineseCharger implements AbstractAdaptee {
    @Override
    public void chargeBy220V() {
        System.out.println("中国提供220v");
    }

}
