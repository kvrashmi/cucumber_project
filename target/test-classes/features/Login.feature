Feature: TechFios Billing Functionality Feature

Scenario: User should be able to login with valid credentials
    Given User is on the techfios login page
    When User enters username as "demo@techfios.com"
    When User enters password as "abc123"
    When User clicks on signin button 
    Then User should land on Dashboard page
  