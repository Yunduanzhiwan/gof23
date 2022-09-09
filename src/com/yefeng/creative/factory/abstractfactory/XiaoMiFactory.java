package com.yefeng.creative.factory.abstractfactory;

/**
 * @author 夜枫
 */
public class XiaoMiFactory implements ProductFactory {
    @Override
    public IPhoneProduct getPhoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public IRouterProduct getRouterProduct() {
        return new XiaoMiRouter();
    }


}
