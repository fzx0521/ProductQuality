package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("org.example.mapper")
@EnableTransactionManagement
public class ProductQualityApplication {
    public static void main(String[] args) {
        //param代表参数模型，用来接受前端请求传输的参数
        SpringApplication.run(ProductQualityApplication.class,args);
    }
  }
