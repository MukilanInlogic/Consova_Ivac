Feature: Home Page
  #Background:
  #Given I am on Consova page
  #And I Enter UserName and Password
  #And I click Login button Consova
  #@Core-login
  #Scenario Outline: Core-login check
   # Given I am on Consova page
   # And I Enter <UserName> and <Password>
   # And I click Login button Consova
    #Examples:
     # | UserName          | Password          |
     # | DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD |

  @EVS-552
  Scenario Outline: EVS-552-As a system, I should prompt HIPAA and GDPR questions for first time users
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should decline disclaimer Notice if displayed
    Then I should verify login screen
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should accept disclaimer Notice if displayed
    Then I should verify homepage screen
    And I should logoff from home screen

    Examples:
      |URL| lastName          | consovaId          | sSN          |
      |DP:LOGIN.URL|  DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-551
  Scenario Outline: EVS-551-As a user, I should log into Employee Portal
    Given I should enter login url <URL>
    Given I should verify login screen
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should verify login button
    And I should click on Login button from Login screen
    #And I should accept disclaimer Notice if displayed
    Then I should verify homepage screen
    And I should logoff from home screen
    Given I should enter login url <URL>
    When I should Login to application with <incorrectlastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should see a warning/error message
    And I should click on warning message

    Examples:
      |URL| incorrectlastName          | lastName          | consovaId          | sSN          |
      |DP:LOGIN.URL| DP:LOGIN.INCORRECTLASTNAME| DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-703
  Scenario Outline: EVS-703-As a user, when I click on wizard I should see process introduction slide
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on wizard start icon
    Then I should verify the first Introduction slide
    And I should click on Begin button in first slide
    And I should verify the second dependent slide
    Then I should close the wizard window
    And I should click on OK button in popup
    And I should logoff from home screen

    Examples:
      |URL|  lastName          | consovaId          | sSN          |
      |DP:LOGIN.URL|  DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |

  @EVS-704
  Scenario Outline: EVS-704-As a user, I should see list of dependents on the dependent slide
    Given I should enter login url <URL>
    When I should Login to application with <lastName> , <consovaId> and <sSN>
    And I should click on Login button from Login screen
    And I should click on wizard start icon
    And I should verify the second dependent slide
    And I should verify DOB of dependents sorted descending by age <format> and <dateFormat>
    And I should verify Dependent's full name present in Dependent information
    And I should verify Dependent's DOB present in Dependent information
    And I should verify Dependent's Gender present in Dependent information
    And I should verify Dependent's relationship present in Dependent information
    Then I should close the wizard window
    And I should click on OK button in popup
    And I should logoff from home screen

    Examples:
      |URL|  lastName          | consovaId          | sSN          |format|dateFormat|
      |DP:LOGIN.URL|  DP:LOGIN.LASTNAME | DP:LOGIN.CONSOVAID | DP:LOGIN.SSN |DP:WIZARD.DATE|DP:WIZARD.DATEFORMAT|