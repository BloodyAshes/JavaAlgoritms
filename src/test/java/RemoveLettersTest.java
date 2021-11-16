import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveLettersTest {
    @Test
    public  void testRemoveLetters() {
        String expectedResult = "Qorroor";
        RemoveLitters removeLitters = new RemoveLitters();
        String testData = "QaForEveryone Java lessons are fun";

        String actualResult = removeLitters.printLitters(testData);

        Assert.assertEquals(expectedResult, actualResult);


    }
}
