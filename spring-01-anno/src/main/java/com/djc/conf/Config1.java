package com.djc.conf;

import com.djc.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.djc.service")
public class Config1 {

    @Bean
    public User user(){
        return new User();
    }
}
