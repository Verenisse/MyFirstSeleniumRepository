package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

    protected WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "first-name")
    public WebElement first_name;

    @FindBy(id = "last-name")
    public WebElement last_name;

    @FindBy(id="job-title")
    public WebElement job_title;

    @FindBy (id="radio-button-1")
    public WebElement highSchoolRadioButton;

    @FindBy (id="radio-button-2")
    public WebElement collegeRadioButton;

    @FindBy (id="radio-button-3")
    public WebElement gradRadioButton;

    @FindBy (id="checkbox-1")
    public WebElement maleCheckbox;

    @FindBy (id="checkbox-2")
    public WebElement femaleCheckbox;

    @FindBy (id="checkbox-3")
    public WebElement preferNotToSayCheckbox;

    @FindBy (xpath = "//select[@id=\"select-menu\"]")
    public WebElement yearsOfExperienceSelect;


    @FindBy (xpath = "//input[@id=\"datepicker\"]")
    public WebElement datePicker;

    @FindBy(xpath = "//a[contains(text(), 'Submit')]")
    public WebElement submit_button;

}
