public class CountVowelsLetter {
    public static int countVowels(String testData){
        String[] str1 = testData.toLowerCase().split("");
        int count = 0;

        for (int i = 0; i < str1.length; i++){
            if (str1[i].contains("a") || str1[i].contains("e") || str1[i].contains("i") || str1[i].contains("o")
             || str1[i].contains("u")){
                count++;
            }
        }
        return count;
    }
}
