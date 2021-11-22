public class ReturnWord {
    public static String returnWordsFirst(String testData){
        String res = "";

        if (testData.length() > 5){
            res = testData.substring((testData.length() - 3), (testData.length())) + testData.substring(0, 3);
        }
        else if (testData.length() % 2 == 0){
            res = testData.substring((testData.length() / 2) - 1, (testData.length() / 2) + 1).repeat(testData.length());
        }
        else {
            res = testData.substring(testData.length() /2, testData.length() / 2 + 1).repeat(testData.length());
        }
        return res;
    }
}
