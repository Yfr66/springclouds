package com.snwellness.userserver.controller;

import com.snwellness.userserver.dao.UserDao;
import com.snwellness.userserver.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * @Description： 用户controoler层
 * @Author:yangfuren
 * @Date: Created in 14:15 2018/4/2
 * @Modified By:
 */
@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {

    /**
     * @RestController 返回json格式的数据 如果需要使用themeleaf则使用@Controller注解
       @Controller 处理http请求
       @RequestMapping 配置url映射
       @PathVariable 获取url中的数据
       @RequestParam 获取请求参数的值
       @GetMapping 组合注解
       @RequestBody 获取object类型参数（post）
     */

    @Autowired
    private UserDao userDao;

    /**
     * @Description： 传统方式传递参数
     * @Date: Created in 2018年4月2日10:38:58
     */
    @RequestMapping("getUser")
    public User getUser(@RequestParam("name") String name){
        return userDao.findUserByUserName(name);
    }

    /**
      * @Description： 采用rest风格请求
      * @Date: Created in $time $date
      */
    @GetMapping("name/{name}")
    public User getUserByUserNmae(@PathVariable String name){
        return  userDao.findUserByUserName(name);
    }

    /**
      * @Description： 根据用户名获取用户年龄
      * @Date: Created in $time $date
      */
    @RequestMapping("getUserAgeByName")
    public Integer getUserAgeByName(@RequestParam("name") String name){
        return  userDao.findUserByUserName(name).getAge();
    }
}

