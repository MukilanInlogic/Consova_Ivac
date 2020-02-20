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


  @MT-84310
  Scenario Outline: MT-84310:User should able to Update the new message Alert settings
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Setting Tab
    Then I Click Yes Button in Alert settings
    And I Click Automatic replies Tab
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-84311
  Scenario Outline: MT-84311:User should able to disable out of reply for the Message
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Setting Tab
    And I Click Yes Button in Alert settings
    And I Click Automatic replies Tab
    Then I Enter <AutoRepliesText> The Valid Text In to The Automatic Replies Text box
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | AutoRepliesText |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test Message    |


  @MT-84312
  Scenario Outline: MT-84312:User should able to Enable out of reply for the Message
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Setting Tab
    And I Click Yes Button in Alert settings
    And I Click Automatic replies Tab
    And I Click The Enable Check Box
    Then I Enter <AutoRepliesText> The Valid Text In to The Automatic Replies Text box
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | AutoRepliesText |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test Message    |

  @MT-84313
  Scenario Outline: MT-84313:User should able to cancel the compose Message
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I click compose Tab
    Then I Should See the page moves to compose tab
    And I Click cancel button In compose message tab
    And I Verify The Page Redirected To Inbox Tab
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-84314
  Scenario Outline: MT-84314:User should able to update the Signature in the Provider Inbox details
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Setting Tab
    And I Click Yes Button in Alert settings
    And I Click Signature Settings Tab
    Then I Enter <SignatureSettings> The Valid Text In to The Signature Settings Text box
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | SignatureSettings |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test Message      |


  @MT-83436
  Scenario Outline: MT-83436:Should not sent a message without patient
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Patient Inbox link
    And I click compose Tab
    And I select healthcenter<HealthCentre> and Location<Location>
    And I select the Services in the dropdown<ServiceName>
    And I select To as Clinical Provider<Topatient>
    When I click Send Message Button
    Then I Verify The Alert Displays
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | HealthCentre                  | Location                  | ServiceName                  | Topatient                               |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:PROVIDERINBOX.HEALTHCENTRE | DP:PROVIDERINBOX.LOCATION | DP:PROVIDERINBOX.SERVICENAME | DP:PROVIDERINBOX.HEALTHCENTRE.TOPATIENT |


  @MT-83420
  Scenario Outline: MT-83420:No records available displayed in the Patient Inbox grid
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Inbox Tab
    Then I Should See no record available message in inbox table
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-84294
  Scenario Outline: MT-84294:User should able to Update the new message Alert settings
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I Click Setting Tab
    Then I Click Yes Button in Alert settings
    And I Click Automatic replies Tab
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-84293
  Scenario Outline: MT-84293:User should able to disable out of reply for the Message
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I Click Setting Tab
    And I Click Yes Button in Alert settings
    And I Click Automatic replies Tab
    Then I Enter <AutoRepliesText> The Valid Text In to The Automatic Replies Text box
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | AutoRepliesText |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test Message    |


  @MT-84292
  Scenario Outline: MT-84292:User should able to Enable out of reply for the Message
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I Click Setting Tab
    And I Click Yes Button in Alert settings
    And I Click Automatic replies Tab
    And I Click The Enable Check Box
    Then I Enter <AutoRepliesText> The Valid Text In to The Automatic Replies Text box
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | AutoRepliesText |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test Message    |


  @MT-84290
  Scenario Outline: MT-84290:User should able to cancel the compose Message
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I click compose Tab
    Then I Should See the page moves to compose tab
    And I Click cancel button In compose message tab
    And I Verify The Page Redirected To Inbox Tab
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-83451
  Scenario Outline: MT-83451:Should not sent a message without recepient
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I click compose Tab
    And I select healthcenter<HealthCentre> and Location<Location>
    And I select the Services in the dropdown<ServiceName>
    And I select To as Clinical Provider<Topatient>
    When I click Send Message Button
    Then I Verify The Alert Displays
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | HealthCentre                  | Location                  | ServiceName                  | Topatient                        |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:PROVIDERINBOX.HEALTHCENTRE | DP:PROVIDERINBOX.LOCATION | DP:PROVIDERINBOX.SERVICENAME | DP:PROVIDERINBOX.HEALTHCENTRE.TO |


  @MT-83512
  Scenario Outline: MT-83512:No records available displayed in the Patient Inbox grid
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I Click Inbox Tab
    Then I Should See no record available message in inbox table
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-84291
  Scenario Outline: MT-84291:User should able to update the Signature in the Provider Inbox details
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I Click Setting Tab
    And I Click Yes Button in Alert settings
    And I Click Signature Settings Tab
    Then I Enter <SignatureSettings> The Valid Text In to The Signature Settings Text box
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | SignatureSettings |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test Message      |

  @MT-83400
  Scenario Outline: MT-83400:Cancel the Event Creation
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Calender link
    Then I should see Calender Page
    And I click the calender to open the Add event popup
    Then I should see Event Page Displays
    And i Click Cancel in Calender
    And I should see the event window closed
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83401
  Scenario Outline: MT-83401:Verify Save button should not enable without enter the mandatory fields
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Calender link
    Then I should see Calender Page
    And I click the calender to open the Add event popup
    Then I should see Event Page Displays
    And I Should See the save button is in disabled state
    And i Click Cancel in Calender
    And I should see the event window closed
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83403
  Scenario Outline: MT-83403:Delete the Added event in the Calendar
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


  @MT-83406
  Scenario Outline: MT-83406:Check cancel button while editing/view the event popup
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Calender link
    Then I should see Calender Page
    And I click the calender to open the Add event popup
    Then I should see Event Page Displays
    And i Click Cancel in Calender
    And I should see the event window closed
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83287
  Scenario Outline: MT-83287:Should not add the journal without mandatory fields
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Journal link
    And I click New Add Journal Button
    And I Click Save Button Journal
    Then I Should See Warning Message Displays In Journal Window
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83269
  Scenario Outline: MT-83269:Should not update the journal without mandatory fields
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Journal link
    And I click New Add Journal Button
    And I Enter the required Details<Subject> ,<Category> ,<Notes>
    When I click the Save Entry Button
    Then I should see updated journal
    And I Click Edit Button View Journal
    And i Clear All The Maditory Fields From Saved Journal Record
    And I click the Update Button View Journal
    Then I Should See Warning Message Displays In Journal Window After Clear
    And Click Cancel View Journal
    And I click Delete Journal Button
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | Subject            | Category            | Notes            |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:JOURNAL.SUBJECT | DP:JOURNAL.CATEGORY | DP:JOURNAL.NOTES |


  @MT-83214
  Scenario Outline: MT-83214:User should able to search a invalid staff in the Staff tab
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Practice link
    Then I should see Practice Page
    And I Click Staff Tab In Practice Page
    And I Enter Invalid Staff Name In The <StrStaffTxt> Text box And Click Search
    Then I Should See no record available message in staff tab practice page
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | StrStaffTxt        |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:STAFF.STAFFNAME |


  @MT-83228
  Scenario Outline: MT-83228:User update the role without Select the locatin and role
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Practice link
    Then I should see Practice Page
    And I Click Staff Tab In Practice Page
    And I Enter Invalid Staff Name In The <StaffName> Text box And Click Search
    And I Click Map Location And Role Link
    Then I Should See map location window and click update and verify the alert displays
    And I Click Cancel Map Location
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | StaffName          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:STAFF.TOMRIDDLE |


  @MT-83255
  Scenario Outline: MT-83255:Without select the Practice in Auto suggest list , search a user
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    And I Enter InValid Text <SearchPatient> in name text box search patient page
    And I Click Search Button Search Patient
    Then I Should See The Warning Message no Patient Found Displays
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | SearchPatient |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | La            |


  @MT-83256
  Scenario Outline: MT-83256:Search the user by username without enter the name
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    And I Click First Name radio Button
    And I Enter InValid Text <SearchPatient> in name text box search patient page
    And I Click Search Button Search Patient
    Then I Should See The Warning Message no Patient Found Displays
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | SearchPatient |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | La            |


  @MT-83261
  Scenario Outline: MT-83261:Search the user by Name without enter the name
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    And I Click Last Name radio Button
    And I Enter InValid Text <SearchPatient> in name text box search patient page
    And I Click Search Button Search Patient
    Then I Should See The Warning Message no Patient Found Displays
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | SearchPatient |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | La            |


