package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import helpers.CommonForum;

public class CommonForumSteps {
    CommonForum commonForum = new CommonForum();

    @Given("Open Chrome")
    public void openChrome() {
        commonForum.startChrome();
    }

    @And("Close Chrome")
    public void closeChrome() {
        commonForum.stopChrome();
    }
}
