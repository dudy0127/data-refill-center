package io.github.dudy.transaction.datarefillcenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 流量充值中心启动类
 * @author dudy
 *
 */
@SpringBootApplication
@MapperScan("io.github.dudy.transaction.datarefillcenter.mapper")
public class DataRefillCenterApplication {
	
	public static void main(String[] args) { 
		SpringApplication.run(DataRefillCenterApplication.class, args);
	}

}
