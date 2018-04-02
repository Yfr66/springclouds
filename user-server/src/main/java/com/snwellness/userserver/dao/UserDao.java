package com.snwellness.userserver.dao;

import com.snwellness.userserver.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description：用户操作接口
 * @Author:yangfuren
 * @Date: Created in 2018年4月2日09:48:31
 */
@Component
public interface UserDao extends JpaRepository<User,Integer>{

    /**
     * @Description： 根据用户名查找用户
     * @Author:yangfuren
     */
    public User findUserByUserName(String name);
}