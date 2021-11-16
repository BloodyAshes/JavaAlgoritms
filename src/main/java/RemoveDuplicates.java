import java.util.Arrays;

public class RemoveDuplicates {
    public int[] removeDup(int[] testData) {
        int count = 1;
        int[] arr = new int[testData.length];

        arr[0] = testData[0];
        for (int i = 1; i < testData.length; ) {
            for (int j = 0; j <= i; ) {
                if (testData[i] == arr[j]) {
                    i++;
                    break;
                }
                if (j == i && arr[j] == 0 || testData[i] == 0 && j < i) {
                    arr[i] = testData[i];
                    i++;
                    j = -1;
                    count++;
                }
                j++;
            }
        }
       int [] result = new int[count];
        for (int j = 0; j < count; j++){
            result[j] = arr[j];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
