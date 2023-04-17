@SmokeTest

  Feature: This feature tests forumcinemas.lv Log In and Profile changing

    Scenario: Checks functionality of Logging In, profile checking an profile data changing

      Given Open Chrome
      When Open homepage
      And Open Log In form
      And Fill username XX
      And Fill password XX
      Then Press submit button
      And Press My profile button
      And check if first name is AAAAAA
      And check if last name is BBBBBBBBBB
      Then Change first name to Charlie
      And Change last name to Winston
      And Change birth date to 22
      And Change birth month to June
      And Change birth year to 2001
      Then Press Save Changes button
      And Close Chrome
