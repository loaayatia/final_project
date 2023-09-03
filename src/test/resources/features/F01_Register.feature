Feature: user Regestration
  Scenario1: guest user could register with valid data successfully
    Given navigate to home page page
    And User Clicks on Register Button
    And user select gender type
    And user enter first name
    And user enter last name
    And user enter date of birth
    And  user enter email
    And  user fills Password fields
    And user clicks on register button
    Then  success message is displayed

