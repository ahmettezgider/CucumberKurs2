

  Feature: Forgot Password

    Scenario:  User is able to reset the password
      Given user is at Login Page
      When user clicks to forgot password
      Then user enters an valid email
      And  user clicks on continue button
      And user checks text for confirmation email
