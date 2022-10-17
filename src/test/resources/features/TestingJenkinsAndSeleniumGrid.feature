@smoke31
Feature: Google search feature


  Scenario: Verifying Google search giving expected result
    Given As a user open google search page
    And   As a user enter a "apple"
    And   Click search button.
    Then  Verify title is "apple - Google Search"


    Scenario: verify google search
      Given As a user open google search page
      And As a user enter a "banana"
      And Click search button.
      Then Verify title is "banana - Google Search"
