Feature: Login into application

  Scenario Outline: Positive test validating login
    Given Initialize the browser with chrome
    And Navigate to "http://www.qaclickacademy.com/" site
    And Click on logs in link in home page to land on sign in page
    When User enters <username> and <password> and logs in
    Then Verify taht user is successfully log in
    And Close browsers


    Examples:
      | username         | password |
      | test99@gmail.com | 123456   |
      | juan@gmail.com   | 123456   |
      | jesus@gmail.com  | 123456   |