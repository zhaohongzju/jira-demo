package geektime.demo;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@CucumberContextConfiguration
public class HelloWorldApplicationTest {

	@Test
	public void contextLoads() {
	}

}

