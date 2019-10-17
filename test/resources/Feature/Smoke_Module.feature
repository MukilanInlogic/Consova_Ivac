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

  @MT-82548
  Scenario Outline: MT-82548:Service Provider should able to update the Profile details
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I Click My Account Main Menu
    Then I sholuld see My Account page
    And I click Update Profile
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-82549
  Scenario Outline: MT-82549:Verify My Health Center tab is opened under My Account page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I Click My Account Main Menu
    When I Click My Health Center tab in the My Account Page
    Then Administrative Staff is present in the My Health Center Tab
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-82550

  Scenario Outline: MT-82550:Verify Access Information tab is opened under My Account page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I Click My Account Main Menu
    When I click Access Information Tab
    Then Access Information tab opened
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-82551
  Scenario Outline: MT-82551:Verify Emergency Contacts tab is opened under My Account page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I Click My Account Main Menu
    When I click Emergency Contacts Tab
    Then Emergeny Contacts tab opened
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-82552
  Scenario Outline: MT-82552:User should able to add the Emergency Contact
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I Click My Account Main Menu
    When I click Emergency Contacts Tab
    Then Emergeny Contacts tab opened
    And click Add icon the Emergency contact Tab
    And Enter the required details in the Emergency contacts tab: <FirstName>, <MobilePhone>, <Relationship>, <LastName>
    Then I should see added emergency contacts in the Emergency Contacts tab
    And Delete the Emergency Contacts
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | FirstName                      | MobilePhone                      | Relationship                      | LastName                      |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:EMERGENCYCONTACTS.FIRSTNAME | DP:EMERGENCYCONTACTS.MOBILEPHONE | DP:EMERGENCYCONTACTS.RELATIONSHIP | DP:EMERGENCYCONTACTS.LASTNAME |