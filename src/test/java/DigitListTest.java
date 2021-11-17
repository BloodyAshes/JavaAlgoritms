import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DigitListTest {
    @Test
    public void testDigitList() {

        DigitList digitList = new DigitList();
        String testData = "QA 4 Every1";
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4);
        expectedResult.add(1);
        List<Integer> actualResult = digitList.digitsList(testData);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
