package com.snwellness.userserver.entity;
import javax.persistence.*;
/**
 * @Description： 用户实体类
 * @Author:yangfuren
 * @Date: Created in 14:12 2018/4/2
 * @Modified By:
 */
@Entity
@Table(name = "users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    private String userName;

    private Integer age;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getAge() {
        return age;
    }

}