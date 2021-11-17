import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteSpaceChangeToUpperCaseTest {
    @Test
    public void testDeleteSpace(){
        DeleteSpaceChangeToUpperCase deleteSpaceChangeToUpperCase = new DeleteSpaceChangeToUpperCase();
        String testData = "QA For  Everyone ";
        String expectedResult = "QA FOR EVERYONE";

        String actualResult = deleteSpaceChangeToUpperCase.printWithOutSpace(testData);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
