import org.testng.Assert;
import org.testng.annotations.Test;

public class ZeroSumTest {
    @Test
    public void testReturnZerosum(){
        int[] testData = {35, 23, 12, 89, -23, -48, 100};
        int[] expectedResult = {23, -23};

        ZeroSum zeroSum = new ZeroSum();

        int[] actualResult = zeroSum.returnSum(testData);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
