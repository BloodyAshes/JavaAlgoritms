import org.testng.Assert;
import org.testng.annotations.Test;

public class EvenLettersTest {
    @Test
    public void testEvenLetters(){
        String testData = "QAForEveryone";
        String expectedResult = "AoEeyn";

        EvenLetters evenLetters = new EvenLetters();

        String actrualResult = evenLetters.returnEvenLetters(testData);

        Assert.assertEquals(expectedResult, actrualResult);
    }
}
