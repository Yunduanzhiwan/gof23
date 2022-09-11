package com.yefeng.structure.adapter.demo2;


/**
 * @author 夜枫
 * 通用适配器，既可以提供110v，也可以220v
 */
class UniversalAdapter extends Adapter {


    public UniversalAdapter(AbstractAdaptee adaptee) {
        super(adaptee);
    }

    @Override
    public void chargeBy220v() {

        if (adaptee instanceof AmericanCharger) {
            adaptee.chargeBy110V();//该对象的现有功能
            //对现有功能扩展
            System.out.println("处理策略:变压器再加110V，达到220v");
        } else if (adaptee instanceof ChineseCharger) {
            adaptee.chargeBy220V();//直接使用220v
            System.out.println("处理策略:直接使用中国的220v");
        }
    }

    @Override
    public void chargeBy110v() {
        if (adaptee instanceof AmericanCharger) {
            adaptee.chargeBy110V();//该对象的现有功能
            System.out.println("处理策略:直接使用110电压");
        } else if (adaptee instanceof ChineseCharger) {
            adaptee.chargeBy220V();//该对象的现有功能
            //对现有功能扩展
            System.out.println("处理策略:变压器缓冲电压，现在是110V了");
        }
    }
}