package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.ProfilePageForum;

public class ProfilePageForumSteps {
    ProfilePageForum profilePageForum = new ProfilePageForum();

    @And("^Press My profile button$")
    public void pressMyProfileButton() {
        profilePageForum.openProfilePage();
    }

//    @And("^check if first name is(.*)$")
//    public void checkIfFirstNameIs(String checkfirstname) {
//
//        profilePageForum.checkFirstName(checkfirstname);
//    }
//
//    @And("^check if last name is(.*)$")
//    public void checkIfLastName(String checklastname) {
//        profilePageForum.checkLastName(checklastname);
//    }

    @Then("^Change first name to(.*)$")
    public void changeFirstName(String firstname) {
        profilePageForum.changeFirstName(firstname);
    }

    @And("^Change last name to(.*)$")
    public void changeLastName(String lastname) {
        profilePageForum.changeLastName(lastname);
    }

    @And("^Change birth date to(.*)$")
    public void changeBirthDate(String birthdate) {
        profilePageForum.selectBirthDate(birthdate);
    }

    @And("^Change birth month to(.*)$")
    public void changeBirthMonth(String birthmonth) {
        profilePageForum.selectBirthMonth(birthmonth);
    }

    @And("^Change birth year to(.*)$")
    public void changeBirthYear(String birthyear) {
        profilePageForum.selectBirthYear(birthyear);
    }

    @Then("^Press Save Changes button$")
    public void pressSaveChangesButton() {
        profilePageForum.clickSaveChangesButton();
    }


}
