package com.djc.test;

import com.djc.conf.Config1;
import com.djc.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    @Test
    public void test01(){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config1.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService.getUser());

    }
}
