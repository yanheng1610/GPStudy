package com.example.demo;

import com.yanheng.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author yanHeng
 * @date 2020-05-26 12:39
 * @description test
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class MystarterApplicationTests {

    @Autowired
    private PersonService personService;

    @Test
    public void testHelloWorld() {
        personService.sayHello();
    }
}
