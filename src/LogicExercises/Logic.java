package LogicExercises;

public class Logic {
    /*
     *   codingbat.com/java
     *   When squirrels get together for a party, they like to have cigars.
     *   A squirrel party is successful when the number of cigars is between
     *   40 and 60, inclusive. Unless it is the weekend, in which case there
     *   is no upper bound on the number of cigars. Return true if the
     *   party with the given values is successful, or false otherwise.
     *
     *       cigarParty(30, false) → false
     *       cigarParty(50, false) → true
     *       cigarParty(70, true) → true
     */

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return (40 <= cigars && cigars <= 60) ||
                (isWeekend && cigars >= 40);
    }


    public static int caughtSpeeding(int speed, boolean isBirthday) {

        if (isBirthday) {
            if (speed <= 65) {
                return 0;
            }
            else if (speed < 86) {
                return 1;
            }
            else {
                return 2;
            }
        }
        else {
            if (speed <= 60) {
                return 0;
            }
            else if (speed < 81) {
                return 1;
            }
            else {
                return 2;
            }
        }
    } // caughtSpeeding


    public static void main(String [] args) {
        System.out.println(caughtSpeeding(60, false) == 0);
        System.out.println(caughtSpeeding(65, false) == 1);
        System.out.println(caughtSpeeding(65, true) == 0);
        System.out.println(caughtSpeeding(81, false) == 2);
        System.out.println(caughtSpeeding(81, true) == 1);

        System.out.println(cigarParty(30,false) == false);
        System.out.println(cigarParty(50,false) == true);
        System.out.println(cigarParty(70,true) == true);
    }

    public static boolean isOrdered(int d1, int d2, int d3) {
        return ((d1 < d2 && d2 < d3) || (d3 < d2 && d2 < d1));
    }

    /**
     * The number 6 is a truly great number. Given two int values,
     * a and b, return true if either one is 6. Or if their sum or
     * difference is 6. Note: the function Math.abs(num) computes the
     * absolute value of a number.
     */
    public static boolean love6(int a, int b) {
        return (a == 6) || (b == 6) ||
                (a + b == 6) || Math.abs(a - b) == 6;
    }


}
