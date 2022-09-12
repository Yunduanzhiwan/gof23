package com.yefeng.structure.proxy.dynamic;

import com.yefeng.structure.proxy.UserService;
import com.yefeng.structure.proxy.UserServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author 夜枫
 */
public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();


        UserServiceInvocationHandler pih = new UserServiceInvocationHandler();

        pih.setUserService(userService);

        //   Object proxyInstance = Proxy.newProxyInstance(userService.getClass().getClassLoader(), UserService.class.getInterfaces(), pih);

        Object o = Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), pih);


//        UserService userService2 = (UserService) pih.getProxy();
        UserService userService2 = (UserService) o;

        userService2.addUser();

    }
}
