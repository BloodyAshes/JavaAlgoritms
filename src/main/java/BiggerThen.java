public class BiggerThen {
    public static int IsNUmberBiggerThen(int a, int b){
        int result = 0;
        if (a == b){
            result = 0;
        }
        if (a < b){
            result = -1;
        }
        if (a > b){
            result = 1;
        }
        return result;
    }
}
