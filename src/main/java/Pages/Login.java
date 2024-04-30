package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement userEmail;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement userPassword;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginBtn;


    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void enterEmail(String email) {
        userEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
        userPassword.sendKeys(password);
    }

    public void loginBtnClk() {
        loginBtn.click();
    }

}
