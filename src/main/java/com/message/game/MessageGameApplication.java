package com.message.game;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.message.game"})
@MapperScan(basePackages = {"com.message.game.dao"})
@EnableCaching
@SpringBootApplication
public class MessageGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageGameApplication.class, args);
	}

}
