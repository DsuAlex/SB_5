import java.util.Random;

public class SkillBuilder5 {
    private static Random rand = new Random(17);

    public static boolean playCraps(){
        boolean isWon = false;
        int diceOne = rand.nextInt(6) + 1;
        int diceTwo = rand.nextInt(6) + 1;
        int roll = diceOne + diceTwo;

        if (roll == 7 || roll == 11) {

            isWon = true;
        } else if (roll == 2 || roll == 3 || roll == 12) {

            isWon = false;
        } else {

            int point = roll;
            boolean isRolling = true;

            while (isRolling) {
                diceOne = rand.nextInt(6) + 1;
                diceTwo = rand.nextInt(6) + 1;
                roll = diceOne + diceTwo;

                if (roll == point) {

                    isWon = true;
                    isRolling = false;
                } else if (roll == 7 || roll == 11) {

                    isWon = false;
                    isRolling = false;
                }

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
