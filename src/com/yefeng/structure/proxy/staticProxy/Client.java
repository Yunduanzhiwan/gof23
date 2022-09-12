package com.yefeng.structure.proxy.staticProxy;

import com.yefeng.structure.proxy.UserServiceImpl;

/**
 * @author 夜枫
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServicesProxy proxy = new UserServicesProxy();
        proxy.setUserService(userService);

        proxy.addUser();
    }
}
