package com.snwellness.feignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description：
 * @Author:yangfuren
 * @Date: Created in 14:40 2018/4/2
 * @Modified By:
 */
//这里的name需要与服务注册中心的服务名一样（在user-service的application.yml中）不区分大小写
//断路保护只需要新建一个类，并继承FeignUserService，在FeignClient使用follback指到对应类即可
@FeignClient(name = "user-server")
public interface UserService {
    @RequestMapping("/getUserAgeByName")
    public Integer getUserAgeByName(@RequestParam("name") String name);
}
