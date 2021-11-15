public class BottlesOfBeer {
    public static void printSong(){



        for (int i = 99;i >= 0; i-- ){
            if (i > 1){
                int m = i - 1;
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer" + "\n Take one down and pass it around, " + m + " bottles of beer on the wall.");
            }
             else if (i == 1){
                int m = i - 1;
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer" + "\n Take one down and pass it around, " + m + " bottle of beer on the wall.");
            }
             else {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.");
            }
        }
    }
}
