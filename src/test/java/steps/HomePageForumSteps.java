package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePageForum;

public class HomePageForumSteps {
    HomePageForum homePageForum = new HomePageForum();

    @When("^Open homepage$")
    public void openHomepage() {
        homePageForum.openHomePage();
    }

    @And("^Open Log In form$")
    public void openLogInForm() {
        homePageForum.clickLoginButton();
    }

    @And("^Fill username(.*)$")
    public void fillUserName(String username) {
        homePageForum.fillUsername(username);
    }


    @And("^Fill password(.*)$")
    public void fillPassword(String passWord) {
        homePageForum.fillPassword(passWord);
    }

    @Then("^Press submit button$")
    public void pressSubmitButton() {
        homePageForum.clickSubmitButton();
    }


}
