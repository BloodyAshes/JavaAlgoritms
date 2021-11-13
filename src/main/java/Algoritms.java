public class Algoritms {
    public static String isNumbersOdd(long a) {
        String result;
        if (a <= Integer.MAX_VALUE && a >= Integer.MIN_VALUE){
            result = a % 2 == 0 ? "Even" : "Odd";
        }
        else {
            result = "Undefined";
        }
        return result;
    }

    }

