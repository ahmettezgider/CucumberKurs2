Feature: Login Functionality


  Scenario Outline: login(TC_LF_00)
    #1,2,3,4,5
    Given user  on homepage
    And   user clicks to My Account
    And   user clicks to login
    When  writes user "<email>" and "<password>"
    And user clicks to loginButton
    Then should act according to "<status>"

    Examples:
      | email                | password       | status |
      | abc1@gmail.com       | passwo123654rd | false  |
      | deneme@gmail.com     | testngkurs     | false  |
      | testngkurs@gmail.com | deneme123      | false  |
      |                      |                | false  |
      | testngkurs@gmail.com | testngkurs     | true   |

