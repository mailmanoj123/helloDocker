package hello.docker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hello.docker.controller.HomeController;

public class HelloDockerApplicationTests {

	@Test
	public void testHome() {
		HomeController hc = new HomeController();
		String result = hc.home();
		assertEquals(result, "Hello Spring boot and Docker");
	}
	
	@Test
	public void testObjective() {
		HomeController hc = new HomeController();
		String result = hc.objective();
		assertEquals(result, "To be a DevOps jombie !!!");
	}
	
	//
	
	@Test
	public void testLearn() {
		HomeController hc = new HomeController();
		String result = hc.objective();
		assertEquals(result, "Spring Boot, docker and Jenkins !!!");
	}
}
