import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlgoritmsTest {
@Test
public static void main(String[] args) {
    Algoritms oddEven = new Algoritms();

    String expectedResult;
    String actualResult;
    long a;


    expectedResult = "Odd";
    a = -345;
    actualResult = Algoritms.isNumbersOdd(a);
    System.out.println(expectedResult+ ":" + actualResult);
    Assert.assertEquals(expectedResult, actualResult);



}
}
