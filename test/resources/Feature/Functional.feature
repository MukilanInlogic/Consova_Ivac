Feature: Functional

  @MT-83050
  Scenario Outline: MT-83050:Login with invalid username and password

    Given I am on manage my health home page
    And I Enter <UserName>, <Password> valid credentials in Manage my health page
    When I click Login button
    Then I should see home page of Managemyhealth
    And I click Logout button


    Examples:
      | UserName              | Password                  |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |