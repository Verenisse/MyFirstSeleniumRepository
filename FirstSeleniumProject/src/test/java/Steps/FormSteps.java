package Steps;

import Pages.FormPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormSteps extends FormPage {

    //public FormSteps (ChromeDriver driver) { super(driver); }
    public FormSteps (FirefoxDriver driver) { super(driver); }
    public void enterFirstName() {
        String FIRSTNAME = "Frufru";
        this.first_name.sendKeys(FIRSTNAME);
    }
    public void enterLastName() {
        String LASTNAME = "Gonzalez";
        this.last_name.sendKeys(LASTNAME);
    }

    public void enterJobTitle() {
        String JOBTITLE = "Automation Tester";
        this.job_title.sendKeys(JOBTITLE);
    }

    public void clickHighSchoolRadioButton() {
        this.highSchoolRadioButton.click();
    }

    public void clickCollegeRadioButton() {
        this.collegeRadioButton.click();
    }

    public void clickGradRadioButton() {
        this.gradRadioButton.click();
    }

    public void clickMaleCheckBox() {
        this.maleCheckbox.click();
    }

    public void clickFemaleCheckBox() {
        this.femaleCheckbox.click();
    }

    public void clickPreferNotToSayCheckBox() {
        this.preferNotToSayCheckbox.click();
    }

    public void selectYearsOfExperienceSelect() {
        this.yearsOfExperienceSelect.sendKeys("0-1");
    }
    public void submitClick() {
        this.submit_button.click();
    }

}
