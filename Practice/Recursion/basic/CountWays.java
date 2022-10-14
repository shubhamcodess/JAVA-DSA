package Practice.Recursion.basic;

/**
 * Problem Statement - Given a ladder of N steps Count the number of ways to
 * reach the top of the Ladder
 * At any given step a jump of 1 step, 2 step or 3 step can be taken
 */
public class CountWays {

    public static void main(String[] args) {

        int ladder_total__steps = 4;
        System.out.println("Total Ways to climb that ladder with " + ladder_total__steps + " is : "
                + countWays__recursion(ladder_total__steps));
    }

    public static int countWays__recursion(int ladder_total__steps) {

        if (ladder_total__steps == 0) {
            return 1;
        }
        if (ladder_total__steps < 0) {
            return 0;
        }
        return countWays__recursion(ladder_total__steps - 1) + countWays__recursion(ladder_total__steps - 2)
                + countWays__recursion(ladder_total__steps - 3);

    }

}
