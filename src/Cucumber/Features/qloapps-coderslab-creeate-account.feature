Feature: Create  Account QLOAPPS CORESLAB
  Scenario: user can create account
    Given an open browser with https://qloapps.coderslab.pl/pl/logowanie?back=my-account
    When  enter email
    Then click on button SubmitCreate
    When  enter required personal information
    Then click on button submitAccount
    And close browser