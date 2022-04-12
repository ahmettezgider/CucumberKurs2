Feature: feature hooks
# BeforeAll

  @Sc1
  Scenario: scenario hooks birinci
    # Before  (Senaryolar icin)
      # BeforeStep
    Given given step
      # AfterStep
      # BeforeStep
    When  when step
      # AfterStep
      # BeforeStep
    Then  then step
      # AfterStep
    # After   (Senaryolar icin)

  @Sc2
  Scenario: scenario hooks ikinci
    # Before
    Given given step
    When  when step
    Then  then step
    # After

# AfterAll