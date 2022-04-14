Feature: Login Functionality

  Scenario: login(TC_LF_001)
     #Validate logging into the Application using valid credentials
    Given user  on homepage
    And   user clicks to My Account
    And   user clicks to login
    When  writes user "testngkurs@gmail.com" and "testngkurs"
    And   user clicks to loginButton
    Then  should be displayed logout

  Scenario: login(TC_LF_002)
    #Validate logging into the Application using invalid credentials
      # (i.e. Invalid email address and Invalid Password)
    Given user  on homepage
    And  user clicks to My Account
    And  user clicks to login
    When  writes user "abc1@gmail.com" and "123654"
    And user clicks to loginButton
    Then should be displayed "Warning: No match for E-Mail Address and/or Password."

  Scenario: login(TC_LF_003)
     #Validate logging into the Application using invalid email address and valid Password
    Given user  on homepage
    And  user clicks to My Account
    And  user clicks to login
    When  writes user "deneme@gmail.com" and "testngkurs"
    And user clicks to loginButton
    Then should be displayed "Warning: No match for E-Mail Address and/or Password."