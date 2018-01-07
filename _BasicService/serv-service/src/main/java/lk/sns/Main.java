package lk.sns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude = { HibernateJpaAutoConfiguration.class, DataSourceAutoConfiguration.class }) 
@EnableDiscoveryClient
public class Main {

	public static void main(String[] args) {

		System.setProperty("spring.config.name", "dev-db,qa-db,application");
		System.setProperty("spring.profiles.active", "dev");
		SpringApplication.run(Main.class, args);

	}

}
