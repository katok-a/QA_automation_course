@All_Tests
@Basic_test

Feature: Test is there hotels in the City on given dates on booking.com

  Scenario: Find hotel
    Given I am on booking.com main page
    When I enter to the searchLine CITY name name
    When I set dates for the trip
    When I click submitButton
    Then I see page with search results>0

