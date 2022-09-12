package com.yefeng.structure.proxy;

/**
 * @author 夜枫
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("添加了一个用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void updateUser() {
        System.out.println("更新了一个用户");
    }

    @Override
    public void quearyUser() {
        System.out.println("查找了一个用户");
    }
}
