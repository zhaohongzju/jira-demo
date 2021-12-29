package geektime.demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"}, features = "src/test/resources")
@CucumberOptions( plugin = {"pretty", "json:target/cucumber.json"}, features = "src/test/resources")
//@SpringBootTest
//@CucumberContextConfiguration
public class CucumberIntegrationTest {
}
