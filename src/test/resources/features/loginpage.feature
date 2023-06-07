Feature: Login functionality for sauce demo e-commerce website

  As a user of opencart website
  I want to login with my account
  so that I can access my account and manage my orders

  Background:
  Given I am on the login page

  Scenario Check login successful with valid credentials


    Given user enters valid username and password
    When I click on login button
    Then user navigated to home page


    Scenario Outline: Unsuccessful login with invalid or empty credentials

      Given I have entered invalid "<username>" and "<password>"
      When I click on login button
      Then I should see an error message indicating "<err_msg>"
      Examples:
      |username |  password | err_msg|
      |abc@email.com | invalidpassword| Epic sadface: Username and password do not match any user in this service|