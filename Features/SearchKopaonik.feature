Feature: Search

  @Kopaonik
  Scenario Outline: Kopaonik
    Given Navigate to URL "https://www.booking.com/"
    Then Click on empty space
    Then Type in "Kopaonik" into search field by placeholder "Where are you going?"
    Then Wait
    Then Click on Button by class "cd1e09fdfe"
    Then Click on start date
    Then Click on end date
    Then Click on occupancy option
    Then Click on plus sign
    Then Click on Search button
    Then Assert search results by class
    Then Wait
    Then Browser quit

    Examples:
      | Kopaonik |
      | 1        |




