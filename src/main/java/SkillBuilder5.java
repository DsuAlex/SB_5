import java.util.Random;

public class SkillBuilder5 {
    private static Random rand = new Random(17);


    public static boolean playCraps() {


        int firstRoll = rollDice(); if (firstRoll == 7 || firstRoll == 11) { return true; }

        else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12) { return false;  }

        int point = firstRoll;
        while (true) { int roll = rollDice(); if (roll == point) { return true;  }
        else if (roll == 7 || roll == 11) { return false;}}
    }
    private static int rollDice() { return rand.nextInt(12)+1; }




    }








    private static void generateLevel(int level, int[] a){
    a[0] = 1;
    for (int i = level; i > 0; i--) {
        a[i] = a[i] + a[i - 1];
    }
}


    private static String generateLevelString(int level, int[] a, int totalRows){
        String result = "";



        int spaces = totalRows - level - 1;


        for (int i = 0; i < spaces; i++) {
            result += "     ";
        }
        for (int num : a) {
            result += String.format("%-5d", num);
        }


        return result.stripTrailing();

    }

    public static String pascalsTriangle(int numOfRows){
        String result = "";


        for (int i = 0; i < numOfRows; i++) {
            int[] row = new int[i + 1];
            generateLevel(i, row);
            String rowString = generateLevelString(i, row, numOfRows);
            result += rowString + "\n";
        }

        return result;
    }
}
