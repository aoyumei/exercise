package com.aym.controller;

import com.aym.model.User;
import com.aym.model.vo.common.JsonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by task on 2018/2/2.
 *
 * @author task
 */
@RestController
@RequestMapping("/user")
public class UserController {


    /**
     * 用户登录功能
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public JsonResponse<User> login(String account, String password) {


        return null;
    }


}
