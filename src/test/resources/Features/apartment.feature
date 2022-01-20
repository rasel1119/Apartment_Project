Feature: Apartment.com Cucumber Test
  Background:
    Given user is on the Home Page

# 1. Sign In negative scenario
  Scenario Outline: check login with invalid credentials
    When user enters email "<email>" and password "<password>"
    And clicks on Sign In button
    Then user should get error message "<error>"

    Examples:
      |        email          |   password       |             error                   |
      |ashfaqmrahman@gmail.com| invalidPassword  |Invalid username/password combination|
      |   invalidEmail        |P@ssw0rD$<TesTing>|Invalid username/password combination|

# 2. Sigh In and Log Out positive scenarios
  Scenario Outline : check login and logout with valid credentials
    When user enters email "<email>" and password "<password>"
    Examples:
      |         email           |     password       |
      | ashfaqmrahman@gmail.com | P@ssw0rD$<TesTing> |
    And user should see Home Page upon clicks on Sign In button
    Then user is able to Log Out by clicking on the user profile

# 3. Add a Property
  Scenario: user is able to add a property to Rent
    When user navigated to Add Your Property Page by clicking on "Add a Property" Link
    And user enters Address upon click on Single Unit
    And user selects Property Type, Beds and Baths through Drop Down Button
    Then user clicks on "Add My Property" Button upon selecting "Captcha"

# 4. Search Apartment(With Price Range)
  Scenario: user searches an Apartment by Price Range
    When user clicks on Search Button upon typing search location
    And user selects Apartment upon "Price" range
    Then user adds the Apartment in Favourite List

# 5. Homes for Rent
  Scenario: user searches a Home for Rent
    When user navigates to "Brooklyn Homes for Rent" upon clicks on "Menu" Bar
    And user selects a Home
    Then user adds the Home in "Favourite" List

# 6. Renter Tools
  Scenario: user searches for Favourites
    When user navigates to "Favorites" upon clicking on "Menu" Bar
    Then user finds "My Favourites"

# 7. Pet Friendly Apartments
  Scenario: user searches for Pet Friendly Apartments
    When user clicks on "Pet Friendly Apartments" Link
    And user Landed to "Pet Friendly Apartments for Rent" Page
    Then user selects an studio upon selecting Location Link "New York"

# 8. Language Preference
  Scenario: user is able to select Preferred Language
    When user clicks on "Español" Tab Link
    And user Landed on the Español Home Page successfully
    And user changes Language preference to "English" by clicking the Tab Link
    Then user Landed on the English Home Page successfully

# 9. Rental Manager Resources
  Scenario: user looks for State Laws
    When user navigates to "Resources" page upon clicking on "Resources" Link
    And user selects an Article "State Laws" from "Filter by Topic" Drop Down
    And user selects the New York State from  USA Map
    Then user is Landed to the "New York State Laws" Page Successfully

# 10. Advertise
  Scenario: user is able to do Advertisement
    When user navigates to "Advertise Now" Page upon clicking on Advertise Link
    And user navigates to "Ready to Advertise?" page by clicking on "Advertise Now" Button
    Then user clicks on "Submit" Button upon filling up all the required fields













