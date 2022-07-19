#parameterization and data driven
Feature: feature to test login functionality with parameters

  Scenario Outline: check login is succesfull with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And click on login page
    Then user is navigated to  home and enter <country>

    Examples: 
      | username | password | country |
      | saurabh  |    12345 | India   |
      | mark     |    12345 | Russia  |
