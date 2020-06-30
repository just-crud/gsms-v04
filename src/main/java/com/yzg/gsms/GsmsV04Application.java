package com.yzg.gsms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan(value = {"com.yzg.gsms.dao"})
@SpringBootApplication
public class GsmsV04Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GsmsV04Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(GsmsV04Application.class);
    }
}
