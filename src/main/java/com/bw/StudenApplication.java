package com.bw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bw.mapper")
public class StudenApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudenApplication.class, args);
		System.out.println("运行成功");
	}

}
