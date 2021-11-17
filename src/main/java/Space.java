public class Space {
    public static int returnSpace(String testData){
        int count = 0;

        for (int i = 0; i <testData.length();i++){
            if (testData.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
