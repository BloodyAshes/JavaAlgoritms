public class RemoveLitters {
    public static String printLitters(String testData){
        String result = "";
        for (int i = 0; i < testData.length(); i++ ){
            if (testData.toLowerCase().charAt(i) == 'q' || testData.toLowerCase().charAt(i) == 'o' || testData.toLowerCase().charAt(i) == 'r'){
                result = result + testData.charAt(i);
            }
        }
        return result;
    }
}
