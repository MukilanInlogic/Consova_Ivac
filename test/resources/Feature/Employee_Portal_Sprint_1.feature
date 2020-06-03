Feature: Home Page

  #Background:
  #Given I am on Consova page
  #And I Enter UserName and Password
  #And I click Login button Consova

  @EVS-552
  Scenario Outline: EVS-552-As a system, I should prompt HIPAA and GDPR questions for first time users
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should decline disclaimer Notice if displayed
    Then I should verify login screen
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should verify disclaimer page
    And I should accept disclaimer Notice if displayed
    Then I should verify homepage screen
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-551
  Scenario Outline: EVS-551-As a user, I should log into Employee Portal
    Given I should enter login url <URL>
    Given I should verify login screen
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should verify login button
    And I should click on Login button from Login screen
    Then I should verify homepage screen
    And I should logoff from home screen
    Given I should enter login url <URL>
    When I should Login to application with <incorrectlastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should see a warning/error message
    And I should click on warning message

    Examples:
      | URL          | incorrectlastName          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.INCORRECTLASTNAME | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-703
  Scenario Outline: EVS-703-As a user, when I click on wizard I should see process introduction slide
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on wizard start icon
    Then I should verify the first Introduction slide
    And I should click on Begin button in first slide
    And I should verify the second wizard slide
    Then I should click Save and Finish Later in Wizard
    And I should click on OK button in popup
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-704
  Scenario Outline: EVS-704-As a user, I should see list of dependents on the dependent slide
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on wizard start icon
    And I should verify the second wizard slide
    And I should verify DOB of dependents sorted descending by age <format> and <dateFormat>
    And I should verify Dependent's full name present in Dependent information
    And I should verify Dependent's DOB present in Dependent information
    And I should verify Dependent's Gender present in Dependent information
    And I should verify Dependent's relationship present in Dependent information
    And I should check the drop down list for Sub relationships Child and Spouse
    And I should click on Back button in Wizard dependent slide
    Then I should verify the first Introduction slide
    And I should click on Begin button in first slide
    Then I should click Save and Finish Later in Wizard
    And I should click on OK button in popup
    Then I should verify homepage screen
    And I should click on wizard start icon
    Then I should click Save and Continue in Wizard
    And I should verify individual dependent slide
    And I should click on Back button in Wizard dependent slide
    Then I should click Save and Finish Later in Wizard
    And I should click on OK button in popup
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          | format         | dateFormat           |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN | DP:WIZARD.DATE | DP:WIZARD.DATEFORMAT |

  @EVS-705
  Scenario Outline: EVS-705-As a user, I should be able to see each dependent verification requirements on separate slide
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on wizard start icon
    And I should click Save and Continue in Wizard
    And I should verify Dependent's full name present in Dependent information
    And I should verify DOB in individual Dependent's page
    And I should verify Relationship in individual Dependent's page
    And I should verify text for dependent eligible
    And I should verify Yes or No radio options for dependent eligible
    And I should click Save and Continue in Wizard
    And I should verify error message
    And I should select No from radio button
    And I should click Save and Continue in Wizard
    And I should verify error message
    And I should select ineligiility reason from dropdown
    And I should click Save and Continue in Wizard
    And I should click on OK button in popup
    And I should verify Next Dependent Slide or click Finish button
    And I should be verifying last summary slide
    And I should check wizard start icon should not be displayed
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-553
  Scenario Outline: EVS-553-As a user, I should see dependent section on home dashboard
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    #And I should check wizard start icon should not be displayed
    And I should verify list of all dependents loaded under the employee
    And I should verify Dependent's full name present in Dependent information
    And I should verify DOB present in Dependent information
    And I should verify Relationship in Dashboard
    And I should verify deadline and status of dependents
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-702
  Scenario Outline: EVS-702-As a user, I should see received document history on home dashboard
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on upload document icon
    And I should select the more than five MB file for upload
    And I should verify the warning message for file size
    And I should select desired document by Browse icon
    And I should upload the document
    And I should click on OK button in popup
    And I should check the uploaded document
    And I should check the received document type
    And I should click the uploaded document for viewing in modal
    And I should close the modal
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-319&EVS-556
  Scenario Outline: EVS-319&EVS-556-As a user I should see comment section on contact page
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should go to Cotacts page by clicking Contacts icon
    And I shold check whether the Submit button is not enabled/disabled
    And I should enter the comments in comments box <comment>
    And I shold check whether the Submit button is enabled
    And I should click on Submit button in Contacts page
    And I should click on OK button in popup
    And I should enter the comments in comments box <comment>
    And I should check whether the checkbox is enabled
    And I should check the callback number textbox
    And I should enter the callback number in callback textbox <callbacknumber>
    And I should click on Submit button in Contacts page
    And I should verify the prompt message in message box
    And I should click on OK button in popup
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |comment|callbacknumber|
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |DP:CONTACT.COMMENTS|DP:CONTACT.CALLBACKNUMBER|

  @EVS-825
  Scenario Outline: EVS-825-As a user I should see call section on contact page
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should go to Cotacts page by clicking Contacts icon
    And I should verify Verification Assistance Center
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-826
  Scenario Outline: EVS-826-As a user I should see submit documents section on contact page
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should go to Cotacts page by clicking Contacts icon
    And I should verify FAX in contacts page
    And I should verify mail in contacts page
    And I should verify upload icon in contacts page
    And I should click upload icon in contacts page
    And I should select desired document by Browse icon
    And I should upload the document
    And I should click on OK button in popup
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-562
  Scenario Outline: EVS-562-As a user, I should be able to change the contact information profile page
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on profile photo icon
    And I should click on profile from popup
    And I should see the address table with address, city, state and pincode
    And I should see the phone numbers table
    And I should verify the both preferred email and confirm preferred email
    And I should click edit button in profile page
    And I should enter details in popup dialog box
    And I should click on Cancel button in popup dialog box
    And I should click edit button in profile page
    And I should enter details in popup dialog box
    And I should click on Save button in popup dialog box
    And I should click on OK button in popup
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-714
  Scenario Outline: EVS-714-As a user, I should see employee information account view
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on profile photo icon
    And I should click on profile from popup
    And I should see the address table with address, city, state and pincode
    And I should see the phone numbers table
    And I should verify the both preferred email and confirm preferred email
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-829
  Scenario Outline: EVS-829-As a user, I should see list of authorized user on Profile page
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on profile photo icon
    And I should click on profile from popup
    And I should check the Authorized Caller table
    And I should check the grid with caller name, relationship, Authorized Date and Expiration date
    And I should click on Add caller button displayed
    And I should enter the caller name and select relationship in dropdown in popup dialog box <callerName>
    And I should click on Save button in popup dialog box
    And I should click on OK button in popup
    And I should check and click the renew button in respective caller
    And I should click on confirm button in popup window
    And I should check the remove button in respective caller
    And I should click the remove button in respective caller
    And I should click on confirm button in popup window
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |callerName|
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |DP:PROFILE.CALLERNAME|

  @EVS-834
  Scenario Outline: EVS-834-As a user, I should manage the authorized user list on profile page
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on profile photo icon
    And I should click on profile from popup
    And I should check the Authorized Caller table
    And I should check the grid with caller name, relationship, Authorized Date and Expiration date
    And I should click on Add caller button displayed
    And I should enter the caller name and select relationship in dropdown in popup dialog box <callerName>
    And I should click on Save button in popup dialog box
    And I should click on OK button in popup
    And I should check the callername saved for authorized caller
    And I should check and click the renew button in respective caller
    And I should click on confirm button in popup window
    And I should click the remove button in respective caller
    And I should click on cancel button in popup window
    And I should check the callername saved for authorized caller
    And I should click the remove button in respective caller
    And I should click on confirm button in popup window
    And I should check the callername is removed from authorized caller
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |callerName|
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |DP:PROFILE.CALLERNAME|

  @EVS-557
  Scenario Outline: EVS-557-As a user, I should see upload documents menu item
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on Upload documents icon in menubar
    And I should check upload icon is disabled till document upload
    And I should select desired document by Browse icon
    And I should click on remove document from pop dialog box
    And I should select desired document by Browse icon
    And I should check the uploaded document in grid
    And I should upload the document
    And I should click on OK button in popup
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-701
  Scenario Outline: EVS-701-As a user, I should see menu bar on the left side of the page
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should check the icons in menubar
    And I should click the sidebar collapse icon
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-827
  Scenario Outline: EVS-827-As a user, I should be able to change the notifications email (going green) on profile page
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on profile photo icon
    And I should click on profile from popup
    And I should check the Go Green section is displayed
    And I should enter the email in preferred email and confirm preferred email textboxes <email>
    And I should click on activate button
    And I should verify activate email sent dialog box
    And I should click on OK button in popup
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |email|
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |DP:PROFILE.GOGREENEMAIL|

  @EVS-828
  Scenario Outline: EVS-828-As a user, I should receive paperless activation email
    Given I should navigate to web outlook
    And I should enter username as <email>
    And I should click on Next button
    And I should give password as <password>
    And I should login to outlook by clicking login button
    And I should click on outlook icon from menubar
    And I should navigate to newly opened window
    And I should click on activation email
    And I should click on activation link
    And I should close the newly opened tab

    Examples:
      |email|password|
      |DP:PROFILE.GOGREENEMAIL|DP:PROFILE.PASSWORD |

  @EVS-564
  Scenario Outline: EVS-564-As a user, I should see complete audit details for each dependent
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on verification details from menubar
    And I should check the benefits verified
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-964
  Scenario Outline: EVS-964-As a user, I should see option to translate the site based on the configured language settings
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on language selection button in menubar
    And I should select Spanish language from dropdown
    And I should verify Spanish language in current window
    And I should click the sidebar collapse icon
    And I should verify Spanish language in menubar
    And I should click on language selection button in menubar
    And I should select English language from dropdown
    And I should logoff from home screen

    Examples:
      | URL          | lastName          | consovaId          | sSN          |
      | DP:LOGIN.URL | DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |



