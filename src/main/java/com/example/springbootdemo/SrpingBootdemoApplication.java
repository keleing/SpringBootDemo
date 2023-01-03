package com.example.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.example.springbootdemo.mapper"})
@SpringBootApplication
public class SrpingBootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrpingBootdemoApplication.class, args);
    }

}
