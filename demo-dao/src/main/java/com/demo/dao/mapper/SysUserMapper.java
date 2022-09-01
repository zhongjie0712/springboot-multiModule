package com.demo.dao.mapper;
import com.demo.dao.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {
    User selectUserById(String id);
}
