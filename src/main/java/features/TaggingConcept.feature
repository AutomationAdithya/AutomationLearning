Feature: Tagging Concept
@SmokeTest
Scenario: Learning Tagging Concept
Given This is learning tagging concepts in cucumber
When Browser is open 
Then Enter URL

@RegressionTest
Scenario: Create a contact
Given This is a contact test case
When contact should be open 
Then Click on contact

@SmokeTest @RegressionTest
Scenario: Create a deal
Given This is a deal test case
When Deal is open 
Then Enter Deal
