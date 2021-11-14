public class BiggestInt {
    public static int MostBigger(int a, int b){
        int result = 0;
        for (int i = 0;i < Integer.MAX_VALUE;i++){
            if (a >= i){
                result = a;
            }
            if (b > a && b >= i){
                result = b;
            }
        }
        return result;
    }
}
