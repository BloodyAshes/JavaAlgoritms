public class ZeroSum {
    public int[] returnSum(int[] testData) {

        for (int i = 0; i < testData.length - 1; i++) {
            for (int j = i + 1; j < testData.length; j++)
                if (testData[i] + testData[j] == 0) {
                    return new int[]{testData[i], testData[j]};
                }
            }
        return new int[1];
    }
}
