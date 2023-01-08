Feature: User Login

  Scenario: User is able to login with valid credentials

    Given user enters valid username in the username field
    And user enters valid password in the password field
    When user clicks on the login button
    Then user is logged in Successfully

  Scenario Outline: User is not able to login with invalid credentials

    Given user enters invalid <username> in the username field
    And user enters invalid <password> in the password field
    When user clicks on the login button
    Then error message is displayed

    Examples:
    | username            | password |
    | paten@gmail.com     | 1234     |
    | test@gmail.com      | test12   |








