package com.zwz521.service.impl;

import com.zwz521.mapper.UserMapper;
import com.zwz521.pojo.User;
import com.zwz521.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 赵文卓
 * @version 1.0
 * @date 2020/11/3 10:25
 */
@Service
@Transactional//事务
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
}
