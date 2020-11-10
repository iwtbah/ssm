package com.zwz521.mapper;

import com.zwz521.pojo.User;

/**
 * @author 赵文卓
 * @version 1.0
 * @date 2020/11/3 10:13
 */
public interface UserMapper {
    public User findById(int id);
}
