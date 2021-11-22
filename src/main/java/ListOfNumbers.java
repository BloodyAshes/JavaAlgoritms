import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    public static List<Integer> returnListOfNumbers(String testData){
        List<Integer> list = new ArrayList<>();

        for (int i = 0;i < testData.length();i++){
            if (testData.charAt(i) > 47 && testData.charAt(i) < 58){
                list.add(testData.charAt(i) - 48);
            }
        }
        return list;
    }
}



