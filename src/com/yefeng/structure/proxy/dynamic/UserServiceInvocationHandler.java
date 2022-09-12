package com.yefeng.structure.proxy.dynamic;

import com.yefeng.structure.proxy.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 夜枫
 * <p>
 * 动态代理
 */
public class UserServiceInvocationHandler implements InvocationHandler {

    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.printf("[debug]执行了%s方法\n", method.getName());
        Object res = method.invoke(userService, args);
        return res;

    }
}
