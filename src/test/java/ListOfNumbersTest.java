import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbersTest {
    @Test
    public void testReturnListOfNumbers() {
        ListOfNumbers listOfNumbers = new ListOfNumbers();
        String testDate = "QA 4 Every1";
       List<Integer> expectedResult = new ArrayList<>();
       expectedResult.add(4);
       expectedResult.add(1);
       List<Integer> actualResult = listOfNumbers.returnListOfNumbers(testDate);
       Assert.assertEquals(actualResult, expectedResult);


    }
}