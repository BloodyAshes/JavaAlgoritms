public class MinMaxAve {

    public static int[] minimumMaximumAverage(int[] testData){
        int minimum = testData[0];
        int maximum = testData[0];
        int sum = 0;


        for (int i = 0; i < testData.length; i++){
            if (minimum > testData[i]){
                minimum = testData[i];
            }
            if (maximum < testData[i]){
                maximum = testData[i];
            }
            sum += testData[i];
        }

        return new int[] {maximum, minimum, sum/testData.length};
    }
}
