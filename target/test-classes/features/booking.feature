Feature: Booking flight

Scenario: when user is onn the booking site
Given user select departure city
And user select destination city
And list of flights are shown to choose
Then choose the flight with lowest price
Then user entered the following details 
|Rohan|abcd hills|bangkok|tn|564329|American Express|1234000011119999|10|2024|Rohan Albert|
When user clicked on purchase flight
Then booking confirmation is displayed
