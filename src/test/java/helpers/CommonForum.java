package helpers;

import org.openqa.selenium.chrome.ChromeDriver;

public class CommonForum {

    public static ChromeDriver driver;

    public void startChrome(){
        String driverPath = "C:\\Users\\postmaster\\IdeaProjects\\Lecture19\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void stopChrome(){
    driver.quit();
    }
}
