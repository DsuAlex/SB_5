import java.util.Random;

public class SkillBuilder5 {
    private static Random rand = new Random(17);

    public static boolean playCraps(){
        int firstRoll = rollDice();
        if (firstRoll == 7 || firstRoll == 11) {
            return true; // Win
        } else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12) {
            return false; // Lose
        }
        int point = firstRoll;
        while (true) {
            int roll = rollDice();
            if (roll == point) {
                return true; // Win
            } else if (roll == 7 || roll == 11) {
                return false; // Lose
            }
        }
    }
    private static int rollDice() {
        return rand.nextInt(12)+1;
    }

    private static void generateLevel(int level, int[] a){
        a[0] = 1;
        for (int i = level; i > 0; i--) {
            a[i] = a[i] + a[i - 1];
        }
    }

    private static String generateLevelString(int level, int[] a){
        String levelString = "";

        // Add leading spaces for alignment
        for (int i = 0; i < (a.length - level - 1); i++) {
            levelString += "     "; // 5 spaces
        }

        // Append level values
        for (int i = 0; i <= level; i++) {
            levelString += String.format("%-5d%5s", a[i], "");
        }

        return levelString;
    }

    public static String pascalsTriangle(int numOfRows){
        String result = "";
        int[] row = new int[numOfRows];

        for (int level = 0; level < numOfRows; level++) {
            generateLevel(level, row);
            result += generateLevelString(level, row) + "\n";
        }

        return result;
    }


}
