package com.spring.mybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.redisson.Redisson;
import org.redisson.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//https://blog.csdn.net/m0_62617719/article/details/131151130
@SpringBootApplication
public class SpringBootMyBatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMyBatisDemoApplication.class, args);
    }


//    @Bean
//    public Redisson redisson() {
//        Config config = new Config();
//        config.useSingleServer().setAddress("redis://localhost:6397").setDatabase(0);
//        return (Redisson)Redisson.create(config);
//    }
}
