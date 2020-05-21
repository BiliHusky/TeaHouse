package com.deardogbit.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.deardogbit.backend.dao")
@ComponentScan(basePackages = {"com.deardogbit.backend.*"})
@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
public class DearDogBitApp {
    public static void main(String[] args) {
        SpringApplication.run(DearDogBitApp.class, args);
    }
}
