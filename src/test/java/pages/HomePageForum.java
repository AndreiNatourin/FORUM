package pages;

import helpers.CommonForum;
import org.openqa.selenium.By;

public class HomePageForum extends CommonForum {

    public void openHomePage(){

        driver.get("https://www.forumcinemas.lv/");
    }
    private final By logInButton = By.xpath("//a[@class ='btn btn-login btn-default']");
    private final By userName = By.id("input-userName");
    private final By password = By.id("input-password");
    private final By submitButton = By.xpath("//button[@class ='btn btn-primary btn-block']");

    public void clickLoginButton(){
        driver.findElement(logInButton).click();
    }

    public void fillUsername(String username){
        driver.findElement(userName).sendKeys(username);
    }

    public void fillPassword(String passWord){
        driver.findElement(password).sendKeys(passWord);
    }

    public void clickSubmitButton(){
    driver.findElement(submitButton).click();
   }
        }
