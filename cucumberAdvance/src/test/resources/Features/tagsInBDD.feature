Feature: to test tags

  @Smoke
  Scenario: scenario1
    Given "User Given "
    When " User When "
    And "User And "
    Then "User Then"

  @Regression
  Scenario: scenario2
    Given "User Given "
    When " User When "
    And "User And "
    Then "User Then"

  @smoke @Regression
  Scenario: scenario3
    Given "User Given "
    When " User When "
    And "User And "
    Then "User Then"
