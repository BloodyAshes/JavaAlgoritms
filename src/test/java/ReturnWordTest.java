import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnWordTest {
    @Test
    public void testReturnWord(){
        ReturnWord returnWord = new ReturnWord();
        String testData = "QAForEveryone";
        String expectedResult = "oneQAF";
        String actualResult = returnWord.returnWordsFirst(testData);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
