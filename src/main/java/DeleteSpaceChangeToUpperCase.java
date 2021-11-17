public class DeleteSpaceChangeToUpperCase {
    public static String printWithOutSpace(String testData){
        return testData.toUpperCase().replaceAll(" +", " ").trim();
    }
}
