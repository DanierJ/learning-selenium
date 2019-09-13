Feature: Application Login
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User logs in into application with username "javid" and password "javid123"
    Then Home page is populated
    And it is "true" that cards are displayed

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User logs in into application with username "danier" and password "danier123"
    Then Home page is populated
    And it is "false" that cards are displayed