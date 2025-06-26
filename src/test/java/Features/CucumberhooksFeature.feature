Feature: Application Login
 
 
 Background:
  	When Launch the browser using URL from config properties file
  	And Hit the Home page Url on banking site
  	
 @RegressionTest
  Scenario: Admin Page Login
    Given User is on NetBanking LandingPage
    When User login into application with "admin" and password "1234"
    Then HomePage is displayed
    And cards are displayed
@RegressionTest
	Scenario: Customer Page Login
    Given User is on NetBanking LandingPage
    When User login into application with customer and password "1234"
    Then HomePage is displayed
    And cards are displayed
@MobileTest  @NetBanking
	Scenario: Loan Customer Page Login
    Given User is on NetBanking LandingPage
    When User login into application with "manager" and password 1234
    Then HomePage is displayed
    And cards are displayed
    
@Mortage
  Scenario Outline: Mortage Customer Page Login
    Given User is on NetBanking LandingPage
    When User login into application with <Username> and password "<Password>"
    Then HomePage is displayed
    And cards are displayed
    Examples:
    | Username | Password   |
    | Admin    | Admin123   |
    | customer | customer123|
    | manager  | manager123 | 
    
  #Data Driven testing by sending list of data as inputs
@SmokeTest @RegressionTest
  Scenario: User page SignUp
    Given User is on Facebook LandingPage
    When User signup into application 
    |rahul|
    |shetty|
    |Gmail.com|
    |mobile|
    Then HomePage is displayed
    And cards are displayed
    

