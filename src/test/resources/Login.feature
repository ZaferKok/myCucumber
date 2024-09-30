Feature: Login

  Background: Default repeated steps
    Given the user is on the login page

  @regression
  @smoke
  Scenario Outline: Successful login with valid credentials
    When the user enters valid username "<username>"
    And the user enters valid password "<password>"
    Then the user is redirected to the homepage
    
    Examples:
    | username      | password |
    | johnWick04    | 54ab21#:&|
    | superman99    | (=)>36ab2|
