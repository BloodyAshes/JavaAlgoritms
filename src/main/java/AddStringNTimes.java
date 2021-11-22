public class AddStringNTimes {
    public int addStringNTimes(String testData, int n){
        if (n < 1){
            return -1;
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n;i++){
            res.append(testData);
        }
        return res.length();
    }
}