#  @EVS-717
#  Scenario Outline: EVS-717-As a user, I should see component (Event type) information
#    Given I should enter login url <URL>
#    When I should Login to application with <lastName> , <consovaId> and <sSN>
#    And I should click on Login button from Login screen
#    #And I should accept disclaimer Notice if displayed
#    And I should click on upload document icon
#    And I should select desired document by Browse icon
#    And I should upload the document
#    And I should click on OK button in popup
#    Given I should enter login url <coreURL>
#    When I should Login to core application with <userName> and <password>
#    And I should click on Login button from Login screen
#    And I should click on My Inventory in tab menu
#    And I should search customer by entring <consovaId> in search header
#    And I should click open account screen by clicking respective icon
#    And I should navigate to newly opened window
#    And I should verify new package created in account screen
#    And I should complete all the packages in the queue
#    And I should click on ineligible codes button
#    And I should click select first ineligible code
#    And I should save by clicking close button
#    And I should get the ineligible icon for ineligible dependent
#    And I should click on second dependent tab
#    And I should click on BC icon for biological child
#    And I should click on Yes to confirm from popup
#    And I should verify BC icon for biological child
#    And I should get the count for completed and not applicable for second dependent
#    And I should click on third dependent tab
#    And I should click on SC icon for step child
#    And I should click on Yes to confirm from popup
#    And I should verify SC icon for step child
#    And I should get the count for completed and not applicable for third dependent
#    And I should click on fourth dependent tab
#    And I should change the status in list
#    And I should add documents and mark the staus as not applicable
#    And I should add documents and mark the staus as missing
#    And I should get the count for completed and not applicable for fourth dependent
#    And I should click on Save button in popup dialog box
#    And I should click on profile icon in core
#    And I should logoff from core login
#    Given I should enter login url <URL>
#    And I should get the ineligible icon for ineligible dependent
#    And I should click on verification details from menubar
#    And I should click on second dependent tab in verification details
#    And I should compare the status between core and ivac for second dependent
#    And I should click on third dependent tab in verification details
#    And I should compare the status between core and ivac for third dependent
#    And I should click on fourth dependent tab in verification details
#    And I should compare the status between core and ivac for fourth dependent
#    And I should logoff from home screen
#
#    Examples:
#      | URL          | lastName          | consovaId          | sSN          |coreURL|userName          | password          |
#      | DP:LOGIN.URL | DP:CORE.LASTNAME | DP:CORE.CONSOVAID | DP:CORE.SSN |DP:CORE.URL|DP:CORE.USERNAME | DP:CORE.PASSWORD  |
#
#  @EVS-818
#  Scenario Outline: EVS-818-As a system, I should create packages based on the employee selections
#    Given I should enter login url <coreURL>
#    When I should Login to core application with <userName> and <password>
#    And I should click on Login button from Login screen
#    And I should click on My Inventory in tab menu
#    And I should search customer by entring <consovaId> in search header
#    And I should click open audit screen by clicking respective icon
#    And I should verify new package created in account screen
#    And I should complete all the packages in the queue
#    And I should click on Save button in popup dialog box
#    And I should click on profile icon in core
#    And I should logoff from core login
#
#    Examples:
#      | consovaId          |coreURL|userName          | password          |
#      | DP:LOGIN.CONSOVAID |DP:CORE.URL|DP:CORE.USERNAME | DP:CORE.PASSWORD  |
