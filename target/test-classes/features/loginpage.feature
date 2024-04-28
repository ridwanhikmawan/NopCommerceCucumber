Feature: Login Functionality for OpenCart E-commerce Website

  As a user of the OpenCart website
  I want to be able to log in with my account
  So that I can access my account-related features and manage my orders

  Background:
    Given I am on the OpenCart login page

  Scenario: Successful login with valid credentials
    Given I have entered a valid username and password
    When I click on the login button
    Then I should be logged in successfully

  Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given I have entered invalid "<username>" and "<password>"
    When I click on the login button
    Then I should see an error message indicating "<error_message>"

    Examples:
      | username          | password        | error_message       |
      | invalid@gmail.com | invalidPassword | No customer account found |
      | abcccc@gmail.com  | validPassword   | No customer account found |
      | valid@gmail.com   | abccc           | No customer account found |

  Scenario: Navigating to the forgotten password page
    When I click on the "Forgotten Password" link
    Then I should be redirected to the password reset page
