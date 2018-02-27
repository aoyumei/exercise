package com.aym.service.impl;

import com.aym.mapper.UserMapper;
import com.aym.model.User;
import com.aym.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 依赖注入方式有三种：1.setter（属性注入） 2.构造方法 3.接口注入/工厂注入
 * http://blog.csdn.net/qq_35923749/article/details/77159213
 *
 * @author plum (2018/2/2)
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * @Autowired 按照byType注入。如果一个接口多个实现类，可使用 @Qualifier进行限定
     * @Resource 默认按照byName注入
     */
//    @Resource(name = "userMapper", type = UserMapper.class)
//    @Autowired
    @Resource
    private UserMapper userMapper;

    /**
     * 通过账户获取用户信息
     *
     * @param account
     * @return
     */

    @Override
    public List<User> getUser(String account) {

        return userMapper.selectByAccount(account);
    }
}
