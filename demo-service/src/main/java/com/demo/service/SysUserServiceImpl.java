package com.demo.service;


import com.demo.dao.entity.User;
import com.demo.dao.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService{

    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public User selectUserById(String id) {
        User user = sysUserMapper.selectUserById(id);
        return user;
    }
}
