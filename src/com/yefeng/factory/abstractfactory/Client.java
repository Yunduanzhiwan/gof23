package com.yefeng.factory.abstractfactory;

/**
 * @author 夜枫
 */
public class Client {


    public static void main(String[] args) {
        ProductFactory factory = new XiaoMiFactory();
        IPhoneProduct product = factory.getPhoneProduct();
        product.sendMsg();


        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();

        IPhoneProduct phoneProduct = huaWeiFactory.getPhoneProduct();
        phoneProduct.sendMsg();

        IRouterProduct router = huaWeiFactory.getRouterProduct();
        router.selectWifi();
    }
}
