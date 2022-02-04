import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTestNGTest {

    public static WebDriver driver;
    String pageURl = "https://www.google.com";
    @BeforeTest
    public void setBaseURL(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(pageURl);
    }

    @Test(priority = 1)
    public void verifyHomepageTitle() {
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void endSession(){
        driver.quit();
    }


}
