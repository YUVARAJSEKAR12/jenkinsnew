@RunAll
Feature: Login Page Exe

  Background: 
    Given Launch the browser

  @smoke2
  Scenario: Validate the valid username and password
    When Enter the username "Aiite"
    And Enter the password "Aiite32324"
    And Click the login button
    Then Validate the home page

  @smoke1
  Scenario: Validate the invalid username and password
    When Enter the username "Aiite2324"
    And Enter the password "Aiite3232444343"
    And Click the login button
    Then Validate the Error message

  @sceout
  Scenario Outline: Validate the emp details
    When Enter the emp name "<name>"
    And Enter the emp email "<email>"
    Then Validate the emp details

    Examples: 
      | name   | email              |
      | Aiite1 | trfghjk@jhgu65     |
      | Aiite2 | jdscbhusdgc@hsdghs |
      | Aiite3 | iaefg@hsdghs       |
