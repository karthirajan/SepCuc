#Author: your.email@your.domain.com

@regression
Feature: Demo Telecom

Background:
    And user click on add customer button

  Scenario: add customer flow validation
    When user need to fill up the fields
    And user click on submit button
    Then user verify customer id is generated

@sanity @smoke
  Scenario: add customer flow validation by 1 dimensional list
    When user need to fill up the fields by 1D list
      | Java | Selenium | Java@gmail.com | chennai | 1234422332 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add Customer validation by 1D map concept
    When user need to fill up the fields by 1D map
      | Fname | Soundar         |
      | Lname | Rajan           |
      | mail  | Rajan@gmail.com |
      | addr  | Addr            |
      | phno  |        65465464 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario Outline: add customer flow validation
    When user need to fill up the fields "<Fname>","<Lname>","<mail>","<addr>","<phno>"
    And user click on submit button
    Then user verify customer id is generated

    Examples: 
      | Fname  | Lname    | mail             | addr    | phno       |
      | Java   | Selenium | Java@gmail.com   | chennai | 1234422332 |
      | karthi | Selenium | karthi@gmail.com | chennai | 1234422332 |
