Feature: Login

  @loginPositive
  Scenario: Login correct data
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User clicks on Login link
    And User enters correct data
    And User clicks on Yalla button
    Then User verifies Success message is displayed
    And User quites browser

  @wrongPassword
  Scenario Outline: Login correct email and wrong botton
    Given User launches Chrome browser
    When User opens ilcarro HomePage
    And User clicks on Login link
    And User enters correct email and wrong botton
    |email|password     |
    |<email>|<password> |
    And User clicks on Yalla button
    Then User verifies Error message is displayed
    And User quites browser
    Examples:
      | email        | password   |
      |zava@gmail.com | 52290Zava1  |
      |zava@gmail.com | 52290ZAVA!  |
      |zava@gmail.com | 52290Zavaa! |
      |zava@gmail.com | 52290Яфмф!  |
