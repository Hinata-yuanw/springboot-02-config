package com.yuan;

import com.yuan.pojo.Dog;
import com.yuan.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02ConfigApplicationTests {


    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
