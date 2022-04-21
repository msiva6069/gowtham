Feature: JIRA API Automtion
Scenario Outline: Verify user should create issue
Given User should add header "<Key>","<Value>"
When User should add basic Auth "<userName>","<ApiToken>"
And User should add body
"""
{
    "fields": {
       "project":
       {
          "key": "TEST"
       },
       "summary": "REST ye merry gentlemen.",
       "description": "Creating of an issue using project keys and issue type names using the REST API",
       "issuetype": {
          "name": "Bug"
       }
   }
}
"""
And User should add "<methodType>" to send request "<endPoint>"
Then User should verify "<status Code>"
Examples:
|Key|Value|userName|ApiToken|methodType|endPoint|status Code|