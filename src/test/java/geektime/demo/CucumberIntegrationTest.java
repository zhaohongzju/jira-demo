package geektime.demo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"}, features = "src/test/resources")
@CucumberOptions( plugin = {"json:target/cucumber.json"}, features = "src/test/resources")
//@SpringBootTest
//@CucumberContextConfiguration
public class CucumberIntegrationTest {
}
