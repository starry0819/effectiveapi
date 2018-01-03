package com.zhanghuanfa.service;

import com.zhanghuanfa.model.po.User;

/**
 * @author zhanghuanfa
 * @date 2018-01-02 20:17
 */
public interface UserService {
    /**
     * 根据用户主键id获取User信息
     * @param id 主键id
     * @return User对象信息
     */
    User getUserById(Integer id);
}
