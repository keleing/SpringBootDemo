package com.example.springbootdemo;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class SrpingBootdemoApplicationTests {


    @Resource
    DataSource dataSource;

    @Resource
    RedisTemplate redisTemplate;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getConnection());
        redisTemplate.opsForValue().set("1", "2");
    }

}
