Feature: Search in qunar website

  @bvt @test1
  Scenario: Search in qunar website
    Given I open qunar website and validate the title
    When I click "自由行"
    And I input the Free Trip search page
    Then the search result displayed





