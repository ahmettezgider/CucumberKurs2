
Feature: feature deneme
  Cucumber baslangic calismasi


  @Tag1 @Tag2 @Tag3
  Scenario: senario 1
    Given user on home page test
    When  user clicks to login button test
    Then  login form should be visible test


  @Tag1 @Tag2
  Scenario: senario 2
    Given user on home page test
    And   user goes to login form test
    When  user input username test
    And   user input password test
    And   user clicks to login button test
    Then  page title should be My Account test
    And   My Account page should be visible test


