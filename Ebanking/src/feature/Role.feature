Feature: Role Creation Functionality

Scenario Outline: Role Creation with Multiple Sets of Data

Given Tester Should on RHP

When Tester Enter username and Password

Then Tester click on Role button

When Tester click on New Role and enters "<RoleName>" and "<RoleType>"

Then Tester Close the Application

Examples:

           | RoleName | RoleType|
           | Cashierhydbnk |E|
           | Tellerbnk |E|
           | Genmanagerbnj|E|