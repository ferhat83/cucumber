
#TAGGING in CUCUMBER IS USED TO SELECT SPECIFIC ANNOTANTION TO RUN SPECIFIC SCENARIO.
  # EX OF ANNOTATION(@FonctionalTest, @SmokeTest, @RegressionTest ...)
  # SO TO SELECT SCENARIO TO RUN THE NEXT tags need to be added to test runner file:
         # tags = {"@SmokeTest"}// the test will run just scenarios with @SmokeTest annotation.
		                       #ORed we use comma between annotation to run this or that scenario:
		                          # EX: tags = {"@SmokeTest , @RegressionTest "}
		                       #ANDed we use double cot and comma between annotation to this and that scenario:
		                          # EX: tags = {"@SmokeTest" , "@RegressionTest "}
		                       #ignore scenario we use ~ in front of that specific annotation :
		                          # EX: tags = {"~@SmokeTest"} so it will ignore all scenarios with @SmokeTest annotation
@FonctionalTest
Feature: facebook login feature using simple data driven 

@SmokeTest
Scenario: facebook Login Test  

@RegressionTest	
Scenario: click on freinds 

@EndToEndTest
Scenario: check messages

@SmokeTest
Scenario: add pictures to my profil

@RegressionTest
Scenario: change profil picture 