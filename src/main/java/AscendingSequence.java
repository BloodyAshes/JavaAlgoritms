public class AscendingSequence {
    public static int[] AscendingSequence(int a, int b, int n) {
        if (a >= b || n < 0) {
            return new int[]{-1};
        }
        int[] arr = new int[((b - a) / n) + 1];
        int element = a;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = element;
            element += n;
        }
        return arr;
    }
}
