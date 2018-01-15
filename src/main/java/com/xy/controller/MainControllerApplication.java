package com.xy.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/*
 * 此标签设置扫描的目录，默认扫描当前类的包及其子包
 * @ComponentScan(basePackages="com.xy.controller")*/	
@SpringBootApplication
@MapperScan(basePackages="com.xy.dao")
@ComponentScan(basePackages="com.xy.controller")
@ComponentScan(basePackages="com.xy.config")
@ComponentScan(basePackages="com.xy.service")

public class MainControllerApplication {

	public static void main(String[] args) {
	  SpringApplication.run(MainControllerApplication.class, args);
	}

}
