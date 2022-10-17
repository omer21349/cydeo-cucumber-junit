Feature: User should be login with correct credentials


  Background: user is on the login pages
    Given Open a chrome browser. Go to web table login pages


  Scenario: Login scenario
    When Enter username: "Test"
    And Enter password: "Tester"
    And user clicks to login button
    Then User should see url contains orders

  Scenario: Login scenario
    When user enters username "Test" password "Tester" and logins
    Then User should see url contains orders



  Scenario: User should be able to see all 12 months in
    When User enters below credentials
      | username | Test |
      | password | Tester |
    Then User should see url contains orders