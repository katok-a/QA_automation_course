@All_Tests
@Advanced_Test

Feature: Test if top hotel rating is higher than given number

  Scenario: Check Rating
    Given I am on booking.com main page
    When I enter to the searchLine Москва
    When I set dates for the trip
    When I click Проверить цены
    When I sort hotels by rating
    When I open top hotel in list
    Then Hotel's rating higher than 9

