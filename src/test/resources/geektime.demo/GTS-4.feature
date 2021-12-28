@GTS-13
@REQ_GTS-4
Feature: Calgo Curate

	@TEST_GTS-6
	Scenario: Test GTS-4 Calgo Curate - case hello
		When the client calls /hello
		Then the client receives status code is 200
		And the client receives message "Hello World"
