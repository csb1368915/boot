package com.ticomm.boot.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ticomm.boot.boot.dao")
public class BootApplication {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

}
