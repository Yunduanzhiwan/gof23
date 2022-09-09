package com.yefeng.creative.factory.abstractfactory;

/**
 * @author 夜枫
 */
public interface ProductFactory {


    /**
     * 生产手机
     *
     * @return the product factory instance
     */
    IPhoneProduct getPhoneProduct();


    /**
     * 生产路由器
     *
     * @return 路由器
     */

    IRouterProduct getRouterProduct();

}
