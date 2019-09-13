Feature: Login into application
  Scenario: Positive test validating login
    Given Initialize the browser with chrome
    And Navigate to "http://www.qaclickacademy.com/" site
    And Click on logs in link in home page to land on sign in page
    When User enters "username" and "password" and logs in
    Then Verify taht user is successfully log in