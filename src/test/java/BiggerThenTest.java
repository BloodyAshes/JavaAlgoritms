import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerThenTest {
    @Test
    public void testIsNumberBiggerThen(){
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        BiggerThen biggerThen = new BiggerThen();

        int actualResult = biggerThen.IsNUmberBiggerThen(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testIsNumberBiggerThen2(){
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        BiggerThen biggerThen = new BiggerThen();

        int actualResult = biggerThen.IsNUmberBiggerThen(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testIsNumberBiggerThen3(){
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        BiggerThen biggerThen = new BiggerThen();

        int actualResult = biggerThen.IsNUmberBiggerThen(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
