Feature: create a lead for Leaftaps

Scenario Outline: To create a lead

And Enter the username as DemoSalesManager
And enter the password as crmsfa
And click on login button
And click on CRM/SFA link
And click on Leads button
And click on CreateLead
And enter the companyname as <cName>
And enter the firstname as <fName>
And enter the lastname as <lName>
When click on createLead button
Then verify lead is created successfully

Examples:
|cName|fName|lName|
|TCS|Laya|S|