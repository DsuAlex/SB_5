import java.util.Random;

public class SkillBuilder5 {
    private static Random rand = new Random(17);


    public static boolean playCraps() {


        boolean HasWon = false;
        boolean isRolling = true;
        int diceOne = rand.nextInt(6) + 1;
        int diceTwo = rand.nextInt(6) + 1;
        int roll = diceOne + diceTwo;

        if (roll == 7 || roll == 11) {
        HasWon = true;

        } else if ( roll == 2 || roll == 3 || roll == 12  ) {
            HasWon = false;

        } else {


            int point = roll;


            while (isRolling) {
                diceOne = rand.nextInt(6) + 1;
                diceTwo = rand.nextInt(6) + 1;
                roll = diceOne + diceTwo;

                if (roll == point) {

                    HasWon = true;
                    isRolling = false;
                } else if (roll == 7 || roll == 11) {

                        HasWon = false;
                        isRolling = false;
                        }
                    }
                }
        return HasWon;
            }








    private static void generateLevel(int level, int[] a){
        a[0] = 1;

        for (int i = 1; i <= level; i++) {
            a[i] = a[i - 1] * (level - i + 1) / i;
        }
    }

    private static String generateLevelString(int level, int[] a){
        String result = "";



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
            String rowString = generateLevelString(i, row);
            result += rowString + "\n";
        }

        return result;
    }
}
