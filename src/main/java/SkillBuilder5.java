import java.util.Random;

public class SkillBuilder5 {
    private static Random rand = new Random(17);

    public static boolean playCraps() {
        boolean isWon = false;
        int diceOne = rand.nextInt(6);
        int diceTwo = rand.nextInt(6);
        diceOne += 1;
        diceTwo += 1;
        int i = 1;
        int roll = diceOne + diceTwo;

        if (i == 1) {
            if (roll == 7 || roll == 11) {
                isWon = true;
            } else if (roll == 2 || roll == 3 || roll == 12) {
                isWon = false;

            } else {
                i++;

            }
        } else if (i > 1) {
            int initialRoll = roll;
            boolean isRolling = true;
            while (isRolling) {
                diceOne = rand.nextInt(6);
                diceOne += 1;
                diceTwo = rand.nextInt(6);
                diceTwo += 1;
                roll = diceOne + diceTwo;
                if (roll == initialRoll) {
                    isWon = true;
                    isRolling = false;

                } else if (roll == 7 || roll == 11) {
                    isWon = false;
                    isRolling = false;


                } else {i++;}


            }


        }
        return isWon;

    }

    private static void generateLevel(int level, int[] a){
        // TODO: replace this line with your code.
    }

    private static String generateLevelString(int level, int[] a){
        return null;
    }

    public static String pascalsTriangle(int numOfRows){
       return null;
    }
}
