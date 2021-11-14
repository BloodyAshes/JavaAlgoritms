import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggestIntTest {
    @Test
    public void testBiggestInt(){
        int a = 9999;
        int b = 3333;
        int expectedresult = 9999;

        BiggestInt biggestInt = new BiggestInt();

        int actualResult = biggestInt.MostBigger(a, b);

        Assert.assertEquals(expectedresult, actualResult);

    }
}
