package com.haihai.springbootmybatiszhujie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.haihai.springbootmybatiszhujie.mapper")
@SpringBootApplication
public class SpringbootMybatisZhujieApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisZhujieApplication.class, args);
    }

}
