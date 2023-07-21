Feature: Flights

  @Flights
  Scenario Outline: Flights
    Given Navigate to URL "https://www.booking.com/"
    Then Click on empty space
    Then Click on Flight option
    Then Click on destination input field
    Then Type in "London" into search field by placeholder "Airport or city"
    Then Wait
    Then Click on Button by class "Text-module__root--variant-body_2___-3fYM FormControl-module__root___3kciK InputCheckbox-module__root___+UyNp"
    Then Wait
    Then Click on date field
    Then Wait
    Then Click on start date
    Then Click on end date
    Then Click on Submit button
    Then Wait
    Then Wait
    Then Browser quit

    Examples:
      | Flights |
      | 2       |
