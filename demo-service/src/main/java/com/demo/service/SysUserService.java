package com.demo.service;


import com.demo.dao.entity.User;

public interface SysUserService {
    User selectUserById(String id);
}
