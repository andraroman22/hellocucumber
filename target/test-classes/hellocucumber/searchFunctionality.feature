Feature: test the search functionality on pearson.com

  Scenario: search should be present on main page
    Given  main page is loaded
    When I look for search element on page
    Then I can use search feature on page


