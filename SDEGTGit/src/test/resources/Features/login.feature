Feature: Login page Automation of saucedemo App

  Scenario Outline: Check login is succesful with valid credientials
    Given User is on Login page
    When User enter valid "<username>" and "<password>"
    And Click on login button
    Then User is navigate to home page
    And Close the browser

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
