@GTS-4
Feature: the version and hello can be retrieved
  Scenario: client makes call to GET /version
    When the client calls /version
    Then the client receives status code is 200
    And the client receives server version "1.0"

  Scenario: client makes call to GET /hello
    When the client calls /hello
    Then the client receives status code is 200
    And the client receives message "Hello World"
