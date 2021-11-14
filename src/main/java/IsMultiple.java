public class IsMultiple {
    public static String IsNumberMultiple(int a){

        if (a % 3 == 0 && a % 5 == 0){
            return "Good number";
        }
        else if (a % 3 == 0 && a % 5 != 0){
            return "Bad number";
        }
        else if (a % 5 == 0 && a % 3 != 0){
            return  "Poor number";
        }
       else
            return  "-1";
        }

    }

