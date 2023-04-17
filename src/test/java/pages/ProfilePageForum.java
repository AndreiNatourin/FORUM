package pages;

import helpers.CommonForum;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class ProfilePageForum extends CommonForum {

    private final By myProfileButton = By.xpath("//button[@class ='btn btn-success']");
    private final By FirstName = By.id("inputFirstName");
    private final By LastName = By.id("inputLastName");
    private final By birthDate = By.id("bdDay");
    private final By birthMonth = By.id("bdMonth");
    private final By birthYear = By.id("bdYear");
    private final By saveChangesButton = By.xpath("//button[@class ='btn btn-primary']");


    public void openProfilePage() {
        driver.findElement(myProfileButton).click();
    }

    public void checkFirstName(String checkfirstname) {

        driver.findElement(FirstName).getText().compareTo(checkfirstname);
    }

 //   public void checkLastName(String checklastname) {
 //     driver.findElement(LastName).getText().compareTo(checklastname);
  //  }

    public void changeFirstName(String firstname) {
        driver.findElement(FirstName).clear();
        driver.findElement(FirstName).sendKeys(firstname);
    }

    public void changeLastName(String lastname) {
        driver.findElement(LastName).clear();
        driver.findElement(LastName).sendKeys(lastname);
    }

    public void selectBirthDate(String birthdate) {
        Select birthDateSelector = new Select(driver.findElement(birthDate));
        birthDateSelector.selectByVisibleText(birthdate);
    }

    public void selectBirthMonth(String birthmonth) {
        Select birthMonthSelector = new Select(driver.findElement(birthMonth));
        switch (birthmonth) {
            case "January":
                birthMonthSelector.selectByValue("1");
                break;
            case "February":
                birthMonthSelector.selectByValue("2");
                break;
            case "March":
                birthMonthSelector.selectByValue("3");
                break;
            case "April":
                birthMonthSelector.selectByValue("4");
                break;
            case "May":
                birthMonthSelector.selectByValue("5");
                break;
            case "June":
                birthMonthSelector.selectByValue("6");
                break;
            case "July":
                birthMonthSelector.selectByValue("7");
                break;
            case "August":
                birthMonthSelector.selectByValue("8");
                break;
            case "September":
                birthMonthSelector.selectByValue("9");
                break;
            case "October":
                birthMonthSelector.selectByValue("10");
                break;
            case "November":
                birthMonthSelector.selectByValue("11");
                break;
            case "December":
                birthMonthSelector.selectByValue("12");
                break;
        }
    }

    public void selectBirthYear(String birthyear) {
        Select birthYearSelector = new Select(driver.findElement(birthYear));
        birthYearSelector.selectByVisibleText(birthyear);
    }

    public void clickSaveChangesButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy (0,350)");
        driver.findElement(saveChangesButton).click();
    }

}






