package com.yuan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Dog
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/9/22-16:24
 * @Version: 1.0
 */
@Component
@ConfigurationProperties(prefix = "dog")
public class Dog {

    private String firstName;
    private Integer age;

    public Dog() {
    }

    public Dog(String firstName, Integer age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
