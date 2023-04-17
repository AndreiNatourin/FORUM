import helpers.CommonForum;
import org.junit.Test;
import pages.HomePageForum;
import pages.ProfilePageForum;

public class ForumPom {

    CommonForum commonForum = new CommonForum();
    HomePageForum homePageForum = new HomePageForum();
    ProfilePageForum profilePageForum = new ProfilePageForum();


    @Test
    public  void forumCinemas(){
        commonForum.startChrome();
        homePageForum.openHomePage();
        homePageForum.clickLoginButton();
        homePageForum.fillUsername("");
        homePageForum.fillPassword("");
        homePageForum.clickSubmitButton();
        profilePageForum.openProfilePage();
        profilePageForum.changeFirstName("Charlie");
        profilePageForum.changeLastName("Winston");
        profilePageForum.selectBirthDate("22");
        profilePageForum.selectBirthMonth("June");
        profilePageForum.selectBirthYear("2001");
        profilePageForum.clickSaveChangesButton();

        commonForum.stopChrome();
    }
}
