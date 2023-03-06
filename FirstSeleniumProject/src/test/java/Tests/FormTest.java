package Tests;

import Steps.FormSteps;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import utils.*;

public class FormTest {
    //public ChromeDriver driver = new ChromeDriver();
    public FirefoxDriver driver = new FirefoxDriver();

    @BeforeSuite
    public void setting() {
        // ChromeDriver location set up in Utils class
        //System.setProperty("webdriver.chrome.driver", utils.UtilsDriver.CHROME_DRIVER_LOCATION);
        System.setProperty("webdriver.gecko.driver", utils.UtilsDriver.FIREFOX_DRIVER_LOCATION);
        driver.get(utils.UtilsDriver.BASE_URL);
    }

    @Test
    public void sendForm() {
        FormSteps action = new FormSteps(driver);
        action.enterFirstName();
        action.submitClick();
    }

    @AfterSuite
    public void cleanUp() {
        //driver.manage().deleteAllCookies();
        //driver.close();
    }

}
