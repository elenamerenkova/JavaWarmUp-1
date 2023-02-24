/*
Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true,
then return true only if both are negative.


posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true

https://codingbat.com/java
 */
public class posNeg {
    public static void main(String[] args) {
        posNeg(-4, -5, false); // input your values here
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if ( !negative && a < 0 && b > 0 || !negative && a > 0 && b < 0) {
            System.out.println("true");
            return true;
        } if ( negative && a < 0 && b < 0) {
            System.out.println("true");
            return true;
        } else System.out.println("false"); return false;
    }
}
