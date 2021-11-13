import org.testng.Assert;
import org.testng.annotations.Test;

public class AsDisSequencesSumDifTest {
    @Test
    public void AsDisSequencesSumDifTest(){
        int n = 222;
        int expectedResult = 24_753;

        AsDisSequencesSumDif asDisSequencesSumDif = new AsDisSequencesSumDif();

        int actualResult = asDisSequencesSumDif.countResult(n);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
