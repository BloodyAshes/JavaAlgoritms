import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class BottlesOfBeerTest {


    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:/Prog/chromedriver.exe");

       driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @AfterMethod
    public void setDown() {
        driver.quit();
    }

    @Test
    public void testBottlesOfBeer() {
         String expectedResult = "Welcome to 99 Bottles of Beer";
         String HEADER = "//h2[text()='Welcome to 99 Bottles of Beer']";
        driver.get("http://www.99-bottles-of-beer.net/");
        driver.findElement(By.xpath(HEADER));

        String actualResult = driver.findElement(By.xpath(HEADER)).getText();

        Assert.assertEquals(expectedResult, actualResult);

    }
}

