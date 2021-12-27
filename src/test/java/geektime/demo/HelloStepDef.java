package geektime.demo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class HelloStepDef {
    static WebTestClient webTestClient = WebTestClient.bindToServer().baseUrl("http://localhost:8089").build();
    static WebTestClient.ResponseSpec responseSpec = null;

    @When("the client calls \\/version")
    public void the_client_calls_version() {
        // Write code here that turns the phrase above into concrete actions
        log.info("http request /version...");
//        webTestClient.get().uri("/version").exchange().expectStatus().isEqualTo(200).expectBody(String.class).isEqualTo("1.0");
        responseSpec = webTestClient.get().uri("/version").exchange();
    }
    @When("the client calls \\/hello")
    public void the_client_calls_hello() {
        log.info("http request /hello...");
        responseSpec = webTestClient.get().uri("/hello").exchange();
    }

    @Then("the client receives status code is {int}")
    public void the_client_receives_status_code_of(int code) {
        // Write code here that turns the phrase above into concrete actions
        log.info("check status...");
        responseSpec.expectStatus().isEqualTo(code);
    }
    @Then("the client receives server version {string}")
    public void the_client_receives_server_version(String version) {
        // Write code here that turns the phrase above into concrete actions
        log.info("check version...");
        responseSpec.expectBody(String.class).isEqualTo(version);
    }
    @Then("the client receives message {string}")
    public void the_client_receives_message(String message) {
        // Write code here that turns the phrase above into concrete actions
        log.info("check message...");
        responseSpec.expectBody(String.class).isEqualTo(message);
    }
}
