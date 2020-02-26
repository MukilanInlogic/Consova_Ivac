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


  @MT-69422
  Scenario Outline: MT-69422:Provider Login_Home page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    When I click Login button
    Then I should see home page of Managemyhealth
    Then I should see Inbox widget defaultly available
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69423
  Scenario Outline: MT-69423:Homepage
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    When I click Login button
    Then I should see home page of Managemyhealth
    Then I should see Main SetUp And Clinical Menus Items
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69427
  Scenario Outline: MT-69427:Update profile
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    When I click Login button
    And I Click My Account Main Menu
    Then I should see All The profile details
    And I click Update Profile
    Then I see Update Profile page
    And I Change the Required Details<MobilePhoneNumber>
    When I Click Update Profile button
    Then I should see updated profile details
    And Remove the Updated profile details
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | MobilePhoneNumber                  |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:EDITPROFILEDETAILS.MOBILENUMBER |


  @MT-69430
  Scenario Outline: MT-69430:View profile
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    When I click Login button
    And I Click My Account Main Menu
    And I should see My Account page Tabs Displays
    Then I should see All The profile details
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |






















