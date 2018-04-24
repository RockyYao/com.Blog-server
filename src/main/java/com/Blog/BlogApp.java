package com.Blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.Blog.mapper")
public class BlogApp {

	public static void main(String[] args) {
		SpringApplication.run(BlogApp.class, args);
	}
}
