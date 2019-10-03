@tag
Feature: user check login functionality

  @tag1
  Scenario Outline: user check the facebook page
    Given user check the url and title
    When user enter username and password "<username>" and "<password>"
    And user enter firstname,lastname and phonenumber "<firstname>","<lastname>" and "<phonenumber>"
    And user click log in button
    Then user check navigation correct url or not

    Examples: 
      | username | password | firstname | lastname | phonenumber |
      | anitha   | vicky    | ln        | s        |  3365656565 |
      | poori    | karthi   | pass      | Don      |   613213212 |
      | anu      | rahul    | fail      | rowdy    |  9962083658 |
      | push      | push    | push      | push    |  9962083658 |
