package com.aym.service;

import com.aym.model.User;

import java.util.List;

/**
 * 接口只有 1.公有静态常量 2.公有抽象方法
 *
 * @author Created by task on 2018/2/2.
 */
public interface UserService {

    //public static final String CONSTANT = "0";

    /**
     * 通过账户获取账户信息
     *
     * @param account
     * @return
     */
    public abstract List<User> getUser(String account);


}
