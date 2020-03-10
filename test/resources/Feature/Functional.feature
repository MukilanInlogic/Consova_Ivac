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


  @MT-69434
  Scenario Outline: MT-69434:Emergency Contacts
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I Click My Account Main Menu
    When I click Emergency Contacts Tab
    Then Emergeny Contacts tab opened
    And I Should See The Emergency contact details displays
    And Click Cancel Button and Verify it redirect to Emergency Contacts tab
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-69435
  Scenario Outline: MT-69435:Emergency Contacts Add/ Edit/View / Delete
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I Click My Account Main Menu
    When I click Emergency Contacts Tab
    And Emergeny Contacts tab opened
    Then I Should See The Emergency contact details displays
    And Click Cancel Button and Verify it redirect to Emergency Contacts tab
    And click Add icon the Emergency contact Tab
    And Enter the required details in the Emergency contacts tab: <FirstName>, <MobilePhone>, <Relationship>, <LastName>
    Then I should see added emergency contacts in the Emergency Contacts tab
    And Delete the Emergency Contacts And Click cancel In Alert
    Then I should see added emergency contacts in the Emergency Contacts tab
    And Delete the Emergency Contacts
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | FirstName                       | MobilePhone                       | Relationship                       | LastName                       |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:EMERGENCYCONTACTS.FIRSTNAME1 | DP:EMERGENCYCONTACTS.MOBILEPHONE1 | DP:EMERGENCYCONTACTS.RELATIONSHIP1 | DP:EMERGENCYCONTACTS.LASTNAME1 |


  @MT-69437
  Scenario Outline: MT-69437:Staff Registered with Admin and Clinical Access rights
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    When I click Login button
    Then I should see home page of Managemyhealth
    Then I should see Main SetUp And Clinical Menus Items
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69440
  Scenario Outline: MT-69440:My Account Bread Crumb display for the User
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    When I click Login button
    And I Click My Account Main Menu
    And I should see My Account page Tabs Displays
    Then I should see All The profile details Bread Crumb
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-69442
  Scenario Outline: MT-69442:To check the Appointment Mode Setting can be changed for admin cum clinical staff in My Account
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    When I click Login button
    And I Click My Account Main Menu
    Then I should see All The profile details
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69451
  Scenario Outline: MT-69451:Inbox
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Inbox Tab
    Then I Should See no record available message in inbox table
    Then I Should See Tabs UI Displays in the page
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69452
  Scenario Outline: MT-69452:Check Inbox/Compose is navigated from Homepage screen
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Inbox Tab
    Then I Should See no record available message in inbox table
    Then I Should See Tabs UI Displays in the page
    And I click compose Tab
    Then I Should See Compose Tab Elements
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-69453
  Scenario Outline: MT-69453:To verify the Provider able to send messages
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Inbox Tab
    Then I Should See no record available message in inbox table
    Then I Should See Tabs UI Displays in the page
    And I click compose Tab
    Then I Should See Compose Tab Elements
    And I Click cancel button In compose message tab
    And I Verify The Page Redirected To Inbox Tab
    Then I Should See Tabs UI Displays in the page
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-69454
  Scenario Outline: MT-69454:To Check all the Editor links are working
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Inbox Tab
    Then I Should See no record available message in inbox table
    Then I Should See Tabs UI Displays in the page
    And I click compose Tab
    Then I Should See Compose Tab Elements
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69462
  Scenario Outline: MT-69462:Check Request Repeat Prescription details are updated when Service name is changed
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Patient Inbox link
    And I Click Inbox Tab
    Then I Should See no record available message in inbox table
    Then I Should See Tabs UI Displays in the page
    And I click compose Tab
    Then I Should See Compose Tab Elements
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69464
  Scenario Outline: MT-69464:Provider View of Journal Data
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Journal link
    Then I Should See All The Elements Displays
    And I click New Add Journal Button
    Then I Should See All Elements In Add Journal Page
    And I Enter the required Details<Subject> ,<Category> ,<Notes>
    When I click the Save Entry Button
    Then I should see updated journal
    And Click More Info Button
    Then I Should See More Info Details in Journal information
    And I Click Edit Button View Journal
    Then I Should See All Elements In Edit Journal Page
    And Click Cancel View Journal
    And I click Delete Journal Button
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | Subject            | Category            | Notes            |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:JOURNAL.SUBJECT | DP:JOURNAL.CATEGORY | DP:JOURNAL.NOTES |

  @MT-69465
  Scenario Outline: MT-69465:Provider can create a journal in MMH
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Journal link
    Then I Should See All The Elements Displays
    And I click New Add Journal Button
    Then I Should See All Elements In Add Journal Page
    And I Enter the required Details<Subject> ,<Category> ,<Notes>
    When I click the Save Entry Button
    Then I should see updated journal
    And Click More Info Button
    Then I Should See More Info Details in Journal information
    And I Click Edit Button View Journal
    Then I Should See All Elements In Edit Journal Page
    And Click Cancel View Journal
    And I click Delete Journal Button
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | Subject            | Category            | Notes            |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:JOURNAL.SUBJECT | DP:JOURNAL.CATEGORY | DP:JOURNAL.NOTES |


  @MT-69466
  Scenario Outline: MT-69466:Tick the 'Add event to Calender'
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Journal link
    And I click New Add Journal Button
    And I Enter the required Details<Subject> ,<Category> ,<Notes>
    When I click the Save Entry Button
    Then I should see updated journal
    And I click Delete Journal Button
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | Subject            | Category            | Notes            |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:JOURNAL.SUBJECT | DP:JOURNAL.CATEGORY | DP:JOURNAL.NOTES |


  @MT-69467
  Scenario Outline: MT-69467:Un-tick the 'Add event to Calender'
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Journal link
    And I click New Add Journal Button
    And I Enter the required Details<Subject> ,<Category> ,<Notes>
    When I click the Save Entry Button
    Then I should see updated journal
    And I click Delete Journal Button
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | Subject            | Category            | Notes            |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:JOURNAL.SUBJECT | DP:JOURNAL.CATEGORY | DP:JOURNAL.NOTES |


  @MT-69468
  Scenario Outline: MT-69468:To Delete the Journal entry in View Journal List
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Journal link
    And I click New Add Journal Button
    And I Enter the required Details<Subject> ,<Category> ,<Notes>
    When I click the Save Entry Button
    And I click Delete Journal Button And Dismiss
    Then I should see updated journal
    And I click Delete Journal Button
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | Subject            | Category            | Notes            |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:JOURNAL.SUBJECT | DP:JOURNAL.CATEGORY | DP:JOURNAL.NOTES |


  @MT-69470
  Scenario Outline: MT-69470:Calendar View Mode
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Calender link
    Then I should see Calender Page
    Then I Should See All The Elements Displays In The Calender Page
    And Click Navigate Button And Verify Today Button Disabled
    And I Click Help Button Calender
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69471
  Scenario Outline: MT-69471:Add/ Edit/ Delete General Event
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Calender link
    Then I should see Calender Page
    And I click the calender to open the Add event popup
    And I Enter the required details<Title>, <Description>
    Then I should see added Event is displayed in the claender Page
    When I click Event
    And I Click The Event And Verify The Elements Displays
    When I click Event
    And I Should See All The Elements Displays In Event Calender Page
    And Drag And drop The Event task
    And I click Event
    And I click the Delete Event Button
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | Title             | Description             |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:CALENDAR.TITLE | DP:CALENDAR.DESCRIPTION |


  @MT-69472
  Scenario Outline: MT-69472:Add/ Edit/ Delete Journal
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Calender link
    Then I should see Calender Page
    And I click the calender to open the Add event popup
    And I Enter the required details<Title>, <Description>
    Then I should see added Event is displayed in the claender Page
    When I click Event
    And I Click The Event And Verify The Elements Displays
    When I click Event
    And I Should See All The Elements Displays In Event Calender Page
    And I click Event
    And I click the Delete Event Button
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | Title             | Description             |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:CALENDAR.TITLE | DP:CALENDAR.DESCRIPTION |


  @MT-69473
  Scenario Outline: MT-69473:Appointments
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Calender link
    Then I should see Calender Page
    And I click the calender to open the Add event popup
    And I Enter the required details<Title>, <Description>
    Then I should see added Event is displayed in the claender Page
    And I click Event
    And I click the Delete Event Button
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          | Title             | Description             |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:CALENDAR.TITLE | DP:CALENDAR.DESCRIPTION |


  @MT-69482
  Scenario Outline: MT-69482:Practice Details Page
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Practice link
    Then I should see Practice Page
    And I Should See Required Elements In Practice Page
    And I Click Map Button
    Then I Should See Map Window
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69484
  Scenario Outline: MT-69484:View Location details
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Practice link
    Then I should see Practice Page
    And I Should See Required Elements In Practice Page
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69562
  Scenario Outline: MT-69562:Setup e-services
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Setup Menu
    When I click Setup E-services Menu
    And I click Add E-services Button
    Then  I Should See All The Elements Displays in E Service
    And  I Click Cancel Button E-Services Menu
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-69563
  Scenario Outline: MT-69563:To Check Group Mail can send to all the registered patients
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Setup Menu
    And I click Group Mail Menu
    And I Enter required fields<From>, <To>, <Subject>, <Message>
    When I click Send Message Button in Group Message
    Then  I Should See Success Message In Group Mail
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | From                   | To                   | Subject                   | Message                   |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:GROUPMESSAGE.GMFROM | DP:GROUPMESSAGE.GMTO | DP:GROUPMESSAGE.GMSUBJECT | DP:GROUPMESSAGE.GMMESSAGE |


  @MT-69564
  Scenario Outline: MT-69564:Check Message sent can be viewed from the SENT MESSAGE Tab
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Setup Menu
    And I click Group Mail Menu
    And I Enter required fields<From>, <To>, <Subject>, <Message>
    When I click Send Message Button in Group Message
    Then I Should See Success Message In Group Mail
    And I click Sent Tab Group Mail
    Then I Click Subject And Verify Elements Displays In Group Message
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | From                   | To                   | Subject                   | Message                   |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | DP:GROUPMESSAGE.GMFROM | DP:GROUPMESSAGE.GMTO | DP:GROUPMESSAGE.GMSUBJECT | DP:GROUPMESSAGE.GMMESSAGE |


  @MT-69565
  Scenario Outline: MT-69565:Admin Staff_My Practice-Practice Details
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    And I click Setup Menu
    When I click MyPractice Menu
    Then I see Practice details opened
    And I Should See All The Elements Displays My Practice
    And I click Logout button

    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69488
  Scenario Outline: MT-69488:Search Patients
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    Then I Should See All Elements Displays In Search Patient
    And I Check Whether The Auto Suggest Checked Or not
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-69489
  Scenario Outline: MT-69489:Blank Search should display the patient detail with respective to single practice
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    Then I Should See All Elements Displays In Search Patient
    And I Check Whether The Auto Suggest Checked Or not
    And I Click Search Button Search Patient
    Then I Should See Patient Search details
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69491
  Scenario Outline: MT-69491:Enable / Disable Auto Suggest
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    Then I Should See All Elements Displays In Search Patient
    And I Check Whether The Auto Suggest Checked Or not
    And I Click Search Button Search Patient
    Then I Should See Patient Search details
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-69492
  Scenario Outline: MT-69492:Search patient by Advance Search
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    And Click Advanced Button
    Then I Should See ELements And Details Displays After Clicking Search Button
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |

  @MT-69493
  Scenario Outline: MT-69493:Ensure searched patient contains all the navigation links and it is redirected to particular screen
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    Then I Should See All Elements Displays In Search Patient
    And I Check Whether The Auto Suggest Checked Or not
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69494
  Scenario Outline: MT-69494:To verify Recently Accessed patient navigation is working
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    Then I Should See All Elements Displays In Search Patient
    And I Check Whether The Auto Suggest Checked Or not
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69495
  Scenario Outline: MT-69495:Ensure Auto Suggest populates the patient name based on the configuration is enabled
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    Then I Should See All Elements Displays In Search Patient
    And I Check Whether The Auto Suggest Checked Or not
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69496
  Scenario Outline: MT-69496:To Verify Navigation to Dashboard is working from search Patient
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    And I Enter InValid Text <SearchPatient> in name text box search patient page
    And I Click Search Button Search Patient
    Then I Should See Patient Search details
    And Click DashBoard Link
    Then I Should See Elements In DashBoard
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | SearchPatient |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test          |


  @MT-69497
  Scenario Outline: MT-69497:Provider can access the Emergency contact details of the Patient
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    Then I Should See All Elements Displays In Search Patient
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD |


  @MT-69498
  Scenario Outline: MT-69498:View the Patient Journal
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    Then I Should See All Elements Displays In Search Patient
    And I Enter InValid Text <SearchPatient> in name text box search patient page
    And I Click Search Button Search Patient Adv
    Then I Should See Patient Search details
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | SearchPatient |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test          |


  @MT-76477
  Scenario Outline: MT-76477:View profile
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    And I Enter InValid Text <SearchPatient> in name text box search patient page
    And I Click Search Button Search Patient
    And I Click patient Link Patient Search
    And I Should See All The Elements Displays View Patient Search
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | SearchPatient |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test          |



  @MT-76478
  Scenario Outline: MT-76478:Patient Details in View Profile tab
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    And I Enter InValid Text <SearchPatient> in name text box search patient page
    And I Click Search Button Search Patient
    And I Click patient Link Patient Search
    And I Should See All The Elements Displays View Patient Search
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | SearchPatient |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test          |


  @MT-76479
  Scenario Outline: MT-76479:Update Profile Last update time
    Given I am on manage my health home page
    And I Enter <ProviderName>, <ProviderPassword> valid credentials in Manage my health page
    And I click Login button
    When I click Search user link
    And I Enter InValid Text <SearchPatient> in name text box search patient page
    And I Click Search Button Search Patient
    And I Click patient Link Patient Search
    And I Should See All The Elements Displays View Patient Search
    And I Click Update Button View Patient
    And Update New Values In View Patient
    Then I Should See The updated Profile Details Displays
    And I Click Update Button View Patient
    And Update Old Values In View Patient
    And I Click Update Button View Patient
    And I Click Cancel Button Update View Patient
    Then I Verify The Page Return Back to view Profile
    And I click Logout button


    Examples:
      | ProviderName          | ProviderPassword          | SearchPatient |
      | DP:LOGIN.PROVIDERNAME | DP:LOGIN.PROVIDERPASSWORD | Test          |








