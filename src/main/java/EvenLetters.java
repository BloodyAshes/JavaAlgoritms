public class EvenLetters {
    public static String returnEvenLetters(String testData){
        String res = "";

        for (int i = 0; i < testData.length(); i++){
            if (i % 2 != 0){
                res = res.concat(String.valueOf(testData.charAt(i)));
            }
        }
        return res;
    }
}
