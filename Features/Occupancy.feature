Feature: Occupancy

  @Occupancy
  Scenario Outline: Occupancy
    Given Navigate to URL "https://www.booking.com/"
    Then Click on empty space
    Then Type in "Venice" into search field by placeholder "Where are you going?"
    Then Click on Button by class "d47738b911 e246f833f7 fe211c0731"
    Then Click on start date
    Then Click on end date
    Then Click on occupancy option
    Then Click on plus sign
    Then Click on plus sign
    Then Wait
    Then Click on Search button
    Then Wait
    Then Browser quit
    Examples:
      | Occupancy |
      | 3         |

