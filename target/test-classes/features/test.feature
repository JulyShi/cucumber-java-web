Feature: Search in Baidu website

  Scenario: Search in Baidu website
    Given I open baidu website and validate the title
    When I input "Selenium" and search
    Then the search result displayed




