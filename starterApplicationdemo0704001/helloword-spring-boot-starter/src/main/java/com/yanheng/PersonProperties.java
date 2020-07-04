package com.yanheng;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yanHeng
 * @date 2020-05-25 21:42
 * @description 配置参数
 */
@ConfigurationProperties(prefix = "spring.person")
public class PersonProperties {

    // 姓名
    private String name;
    // 年龄
    private int age;
    // 性别
    private String sex = "M";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
