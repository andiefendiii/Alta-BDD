Feature: Login
  As a Linkedin user
  I want to see my timeline
  So that I can like or comment my friend post


  Scenario: Login Success
    Given I am on the Login Page
    When I enter my username and password correctly
    And I click 'Login' button
    Then I am taken to the dashboard

  Scenario: Login Failed username
    Given I am on the Login Page failed username
    When I enter my username wrong and password correctly
    And I click 'Login' button for failed case
    Then I am taken to the dashboard failed login

  Scenario: Login Failed password
    Given I am on the Login Page failed password
    When I enter my username correctly and password wrong
    And I click 'Login' button for failed
    Then I am taken to the dashboard failed
