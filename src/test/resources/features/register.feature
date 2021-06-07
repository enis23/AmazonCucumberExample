Feature: user registration
  Scenario Outline: amazon user registration
    Given user should be on the homepage "url"
    Then user should hover the sign in menu
    Then user should click start here link
    Then user should enter fullName"<fullName>"
    Then user should enter email"<email>"
    Then user should enter password"<password>"
    Then user should re-enter password"<password>"
    Then user should click create account button
    Then the new page title should be "Authentication required"
    Examples: register data
    |fullName|email|password|
    |ahmet   |a1h2m3e4t5@gmail.com|asdf1234|
