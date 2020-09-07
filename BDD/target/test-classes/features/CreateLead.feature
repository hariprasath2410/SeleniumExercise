Feature: CreateLead in LeafTaps
Background:
Given  Open the chrome browser and load the url
And Enter the username as Demosalesmanager and password as crmsfa
And Click the Login Button
And Click the CRMSFA Link
And Click the Leads Link

Scenario Outline: Positive flow to create a Lead
And Click the Create Lead Link
And Enter the Company Name as<Company Name>
And Enter the First Name as<First Name>
And Enter the Last Name as<Last Name>
When Click on the Create Lead Button
Then Verify the Lead Creation

Examples:
|Company Name|First Name|Last Name|
|TestLeaf|Sudan|Haran|
|TestLeaf|Arun|Kumar|


Scenario Outline: Negative flow to create a Lead
And Enter the First Name as<First Name>
And Enter the Last Name as<Last Name>
When Click on the Create Lead Button
Then Verify the Lead Creation
When Click on the Create Lead Button
But Verify the Error Message

Examples:
|First Name|Last Name|
|Sudan|Haran|
|Arun|Kumar|



Scenario Outline: Click on Edit Leads.
And Click on Find Lead Link
And Enter the Company Name as<Company Name1>
And Enter the First Name as<First Name1>
And Enter the Last Name as<Last Name1>
And Click on the Find Lead Button
And Select the record
And Click on Edit Button
And Enter the New Company Name<New Company Name>
When Click on Submit Button
Then Verify Lead Updation
And Logout and close Browser

Examples:
|Company Name1|First Name1|Last Name1|New Company Name|
|Intellect|Badri|Nath|Adobe|
|FSS|Gowri|Shankar|DTCC|
|FSS|Prashanth|N|BNPP|

Scenario: Duplicate Leads
And Click on Find Lead Link
And Click on Phone Tab
And Enter Phone Number 
And Click on the Find Lead Button
And Select the record
And Click on Duplicate leads Button
When Click on Submit Button
Then Verify the Lead Creation
And Logout and close Browser


Scenario: Merge Leads
And Click on Merge Leads 
And Click on First Lookup Icon
And Enter the Fname in lookup as Hari
And Store leadID of First record
And Select the record
And Click on Second Lookup icon
And Enter the First Name as
And Click on the Find Lead Button
And Select the record
And Click on Merge Button
And Accept popup alert
When Click on Submit Button
And Click on Find Lead Link
And Enter Lead ID
And Click on the Find Lead Button
Then Verify Lead Merge  
And Logout and close Browser


Scenario: Delete Lead
And Click on Find Lead Link
And Click on Email Tab
And Enter Email Address as hari.prasath086@gmail.com
And Click on the Find Lead Button
And Store leadID of First record
And Select the record
When Click on Delete Button
And Click on Find Lead Link
And Enter Lead ID
And Click on the Find Lead Button
Then Verify the Lead Deletion
And Logout and close Browser



