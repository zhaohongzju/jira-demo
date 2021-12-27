@REQ_GTS-5
Feature: Mach Curate

	@TEST_GTS-9
	Scenario: Test GTS-5 Mach Curate - case version
		Scenario: client makes call to GET /version
		  When the client calls /version
		  Then the client receives status code is 200
		  And the client receives server version "1.0"
