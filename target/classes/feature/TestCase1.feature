Feature: Demo QA Application test cases

  Scenario Outline: Test case1: Add book to the profile
  	Given Opening the browser
    And Enter username
    And Enter password
    When Click login
    When Click bookstore
    And Enter search text as "<SearchText>"
    And Click search result as "<SearchText>"
    Then Get title of the book
    And Click logout

Examples:
  | SearchText | SearchText|
  | Git | Git Pocket Guide|
 