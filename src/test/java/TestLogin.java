import Pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLogin {

    public WebDriver driver;

    @Test
    public void setup() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        Login login=new Login(driver);
        login.enterEmail("admin@admin.com");
        login.enterPassword("admin");
        login.loginBtnClk();

        
    }

}
