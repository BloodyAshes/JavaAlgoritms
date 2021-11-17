import org.testng.Assert;
import org.testng.annotations.Test;

public class SpaceTest {
    @Test
    public void testSpaceReturn(){
        Space space = new Space();
        String testData = "QA For Everyone";
        int expectedResult = 2;

        int actualResult = space.returnSpace(testData);

        Assert.assertEquals(expectedResult, actualResult);

    }
}
