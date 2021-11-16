import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveDuplicatesTest {
    @Test
    public void testRemoteDuplicates(){
        int[] testData = {3, 4, 2, 6, 3, 3, 3, 2, 2};
        int[] expectedResult = {3, 4, 2, 6};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        int[] actualResult = removeDuplicates.removeDup(testData);

        Assert.assertEquals(expectedResult, actualResult);

    }
}
