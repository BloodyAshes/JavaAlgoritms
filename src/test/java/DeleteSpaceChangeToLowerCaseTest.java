import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteSpaceChangeToLowerCaseTest {
    @Test
    public void testWithOutSpace(){
        DeleteSpaceChangeToLowerCase deleteSpaceChangeToLowerCase = new DeleteSpaceChangeToLowerCase();
        String testData = "QA For  Everyone";
        String expectedResult = "qaforeveryone";

        String actualResult = deleteSpaceChangeToLowerCase.printWitOutSpace(testData);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
