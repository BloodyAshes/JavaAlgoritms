import org.testng.Assert;
import org.testng.annotations.Test;

public class IsMultipleTest {
    @Test
    public void testIsMultiple(){
        int a = 100;
        String expectedResult = "Poor number";

        IsMultiple isMultiple = new IsMultiple();

        String actualResult = isMultiple.IsNumberMultiple(a);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
