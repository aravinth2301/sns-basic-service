package lk.sns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
//@EnableDiscoveryClient
public class SeverWeb {

	public static void main(String[] args) {
		SpringApplication.run(SeverWeb.class, args);
	}

	@RequestMapping("/login")
	public String login() {
		return "login2.jsf";
	}

	@RequestMapping("/pages/index")
	public String index() {
		return "index.jsf";
	}
}
