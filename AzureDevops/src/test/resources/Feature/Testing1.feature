Feature: Testing BDD cucumber

  Scenario: Testing demo site
    Given open browser
    And navigate to toolsqa site
    When title is displayed
    And form is filled
    Then click submit