#  @MT-83267
#  Scenario Outline: MT-83267:Clear the search critera in Manage user page
#    Given I am on manage my health home page
#    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
#    And I click Login button
#    When I click Search user link
#    And I Click Last Name radio Button
#    And I Enter InValid Text <SearchPatient> in name text box search patient page
#    Then I Should See The Value Enter in To The text box
#    And I Click Clear Button Search patient
#    Then I Should see the text cleared from the text box
#    And I click Logout button
#
#
#    Examples:
#      | ProviderName          | ProviderPassword          | SearchPatient |
#      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | TESTVALUE     |


  @MT-83262
  Scenario Outline: MT-83262:Search a user by Name without autosuggest
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    And I Click Last Name radio Button
    And I Click AutoAuggest Button
    And I Enter InValid Text <SearchPatient> in name text box search patient page
    Then I Should See The Auto Suggest List Not Displays
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | SearchPatient |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test          |

  @MT-83341
  Scenario Outline: MT-83341:Check mandatory validation message is displayed while adding the e-service
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Setup Menu
    And I click Setup E-services Menu
    And I click Add E-services Button
    And I Enter Mandatory fields in the Add e-servicePage <HealthCenter>, <ServiceCategory>, <ServiceName>, <ServiceCode>, <RecipientRole>, <Recipient>, <Description>, <Terms>
    When I click Save Button
    Then I Should See The Created Setup Records <EService> Displays In All The Fields
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | HealthCenter                  | ServiceCategory                    | ServiceName                   | ServiceCode                   | RecipientRole                    | Recipient                    | Description                    | Terms                    | EService                    |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:SETUPESERVICE.SSHEALTHCARE | DP:SETUPESERVICE.SSSERVICECATEGORY | DP:SETUPESERVICE.ESERVICENAME | DP:SETUPESERVICE.ESERVICECODE | DP:SETUPESERVICE.SSRECIPIENTROLE | DP:SETUPESERVICE.SSRECIPIENT | DP:SETUPESERVICE.SSDESCRIPTION | DP:SETUPESERVICE.SSTERMS | DP:SETUPESERVICE.SETUPECODE |


  @MT-83342
  Scenario Outline: MT-83342:Cancel the e-service request while adding the e-service request
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Setup Menu
    When I click Setup E-services Menu
    And I click Add E-services Button
    Then I Click Cancel Button E-Services Menu
    And I Should See the pare redirected to setup E-Service
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83343
  Scenario Outline: MT-83343: Check mandatory validation message is displayed while edit the e-service
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Setup Menu
    And I click Setup E-services Menu
    And I click Add E-services Button
    And I Enter Mandatory fields in the Add e-servicePage <HealthCenter>, <ServiceCategory>, <ServiceName>, <ServiceCode>, <RecipientRole>, <Recipient>, <Description>, <Terms>
    When I click Save Button
    And Click The Edit Button For Created Record <ToEdit>
    And I Enter Edited Text in The Name text box <EditedName>
    Then I click Edit Save Button
    And I See Success Message Display And Click return Button
    And I Should See The Created Setup Records <EService> Displays In All The Fields
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | HealthCenter                  | ServiceCategory                    | ServiceName                       | ServiceCode                       | RecipientRole                    | Recipient                    | Description                    | Terms                    | ToEdit                            | EditedName                          | EService                            |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:SETUPESERVICE.SSHEALTHCARE | DP:SETUPESERVICE.SSSERVICECATEGORY | DP:SETUPESERVICE.EDITESERVICENAME | DP:SETUPESERVICE.EDITESERVICECODE | DP:SETUPESERVICE.SSRECIPIENTROLE | DP:SETUPESERVICE.SSRECIPIENT | DP:SETUPESERVICE.SSDESCRIPTION | DP:SETUPESERVICE.SSTERMS | DP:SETUPESERVICE.EDITESERVICENAME | DP:SETUPESERVICE.EDITEDESERVICENAME | DP:SETUPESERVICE.EDITEDESERVICENAME |


  @MT-83344
  Scenario Outline: MT-83344:Cancel the e-service request while updating the e-service request
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Setup Menu
    And I click Setup E-services Menu
    And I click Add E-services Button
    And I Enter Mandatory fields in the Add e-servicePage <HealthCenter>, <ServiceCategory>, <ServiceName>, <ServiceCode>, <RecipientRole>, <Recipient>, <Description>, <Terms>
    When I click Save Button
    And Click The Edit Button For Created Record <ToEdit>
    Then I Click Cancel Button E-Services Menu
    And I Should See the pare redirected to setup E-Service
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | HealthCenter                  | ServiceCategory                    | ServiceName                    | ServiceCode                    | RecipientRole                    | Recipient                    | Description                    | Terms                    | ToEdit                         |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:SETUPESERVICE.SSHEALTHCARE | DP:SETUPESERVICE.SSSERVICECATEGORY | DP:SETUPESERVICE.ESERVICENAME1 | DP:SETUPESERVICE.ESERVICECODE1 | DP:SETUPESERVICE.SSRECIPIENTROLE | DP:SETUPESERVICE.SSRECIPIENT | DP:SETUPESERVICE.SSDESCRIPTION | DP:SETUPESERVICE.SSTERMS | DP:SETUPESERVICE.ESERVICENAME1 |


  @MT-83349
  Scenario Outline: MT-83349:Cancel the Service Status update in Setup e-services
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Setup Menu
    And I click Setup E-services Menu
    And I click Add E-services Button
    And I Enter Mandatory fields in the Add e-servicePage <HealthCenter>, <ServiceCategory>, <ServiceName>, <ServiceCode>, <RecipientRole>, <Recipient>, <Description>, <Terms>
    When I click Save Button
    And I Click The Status Button <ClickStatus>
    Then I Should See The Saved Record Status <CreatedStatus>
    And I Click Cancel Button E-Services Menu
    Then I Should See the pare redirected to setup E-Service
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | HealthCenter                  | ServiceCategory                    | ServiceName                    | ServiceCode                    | RecipientRole                    | Recipient                    | Description                    | Terms                    | ClickStatus                    | CreatedStatus                  |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:SETUPESERVICE.SSHEALTHCARE | DP:SETUPESERVICE.SSSERVICECATEGORY | DP:SETUPESERVICE.ESERVICENAME2 | DP:SETUPESERVICE.ESERVICECODE2 | DP:SETUPESERVICE.SSRECIPIENTROLE | DP:SETUPESERVICE.SSRECIPIENT | DP:SETUPESERVICE.SSDESCRIPTION | DP:SETUPESERVICE.SSTERMS | DP:SETUPESERVICE.ESERVICENAME2 | DP:SETUPESERVICE.ESERVICENAME2 |

  @MT-83350
  Scenario Outline: MT-83350:Send the Group message wiithout enter the subject
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Setup Menu
    When I click Group Mail Menu
    And I should see Group Message Page
    And I click Send Message Button in Group Message
    Then I Should See The Warning Displays In Group Message Page
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83367
  Scenario Outline: MT-83367:Accept Numeric in Appointment and Follow ups per day
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Setup Menu
    When I click MyPractice Menu
    And I see Practice details opened
    And I Click Setting Tab My Practice
    And I Click Edit Button My Practice
    Then I Clear And Click The Update Button Practice Settings
    And I Should See The Warning Displays Practice Settings Page
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83366
  Scenario Outline: MT-83366:Cancel the Update Appointment and Followup Settings
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Setup Menu
    When I click MyPractice Menu
    And I see Practice details opened
    And I Click Setting Tab My Practice
    And I Click Edit Button My Practice
    Then I Click Cancel Button E-Services Menu
    And I Should See The Page Redirected to practice settings menu page
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83175

  Scenario Outline: MT-83175:User update the password with Invalid current password

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


  @MT-83176

  Scenario Outline: MT-83176:User update the password with Invalid new password

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

  @MT-83177

  Scenario Outline: MT-83177:User update the password with different new and confirm password

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


  @MT-83181
  Scenario Outline: MT-83181:Check validation message is displayed in the My Health Center tab

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


  @MT-83182
  Scenario Outline: MT-83182:Check cancel button is working in My Health Center tab

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


  @MT-83183
  Scenario Outline: MT-83183:User try to add emergency contacts without enter the mandatory fields
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

  @MT-83184
  Scenario Outline: MT-83184:User should able to Edit the emergency contacts without mandatory fields
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


  @MT-83185
  Scenario Outline: MT-83185:Check cancel button in Add Emergency contacts page
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


  @MT-83186
  Scenario Outline: MT-83186:Check cancel button in Edit Emergency contacts page
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

  @MT-83187
  Scenario Outline: MT-83187:Check cancel button in Update Profile page
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


  @MT-83513
  Scenario Outline: MT-83513:No records available displayed in the Patient Inbox grid
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I Click Inbox Tab
    Then I Should See no record available message in inbox table
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-84305
  Scenario Outline: MT-84305:User should able to Update the new message Alert settings
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I Click Setting Tab
    Then I Click Yes Button in Alert settings
    And I Click Automatic replies Tab
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-83495
  Scenario Outline: MT-83495:Should not sent a message without recepient
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I click compose Tab
    And I select healthcenter<HealthCentre> and Location<Location>
    And I select the Services in the dropdown<ServiceName>
    And I select To as Clinical Provider<Topatient>
    When I click Send Message Button
    Then I Verify The Alert Displays
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | HealthCentre                  | Location                  | ServiceName                  | Topatient                        |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:PROVIDERINBOX.HEALTHCENTRE | DP:PROVIDERINBOX.LOCATION | DP:PROVIDERINBOX.SERVICENAME | DP:PROVIDERINBOX.HEALTHCENTRE.TO |


  @MT-84306
  Scenario Outline: MT-84306:User should able to disable out of reply for the Message
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I Click Setting Tab
    And I Click Yes Button in Alert settings
    And I Click Automatic replies Tab
    Then I Enter <AutoRepliesText> The Valid Text In to The Automatic Replies Text box
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | AutoRepliesText |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test Message    |


  @MT-84307
  Scenario Outline: MT-84307:User should able to Enable out of reply for the Message
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I Click Setting Tab
    And I Click Yes Button in Alert settings
    And I Click Automatic replies Tab
    And I Click The Enable Check Box
    Then I Enter <AutoRepliesText> The Valid Text In to The Automatic Replies Text box
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | AutoRepliesText |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test Message    |


  @MT-84308
  Scenario Outline: MT-84308:User should able to cancel the compose Message
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I click compose Tab
    Then I Should See the page moves to compose tab
    And I Click cancel button In compose message tab
    And I Verify The Page Redirected To Inbox Tab
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-84309
  Scenario Outline: MT-84309:User should able to update the Signature in the Provider Inbox details
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Provider Inbox link
    And I Click Setting Tab
    And I Click Yes Button in Alert settings
    And I Click Signature Settings Tab
    Then I Enter <SignatureSettings> The Valid Text In to The Signature Settings Text box
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | SignatureSettings |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test Message      |


  @MT-83514
  Scenario Outline: MT-83514:No records available displayed in the Patient Inbox grid
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Inbox Tab
    Then I Should See no record available message in inbox table
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-84300
  Scenario Outline: MT-84300:User should able to Update the new message Alert settings
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Setting Tab
    Then I Click Yes Button in Alert settings
    And I Click Automatic replies Tab
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83465
  Scenario Outline: MT-83465:Should not sent a message without patient
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Patient Inbox link
    And I click compose Tab
    And I select healthcenter<HealthCentre> and Location<Location>
    And I select the Services in the dropdown<ServiceName>
    And I select To as Clinical Provider<Topatient>
    When I click Send Message Button
    Then I Verify The Alert Displays
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | HealthCentre                  | Location                  | ServiceName                  | Topatient                               |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:PROVIDERINBOX.HEALTHCENTRE | DP:PROVIDERINBOX.LOCATION | DP:PROVIDERINBOX.SERVICENAME | DP:PROVIDERINBOX.HEALTHCENTRE.TOPATIENT |


  @MT-84301
  Scenario Outline: MT-84301:User should able to disable out of reply for the Message
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Setting Tab
    And I Click Yes Button in Alert settings
    And I Click Automatic replies Tab
    Then I Enter <AutoRepliesText> The Valid Text In to The Automatic Replies Text box
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | AutoRepliesText |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test Message    |


  @MT-84302
  Scenario Outline: MT-84302:User should able to Enable out of reply for the Message
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Setting Tab
    And I Click Yes Button in Alert settings
    And I Click Automatic replies Tab
    And I Click The Enable Check Box
    Then I Enter <AutoRepliesText> The Valid Text In to The Automatic Replies Text box
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | AutoRepliesText |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test Message    |


  @MT-84303
  Scenario Outline: MT-84303:User should able to cancel the compose Message
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I click compose Tab
    Then I Should See the page moves to compose tab
    And I Click cancel button In compose message tab
    And I Verify The Page Redirected To Inbox Tab
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-84304
  Scenario Outline: MT-84304:User should able to update the Signature in the Provider Inbox details
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Setting Tab
    And I Click Yes Button in Alert settings
    And I Click Signature Settings Tab
    Then I Enter <SignatureSettings> The Valid Text In to The Signature Settings Text box
    And I Click Save Settings Button
    And I Verify The Success Message in Provider Inbox
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | SignatureSettings |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test Message      |

  @MT-83286
  Scenario Outline: MT-83286:Should not add the journal without mandatory fields
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Journal link
    And I click New Add Journal Button
    And I Click Save Button Journal
    Then I Should See Warning Message Displays In Journal Window
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83283
  Scenario Outline: MT-83283:Should not update the journal without mandatory fields
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Journal link
    And I click New Add Journal Button
    And I Enter the required Details<Subject> ,<Category> ,<Notes>
    When I click the Save Entry Button
    Then I should see updated journal
    And I Click Edit Button View Journal
    And i Clear All The Maditory Fields From Saved Journal Record
    And I click the Update Button View Journal
    Then I Should See Warning Message Displays In Journal Window After Clear
    And Click Cancel View Journal
    And I click Delete Journal Button
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | Subject            | Category            | Notes            |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:JOURNAL.SUBJECT | DP:JOURNAL.CATEGORY | DP:JOURNAL.NOTES |


  @MT-83415
  Scenario Outline: MT-83415:Cancel the Event Creation
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Calender link
    Then I should see Calender Page
    And I click the calender to open the Add event popup
    Then I should see Event Page Displays
    And i Click Cancel in Calender
    And I should see the event window closed
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83416
  Scenario Outline: MT-83416:Verify Save button should not enable without enter the mandatory fields
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Calender link
    Then I should see Calender Page
    And I click the calender to open the Add event popup
    Then I should see Event Page Displays
    And I Should See the save button is in disabled state
    And i Click Cancel in Calender
    And I should see the event window closed
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83417
  Scenario Outline: MT-83417:Delete the Added event in the Calendar
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


  @MT-83418
  Scenario Outline: MT-83418:Check cancel button while editing/view the event popup
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Calender link
    Then I should see Calender Page
    And I click the calender to open the Add event popup
    Then I should see Event Page Displays
    And i Click Cancel in Calender
    And I should see the event window closed
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-83162

  Scenario Outline: MT-83162:User update the password with Invalid current password

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
      | UserName             | Password                 | CrntPswd                   | NewPswd      | ConfirmNewPswd                   |
      | DP:LOGIN.PATIENTNAME | DP:LOGIN.PATIENTPASSWORD | DP:ChangePassword.CrntPswd | Cameraman123 | DP:ChangePassword.ConfirmNewPswd |


  @MT-83163

  Scenario Outline: MT-83163:User update the password with Invalid new password

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
      | UserName             | Password                 | CrntCrtPswd                   | NewPswd      | ConfirmNewPswd                    |
      | DP:LOGIN.PATIENTNAME | DP:LOGIN.PATIENTPASSWORD | DP:ChangePassword.CrntCrtPswd | cameraman123 | DP:ChangePassword.ConfirmNewPswd1 |


  @MT-83164

  Scenario Outline: MT-83164:User update the password with different new and confirm password

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
      | UserName             | Password                 | CrntCrtPswd                   | NewPswd | ConfirmNewPswd                   |
      | DP:LOGIN.PATIENTNAME | DP:LOGIN.PATIENTPASSWORD | DP:ChangePassword.CrntCrtPswd | Void123 | DP:ChangePassword.ConfirmNewPswd |


  @MT-83168
  Scenario Outline: MT-83168:Check validation message is displayed in the My Health Center tab

    Given I am on manage my health home page
    And I Enter <UserName>, <Password> valid credentials in Manage my health page
    When I click Login button
    Then I Click My Account Main Menu
    Then I Click My Health Center tab in the My Account Page
    And I Click Verify button
    And I Verify The Warning Displays
    And I click Logout button

    Examples:
      | UserName             | Password                 |
      | DP:LOGIN.PATIENTNAME | DP:LOGIN.PATIENTPASSWORD |


  @MT-83169
  Scenario Outline: MT-83169:Check cancel button is working in My Health Center tab

    Given I am on manage my health home page
    And I Enter <UserName>, <Password> valid credentials in Manage my health page
    When I click Login button
    Then I Click My Account Main Menu
    Then I Click My Health Center tab in the My Account Page
    And I Click Cancel Button And Verify It redirect To Profile Tab
    And I click Logout button

    Examples:
      | UserName             | Password                 |
      | DP:LOGIN.PATIENTNAME | DP:LOGIN.PATIENTPASSWORD |


  @MT-83170
  Scenario Outline: MT-83170:User try to add emergency contacts without enter the mandatory fields
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
      | ProviderName         | ProviderPassword         | FirstName                       | MobilePhone                       | Relationship                       | LastName                       |
      | DP:LOGIN.PATIENTNAME | DP:LOGIN.PATIENTPASSWORD | DP:EMERGENCYCONTACTS.FIRSTNAME1 | DP:EMERGENCYCONTACTS.MOBILEPHONE1 | DP:EMERGENCYCONTACTS.RELATIONSHIP1 | DP:EMERGENCYCONTACTS.LASTNAME1 |


  @MT-83171
  Scenario Outline: MT-83171:User should able to Edit the emergency contacts without mandatory fields
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
      | ProviderName         | ProviderPassword         | FirstName                       | MobilePhone                       | Relationship                       | LastName                       | EditedFirstName |
      | DP:LOGIN.PATIENTNAME | DP:LOGIN.PATIENTPASSWORD | DP:EMERGENCYCONTACTS.FIRSTNAME1 | DP:EMERGENCYCONTACTS.MOBILEPHONE1 | DP:EMERGENCYCONTACTS.RELATIONSHIP1 | DP:EMERGENCYCONTACTS.LASTNAME1 | Jack            |






