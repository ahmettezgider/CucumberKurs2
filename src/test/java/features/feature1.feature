
Feature: feature deneme
  Cucumber baslangic calismasi


  @Tag1 @Tag2 @Tag3
  Scenario: senario 1
    Given user on home page
    When  user clicks to login button
    Then  login form should be visible


  @Tag1 @Tag2
  Scenario: senario 2
    Given user on home page
    And   user goes to login form
    When  user input username
    And   user input password
    And   user clicks to login button
    Then  page title should be My Account
    And   My Account page should be visible