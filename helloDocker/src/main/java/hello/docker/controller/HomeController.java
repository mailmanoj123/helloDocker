package hello.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "Hello Spring boot and Docker";
	}
	
	@RequestMapping("/objective")
	public String objective() {
		return "To be a DevOps jombie !!!";
	}
	
	@RequestMapping("/learn")
	public String learn() {
		return "Spring Boot, docker and Jenkins";
	}
}
