Feature: Attractions

  @Attractions
  Scenario Outline: Attractions
    Given Navigate to URL "https://www.booking.com/"
    Then Click on empty space
    Then Click on Attractions option
    Then Type in "Paris" into search field by placeholder "Where are you going?"
    Then Wait
    Then Click on Button by class "css-10yoke3"
    Then Click on Select your dates field
    Then Click on start date
    Then Click on end date
    Then Click on Search button by class
    Then Wait
    Then Browser quit
    Examples:
      | attractions |
      | 1           |