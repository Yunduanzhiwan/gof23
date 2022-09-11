package com.yefeng.structure.adapter.demo2;

/**
 * @author 夜枫
 */
public class AmericanCharger implements AbstractAdaptee {


    /**
     * 现有接口的具体实现类，美国供电器——通过110V电压供电
     */
    @Override
    public void chargeBy110V() {
        System.out.println("美国供电器，正在提供110V电压");
    }
}
