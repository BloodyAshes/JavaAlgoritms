public class DeleteSpaceChangeToLowerCase {
    public static String printWitOutSpace(String testData){
        String str1 = testData.toLowerCase();
        String str2 = "";
        String error = "Poop";
        if (testData.length() == 0){
            return error;
        }
        for (int i = 0; i <testData.length(); i++){
            if (testData.charAt(i) != ' '){
                str2 += str1.charAt(i);
            }
        }
        return str2;
    }
}
