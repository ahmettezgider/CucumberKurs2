

  Feature: Forgot Password

    Scenario:  User is able to reset the password

      Given user is at Login Page
      When user clicks to forgot password
      Then user enters an valid email
      And user clicks on continue button
      And user checks text for confirmation email

    Scenario: Login with old and new passwords

      Given user is at Login Page
      When user enters email and password
        | email                    | password | status |
        | Toprak@email.com | 537937   | 0 |
        | Zeydin@hotmail.com | 412512   | 0 |
        | zeydin.toprak@hotmail.com | 412412   | 1 |
