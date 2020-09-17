package cn.ekgc.mycloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MyCloudRegister {
	public static void main(String[] args) {
		SpringApplication.run(MyCloudRegister.class, args);
	}
}
