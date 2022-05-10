Feature: This file contains scenario related to hrm orange dashboard
Scenario: To verify User is able to enter valid data in ManageReviews tab
        Given In the Dashboard click on performance tab
        When  user hover on ManageReviewstab
        And  select sublist option ManageReviews from ManageReviews tab
        Then It should open tab successfully
        When Enter details for EmployeeName as "Rebecca Harmony"
        And click on jobtitle
        And Select job title as "All"
        And click on status field
        And Select status as "All"
        And Enter from date as "2019-06-04"
        And Enter to date as "2021-06-09"
        And click on Search Button
        Then click on Evaluate Button from searched data
  
  Scenario: To verify Data Saved Successfully for Evaluation filled by supervisior
          Given User is at Administrator Evaluation Form Page
          When User Enter data for "Passed Tests" Field
          And User Enter data for "Passed Tests" Field
          And User Enter data for "Rejected Defects" Field
          And User Enter data for "Sharing Knowledge" Field
          And User Enter data for "Tests Executed" Field
          And User Enter data for "Tracking active defects" Field
          And User Enter comment in Final Comment "comment" field
          And User Enter rating in Final Rating "9" field
          And User enter completed date "2021-07-06"
          And click on Save Button
          Then Data Should be saved Successfully in Individual Evaluation Status ReviewverName as "Rebecca Harmony" and ReviewStatus as "Activated"