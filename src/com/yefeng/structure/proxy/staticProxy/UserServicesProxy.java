package com.yefeng.structure.proxy.staticProxy;

import com.yefeng.structure.proxy.UserService;

/**
 * @author 夜枫
 */
public class UserServicesProxy implements UserService {

    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void addUser() {
        System.out.println("执行了add");
        userService.addUser();
    }

    @Override
    public void deleteUser() {
        System.out.println("执行了delete");
        userService.deleteUser();
    }

    @Override
    public void updateUser() {
        System.out.println("执行了update");
        userService.updateUser();
    }

    @Override
    public void quearyUser() {
        System.out.println("执行了queary");
        userService.quearyUser();
    }
}
