import org.testng.Assert;
import org.testng.annotations.Test;

public class TrueOrFalseTest {
    @Test
    public void testIsNumberBigger(){
        int a = 555;
        boolean expectedResult = false;

        TrueOrFalse trueOrFalse = new TrueOrFalse();

        boolean actualResult = trueOrFalse.IsNumberBigger(a);

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testIsNumberBigger2(){
        int a = 0;
        boolean expectedResult = false;

        TrueOrFalse trueOrFalse = new TrueOrFalse();

        boolean actualResult = trueOrFalse.IsNumberBigger(a);

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testIsNumberBigger3(){
        int a = -555;
        boolean expectedResult = true;

        TrueOrFalse trueOrFalse = new TrueOrFalse();

        boolean actualResult = trueOrFalse.IsNumberBigger(a);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
