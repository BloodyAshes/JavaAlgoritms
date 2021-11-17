import java.util.ArrayList;
import java.util.List;

public class DigitList {
    public List<Integer> digitsList(String testData){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < testData.length(); i++){
            if (testData.charAt(i) > 47 && testData.charAt(i) < 57){
                list.add(testData.charAt(i) - 48);
            }
        }
        return list;
    }
}
