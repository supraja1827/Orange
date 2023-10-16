

Feature: orange hrm 
  
  Scenario: login functions
    Given i open with browser url "http://183.82.103.245/nareshit/index.php"
    Then   i should see login application
    When i enter the username "nareshit"
    And  i enter the password "nareshit"
    And  i click login button
    When i click the logout
    Then i should see login application
    And i close application 

  
 
