package com.snwellness.feignconsumer.controller;

import com.snwellness.feignconsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description： 服务访问入口
 * @Author:yangfuren
 * @Date: Created in 14:39 2018/4/2
 * @Modified By:
 */
@RestController
//这里的RequestMapping与user-server中的controller要一致否则会找不到
@RequestMapping("/user")
public class UserFeignController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUserAgeByName")
    public Integer getUserAgeByName(@RequestParam("name") String name){
        return  userService.getUserAgeByName(name);
    }


}
