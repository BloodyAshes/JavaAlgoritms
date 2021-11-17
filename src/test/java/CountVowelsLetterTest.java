import org.testng.Assert;
import org.testng.annotations.Test;

public class CountVowelsLetterTest {
    @Test
    public void testCountVowels(){
        CountVowelsLetter countVowelsLetter = new CountVowelsLetter();
        String testData = "QA For Everyone";
        int expectedResult = 6;
        int actualResult = countVowelsLetter.countVowels(testData);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
