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
    Then I should see <SETUPHEADER> Header in left pane
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
    Then I should see Inbox widget defaultly available
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
    Then I should see My Account page
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-82548
  Scenario Outline: MT-82548:Service Provider should able to update the Profile details
    Given I Login with valid username <ProviderName> and password <ProviderPassword>
    When I Click My Account Main Menu
    Then I should see My Account page
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

  @MT-84335
  Scenario Outline: MT-84335:User should able to send the Message to the Clinical Provider
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Provider Inbox link
    And I click compose Tab
    And I select healthcenter<HealthCentre> and Location<Location>
    And I select the Services in the dropdown<ServiceName>
    And I select To as Clinical Provider<To>
    And I select UserName<UserName>
    And I Enter manadory fields<Message>
    When I click Send Message Button
    Then I should see Send successfully
    And I click Reuturn to Inbox Button
    And I click sent Tab
    And I click delete Button
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | HealthCentre                  | Location                  | ServiceName                  | To                               | UserName                  | Message                  |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:PROVIDERINBOX.HEALTHCENTRE | DP:PROVIDERINBOX.LOCATION | DP:PROVIDERINBOX.SERVICENAME | DP:PROVIDERINBOX.HEALTHCENTRE.TO | DP:PROVIDERINBOX.USERNAME | DP:PROVIDERINBOX.MESSAGE |

  @MT-82768
  Scenario Outline: MT-82768:User should able to open the Provider Inbox
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    Then I should see Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-82770
  Scenario Outline: MT-82770: User should able to send the Message to the Service Provider
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Provider Inbox link
    And I click compose Tab
    And I select healthcenter<HealthCentre> and Location<Location>
    And I select the Services in the dropdown<ServiceName>
    And I select To as Clinical Provider<To>
    And I select UserName<UserName>
    And I Enter manadory fields<Message>
    When I click Send Message Button
    Then I should see Send successfully
    And I click Reuturn to Inbox Button
    And I click sent Tab
    And I click delete Button
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | HealthCentre                  | Location                  | ServiceName                  | To                               | UserName                  | Message                  |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:PROVIDERINBOX.HEALTHCENTRE | DP:PROVIDERINBOX.LOCATION | DP:PROVIDERINBOX.SERVICENAME | DP:PROVIDERINBOX.HEALTHCENTRE.TO | DP:PROVIDERINBOX.USERNAME | DP:PROVIDERINBOX.MESSAGE |

  @MT-84369
  Scenario Outline: MT-84369:User should able to send the Message to the Patient with attachment
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Patient Inbox link
    And I click compose Tab
    And I select healthcenter<HealthCentre> and Location<Location>
    And I select the Services in the dropdown<ServiceName>
    And I select To as Clinical Provider<Topatient>
    And I enter Patient Name<PatientName>
    And I Enter manadory fields<Message>
    When I click Send Message Button
    Then I should see Send successfully
    And I click Reuturn to Inbox Button
    And I click sent Tab
    And I click delete Button
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | HealthCentre                  | Location                  | ServiceName                  | Topatient                               | PatientName                  | Message                  |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:PROVIDERINBOX.HEALTHCENTRE | DP:PROVIDERINBOX.LOCATION | DP:PROVIDERINBOX.SERVICENAME | DP:PROVIDERINBOX.HEALTHCENTRE.TOPATIENT | DP:PROVIDERINBOX.PATIENTNAME | DP:PROVIDERINBOX.MESSAGE |

  @MT-82767
  Scenario Outline: MT-82767:User should able to open the Patient Inbox
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    Then I should see Patient Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-82769
  Scenario Outline: MT-82769:User should able to send the Message to the Patient
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Patient Inbox link
    And I click compose Tab
    And I select healthcenter<HealthCentre> and Location<Location>
    And I select the Services in the dropdown<ServiceName>
    And I select To as Clinical Provider<Topatient>
    And I enter Patient Name<PatientName>
    And I Enter manadory fields<Message>
    When I click Send Message Button
    Then I should see Send successfully
    And I click Reuturn to Inbox Button
    And I click sent Tab
    And I click delete Button
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | HealthCentre                  | Location                  | ServiceName                  | Topatient                               | PatientName                  | Message                  |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:PROVIDERINBOX.HEALTHCENTRE | DP:PROVIDERINBOX.LOCATION | DP:PROVIDERINBOX.SERVICENAME | DP:PROVIDERINBOX.HEALTHCENTRE.TOPATIENT | DP:PROVIDERINBOX.PATIENTNAME | DP:PROVIDERINBOX.MESSAGE |


  @MT-82595
  Scenario Outline: MT-82595:User should open the Calendar page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Calender link
    Then I should see Calender Page
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-82718
  Scenario Outline: MT-82718:User should able to add event to the calendar
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Calender link
    Then I should see Calender Page
    And I click the calender to open the Add event popup
    And I Enter the required details<Title>, <Description>
    When I click Event
    Then I should see added Event is displayed in the claender Page
    And I click the Delete Event Button
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | Title             | Description             |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:CALENDAR.TITLE | DP:CALENDAR.DESCRIPTION |


  @MT-83259
  Scenario Outline: MT-83259:User should open the Journal page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Journal link
    Then I should see Journal Page
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-83260
  Scenario Outline: MT-83260:User should able to add the Journal
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Journal link
    And I click New Add Journal Button
    And I Enter the required Details<Subject> ,<Category> ,<Notes>
    When I click the Save Entry Button
    Then I should see updated journal
    And I click Delete Journal Button
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | Subject            | Category            | Notes            |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:JOURNAL.SUBJECT | DP:JOURNAL.CATEGORY | DP:JOURNAL.NOTES |


  @MT-82719
  Scenario Outline: MT-82719:User should open the Practice page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Practice link
    Then I should see Practice Page
    Then I should see Health Center Name Available in the Practice
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-82763
  Scenario Outline: MT-82763:User should able to add the new staff to the Practice
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Practice link


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-82729
  Scenario Outline: MT-82729:User should open the Appointment inbox page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I Click Clinical Menu
    When I click Appointment inbox Menu
    Then I should see Appointment inbox Menu
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-82730
  Scenario Outline:MT-82730:User should open the Downloads page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Downloads Menu
    Then I should see Downloads Page
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-82732
  Scenario Outline:MT-82732:User should open the Setup E-services page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Setup Menu
    When I click Setup E-services Menu
    Then I should see E-services Page
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |