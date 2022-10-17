Feature: Wikipedia Search Functionality Title Verification
  Agile story: As a user, when I am on the wikipedia search page
  I should be able to search whatever I want and see relevant information


  Scenario: Wikipedia Search Functionality Title Verification
    When User is on Wikipedia home page
    And User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title


  @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality Title Verification
    When User is on Wikipedia home page
    And User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: search values we are going to be using in the scenario
      | searchValue       | expectedTitle     | expectedMainHeader |
      | Steve Jobs        | Steve Jobs        | Steve Jobs         |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
      | Bob Marley        | Bob Marley        | Bob Marley         |
      | Chuck Norris      | Chuck Norris      | Chuck Norris       |
      | Antony Hopkins    | Antony Hopkins    | Antony Hopkins     |
      | Marie Curie       | Marie Curie       | Marie Curie        |



 # TC#2: Wikipedia Search Functionality Title Verification
 # 1. User is on Wikipedia home page
 # 2. User types Steve Jobs in the wiki search box
 # 3. User clicks wiki search button
 # 4. User sees Steve Jobs is in the wiki title
 # Note: Follow POM#
