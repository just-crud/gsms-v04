package com.yzg.gsms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.IdGenerator;
import org.springframework.util.JdkIdGenerator;

@Configuration
public class BeanConfig {

    @Bean
    public IdGenerator initIdGenerator(){
        return new JdkIdGenerator();
    }
}
