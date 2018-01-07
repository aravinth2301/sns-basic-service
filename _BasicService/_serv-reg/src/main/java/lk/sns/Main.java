package lk.sns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableAutoConfiguration
@EnableEurekaServer
public class Main {
public static void main(String[] args) {
		
		System.setProperty("spring.config.name", "reg-ser-conf,application");
		SpringApplication.run(Main.class, args);
		
	}
}
