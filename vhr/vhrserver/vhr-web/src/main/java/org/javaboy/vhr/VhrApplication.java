package org.javaboy.vhr;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author meehom
 * @data 2022/8/17 - 19:36
 */
@SpringBootApplication
@EnableCaching
//@MapperScan(basePackages = "org.javaboy.vhr.mapper")
@EnableScheduling
public class VhrApplication {

	public static void main(String[] args) {
		SpringApplication.run(VhrApplication.class, args);
	}

}