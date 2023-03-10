Feature: User should be able to log in with valid credentials


  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on fidexio log in page


  Scenario Outline: user can log in with SalesManager

    When user enter salesmanager username "<salesmanagerUserName>"
    And  user enter salesmanager password "<salesmanagerPassword>"
    And click Log in button
    Then user(salesmanager) should be on the dashboard

    Examples:
    | salesmanagerUserName    | salesmanagerPassword |
    | salesmanager15@info.com | salesmanager         |
    | salesmanager36@info.com | salesmanager         |
    | salesmanager57@info.com | salesmanager         |

  Scenario Outline: user can log in with PosManager

    When user enter posmanager username "<posmanagerUserName>"
    And  user enters posmanager password "<posmanagerPassword>"
    And click Log in button
    Then user(posmanager) should be on the dashboard

    Examples:
      | posmanagerUserName    | posmanagerPassword |
      | posmanager6@info.com  | posmanager         |
      | posmanager56@info.com | posmanager         |
      | posmanager97@info.com | posmanager         |

  Scenario Outline: "Wrong login/password" should be displayed for invalid credentials
    When  user enter "<userName>" and "<password>"
    And click Log in button
    Then "Wrong login/password" should be displayed

    Examples:
      | userName                 |    password     |
      | posmanag5@info.com       | ssales          |
      | salesmanager12@info.com  | slsmng          |
      | posmaneger0@info.com     | posmanager      |

    Scenario Outline: "Please fill out this field" message should be displayed if the password or username is empty
      When user enter "<userName>" or "<password>"
      And click Log in button
      Then "Please fill out this field" message should be displayed

      Examples:
      | userName               |  password  |
      |                        |            |
      |                        |    abc     |
      | salesmanager9@info.com |            |


      Scenario:  after clicking on the "Reset password" link user on the "reset password" page
        When  user click "Reset password" link
        Then user on the "reset password" page

     Scenario:  User should see the password in bullet signs by default
       When  user enters password
       Then  User should see the password displayed in bullet signs

     Scenario: Verify if the "Enter" key of the keyboard is working correctly on the login page
         When user enter salesmanager8@info.com into the email field
         And user enter salesmanager into the password field
         When user enter "Enter" key of the keyboard
         Then user should be on the login page
