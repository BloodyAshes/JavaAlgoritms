import org.testng.Assert;
import org.testng.annotations.Test;

public class Swap0ToOTest {
    @Test
    public void testSwapZeroToO(){
        String testData = "QAF0rEvery0ne";
        String expectedResult = "QAForEveryone";

        Swap0ToO swap0ToO = new Swap0ToO();

        String actualResult = swap0ToO.swapLetter(testData);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
