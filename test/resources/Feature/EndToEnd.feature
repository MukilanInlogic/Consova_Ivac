Feature: EneToEnd


  @MT-83080

  Scenario Outline: MT-83080:User update the password with Invalid current password

    Given I am on manage my health home page
    And I Enter <UserName>, <Password> valid credentials in Manage my health page
    When I click Login button
    Then I Click My Account Main Menu
    And I click change password button
    And I Enter Invalid And Valid Password <CrntPswd>, <NewPswd>, <ConfirmNewPswd>
    And I click button Change Password
    And I Verify the error message displays
    And I click Logout button




    Examples:
      | UserName              | Password                  | CrntPswd                   | NewPswd      | ConfirmNewPswd                   |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:ChangePassword.CrntPswd | Cameraman123 | DP:ChangePassword.ConfirmNewPswd |

  @MT-83081

  Scenario Outline: MT-83081:User update the password with Invalid new password

    Given I am on manage my health home page
    And I Enter <UserName>, <Password> valid credentials in Manage my health page
    When I click Login button
    Then I Click My Account Main Menu
    And I click change password button
    And I Enter Invalid And Valid Password <CrntCrtPswd>, <NewPswd>, <ConfirmNewPswd>
    And I click button Change Password
    And I Verify the required format message displays
    And I click Logout button




    Examples:
      | UserName              | Password                  | CrntCrtPswd                   | NewPswd      | ConfirmNewPswd                    |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:ChangePassword.CrntCrtPswd | cameraman123 | DP:ChangePassword.ConfirmNewPswd1 |

  @MT-83082

  Scenario Outline: MT-83082:User update the password with different new and confirm password

    Given I am on manage my health home page
    And I Enter <UserName>, <Password> valid credentials in Manage my health page
    When I click Login button
    Then I Click My Account Main Menu
    And I click change password button
    And I Enter Invalid And Valid Password <CrntCrtPswd>, <NewPswd>, <ConfirmNewPswd>
    And I click button Change Password
    And I Verify the New and confirm password miss match
    And I click Logout button




    Examples:
      | UserName              | Password                  | CrntCrtPswd                   | NewPswd | ConfirmNewPswd                   |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:ChangePassword.CrntCrtPswd | Void123 | DP:ChangePassword.ConfirmNewPswd |


  @MT-83107
  Scenario Outline: MT-83107:Check validation message is displayed in the My Health Center tab

    Given I am on manage my health home page
    And I Enter <UserName>, <Password> valid credentials in Manage my health page
    When I click Login button
    Then I Click My Account Main Menu
    Then I Click My Health Center tab in the My Account Page
    And I Click Verify button
    And I Verify The Warning Displays
    And I click Logout button

    Examples:
      | UserName              | Password                  |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83109
  Scenario Outline: MT-83109:Check cancel button is working in My Health Center tab

    Given I am on manage my health home page
    And I Enter <UserName>, <Password> valid credentials in Manage my health page
    When I click Login button
    Then I Click My Account Main Menu
    Then I Click My Health Center tab in the My Account Page
    And I Click Cancel Button And Verify It redirect To Profile Tab
    And I click Logout button

    Examples:
      | UserName              | Password                  |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83126
  Scenario Outline: MT-83126:User try to add emergency contacts without enter the mandatory fields
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
      | ProviderName          | ProviderPassword          | FirstName                       | MobilePhone                       | Relationship                       | LastName                       |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:EMERGENCYCONTACTS.FIRSTNAME1 | DP:EMERGENCYCONTACTS.MOBILEPHONE1 | DP:EMERGENCYCONTACTS.RELATIONSHIP1 | DP:EMERGENCYCONTACTS.LASTNAME1 |

  @MT-83127
  Scenario Outline: MT-83127:User should able to Edit the emergency contacts without mandatory fields
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I Click My Account Main Menu
    When I click Emergency Contacts Tab
    Then Emergeny Contacts tab opened
    And click Add icon the Emergency contact Tab
    And Enter the required details in the Emergency contacts tab: <FirstName>, <MobilePhone>, <Relationship>, <LastName>
    And I Click Edit Button
    And I Edit The Created Contact <EditedFirstName>
    And I Verify The Edited Text Got Saved
    And Delete the Emergency Contacts
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | FirstName                       | MobilePhone                       | Relationship                       | LastName                       | EditedFirstName |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:EMERGENCYCONTACTS.FIRSTNAME1 | DP:EMERGENCYCONTACTS.MOBILEPHONE1 | DP:EMERGENCYCONTACTS.RELATIONSHIP1 | DP:EMERGENCYCONTACTS.LASTNAME1 | Jack            |


  @MT-83128
  Scenario Outline: MT-83128:Check cancel button in Add Emergency contacts page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I Click My Account Main Menu
    When I click Emergency Contacts Tab
    Then Emergeny Contacts tab opened
    And click Add icon the Emergency contact Tab
    And Click Cancel Button and Verify it redirect to Emergency Contacts tab
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |



  @MT-83129
  Scenario Outline: MT-83129:Check cancel button in Edit Emergency contacts page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I Click My Account Main Menu
    When I click Emergency Contacts Tab
    Then Emergeny Contacts tab opened
    And click Add icon the Emergency contact Tab
    And Enter the required details in the Emergency contacts tab: <FirstName>, <MobilePhone>, <Relationship>, <LastName>
    And I Click Edit Button
    And Click Cancel Button and Verify it redirect to Emergency Contacts tab
    And Delete the Emergency Contacts
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | FirstName                       | MobilePhone                       | Relationship                       | LastName                       |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:EMERGENCYCONTACTS.FIRSTNAME1 | DP:EMERGENCYCONTACTS.MOBILEPHONE1 | DP:EMERGENCYCONTACTS.RELATIONSHIP1 | DP:EMERGENCYCONTACTS.LASTNAME1 |

  @MT-83161
  Scenario Outline: MT-83161:Check cancel button in Update Profile page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I Click My Account Main Menu
    When I click Update Profile
    Then I Click Cancel Button And Verify It redirect To Profile Tab
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |
