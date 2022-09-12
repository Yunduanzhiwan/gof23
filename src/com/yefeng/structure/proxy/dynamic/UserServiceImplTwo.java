package com.yefeng.structure.proxy.dynamic;

import com.yefeng.structure.proxy.UserService;

/**
 * @author 夜枫
 */
public class UserServiceImplTwo implements UserService {
    @Override
    public void addUser() {
        printMe();
        System.out.println("添加了一个用户");
    }

    @Override
    public void deleteUser() {
        printMe();
        System.out.println("删除了一个用户");
    }

    @Override
    public void updateUser() {
        printMe();
        System.out.println("更新了一个用户");
    }

    @Override
    public void quearyUser() {
        printMe();
        System.out.println("查找了一个用户");
    }

    private void printMe() {
        System.out.print("我自己实现了:");
    }
}
