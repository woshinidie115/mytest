package com.hzb.photoalbum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages= "com.hzb.photoalbum.*")
@EntityScan(basePackages="com.hzb.photoalbum.pojo")
@EnableJpaRepositories(basePackages= "com.hzb.photoalbum.repository")
@SpringBootApplication
public class PhotoalbumApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoalbumApplication.class, args);
	}
}
