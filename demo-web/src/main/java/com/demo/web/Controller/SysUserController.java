package com.demo.web.Controller;

import com.demo.dao.entity.User;
import com.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysUserController{
    @Autowired
     SysUserService sysUserService;

    @GetMapping("/selectUser")
    public User selectUserById(String id){
        User user = sysUserService.selectUserById(id);
        System.out.println(user);
        return user;
    }

}

