package com.my.layui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.my.layui.dao")
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
  }
}
