Feature: Smoke Module

  @MT-82538
  Scenario Outline: MT-82538:Login with valid username and password

    Given I am on manage my health home page
    And I Enter <UserName>, <Password> valid credentials in Manage my health page
    When I click Login button
    Then I should see home page of Managemyhealth
    And I click Logout button


    Examples:
      | UserName          | Password          |
      | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD |

  @MT-82541
  Scenario Outline: MT-82541:Check the Menu displayed in the Service Provider login
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    When I click Login button
    Then I sholuld see <SETUPHEADER> Header in left pane
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | SETUPHEADER             |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:LEFTPANE.SETUPHEADER |

  @MT-83052
  Scenario Outline: MT-83052:Service Provider able to view the Inbox widget in the Home page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    When I click Login button
    Then I should see home page of Managemyhealth
    Then I sholuld see Inbox widget defaultly available
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-82545
  Scenario Outline: MT-82545:Service Provider able to Open and View the My Account page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I Click My Account Main Menu
    Then I sholuld see My Account page
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |
