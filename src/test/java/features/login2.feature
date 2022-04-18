Feature: Login_Forget_Keyboard


  Background:LoginLink
    Given user  on homepage
    And   user clicks to My Account
    And   user clicks to login

  Scenario: ForgottenPassword
    #6

    When user clicks to ForgottenPassword
    Then User should be taken to Forgotten Password page

  Scenario: LoginWithKeyboard
    #7

    When user Tab to email and writes "testngkurs@gmail.com"
    And  user Tab to password and writes "testngkurs"
    And user clicks login button with enter
    Then user should see logout
    And user clicks to logoutButton


  Scenario: BrowserBack
      #9
    When  user is in login
    And user clicks to browser backButton
    Then User should not logged out
      #navigate.back  işlem yapmadı,sorulacak

  Scenario:Wrong_Entry
    #12- Validate the number of unsucessful login attemps
    When   user repeats login five times with wrong "abc@gmail.com" and "123456"
    Then   user should see "Warning:"
    #Senaryoda 1 saat sonra tekrar dene var ama o gözlenmedi

