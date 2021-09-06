#Author: Rajesh.gmail.com

@regression
   Feature: Demo Tariff Plan
    
    #Scenario: Add Tariff Plan Flow Validation
     #And User click Add Tariff Plan Button
    #When User Need to fill up the fields 
     #And User Click on the Submit button
    #Then User Verify the customer Id is generated

  @smoke
   Scenario: Add Tariff Plan Flow Validation by 1 dimensional list
     And User click Add Tariff Plan Button
    When User Need to fill up the fields by 1D List 
    |10000|50|25|100|5|4|3|
     And User Click on the Submit button
    Then User Verify the customer Id is generated
  
