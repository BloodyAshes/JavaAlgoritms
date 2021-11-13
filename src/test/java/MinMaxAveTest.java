import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {
    @Test
    public void testMinMaxAve(){
        int[] testDate = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 1, 3};
        MinMaxAve minMaxAve = new MinMaxAve();

        int[] actualResult = minMaxAve.minimumMaximumAverage(testDate);

        Assert.assertEquals(actualResult, expectedResult);


    }
}
