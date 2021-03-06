package com.wghs.babytun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wghs.babytun.dao")
public class BabytunApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabytunApplication.class, args);
	}

}

