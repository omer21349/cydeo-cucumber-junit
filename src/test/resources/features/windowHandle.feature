
  Feature: window Handle feature
  @window
  Scenario: Verify window handle working as expected
    Given As a user go to practice page
    When Assert title is window
    And Click "Click Here" link
    And Switch to "New Window"
    Then Assert title is "New Window"










  #TC #5: Window Handle practice
  #
  #1. Create a new class called: T5_WindowsPractice
  #2. Create new test and make set ups
  #3. Go to : https://practice.cydeo.com/windows
  #4. Assert: Title is “Windows”
  #5. Click to: “Click Here” link
  #6. Switch to new Window.
  #7. Assert: Title is “New Window”