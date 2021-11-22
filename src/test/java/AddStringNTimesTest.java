import org.testng.Assert;
import org.testng.annotations.Test;

public class AddStringNTimesTest {
    @Test
    public void testAddStringNTimes(){
        AddStringNTimes addStringNTimes = new AddStringNTimes();
        String testData = "Qa";
        int n = 10;
        int expectedResult = 20;
        int actualResult = addStringNTimes.addStringNTimes(testData, n);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
