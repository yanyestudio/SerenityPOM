Feature:Enter the Avianca Page
    @currentScenario
    Scenario:enter page and enter flightType
      Given effective user entry to flightType page
      When flightType equal One Way
      Then go to flight search page

     Scenario:enter the flight search page
          Given effective user entry to flightSearch page
          When  select origin destination and date
          Then flight search

    Scenario:check reportPage
      Given effective user entry to reportPage
      When number of records is greater than 0
      Then look for the cheapest flight

    Scenario:Be on cheapest flightPage
      Given effective finding of cheapest flight
      When  results greater than 0 records
      Then print the most economical flight