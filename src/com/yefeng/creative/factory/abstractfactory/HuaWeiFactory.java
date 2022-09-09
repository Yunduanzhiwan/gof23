package com.yefeng.creative.factory.abstractfactory;

/**
 * @author 夜枫
 */
public class HuaWeiFactory implements ProductFactory {
    @Override
    public IPhoneProduct getPhoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct getRouterProduct() {
        return new HuaWeiRouter();
    }

}
